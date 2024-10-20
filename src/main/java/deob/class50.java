package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("az")
public final class class50 implements class158, MouseWheelListener {

    @ObfuscatedName("az.b")
    public int field578 = 0;

    @ObfuscatedName("az.b(Ljava/awt/Component;I)V")
    public void method609(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("az.s(Ljava/awt/Component;I)V")
    public void method614(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field578 += arg0.getWheelRotation();
    }

    @ObfuscatedName("az.r(I)I")
    public synchronized int method610() {
        int var1 = this.field578;
        this.field578 = 0;
        return var1;
    }
}
