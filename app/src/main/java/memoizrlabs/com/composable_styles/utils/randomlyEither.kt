package memoizrlabs.com.composable_styles.utils

fun <T> randomlyEither(a: T, b: T) = if (Math.random() > 0.5) a else b