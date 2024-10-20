package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("be")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("be.b")
    public int field1426 = 0;

    @ObfuscatedName("be.b(Ljava/awt/Component;B)V")
    public void method1332(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("be.c(Ljava/awt/Component;I)V")
    public void method1340(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1426 += arg0.getWheelRotation();
    }

    @ObfuscatedName("be.j(I)I")
    public synchronized int method1334() {
        int var1 = this.field1426;
        this.field1426 = 0;
        return var1;
    }
}
