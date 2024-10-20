package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("et")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("et.d")
    public int field2186 = 0;

    @ObfuscatedName("et.d(Ljava/awt/Component;S)V")
    public void method2699(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("et.p(Ljava/awt/Component;B)V")
    public void method2704(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2186 += arg0.getWheelRotation();
    }

    @ObfuscatedName("et.v(I)I")
    public synchronized int method2701() {
        int var1 = this.field2186;
        this.field2186 = 0;
        return var1;
    }
}
