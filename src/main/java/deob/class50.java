package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ah")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("ah.p")
    public int field634 = 0;

    @ObfuscatedName("ah.p(Ljava/awt/Component;B)V")
    public void method625(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ah.m(Ljava/awt/Component;S)V")
    public void method626(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field634 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ah.e(B)I")
    public synchronized int method632() {
        int var1 = this.field634;
        this.field634 = 0;
        return var1;
    }
}
