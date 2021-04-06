package io.coquus.ms.recipes.domain

import javax.persistence.*

/**
 * @author Joaco Campero
 *
 * created at 5/4/21
 */
@Entity
class Ingredient(
    @field:Column(nullable = false)
    var name: String? = null,
    @field:Id
    var slug: String = name?.toSlug() ?: "",
    @field:ManyToMany
    var recipes: MutableList<Recipe> = mutableListOf()
)