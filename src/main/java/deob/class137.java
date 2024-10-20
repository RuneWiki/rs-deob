package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eh")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("eh.e")
    public int field2065 = 0;

    @ObfuscatedName("eh.e(Ljava/awt/Component;I)V")
    public void method2520(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eh.a(Ljava/awt/Component;B)V")
    public void method2513(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2065 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eh.l(I)I")
    public synchronized int method2514() {
        int var1 = this.field2065;
        this.field2065 = 0;
        return var1;
    }
}
