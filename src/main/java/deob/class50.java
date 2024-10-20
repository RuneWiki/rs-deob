package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("al")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("al.d")
    public int field643 = 0;

    @ObfuscatedName("al.d(Ljava/awt/Component;I)V")
    public void method650(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("al.k(Ljava/awt/Component;B)V")
    public void method663(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field643 += arg0.getWheelRotation();
    }

    @ObfuscatedName("al.e(I)I")
    public synchronized int method652() {
        int var1 = this.field643;
        this.field643 = 0;
        return var1;
    }
}
