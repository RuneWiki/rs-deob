package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("cg")
public class class79 extends class67 implements MouseWheelListener {

    @ObfuscatedName("cg.e")
    public int field1408 = 0;

    @ObfuscatedName("cg.e(Ljava/awt/Component;I)V")
    public void method1407(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("cg.i(Ljava/awt/Component;I)V")
    public void method1408(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1408 += arg0.getWheelRotation();
    }

    @ObfuscatedName("cg.k(I)I")
    public synchronized int method1413() {
        int var1 = this.field1408;
        this.field1408 = 0;
        return var1;
    }
}
