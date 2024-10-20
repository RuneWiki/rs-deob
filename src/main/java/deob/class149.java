package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eq")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("eq.l")
    public int field2272 = 0;

    @ObfuscatedName("eq.g(Ljava/awt/Component;I)V")
    public void method2829(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eq.r(Ljava/awt/Component;S)V")
    public void method2830(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2272 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eq.e(I)I")
    public synchronized int method2831() {
        int var1 = this.field2272;
        this.field2272 = 0;
        return var1;
    }
}
