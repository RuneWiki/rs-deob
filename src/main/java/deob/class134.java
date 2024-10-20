package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("er")
public class class134 extends class120 implements MouseWheelListener {

    @ObfuscatedName("er.x")
    public int field2065 = 0;

    @ObfuscatedName("er.v(Ljava/awt/Component;I)V")
    public void method2459(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("er.m(Ljava/awt/Component;I)V")
    public void method2448(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2065 += arg0.getWheelRotation();
    }

    @ObfuscatedName("er.e(S)I")
    public synchronized int method2458() {
        int var1 = this.field2065;
        this.field2065 = 0;
        return var1;
    }
}
