package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("et")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("et.z")
    public int field2216 = 0;

    @ObfuscatedName("et.q(Ljava/awt/Component;I)V")
    public void method2626(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("et.k(Ljava/awt/Component;I)V")
    public void method2625(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2216 += arg0.getWheelRotation();
    }

    @ObfuscatedName("et.f(B)I")
    public synchronized int method2630() {
        int var1 = this.field2216;
        this.field2216 = 0;
        return var1;
    }
}
