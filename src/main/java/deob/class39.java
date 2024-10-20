package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ax")
public final class class39 implements class159, MouseWheelListener {

    @ObfuscatedName("ax.f")
    public int field361 = 0;

    @ObfuscatedName("ax.f(Ljava/awt/Component;I)V")
    public void method618(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ax.l(Ljava/awt/Component;B)V")
    public void method619(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field361 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ax.w(I)I")
    public synchronized int method621() {
        int var1 = this.field361;
        this.field361 = 0;
        return var1;
    }
}
