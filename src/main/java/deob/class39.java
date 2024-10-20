package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ac")
public final class class39 implements class159, MouseWheelListener {

    @ObfuscatedName("ac.f")
    public int field327 = 0;

    @ObfuscatedName("ac.f(Ljava/awt/Component;I)V")
    public void method608(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ac.h(Ljava/awt/Component;I)V")
    public void method610(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field327 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ac.e(S)I")
    public synchronized int method615() {
        int var1 = this.field327;
        this.field327 = 0;
        return var1;
    }
}
