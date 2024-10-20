package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aj")
public final class class22 implements class222, MouseWheelListener {

    @ObfuscatedName("aj.ac")
    public int field87 = 0;

    @ObfuscatedName("aj.ac(Ljava/awt/Component;B)V")
    public void method297(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aj.ae(Ljava/awt/Component;I)V")
    public void method296(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field87 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aj.ag(I)I")
    public synchronized int method298() {
        int var1 = this.field87;
        this.field87 = 0;
        return var1;
    }
}
