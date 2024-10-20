package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ep")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ep.h")
    public int field2195 = 0;

    @ObfuscatedName("ep.q(Ljava/awt/Component;I)V")
    public void method2704(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ep.v(Ljava/awt/Component;I)V")
    public void method2705(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2195 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ep.n(I)I")
    public synchronized int method2706() {
        int var1 = this.field2195;
        this.field2195 = 0;
        return var1;
    }
}
