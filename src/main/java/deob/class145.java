package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("er")
public class class145 extends class131 implements MouseWheelListener {

    @ObfuscatedName("er.n")
    public int field2195 = 0;

    @ObfuscatedName("er.q(Ljava/awt/Component;I)V")
    public void method2667(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("er.c(Ljava/awt/Component;I)V")
    public void method2668(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2195 += arg0.getWheelRotation();
    }

    @ObfuscatedName("er.l(I)I")
    public synchronized int method2680() {
        int var1 = this.field2195;
        this.field2195 = 0;
        return var1;
    }
}
