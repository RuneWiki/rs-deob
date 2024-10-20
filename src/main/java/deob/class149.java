package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("eg")
public class class149 extends class135 implements MouseWheelListener {

    @ObfuscatedName("eg.e")
    public int field2260 = 0;

    @ObfuscatedName("eg.l(Ljava/awt/Component;I)V")
    public void method2809(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("eg.c(Ljava/awt/Component;I)V")
    public void method2793(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2260 += arg0.getWheelRotation();
    }

    @ObfuscatedName("eg.h(I)I")
    public synchronized int method2794() {
        int var1 = this.field2260;
        this.field2260 = 0;
        return var1;
    }
}
