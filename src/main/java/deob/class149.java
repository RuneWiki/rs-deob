package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ey")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("ey.s")
    public int field2253 = 0;

    @ObfuscatedName("ey.s(Ljava/awt/Component;I)V")
    public void method2707(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ey.z(Ljava/awt/Component;B)V")
    public void method2708(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2253 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ey.t(I)I")
    public synchronized int method2712() {
        int var1 = this.field2253;
        this.field2253 = 0;
        return var1;
    }
}
