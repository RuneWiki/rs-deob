package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("br")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("br.a")
    public int field1411 = 0;

    @ObfuscatedName("br.a(Ljava/awt/Component;I)V")
    public void method1344(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("br.x(Ljava/awt/Component;I)V")
    public void method1336(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1411 += arg0.getWheelRotation();
    }

    @ObfuscatedName("br.e(B)I")
    public synchronized int method1337() {
        int var1 = this.field1411;
        this.field1411 = 0;
        return var1;
    }
}
