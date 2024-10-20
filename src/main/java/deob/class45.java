package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("af")
public final class class45 implements class169, MouseWheelListener {

    @ObfuscatedName("af.a")
    public int field370 = 0;

    @ObfuscatedName("af.a(Ljava/awt/Component;I)V")
    public void method711(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("af.t(Ljava/awt/Component;B)V")
    public void method712(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field370 += arg0.getWheelRotation();
    }

    @ObfuscatedName("af.n(I)I")
    public synchronized int method713() {
        int var1 = this.field370;
        this.field370 = 0;
        return var1;
    }
}
