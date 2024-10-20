package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bg")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bg.q")
    public int field1410 = 0;

    @ObfuscatedName("bg.q(Ljava/awt/Component;I)V")
    public void method1370(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bg.c(Ljava/awt/Component;I)V")
    public void method1377(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1410 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bg.p(I)I")
    public synchronized int method1372() {
        int var1 = this.field1410;
        this.field1410 = 0;
        return var1;
    }
}
