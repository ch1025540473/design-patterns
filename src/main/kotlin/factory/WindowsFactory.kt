package factory

class WindowsFactory : GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createImage(): Image {
        return WindowsImage()
    }
}