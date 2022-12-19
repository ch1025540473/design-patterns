package factory

class MacOSFactory : GUIFactory {
    override fun createButton(): Button {
        return MacOSButton()
    }

    override fun createImage(): Image {
        return MacOSImage()
    }
}