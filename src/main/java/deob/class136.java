package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ef")
public class class136 extends class122 implements MouseWheelListener {

    @ObfuscatedName("ef.v")
    public int field2073 = 0;

    @ObfuscatedName("ef.v(Ljava/awt/Component;I)V")
    public void method2477(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ef.t(Ljava/awt/Component;I)V")
    public void method2476(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2073 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ef.f(B)I")
    public synchronized int method2482() {
        int var1 = this.field2073;
        this.field2073 = 0;
        return var1;
    }
}
