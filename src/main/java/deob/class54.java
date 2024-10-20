package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bc")
public final class class54 implements class178, MouseWheelListener {

    @ObfuscatedName("bc.z")
    public int field398 = 0;

    @ObfuscatedName("bc.z(Ljava/awt/Component;I)V")
    public void method716(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bc.k(Ljava/awt/Component;I)V")
    public void method713(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field398 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bc.s(I)I")
    public synchronized int method714() {
        int var1 = this.field398;
        this.field398 = 0;
        return var1;
    }
}
