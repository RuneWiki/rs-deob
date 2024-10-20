package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("i")
public final class class23 implements class160, MouseWheelListener {

    @ObfuscatedName("i.c")
    public int field122 = 0;

    @ObfuscatedName("i.c(Ljava/awt/Component;S)V")
    public void method319(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("i.p(Ljava/awt/Component;I)V")
    public void method320(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field122 += arg0.getWheelRotation();
    }

    @ObfuscatedName("i.f(B)I")
    public synchronized int method322() {
        int var1 = this.field122;
        this.field122 = 0;
        return var1;
    }
}
