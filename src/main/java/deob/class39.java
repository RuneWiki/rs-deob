package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ap")
public final class class39 implements class157, MouseWheelListener {

    @ObfuscatedName("ap.w")
    public int field331 = 0;

    @ObfuscatedName("ap.w(Ljava/awt/Component;I)V")
    public void method632(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ap.m(Ljava/awt/Component;I)V")
    public void method631(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field331 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ap.q(I)I")
    public synchronized int method636() {
        int var1 = this.field331;
        this.field331 = 0;
        return var1;
    }
}
