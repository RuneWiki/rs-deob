package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ao")
public final class class50 implements class159, MouseWheelListener {

    @ObfuscatedName("ao.a")
    public int field582 = 0;

    @ObfuscatedName("ao.a(Ljava/awt/Component;I)V")
    public void method622(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ao.w(Ljava/awt/Component;B)V")
    public void method630(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field582 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ao.e(I)I")
    public synchronized int method624() {
        int var1 = this.field582;
        this.field582 = 0;
        return var1;
    }
}
