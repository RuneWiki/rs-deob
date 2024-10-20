package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bj")
public class class77 extends class65 implements MouseWheelListener {

    @ObfuscatedName("bj.c")
    public int field1376 = 0;

    @ObfuscatedName("bj.c(Ljava/awt/Component;I)V")
    public void method1309(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bj.j(Ljava/awt/Component;I)V")
    public void method1308(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1376 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bj.f(I)I")
    public synchronized int method1311() {
        int var1 = this.field1376;
        this.field1376 = 0;
        return var1;
    }
}
