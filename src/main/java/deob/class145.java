package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ep")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ep.m")
    public int field2182 = 0;

    @ObfuscatedName("ep.m(Ljava/awt/Component;I)V")
    public void method2711(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ep.l(Ljava/awt/Component;I)V")
    public void method2702(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2182 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ep.y(I)I")
    public synchronized int method2703() {
        int var1 = this.field2182;
        this.field2182 = 0;
        return var1;
    }
}
