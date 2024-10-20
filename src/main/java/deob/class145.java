package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ef")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ef.h")
    public int field2210 = 0;

    @ObfuscatedName("ef.h(Ljava/awt/Component;B)V")
    public void method2645(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ef.m(Ljava/awt/Component;I)V")
    public void method2643(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2210 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ef.i(B)I")
    public synchronized int method2644() {
        int var1 = this.field2210;
        this.field2210 = 0;
        return var1;
    }
}
