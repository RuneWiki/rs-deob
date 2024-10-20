package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bw")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bw.g")
    public int field1399 = 0;

    @ObfuscatedName("bw.m(Ljava/awt/Component;I)V")
    public void method1365(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bw.v(Ljava/awt/Component;B)V")
    public void method1375(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1399 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bw.r(I)I")
    public synchronized int method1367() {
        int var1 = this.field1399;
        this.field1399 = 0;
        return var1;
    }
}
