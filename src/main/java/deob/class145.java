package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eg")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("eg.f")
    public int field2198 = 0;

    @ObfuscatedName("eg.f(Ljava/awt/Component;I)V")
    public void method2661(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eg.s(Ljava/awt/Component;B)V")
    public void method2667(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2198 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eg.q(I)I")
    public synchronized int method2662() {
        int var1 = this.field2198;
        this.field2198 = 0;
        return var1;
    }
}
