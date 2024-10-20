package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("x")
public final class class23 implements class155, MouseWheelListener {

    @ObfuscatedName("x.c")
    public int field120 = 0;

    @ObfuscatedName("x.c(Ljava/awt/Component;I)V")
    public void method340(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("x.b(Ljava/awt/Component;B)V")
    public void method337(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field120 += arg0.getWheelRotation();
    }

    @ObfuscatedName("x.p(B)I")
    public synchronized int method339() {
        int var1 = this.field120;
        this.field120 = 0;
        return var1;
    }
}
