package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bv")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bv.y")
    public int field1404 = 0;

    @ObfuscatedName("bv.y(Ljava/awt/Component;I)V")
    public void method1353(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bv.m(Ljava/awt/Component;B)V")
    public void method1354(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1404 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bv.d(B)I")
    public synchronized int method1355() {
        int var1 = this.field1404;
        this.field1404 = 0;
        return var1;
    }
}
