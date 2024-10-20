package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("em")
public class class134 extends class120 implements MouseWheelListener {

    @ObfuscatedName("em.c")
    public int field2053 = 0;

    @ObfuscatedName("em.j(Ljava/awt/Component;I)V")
    public void method2452(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("em.y(Ljava/awt/Component;B)V")
    public void method2463(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2053 += arg0.getWheelRotation();
    }

    @ObfuscatedName("em.r(I)I")
    public synchronized int method2453() {
        int var1 = this.field2053;
        this.field2053 = 0;
        return var1;
    }
}
