package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("an")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("an.i")
    public int field617 = 0;

    @ObfuscatedName("an.i(Ljava/awt/Component;I)V")
    public void method650(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("an.h(Ljava/awt/Component;I)V")
    public void method651(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field617 += arg0.getWheelRotation();
    }

    @ObfuscatedName("an.u(I)I")
    public synchronized int method656() {
        int var1 = this.field617;
        this.field617 = 0;
        return var1;
    }
}
