package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eq")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("eq.p")
    public int field2116 = 0;

    @ObfuscatedName("eq.k(Ljava/awt/Component;B)V")
    public void method2508(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eq.e(Ljava/awt/Component;I)V")
    public void method2513(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2116 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eq.f(I)I")
    public synchronized int method2504() {
        int var1 = this.field2116;
        this.field2116 = 0;
        return var1;
    }
}
