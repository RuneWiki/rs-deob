package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bb")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bb.b")
    public int field1392 = 0;

    @ObfuscatedName("bb.b(Ljava/awt/Component;I)V")
    public void method1332(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bb.e(Ljava/awt/Component;I)V")
    public void method1337(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1392 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bb.g(I)I")
    public synchronized int method1334() {
        int var1 = this.field1392;
        this.field1392 = 0;
        return var1;
    }
}
