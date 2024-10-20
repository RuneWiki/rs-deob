package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("by")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("by.g")
    public int field1388 = 0;

    @ObfuscatedName("by.h(Ljava/awt/Component;B)V")
    public void method1361(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("by.s(Ljava/awt/Component;I)V")
    public void method1363(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1388 += arg0.getWheelRotation();
    }

    @ObfuscatedName("by.o(B)I")
    public synchronized int method1364() {
        int var1 = this.field1388;
        this.field1388 = 0;
        return var1;
    }
}
