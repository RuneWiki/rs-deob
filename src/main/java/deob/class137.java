package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ed")
public class class137 extends class123 implements MouseWheelListener {

    @ObfuscatedName("ed.n")
    public int field2097 = 0;

    @ObfuscatedName("ed.n(Ljava/awt/Component;I)V")
    public void method2477(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ed.w(Ljava/awt/Component;B)V")
    public void method2478(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2097 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ed.i(B)I")
    public synchronized int method2483() {
        int var1 = this.field2097;
        this.field2097 = 0;
        return var1;
    }
}
