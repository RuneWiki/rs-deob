package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("al")
public final class class44 implements class164, MouseWheelListener {

    @ObfuscatedName("al.a")
    public int field382 = 0;

    @ObfuscatedName("al.a(Ljava/awt/Component;I)V")
    public void method670(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("al.s(Ljava/awt/Component;I)V")
    public void method671(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field382 += arg0.getWheelRotation();
    }

    @ObfuscatedName("al.g(B)I")
    public synchronized int method672() {
        int var1 = this.field382;
        this.field382 = 0;
        return var1;
    }
}
