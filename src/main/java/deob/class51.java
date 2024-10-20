package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ar")
public final class class51 implements class169, MouseWheelListener {

    @ObfuscatedName("ar.g")
    public int field608 = 0;

    @ObfuscatedName("ar.g(Ljava/awt/Component;I)V")
    public void method694(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ar.e(Ljava/awt/Component;I)V")
    public void method696(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field608 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ar.b(I)I")
    public synchronized int method698() {
        int var1 = this.field608;
        this.field608 = 0;
        return var1;
    }
}
