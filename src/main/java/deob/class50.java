package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ap")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("ap.n")
    public int field617 = 0;

    @ObfuscatedName("ap.n(Ljava/awt/Component;I)V")
    public void method629(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ap.p(Ljava/awt/Component;I)V")
    public void method628(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field617 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ap.i(B)I")
    public synchronized int method631() {
        int var1 = this.field617;
        this.field617 = 0;
        return var1;
    }
}
