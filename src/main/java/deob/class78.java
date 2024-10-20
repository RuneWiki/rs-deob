package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bh")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bh.p")
    public int field1391 = 0;

    @ObfuscatedName("bh.l(Ljava/awt/Component;B)V")
    public void method1401(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bh.d(Ljava/awt/Component;I)V")
    public void method1410(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1391 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bh.x(I)I")
    public synchronized int method1402() {
        int var1 = this.field1391;
        this.field1391 = 0;
        return var1;
    }
}
