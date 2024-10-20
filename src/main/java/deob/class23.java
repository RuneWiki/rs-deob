package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("j")
public final class class23 implements class159, MouseWheelListener {

    @ObfuscatedName("j.o")
    public int field119 = 0;

    @ObfuscatedName("j.o(Ljava/awt/Component;I)V")
    public void method276(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("j.q(Ljava/awt/Component;I)V")
    public void method277(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field119 += arg0.getWheelRotation();
    }

    @ObfuscatedName("j.l(I)I")
    public synchronized int method280() {
        int var1 = this.field119;
        this.field119 = 0;
        return var1;
    }
}
