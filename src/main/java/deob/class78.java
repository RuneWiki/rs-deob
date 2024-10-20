package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("bq")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("bq.x")
    public int field1378 = 0;

    @ObfuscatedName("bq.p(Ljava/awt/Component;I)V")
    public void method1325(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("bq.k(Ljava/awt/Component;B)V")
    public void method1338(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1378 += arg0.getWheelRotation();
    }

    @ObfuscatedName("bq.a(S)I")
    public synchronized int method1327() {
        int var1 = this.field1378;
        this.field1378 = 0;
        return var1;
    }
}
