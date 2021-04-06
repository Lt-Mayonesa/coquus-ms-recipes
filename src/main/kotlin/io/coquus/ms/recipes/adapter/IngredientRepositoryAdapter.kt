package io.coquus.ms.recipes.adapter

import io.coquus.ms.recipes.domain.Ingredient
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * @author Joaco Campero
 *
 * created at 5/4/21
 */
@RepositoryRestResource(collectionResourceRel = "ingredient", path = "ingredients")
interface IngredientRepositoryAdapter : PagingAndSortingRepository<Ingredient, String>