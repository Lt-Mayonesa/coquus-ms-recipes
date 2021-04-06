package io.coquus.ms.recipes.adapter

import io.coquus.ms.recipes.domain.Recipe
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * @author Joaco Campero
 *
 * created at 5/4/21
 */
@RepositoryRestResource(collectionResourceRel = "recipe", path = "recipes")
interface RecipeRepositoryAdapter : PagingAndSortingRepository<Recipe, String>