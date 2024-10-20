package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bh")
public final class class54 implements class178, MouseWheelListener {

    @ObfuscatedName("bh.m")
    public int field398 = 0;

    @ObfuscatedName("bh.m(Ljava/awt/Component;I)V")
    public void method710(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bh.o(Ljava/awt/Component;B)V")
    public void method711(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field398 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bh.q(I)I")
    public synchronized int method712() {
        int var1 = this.field398;
        this.field398 = 0;
        return var1;
    }
}
