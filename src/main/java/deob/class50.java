package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aj")
public final class class50 implements class158, MouseWheelListener {

    @ObfuscatedName("aj.m")
    public int field603 = 0;

    @ObfuscatedName("aj.m(Ljava/awt/Component;I)V")
    public void method693(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aj.p(Ljava/awt/Component;I)V")
    public void method686(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field603 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aj.i(B)I")
    public synchronized int method689() {
        int var1 = this.field603;
        this.field603 = 0;
        return var1;
    }
}
