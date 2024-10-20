package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ar")
public final class class50 implements class158, MouseWheelListener {

    @ObfuscatedName("ar.e")
    public int field618 = 0;

    @ObfuscatedName("ar.e(Ljava/awt/Component;I)V")
    public void method638(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ar.n(Ljava/awt/Component;I)V")
    public void method639(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field618 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ar.g(B)I")
    public synchronized int method645() {
        int var1 = this.field618;
        this.field618 = 0;
        return var1;
    }
}
