package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ey")
public class class134 extends class120 implements MouseWheelListener {

    @ObfuscatedName("ey.l")
    public int field2048 = 0;

    @ObfuscatedName("ey.y(Ljava/awt/Component;B)V")
    public void method2449(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ey.g(Ljava/awt/Component;B)V")
    public void method2447(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2048 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ey.j(I)I")
    public synchronized int method2456() {
        int var1 = this.field2048;
        this.field2048 = 0;
        return var1;
    }
}
