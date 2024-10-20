package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("es")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("es.o")
    public int field2100 = 0;

    @ObfuscatedName("es.l(Ljava/awt/Component;B)V")
    public void method2564(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("es.g(Ljava/awt/Component;I)V")
    public void method2562(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2100 += arg0.getWheelRotation();
    }

    @ObfuscatedName("es.u(I)I")
    public synchronized int method2552() {
        int var1 = this.field2100;
        this.field2100 = 0;
        return var1;
    }
}
