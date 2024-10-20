package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ac")
public final class class51 implements class169, MouseWheelListener {

    @ObfuscatedName("ac.t")
    public int field590 = 0;

    @ObfuscatedName("ac.t(Ljava/awt/Component;B)V")
    public void method680(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ac.q(Ljava/awt/Component;B)V")
    public void method681(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field590 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ac.i(I)I")
    public synchronized int method683() {
        int var1 = this.field590;
        this.field590 = 0;
        return var1;
    }
}
