package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ep")
public class class134 extends class120 implements MouseWheelListener {

    @ObfuscatedName("ep.g")
    public int field2050 = 0;

    @ObfuscatedName("ep.j(Ljava/awt/Component;I)V")
    public void method2410(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ep.z(Ljava/awt/Component;B)V")
    public void method2400(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2050 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ep.b(B)I")
    public synchronized int method2406() {
        int var1 = this.field2050;
        this.field2050 = 0;
        return var1;
    }
}
