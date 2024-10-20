package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ae")
public final class class22 implements class213, MouseWheelListener {

    @ObfuscatedName("ae.at")
    public int field107 = 0;

    @ObfuscatedName("ae.at(Ljava/awt/Component;I)V")
    public void method299(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ae.ah(Ljava/awt/Component;B)V")
    public void method300(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field107 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ae.ar(I)I")
    public synchronized int method298() {
        int var1 = this.field107;
        this.field107 = 0;
        return var1;
    }
}
