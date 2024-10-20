package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bq")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bq.j")
    public int field1413 = 0;

    @ObfuscatedName("bq.j(Ljava/awt/Component;I)V")
    public void method1361(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bq.f(Ljava/awt/Component;I)V")
    public void method1362(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1413 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bq.o(B)I")
    public synchronized int method1365() {
        int var1 = this.field1413;
        this.field1413 = 0;
        return var1;
    }
}
