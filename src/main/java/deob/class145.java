package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("et")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("et.k")
    public int field2188 = 0;

    @ObfuscatedName("et.k(Ljava/awt/Component;I)V")
    public void method2652(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("et.h(Ljava/awt/Component;I)V")
    public void method2654(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2188 += arg0.getWheelRotation();
    }

    @ObfuscatedName("et.o(I)I")
    public synchronized int method2658() {
        int var1 = this.field2188;
        this.field2188 = 0;
        return var1;
    }
}
