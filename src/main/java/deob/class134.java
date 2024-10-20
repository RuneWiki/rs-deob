package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ef")
public class class134 extends class120 implements MouseWheelListener {

    @ObfuscatedName("ef.f")
    public int field2088 = 0;

    @ObfuscatedName("ef.k(Ljava/awt/Component;B)V")
    public void method2475(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ef.y(Ljava/awt/Component;B)V")
    public void method2476(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2088 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ef.e(B)I")
    public synchronized int method2477() {
        int var1 = this.field2088;
        this.field2088 = 0;
        return var1;
    }
}
