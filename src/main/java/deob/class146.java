package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eq")
public class class146 extends class132 implements MouseWheelListener {

    @ObfuscatedName("eq.a")
    public int field2206 = 0;

    @ObfuscatedName("eq.a(Ljava/awt/Component;I)V")
    public void method2791(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eq.w(Ljava/awt/Component;I)V")
    public void method2797(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2206 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eq.d(S)I")
    public synchronized int method2794() {
        int var1 = this.field2206;
        this.field2206 = 0;
        return var1;
    }
}
