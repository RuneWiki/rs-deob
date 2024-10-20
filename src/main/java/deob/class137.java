package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eh")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("eh.q")
    public int field2058 = 0;

    @ObfuscatedName("eh.q(Ljava/awt/Component;I)V")
    public void method2460(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eh.s(Ljava/awt/Component;I)V")
    public void method2448(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2058 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eh.h(I)I")
    public synchronized int method2449() {
        int var1 = this.field2058;
        this.field2058 = 0;
        return var1;
    }
}
