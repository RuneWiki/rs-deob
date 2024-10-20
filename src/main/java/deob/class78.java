package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bt")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bt.p")
    public int field1410 = 0;

    @ObfuscatedName("bt.p(Ljava/awt/Component;I)V")
    public void method1380(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bt.e(Ljava/awt/Component;B)V")
    public void method1381(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1410 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bt.a(I)I")
    public synchronized int method1388() {
        int var1 = this.field1410;
        this.field1410 = 0;
        return var1;
    }
}
