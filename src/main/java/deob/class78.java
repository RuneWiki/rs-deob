package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bx")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bx.f")
    public int field1390 = 0;

    @ObfuscatedName("bx.t(Ljava/awt/Component;B)V")
    public void method1385(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bx.n(Ljava/awt/Component;B)V")
    public void method1376(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1390 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bx.e(I)I")
    public synchronized int method1377() {
        int var1 = this.field1390;
        this.field1390 = 0;
        return var1;
    }
}
