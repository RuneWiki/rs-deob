package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ah")
public final class class22 implements class214, MouseWheelListener {

    @ObfuscatedName("ah.am")
    public int field112 = 0;

    @ObfuscatedName("ah.am(Ljava/awt/Component;B)V")
    public void method309(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ah.ap(Ljava/awt/Component;I)V")
    public void method310(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field112 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ah.af(I)I")
    public synchronized int method318() {
        int var1 = this.field112;
        this.field112 = 0;
        return var1;
    }
}
