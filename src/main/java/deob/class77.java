package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bx")
public class class77 extends class65 implements MouseWheelListener {

    @ObfuscatedName("bx.j")
    public int field1394 = 0;

    @ObfuscatedName("bx.j(Ljava/awt/Component;B)V")
    public void method1323(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bx.y(Ljava/awt/Component;I)V")
    public void method1334(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1394 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bx.x(I)I")
    public synchronized int method1322() {
        int var1 = this.field1394;
        this.field1394 = 0;
        return var1;
    }
}
