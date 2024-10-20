package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ec")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ec.i")
    public int field2203 = 0;

    @ObfuscatedName("ec.v(Ljava/awt/Component;I)V")
    public void method2631(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ec.f(Ljava/awt/Component;B)V")
    public void method2624(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2203 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ec.h(I)I")
    public synchronized int method2625() {
        int var1 = this.field2203;
        this.field2203 = 0;
        return var1;
    }
}
