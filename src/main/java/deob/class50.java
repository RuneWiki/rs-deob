package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("at")
public final class class50 implements class159, MouseWheelListener {

    @ObfuscatedName("at.p")
    public int field570 = 0;

    @ObfuscatedName("at.p(Ljava/awt/Component;I)V")
    public void method635(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("at.i(Ljava/awt/Component;B)V")
    public void method636(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field570 += arg0.getWheelRotation();
    }

    @ObfuscatedName("at.w(I)I")
    public synchronized int method638() {
        int var1 = this.field570;
        this.field570 = 0;
        return var1;
    }
}
