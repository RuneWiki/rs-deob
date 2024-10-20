package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ak")
public final class class22 implements class175, MouseWheelListener {

    @ObfuscatedName("ak.aw")
    public int field116 = 0;

    @ObfuscatedName("ak.aw(Ljava/awt/Component;I)V")
    public void method295(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ak.ay(Ljava/awt/Component;I)V")
    public void method293(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field116 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ak.ar(I)I")
    public synchronized int method294() {
        int var1 = this.field116;
        this.field116 = 0;
        return var1;
    }
}
