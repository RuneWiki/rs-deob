package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("en")
public class class134 extends class120 implements MouseWheelListener {

    @ObfuscatedName("en.e")
    public int field2070 = 0;

    @ObfuscatedName("en.v(Ljava/awt/Component;I)V")
    public void method2445(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("en.k(Ljava/awt/Component;I)V")
    public void method2444(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2070 += arg0.getWheelRotation();
    }

    @ObfuscatedName("en.g(I)I")
    public synchronized int method2447() {
        int var1 = this.field2070;
        this.field2070 = 0;
        return var1;
    }
}
