package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("cv")
public class class79 extends class67 implements MouseWheelListener {

    @ObfuscatedName("cv.i")
    public int field1424 = 0;

    @ObfuscatedName("cv.b(Ljava/awt/Component;I)V")
    public void method1355(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("cv.r(Ljava/awt/Component;I)V")
    public void method1344(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1424 += arg0.getWheelRotation();
    }

    @ObfuscatedName("cv.l(B)I")
    public synchronized int method1345() {
        int var1 = this.field1424;
        this.field1424 = 0;
        return var1;
    }
}
