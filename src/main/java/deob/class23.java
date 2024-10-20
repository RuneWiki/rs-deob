package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("t")
public final class class23 implements class155, MouseWheelListener {

    @ObfuscatedName("t.c")
    public int field123 = 0;

    @ObfuscatedName("t.c(Ljava/awt/Component;I)V")
    public void method301(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("t.l(Ljava/awt/Component;I)V")
    public void method309(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field123 += arg0.getWheelRotation();
    }

    @ObfuscatedName("t.s(I)I")
    public synchronized int method307() {
        int var1 = this.field123;
        this.field123 = 0;
        return var1;
    }
}
