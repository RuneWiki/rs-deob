package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aq")
public final class class22 implements class177, MouseWheelListener {

    @ObfuscatedName("aq.az")
    public int field96 = 0;

    @ObfuscatedName("aq.az(Ljava/awt/Component;I)V")
    public void method278(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aq.ah(Ljava/awt/Component;B)V")
    public void method281(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field96 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aq.af(B)I")
    public synchronized int method275() {
        int var1 = this.field96;
        this.field96 = 0;
        return var1;
    }
}
