package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("es")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("es.a")
    public int field2198 = 0;

    @ObfuscatedName("es.r(Ljava/awt/Component;I)V")
    public void method2671(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("es.f(Ljava/awt/Component;I)V")
    public void method2666(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2198 += arg0.getWheelRotation();
    }

    @ObfuscatedName("es.s(I)I")
    public synchronized int method2667() {
        int var1 = this.field2198;
        this.field2198 = 0;
        return var1;
    }
}
