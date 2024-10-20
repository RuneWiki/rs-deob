package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("au")
public final class class44 implements class164, MouseWheelListener {

    @ObfuscatedName("au.n")
    public int field365 = 0;

    @ObfuscatedName("au.n(Ljava/awt/Component;S)V")
    public void method650(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("au.h(Ljava/awt/Component;B)V")
    public void method659(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field365 += arg0.getWheelRotation();
    }

    @ObfuscatedName("au.l(I)I")
    public synchronized int method651() {
        int var1 = this.field365;
        this.field365 = 0;
        return var1;
    }
}
