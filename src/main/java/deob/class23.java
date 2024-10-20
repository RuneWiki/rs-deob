package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("n")
public final class class23 implements class159, MouseWheelListener {

    @ObfuscatedName("n.c")
    public int field124 = 0;

    @ObfuscatedName("n.c(Ljava/awt/Component;B)V")
    public void method265(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("n.v(Ljava/awt/Component;B)V")
    public void method262(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field124 += arg0.getWheelRotation();
    }

    @ObfuscatedName("n.q(B)I")
    public synchronized int method266() {
        int var1 = this.field124;
        this.field124 = 0;
        return var1;
    }
}
