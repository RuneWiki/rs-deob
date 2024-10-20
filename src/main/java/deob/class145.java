package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eb")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("eb.g")
    public int field2208 = 0;

    @ObfuscatedName("eb.g(Ljava/awt/Component;I)V")
    public void method2694(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eb.b(Ljava/awt/Component;B)V")
    public void method2695(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2208 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eb.w(I)I")
    public synchronized int method2708() {
        int var1 = this.field2208;
        this.field2208 = 0;
        return var1;
    }
}
