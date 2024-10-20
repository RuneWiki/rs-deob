package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aa")
public final class class51 implements class169, MouseWheelListener {

    @ObfuscatedName("aa.d")
    public int field619 = 0;

    @ObfuscatedName("aa.d(Ljava/awt/Component;I)V")
    public void method639(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aa.z(Ljava/awt/Component;I)V")
    public void method640(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field619 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aa.n(B)I")
    public synchronized int method641() {
        int var1 = this.field619;
        this.field619 = 0;
        return var1;
    }
}
