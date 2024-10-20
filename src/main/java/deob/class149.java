package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eo")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("eo.f")
    public int field2258 = 0;

    @ObfuscatedName("eo.e(Ljava/awt/Component;I)V")
    public void method2706(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eo.n(Ljava/awt/Component;B)V")
    public void method2715(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2258 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eo.t(I)I")
    public synchronized int method2708() {
        int var1 = this.field2258;
        this.field2258 = 0;
        return var1;
    }
}
