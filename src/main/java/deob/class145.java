package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eo")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("eo.j")
    public int field2196 = 0;

    @ObfuscatedName("eo.j(Ljava/awt/Component;I)V")
    public void method2696(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eo.m(Ljava/awt/Component;I)V")
    public void method2698(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2196 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eo.f(I)I")
    public synchronized int method2699() {
        int var1 = this.field2196;
        this.field2196 = 0;
        return var1;
    }
}
