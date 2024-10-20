package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eq")
public class class146 extends class132 implements MouseWheelListener {

    @ObfuscatedName("eq.s")
    public int field2222 = 0;

    @ObfuscatedName("eq.s(Ljava/awt/Component;B)V")
    public void method2663(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eq.j(Ljava/awt/Component;S)V")
    public void method2662(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2222 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eq.p(I)I")
    public synchronized int method2664() {
        int var1 = this.field2222;
        this.field2222 = 0;
        return var1;
    }
}
