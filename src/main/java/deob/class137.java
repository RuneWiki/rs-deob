package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ea")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("ea.n")
    public int field2118 = 0;

    @ObfuscatedName("ea.g(Ljava/awt/Component;I)V")
    public void method2524(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ea.a(Ljava/awt/Component;I)V")
    public void method2525(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2118 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ea.m(B)I")
    public synchronized int method2527() {
        int var1 = this.field2118;
        this.field2118 = 0;
        return var1;
    }
}
