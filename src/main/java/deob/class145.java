package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ea")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ea.c")
    public int field2179 = 0;

    @ObfuscatedName("ea.h(Ljava/awt/Component;I)V")
    public void method2614(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ea.k(Ljava/awt/Component;I)V")
    public void method2613(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2179 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ea.t(B)I")
    public synchronized int method2616() {
        int var1 = this.field2179;
        this.field2179 = 0;
        return var1;
    }
}
