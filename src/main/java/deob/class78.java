package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("br")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("br.i")
    public int field1423 = 0;

    @ObfuscatedName("br.p(Ljava/awt/Component;I)V")
    public void method1306(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("br.a(Ljava/awt/Component;I)V")
    public void method1305(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1423 += arg0.getWheelRotation();
    }

    @ObfuscatedName("br.l(I)I")
    public synchronized int method1317() {
        int var1 = this.field1423;
        this.field1423 = 0;
        return var1;
    }
}
