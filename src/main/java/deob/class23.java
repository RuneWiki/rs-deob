package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("e")
public final class class23 implements class166, MouseWheelListener {

    @ObfuscatedName("e.a")
    public int field118 = 0;

    @ObfuscatedName("e.a(Ljava/awt/Component;I)V")
    public void method304(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("e.f(Ljava/awt/Component;B)V")
    public void method303(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field118 += arg0.getWheelRotation();
    }

    @ObfuscatedName("e.c(I)I")
    public synchronized int method305() {
        int var1 = this.field118;
        this.field118 = 0;
        return var1;
    }
}
