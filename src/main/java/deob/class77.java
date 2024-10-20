package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bc")
public class class77 extends class65 implements MouseWheelListener {

    @ObfuscatedName("bc.p")
    public int field1405 = 0;

    @ObfuscatedName("bc.p(Ljava/awt/Component;I)V")
    public void method1314(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bc.j(Ljava/awt/Component;I)V")
    public void method1320(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1405 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bc.w(I)I")
    public synchronized int method1316() {
        int var1 = this.field1405;
        this.field1405 = 0;
        return var1;
    }
}
