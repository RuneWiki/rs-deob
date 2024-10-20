package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("en")
public class class146 extends class132 implements MouseWheelListener {

    @ObfuscatedName("en.j")
    public int field2191 = 0;

    @ObfuscatedName("en.h(Ljava/awt/Component;I)V")
    public void method2656(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("en.m(Ljava/awt/Component;I)V")
    public void method2654(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2191 += arg0.getWheelRotation();
    }

    @ObfuscatedName("en.z(I)I")
    public synchronized int method2657() {
        int var1 = this.field2191;
        this.field2191 = 0;
        return var1;
    }
}
