package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bc")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bc.p")
    public int field1408 = 0;

    @ObfuscatedName("bc.p(Ljava/awt/Component;I)V")
    public void method1380(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bc.i(Ljava/awt/Component;I)V")
    public void method1389(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1408 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bc.o(I)I")
    public synchronized int method1382() {
        int var1 = this.field1408;
        this.field1408 = 0;
        return var1;
    }
}
