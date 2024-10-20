package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ej")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("ej.n")
    public int field2110 = 0;

    @ObfuscatedName("ej.n(Ljava/awt/Component;B)V")
    public void method2560(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ej.o(Ljava/awt/Component;I)V")
    public void method2561(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2110 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ej.a(B)I")
    public synchronized int method2568() {
        int var1 = this.field2110;
        this.field2110 = 0;
        return var1;
    }
}
