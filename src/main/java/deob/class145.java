package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ep")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("ep.j")
    public int field2218 = 0;

    @ObfuscatedName("ep.j(Ljava/awt/Component;B)V")
    public void method2619(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ep.l(Ljava/awt/Component;I)V")
    public void method2620(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2218 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ep.a(I)I")
    public synchronized int method2624() {
        int var1 = this.field2218;
        this.field2218 = 0;
        return var1;
    }
}
