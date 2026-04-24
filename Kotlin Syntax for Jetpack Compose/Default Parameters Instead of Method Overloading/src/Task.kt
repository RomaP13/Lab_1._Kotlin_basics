fun Icon(iconId: Int, tint: String = "Black", size: Int = 24, contentDescription: String? = null): String {
    return "Icon $iconId ($contentDescription)"
}
fun drawIcon(): String {
    return Icon(101, contentDescription="Search")
}