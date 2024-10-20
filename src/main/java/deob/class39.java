package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aa")
public final class class39 implements class157, MouseWheelListener {

    @ObfuscatedName("aa.z")
    public int field329 = 0;

    @ObfuscatedName("aa.z(Ljava/awt/Component;I)V")
    public void method586(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aa.w(Ljava/awt/Component;I)V")
    public void method589(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field329 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aa.s(I)I")
    public synchronized int method588() {
        int var1 = this.field329;
        this.field329 = 0;
        return var1;
    }
}
