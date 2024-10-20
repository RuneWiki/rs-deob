package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aw")
public final class class50 implements class158, MouseWheelListener {

    @ObfuscatedName("aw.s")
    public int field619 = 0;

    @ObfuscatedName("aw.s(Ljava/awt/Component;I)V")
    public void method632(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aw.c(Ljava/awt/Component;B)V")
    public void method633(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field619 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aw.f(I)I")
    public synchronized int method635() {
        int var1 = this.field619;
        this.field619 = 0;
        return var1;
    }
}
