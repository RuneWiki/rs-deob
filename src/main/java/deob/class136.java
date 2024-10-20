package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ef")
public class class136 extends class122 implements MouseWheelListener {

    @ObfuscatedName("ef.b")
    public int field2080 = 0;

    @ObfuscatedName("ef.e(Ljava/awt/Component;I)V")
    public void method2443(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ef.i(Ljava/awt/Component;B)V")
    public void method2444(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2080 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ef.k(I)I")
    public synchronized int method2445() {
        int var1 = this.field2080;
        this.field2080 = 0;
        return var1;
    }
}
