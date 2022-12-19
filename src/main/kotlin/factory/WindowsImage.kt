package factory

internal class WindowsImage : Image {
    override fun showImage(uri: String) {
        println("show image on Windows $uri")
    }
}