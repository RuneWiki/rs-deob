package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bn")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bn.i")
    public int field1406 = 0;

    @ObfuscatedName("bn.i(Ljava/awt/Component;I)V")
    public void method1389(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bn.v(Ljava/awt/Component;B)V")
    public void method1390(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1406 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bn.m(I)I")
    public synchronized int method1385() {
        int var1 = this.field1406;
        this.field1406 = 0;
        return var1;
    }
}
