package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eb")
public class class146 extends class132 implements MouseWheelListener {

    @ObfuscatedName("eb.e")
    public int field2208 = 0;

    @ObfuscatedName("eb.w(Ljava/awt/Component;I)V")
    public void method2649(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eb.f(Ljava/awt/Component;B)V")
    public void method2650(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2208 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eb.s(I)I")
    public synchronized int method2651() {
        int var1 = this.field2208;
        this.field2208 = 0;
        return var1;
    }
}
