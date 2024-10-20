package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ak")
public final class class50 implements class158, MouseWheelListener {

    @ObfuscatedName("ak.j")
    public int field631 = 0;

    @ObfuscatedName("ak.j(Ljava/awt/Component;I)V")
    public void method659(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ak.h(Ljava/awt/Component;I)V")
    public void method660(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field631 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ak.f(I)I")
    public synchronized int method663() {
        int var1 = this.field631;
        this.field631 = 0;
        return var1;
    }
}
