package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aj")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("aj.e")
    public int field624 = 0;

    @ObfuscatedName("aj.e(Ljava/awt/Component;B)V")
    public void method641(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aj.o(Ljava/awt/Component;I)V")
    public void method635(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field624 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aj.m(I)I")
    public synchronized int method633() {
        int var1 = this.field624;
        this.field624 = 0;
        return var1;
    }
}
