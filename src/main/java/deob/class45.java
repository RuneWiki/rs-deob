package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ap")
public final class class45 implements class169, MouseWheelListener {

    @ObfuscatedName("ap.u")
    public int field378 = 0;

    @ObfuscatedName("ap.u(Ljava/awt/Component;S)V")
    public void method682(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ap.f(Ljava/awt/Component;I)V")
    public void method676(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field378 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ap.b(I)I")
    public synchronized int method677() {
        int var1 = this.field378;
        this.field378 = 0;
        return var1;
    }
}
