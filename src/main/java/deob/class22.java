package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("q")
public final class class22 implements class171, MouseWheelListener {

    @ObfuscatedName("q.f")
    public int field127 = 0;

    @ObfuscatedName("q.f(Ljava/awt/Component;I)V")
    public void method300(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("q.w(Ljava/awt/Component;S)V")
    public void method301(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field127 += arg0.getWheelRotation();
    }

    @ObfuscatedName("q.v(B)I")
    public synchronized int method305() {
        int var1 = this.field127;
        this.field127 = 0;
        return var1;
    }
}
