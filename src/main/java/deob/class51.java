package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("au")
public final class class51 implements class169, MouseWheelListener {

    @ObfuscatedName("au.c")
    public int field593 = 0;

    @ObfuscatedName("au.c(Ljava/awt/Component;B)V")
    public void method676(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("au.i(Ljava/awt/Component;I)V")
    public void method675(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field593 += arg0.getWheelRotation();
    }

    @ObfuscatedName("au.o(I)I")
    public synchronized int method677() {
        int var1 = this.field593;
        this.field593 = 0;
        return var1;
    }
}
