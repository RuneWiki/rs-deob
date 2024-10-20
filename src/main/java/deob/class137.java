package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ep")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("ep.y")
    public int field2133 = 0;

    @ObfuscatedName("ep.y(Ljava/awt/Component;I)V")
    public void method2491(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ep.k(Ljava/awt/Component;I)V")
    public void method2492(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2133 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ep.g(B)I")
    public synchronized int method2490() {
        int var1 = this.field2133;
        this.field2133 = 0;
        return var1;
    }
}
