package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aq")
public final class class45 implements class169, MouseWheelListener {

    @ObfuscatedName("aq.s")
    public int field360 = 0;

    @ObfuscatedName("aq.s(Ljava/awt/Component;I)V")
    public void method640(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aq.j(Ljava/awt/Component;I)V")
    public void method644(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field360 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aq.i(I)I")
    public synchronized int method642() {
        int var1 = this.field360;
        this.field360 = 0;
        return var1;
    }
}
