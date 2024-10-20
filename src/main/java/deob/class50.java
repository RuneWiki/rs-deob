package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("aa")
public final class class50 implements class159, MouseWheelListener {

    @ObfuscatedName("aa.s")
    public int field591 = 0;

    @ObfuscatedName("aa.s(Ljava/awt/Component;B)V")
    public void method617(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("aa.g(Ljava/awt/Component;I)V")
    public void method616(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field591 += arg0.getWheelRotation();
    }

    @ObfuscatedName("aa.m(I)I")
    public synchronized int method615() {
        int var1 = this.field591;
        this.field591 = 0;
        return var1;
    }
}
