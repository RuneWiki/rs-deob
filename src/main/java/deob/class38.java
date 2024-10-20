package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("am")
public final class class38 implements class130, MouseWheelListener {

    @ObfuscatedName("am.v")
    public int field274 = 0;

    @ObfuscatedName("am.v(Ljava/awt/Component;I)V")
    public void method257(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("am.n(Ljava/awt/Component;I)V")
    public void method253(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field274 += arg0.getWheelRotation();
    }

    @ObfuscatedName("am.f(I)I")
    public synchronized int method254() {
        int var1 = this.field274;
        this.field274 = 0;
        return var1;
    }
}
