package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("am")
public final class class44 implements class170, MouseWheelListener {

    @ObfuscatedName("am.m")
    public int field353 = 0;

    @ObfuscatedName("am.m(Ljava/awt/Component;B)V")
    public void method674(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("am.f(Ljava/awt/Component;I)V")
    public void method675(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field353 += arg0.getWheelRotation();
    }

    @ObfuscatedName("am.q(I)I")
    public synchronized int method676() {
        int var1 = this.field353;
        this.field353 = 0;
        return var1;
    }
}
