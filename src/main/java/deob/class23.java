package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("c")
public final class class23 implements class145, MouseWheelListener {

    @ObfuscatedName("c.i")
    public int field106 = 0;

    @ObfuscatedName("c.i(Ljava/awt/Component;I)V")
    public void method306(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("c.w(Ljava/awt/Component;I)V")
    public void method313(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field106 += arg0.getWheelRotation();
    }

    @ObfuscatedName("c.s(I)I")
    public synchronized int method307() {
        int var1 = this.field106;
        this.field106 = 0;
        return var1;
    }
}
