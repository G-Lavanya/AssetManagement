package com.asset.management;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.asset.management.model.AssetModel;
import com.asset.management.model.CategoriesModel;
import com.asset.management.repo.AssetRepository;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase()
public class ApplicationRepository {
	@Autowired
	   private TestEntityManager entityManager;

	   @Autowired
	   private AssetRepository arepo;

	   @Test
	   public void whenFindAll() {
	       //given
	       CategoriesModel am = new CategoriesModel();
	       //am.set
	       am.setType("Electronics");
	       entityManager.persist(am);
	       entityManager.flush();
	   }
}
