package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bi")
public class class77 extends class65 implements MouseWheelListener {

    @ObfuscatedName("bi.g")
    public int field1393 = 0;

    @ObfuscatedName("bi.g(Ljava/awt/Component;I)V")
    public void method1345(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bi.e(Ljava/awt/Component;I)V")
    public void method1347(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1393 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bi.n(B)I")
    public synchronized int method1357() {
        int var1 = this.field1393;
        this.field1393 = 0;
        return var1;
    }
}
