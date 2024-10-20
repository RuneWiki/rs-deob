package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bt")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bt.i")
    public int field1404 = 0;

    @ObfuscatedName("bt.i(Ljava/awt/Component;B)V")
    public void method1342(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bt.w(Ljava/awt/Component;I)V")
    public void method1345(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1404 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bt.f(B)I")
    public synchronized int method1344() {
        int var1 = this.field1404;
        this.field1404 = 0;
        return var1;
    }
}
