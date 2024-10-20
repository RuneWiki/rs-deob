package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eq")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("eq.t")
    public int field2097 = 0;

    @ObfuscatedName("eq.b(Ljava/awt/Component;I)V")
    public void method2508(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eq.p(Ljava/awt/Component;B)V")
    public void method2498(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2097 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eq.e(B)I")
    public synchronized int method2496() {
        int var1 = this.field2097;
        this.field2097 = 0;
        return var1;
    }
}
