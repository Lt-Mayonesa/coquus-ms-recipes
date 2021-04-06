package io.coquus.ms.recipes.domain

import javax.persistence.*

/**
 * @author Joaco Campero
 *
 * created at 5/4/21
 */
@Entity
class Recipe(
    @field:Column(nullable = false)
    var title: String? = null,
    @field:Id
    var slug: String = title?.toSlug() ?: "",
    @field:ManyToMany(cascade = [CascadeType.ALL])
    var ingredients: MutableList<Ingredient> = mutableListOf()
)