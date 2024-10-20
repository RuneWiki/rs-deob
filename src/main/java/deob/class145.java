package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ez")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ez.v")
    public int field2217 = 0;

    @ObfuscatedName("ez.f(Ljava/awt/Component;B)V")
    public void method2676(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ez.i(Ljava/awt/Component;B)V")
    public void method2677(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2217 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ez.d(B)I")
    public synchronized int method2679() {
        int var1 = this.field2217;
        this.field2217 = 0;
        return var1;
    }
}
