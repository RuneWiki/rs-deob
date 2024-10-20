package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ao")
public final class class38 implements class131, MouseWheelListener {

    @ObfuscatedName("ao.f")
    public int field252 = 0;

    @ObfuscatedName("ao.f(Ljava/awt/Component;B)V")
    public void method269(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ao.e(Ljava/awt/Component;I)V")
    public void method270(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field252 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ao.v(B)I")
    public synchronized int method271() {
        int var1 = this.field252;
        this.field252 = 0;
        return var1;
    }
}
