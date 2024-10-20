package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aj")
public final class class51 implements class169, MouseWheelListener {

    @ObfuscatedName("aj.o")
    public int field610 = 0;

    @ObfuscatedName("aj.o(Ljava/awt/Component;I)V")
    public void method670(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aj.k(Ljava/awt/Component;I)V")
    public void method664(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field610 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aj.t(S)I")
    public synchronized int method665() {
        int var1 = this.field610;
        this.field610 = 0;
        return var1;
    }
}
