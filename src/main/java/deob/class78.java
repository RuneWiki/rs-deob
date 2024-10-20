package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bs")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bs.l")
    public int field1390 = 0;

    @ObfuscatedName("bs.b(Ljava/awt/Component;I)V")
    public void method1376(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bs.o(Ljava/awt/Component;B)V")
    public void method1379(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1390 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bs.w(B)I")
    public synchronized int method1375() {
        int var1 = this.field1390;
        this.field1390 = 0;
        return var1;
    }
}
