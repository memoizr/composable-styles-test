package memoizrlabs.com.fastviewtest

interface CustomTheme {
    val accent: Int
    val primaryDark: Int
}

class DefaultTheme : CustomTheme {
    override val accent: Int get() = Colors.Red
    override val primaryDark: Int get() = Colors.Gray
}

class InvertedTheme : CustomTheme by DefaultTheme() {
    override val accent: Int get() = Colors.Blue
}
