package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("be")
public class class77 extends class65 implements MouseWheelListener {

    @ObfuscatedName("be.u")
    public int field1382 = 0;

    @ObfuscatedName("be.k(Ljava/awt/Component;I)V")
    public void method1344(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("be.x(Ljava/awt/Component;I)V")
    public void method1345(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1382 += arg0.getWheelRotation();
    }

    @ObfuscatedName("be.m(B)I")
    public synchronized int method1346() {
        int var1 = this.field1382;
        this.field1382 = 0;
        return var1;
    }
}
