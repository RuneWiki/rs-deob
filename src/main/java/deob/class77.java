package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bb")
public class class77 extends class65 implements MouseWheelListener {

    @ObfuscatedName("bb.v")
    public int field1384 = 0;

    @ObfuscatedName("bb.v(Ljava/awt/Component;S)V")
    public void method1386(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bb.f(Ljava/awt/Component;I)V")
    public void method1397(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1384 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bb.n(I)I")
    public synchronized int method1388() {
        int var1 = this.field1384;
        this.field1384 = 0;
        return var1;
    }
}
