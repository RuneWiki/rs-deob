package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("be")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("be.t")
    public int field1441 = 0;

    @ObfuscatedName("be.t(Ljava/awt/Component;I)V")
    public void method1370(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("be.l(Ljava/awt/Component;I)V")
    public void method1372(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1441 += arg0.getWheelRotation();
    }

    @ObfuscatedName("be.c(B)I")
    public synchronized int method1369() {
        int var1 = this.field1441;
        this.field1441 = 0;
        return var1;
    }
}
