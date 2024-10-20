package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ak")
public final class class22 implements class171, MouseWheelListener {

    @ObfuscatedName("ak.af")
    public int field114 = 0;

    @ObfuscatedName("ak.af(Ljava/awt/Component;I)V")
    public void method302(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ak.an(Ljava/awt/Component;I)V")
    public void method301(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field114 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ak.aw(I)I")
    public synchronized int method300() {
        int var1 = this.field114;
        this.field114 = 0;
        return var1;
    }
}
