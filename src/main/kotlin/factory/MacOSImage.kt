package factory

internal class MacOSImage : Image {
    override fun showImage(uri: String) {
        println("show image on MacOS $uri")
    }
}