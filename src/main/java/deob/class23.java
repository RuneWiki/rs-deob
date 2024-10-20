package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("d")
public final class class23 implements class167, MouseWheelListener {

    @ObfuscatedName("d.h")
    public int field126 = 0;

    @ObfuscatedName("d.h(Ljava/awt/Component;B)V")
    public void method297(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("d.e(Ljava/awt/Component;I)V")
    public void method301(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field126 += arg0.getWheelRotation();
    }

    @ObfuscatedName("d.v(I)I")
    public synchronized int method299() {
        int var1 = this.field126;
        this.field126 = 0;
        return var1;
    }
}
