package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ab")
public final class class50 implements class158, MouseWheelListener {

    @ObfuscatedName("ab.d")
    public int field594 = 0;

    @ObfuscatedName("ab.d(Ljava/awt/Component;I)V")
    public void method655(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ab.x(Ljava/awt/Component;I)V")
    public void method652(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field594 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ab.k(I)I")
    public synchronized int method651() {
        int var1 = this.field594;
        this.field594 = 0;
        return var1;
    }
}
