package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("em")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("em.y")
    public int field2193 = 0;

    @ObfuscatedName("em.d(Ljava/awt/Component;I)V")
    public void method2646(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("em.g(Ljava/awt/Component;I)V")
    public void method2637(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2193 += arg0.getWheelRotation();
    }

    @ObfuscatedName("em.w(I)I")
    public synchronized int method2638() {
        int var1 = this.field2193;
        this.field2193 = 0;
        return var1;
    }
}
