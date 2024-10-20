package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("et")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("et.i")
    public int field2262 = 0;

    @ObfuscatedName("et.h(Ljava/awt/Component;B)V")
    public void method2723(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("et.e(Ljava/awt/Component;B)V")
    public void method2720(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2262 += arg0.getWheelRotation();
    }

    @ObfuscatedName("et.g(I)I")
    public synchronized int method2722() {
        int var1 = this.field2262;
        this.field2262 = 0;
        return var1;
    }
}
