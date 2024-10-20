package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bc")
public final class class54 implements class178, MouseWheelListener {

    @ObfuscatedName("bc.x")
    public int field413 = 0;

    @ObfuscatedName("bc.x(Ljava/awt/Component;I)V")
    public void method750(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bc.m(Ljava/awt/Component;I)V")
    public void method751(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field413 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bc.k(I)I")
    public synchronized int method754() {
        int var1 = this.field413;
        this.field413 = 0;
        return var1;
    }
}
