package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("br")
public class class78 extends class66 implements MouseWheelListener {

    @ObfuscatedName("br.j")
    public int field1386 = 0;

    @ObfuscatedName("br.r(Ljava/awt/Component;I)V")
    public void method1350(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("br.v(Ljava/awt/Component;I)V")
    public void method1351(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1386 += arg0.getWheelRotation();
    }

    @ObfuscatedName("br.p(I)I")
    public synchronized int method1352() {
        int var1 = this.field1386;
        this.field1386 = 0;
        return var1;
    }
}
