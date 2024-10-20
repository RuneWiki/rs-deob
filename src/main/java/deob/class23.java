package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("j")
public final class class23 implements class159, MouseWheelListener {

    @ObfuscatedName("j.v")
    public int field118 = 0;

    @ObfuscatedName("j.v(Ljava/awt/Component;I)V")
    public void method301(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("j.c(Ljava/awt/Component;I)V")
    public void method307(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field118 += arg0.getWheelRotation();
    }

    @ObfuscatedName("j.i(I)I")
    public synchronized int method302() {
        int var1 = this.field118;
        this.field118 = 0;
        return var1;
    }
}
