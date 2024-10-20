package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ex")
public class class136 extends class122 implements MouseWheelListener {

    @ObfuscatedName("ex.p")
    public int field2069 = 0;

    @ObfuscatedName("ex.y(Ljava/awt/Component;I)V")
    public void method2440(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ex.d(Ljava/awt/Component;B)V")
    public void method2441(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2069 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ex.c(I)I")
    public synchronized int method2442() {
        int var1 = this.field2069;
        this.field2069 = 0;
        return var1;
    }
}
