package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bn")
public final class class54 implements class178, MouseWheelListener {

    @ObfuscatedName("bn.n")
    public int field407 = 0;

    @ObfuscatedName("bn.n(Ljava/awt/Component;I)V")
    public void method744(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bn.v(Ljava/awt/Component;I)V")
    public void method745(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field407 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bn.d(S)I")
    public synchronized int method750() {
        int var1 = this.field407;
        this.field407 = 0;
        return var1;
    }
}
