package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ee")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ee.o")
    public int field2199 = 0;

    @ObfuscatedName("ee.f(Ljava/awt/Component;B)V")
    public void method2611(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ee.i(Ljava/awt/Component;I)V")
    public void method2612(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2199 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ee.h(I)I")
    public synchronized int method2615() {
        int var1 = this.field2199;
        this.field2199 = 0;
        return var1;
    }
}
