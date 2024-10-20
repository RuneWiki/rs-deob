package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("au")
public final class class45 implements class169, MouseWheelListener {

    @ObfuscatedName("au.q")
    public int field385 = 0;

    @ObfuscatedName("au.q(Ljava/awt/Component;B)V")
    public void method634(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("au.w(Ljava/awt/Component;I)V")
    public void method635(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field385 += arg0.getWheelRotation();
    }

    @ObfuscatedName("au.e(I)I")
    public synchronized int method640() {
        int var1 = this.field385;
        this.field385 = 0;
        return var1;
    }
}
