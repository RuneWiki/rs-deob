package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ao")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("ao.a")
    public int field612 = 0;

    @ObfuscatedName("ao.a(Ljava/awt/Component;I)V")
    public void method640(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ao.j(Ljava/awt/Component;I)V")
    public void method636(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field612 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ao.n(B)I")
    public synchronized int method637() {
        int var1 = this.field612;
        this.field612 = 0;
        return var1;
    }
}
