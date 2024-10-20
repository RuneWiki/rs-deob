package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bf")
public final class class54 implements class178, MouseWheelListener {

    @ObfuscatedName("bf.f")
    public int field409 = 0;

    @ObfuscatedName("bf.f(Ljava/awt/Component;B)V")
    public void method742(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bf.b(Ljava/awt/Component;S)V")
    public void method743(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field409 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bf.l(S)I")
    public synchronized int method745() {
        int var1 = this.field409;
        this.field409 = 0;
        return var1;
    }
}
