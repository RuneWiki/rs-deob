package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ei")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ei.l")
    public int field2210 = 0;

    @ObfuscatedName("ei.l(Ljava/awt/Component;I)V")
    public void method2686(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ei.e(Ljava/awt/Component;S)V")
    public void method2687(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2210 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ei.q(I)I")
    public synchronized int method2688() {
        int var1 = this.field2210;
        this.field2210 = 0;
        return var1;
    }
}
