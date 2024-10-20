package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bj")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bj.a")
    public int field1378 = 0;

    @ObfuscatedName("bj.r(Ljava/awt/Component;I)V")
    public void method1290(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bj.u(Ljava/awt/Component;I)V")
    public void method1291(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1378 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bj.t(I)I")
    public synchronized int method1292() {
        int var1 = this.field1378;
        this.field1378 = 0;
        return var1;
    }
}
