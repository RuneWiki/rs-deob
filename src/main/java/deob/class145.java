package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ea")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ea.i")
    public int field2192 = 0;

    @ObfuscatedName("ea.v(Ljava/awt/Component;I)V")
    public void method2664(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ea.r(Ljava/awt/Component;B)V")
    public void method2656(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2192 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ea.n(I)I")
    public synchronized int method2657() {
        int var1 = this.field2192;
        this.field2192 = 0;
        return var1;
    }
}
