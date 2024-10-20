package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ab")
public final class class39 implements class159, MouseWheelListener {

    @ObfuscatedName("ab.y")
    public int field354 = 0;

    @ObfuscatedName("ab.y(Ljava/awt/Component;I)V")
    public void method615(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ab.c(Ljava/awt/Component;B)V")
    public void method606(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field354 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ab.n(I)I")
    public synchronized int method608() {
        int var1 = this.field354;
        this.field354 = 0;
        return var1;
    }
}
