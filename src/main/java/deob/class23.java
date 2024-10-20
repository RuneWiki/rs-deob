package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("r")
public final class class23 implements class145, MouseWheelListener {

    @ObfuscatedName("r.l")
    public int field114 = 0;

    @ObfuscatedName("r.l(Ljava/awt/Component;I)V")
    public void method318(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("r.q(Ljava/awt/Component;S)V")
    public void method323(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field114 += arg0.getWheelRotation();
    }

    @ObfuscatedName("r.f(I)I")
    public synchronized int method316() {
        int var1 = this.field114;
        this.field114 = 0;
        return var1;
    }
}
