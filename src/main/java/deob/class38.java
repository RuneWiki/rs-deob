package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ad")
public final class class38 implements class130, MouseWheelListener {

    @ObfuscatedName("ad.f")
    public int field246 = 0;

    @ObfuscatedName("ad.f(Ljava/awt/Component;I)V")
    public void method272(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ad.o(Ljava/awt/Component;B)V")
    public void method265(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field246 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ad.u(I)I")
    public synchronized int method267() {
        int var1 = this.field246;
        this.field246 = 0;
        return var1;
    }
}
