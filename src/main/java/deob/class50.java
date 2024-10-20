package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("au")
public final class class50 implements class158, MouseWheelListener {

    @ObfuscatedName("au.w")
    public int field646 = 0;

    @ObfuscatedName("au.w(Ljava/awt/Component;I)V")
    public void method632(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("au.o(Ljava/awt/Component;I)V")
    public void method629(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field646 += arg0.getWheelRotation();
    }

    @ObfuscatedName("au.x(I)I")
    public synchronized int method630() {
        int var1 = this.field646;
        this.field646 = 0;
        return var1;
    }
}
