package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eo")
public class class136 extends class122 implements MouseWheelListener {

    @ObfuscatedName("eo.a")
    public int field2092 = 0;

    @ObfuscatedName("eo.v(Ljava/awt/Component;I)V")
    public void method2431(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eo.i(Ljava/awt/Component;B)V")
    public void method2441(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2092 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eo.b(I)I")
    public synchronized int method2436() {
        int var1 = this.field2092;
        this.field2092 = 0;
        return var1;
    }
}
