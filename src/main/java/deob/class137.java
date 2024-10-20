package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eu")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("eu.b")
    public int field2111 = 0;

    @ObfuscatedName("eu.e(Ljava/awt/Component;I)V")
    public void method2449(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eu.a(Ljava/awt/Component;B)V")
    public void method2448(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2111 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eu.k(I)I")
    public synchronized int method2450() {
        int var1 = this.field2111;
        this.field2111 = 0;
        return var1;
    }
}
