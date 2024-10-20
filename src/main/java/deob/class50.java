package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("au")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("au.w")
    public int field639 = 0;

    @ObfuscatedName("au.w(Ljava/awt/Component;B)V")
    public void method636(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("au.s(Ljava/awt/Component;I)V")
    public void method637(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field639 += arg0.getWheelRotation();
    }

    @ObfuscatedName("au.q(B)I")
    public synchronized int method638() {
        int var1 = this.field639;
        this.field639 = 0;
        return var1;
    }
}
