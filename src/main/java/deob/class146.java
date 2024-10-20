package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eq")
public class class146 extends class132 implements MouseWheelListener {

    @ObfuscatedName("eq.t")
    public int field2245 = 0;

    @ObfuscatedName("eq.i(Ljava/awt/Component;I)V")
    public void method2631(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eq.g(Ljava/awt/Component;B)V")
    public void method2632(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2245 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eq.h(B)I")
    public synchronized int method2633() {
        int var1 = this.field2245;
        this.field2245 = 0;
        return var1;
    }
}
