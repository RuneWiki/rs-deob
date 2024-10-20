package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aq")
public final class class22 implements class177, MouseWheelListener {

    @ObfuscatedName("aq.ac")
    public int field111 = 0;

    @ObfuscatedName("aq.ac(Ljava/awt/Component;I)V")
    public void method291(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aq.al(Ljava/awt/Component;I)V")
    public void method292(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field111 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aq.ak(I)I")
    public synchronized int method293() {
        int var1 = this.field111;
        this.field111 = 0;
        return var1;
    }
}
