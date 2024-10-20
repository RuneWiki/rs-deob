package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("el")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("el.n")
    public int field2113 = 0;

    @ObfuscatedName("el.d(Ljava/awt/Component;B)V")
    public void method2564(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("el.z(Ljava/awt/Component;B)V")
    public void method2565(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2113 += arg0.getWheelRotation();
    }

    @ObfuscatedName("el.y(B)I")
    public synchronized int method2578() {
        int var1 = this.field2113;
        this.field2113 = 0;
        return var1;
    }
}
