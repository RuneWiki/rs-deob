package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ad")
public final class class44 implements class169, MouseWheelListener {

    @ObfuscatedName("ad.f")
    public int field361 = 0;

    @ObfuscatedName("ad.f(Ljava/awt/Component;I)V")
    public void method657(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ad.i(Ljava/awt/Component;I)V")
    public void method654(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field361 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ad.y(I)I")
    public synchronized int method653() {
        int var1 = this.field361;
        this.field361 = 0;
        return var1;
    }
}
