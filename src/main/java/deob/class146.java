package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("el")
public class class146 extends class132 implements MouseWheelListener {

    @ObfuscatedName("el.f")
    public int field2210 = 0;

    @ObfuscatedName("el.f(Ljava/awt/Component;B)V")
    public void method2687(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("el.u(Ljava/awt/Component;I)V")
    public void method2680(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2210 += arg0.getWheelRotation();
    }

    @ObfuscatedName("el.x(I)I")
    public synchronized int method2681() {
        int var1 = this.field2210;
        this.field2210 = 0;
        return var1;
    }
}
