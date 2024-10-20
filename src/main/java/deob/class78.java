package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bj")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bj.c")
    public int field1418 = 0;

    @ObfuscatedName("bj.q(Ljava/awt/Component;I)V")
    public void method1306(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bj.y(Ljava/awt/Component;I)V")
    public void method1314(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1418 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bj.v(I)I")
    public synchronized int method1308() {
        int var1 = this.field1418;
        this.field1418 = 0;
        return var1;
    }
}
