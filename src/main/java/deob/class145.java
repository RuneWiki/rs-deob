package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ej")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ej.o")
    public int field2206 = 0;

    @ObfuscatedName("ej.o(Ljava/awt/Component;B)V")
    public void method2668(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ej.e(Ljava/awt/Component;I)V")
    public void method2673(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2206 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ej.u(B)I")
    public synchronized int method2670() {
        int var1 = this.field2206;
        this.field2206 = 0;
        return var1;
    }
}
