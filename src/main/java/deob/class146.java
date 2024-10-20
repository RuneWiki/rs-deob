package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ep")
public class class146 extends class132 implements MouseWheelListener {

    @ObfuscatedName("ep.b")
    public int field2195 = 0;

    @ObfuscatedName("ep.g(Ljava/awt/Component;I)V")
    public void method2696(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ep.j(Ljava/awt/Component;I)V")
    public void method2690(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2195 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ep.d(B)I")
    public synchronized int method2691() {
        int var1 = this.field2195;
        this.field2195 = 0;
        return var1;
    }
}
