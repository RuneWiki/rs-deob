package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("r")
public final class class23 implements class145, MouseWheelListener {

    @ObfuscatedName("r.n")
    public int field114 = 0;

    @ObfuscatedName("r.n(Ljava/awt/Component;B)V")
    public void method323(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("r.c(Ljava/awt/Component;I)V")
    public void method321(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field114 += arg0.getWheelRotation();
    }

    @ObfuscatedName("r.m(I)I")
    public synchronized int method325() {
        int var1 = this.field114;
        this.field114 = 0;
        return var1;
    }
}
