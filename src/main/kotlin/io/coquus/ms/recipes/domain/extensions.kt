package io.coquus.ms.recipes.domain

/**
 * @author Joaco Campero
 *
 * created at 5/4/21
 */
fun String.toSlug(): String = this.replace(" ", "-")