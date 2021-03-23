package com.asset.management.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.asset.management.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.asset.management.model.CategoriesModel;
import com.asset.management.repo.CategoryRepo;
//import com.asset.management.service.CategoryService;
//import javax.validation.Valid;


@RestController
@Component
public class CategoryController {
	
	@Autowired
	CategoryRepo crepo;	
	
	
	@GetMapping(path ="getdata")
	public List<CategoriesModel> categoriseAssets(){
		return crepo.findAll();
		
		
	}
	@PostMapping("/postdata")
	public long postDetails(@RequestBody CategoriesModel pd) {
		System.out.println(pd.toString());
		crepo.save(pd);
		return pd.getId();
	}
	
	@PutMapping("/getdata/{categoryId}")
    public CategoriesModel updatePost(@PathVariable Long categoryId,  @RequestBody CategoriesModel postRequest) {
        return crepo.findById(categoryId).map(post -> {
            post.setType(postRequest.getType());
            post.setDescription(postRequest.getDescription());
           // post.setContent(postRequest.getContent());
            return crepo.save(post);
        }).orElseThrow(() -> new ResourceNotFoundException("categoryId " + categoryId + " not found"));
    }
	
//	@PutMapping("/getdata/{id}")
//	public ResponseEntity<?> saveResource(@RequestBody CategoriesModel cmodel,
//	  @PathVariable("id") String id) {
//	    crepo.save(cmodel);
//	    return ResponseEntity.ok("resource saved");
//	}
	
	 @GetMapping("/getdata/{id}")
	    CategoriesModel getcategoryById(@PathVariable Long id) {
	        return crepo.findById(id).get();
	    }

    
    @DeleteMapping("/delete/{id}") 
    public void deleteStudent( 
        @PathVariable(value = "id") long id) 
    { 
        crepo.deleteById(id);
    } 
  
}
