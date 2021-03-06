package memoizrlabs.com.composable_styles.app.styles

interface AppTheme {
    val accent: Int
    val primaryDark: Int
}

class DefaultTheme : AppTheme {
    override val accent: Int get() = Colors.Red
    override val primaryDark: Int get() = Colors.Gray
}

class InvertedTheme : AppTheme by DefaultTheme() {
    override val accent: Int get() = Colors.Blue
}
