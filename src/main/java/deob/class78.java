package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bj")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bj.d")
    public int field1407 = 0;

    @ObfuscatedName("bj.g(Ljava/awt/Component;B)V")
    public void method1325(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bj.a(Ljava/awt/Component;I)V")
    public void method1330(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1407 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bj.t(I)I")
    public synchronized int method1341() {
        int var1 = this.field1407;
        this.field1407 = 0;
        return var1;
    }
}
