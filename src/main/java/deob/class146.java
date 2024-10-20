package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ee")
public class class146 extends class132 implements MouseWheelListener {

    @ObfuscatedName("ee.w")
    public int field2231 = 0;

    @ObfuscatedName("ee.w(Ljava/awt/Component;I)V")
    public void method2686(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ee.x(Ljava/awt/Component;B)V")
    public void method2687(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2231 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ee.t(B)I")
    public synchronized int method2688() {
        int var1 = this.field2231;
        this.field2231 = 0;
        return var1;
    }
}
