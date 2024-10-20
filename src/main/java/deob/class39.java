package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ax")
public final class class39 implements class159, MouseWheelListener {

    @ObfuscatedName("ax.c")
    public int field352 = 0;

    @ObfuscatedName("ax.c(Ljava/awt/Component;B)V")
    public void method629(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ax.q(Ljava/awt/Component;B)V")
    public void method630(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field352 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ax.m(I)I")
    public synchronized int method628() {
        int var1 = this.field352;
        this.field352 = 0;
        return var1;
    }
}
