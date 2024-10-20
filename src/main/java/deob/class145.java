package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ew")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ew.n")
    public int field2196 = 0;

    @ObfuscatedName("ew.d(Ljava/awt/Component;B)V")
    public void method2658(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ew.s(Ljava/awt/Component;I)V")
    public void method2653(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2196 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ew.q(S)I")
    public synchronized int method2654() {
        int var1 = this.field2196;
        this.field2196 = 0;
        return var1;
    }
}
