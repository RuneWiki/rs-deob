package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("em")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("em.x")
    public int field2266 = 0;

    @ObfuscatedName("em.x(Ljava/awt/Component;I)V")
    public void method2733(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("em.r(Ljava/awt/Component;I)V")
    public void method2734(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2266 += arg0.getWheelRotation();
    }

    @ObfuscatedName("em.j(I)I")
    public synchronized int method2735() {
        int var1 = this.field2266;
        this.field2266 = 0;
        return var1;
    }
}
