package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aq")
public final class class45 implements class169, MouseWheelListener {

    @ObfuscatedName("aq.c")
    public int field366 = 0;

    @ObfuscatedName("aq.c(Ljava/awt/Component;I)V")
    public void method640(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aq.x(Ljava/awt/Component;I)V")
    public void method641(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field366 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aq.t(I)I")
    public synchronized int method649() {
        int var1 = this.field366;
        this.field366 = 0;
        return var1;
    }
}
