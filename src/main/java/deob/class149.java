package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("es")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("es.k")
    public int field2260 = 0;

    @ObfuscatedName("es.q(Ljava/awt/Component;I)V")
    public void method2735(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("es.f(Ljava/awt/Component;B)V")
    public void method2727(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2260 += arg0.getWheelRotation();
    }

    @ObfuscatedName("es.c(B)I")
    public synchronized int method2729() {
        int var1 = this.field2260;
        this.field2260 = 0;
        return var1;
    }
}
