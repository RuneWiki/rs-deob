package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ez")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("ez.a")
    public int field2279 = 0;

    @ObfuscatedName("ez.a(Ljava/awt/Component;I)V")
    public void method2738(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ez.d(Ljava/awt/Component;B)V")
    public void method2740(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2279 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ez.v(B)I")
    public synchronized int method2748() {
        int var1 = this.field2279;
        this.field2279 = 0;
        return var1;
    }
}
