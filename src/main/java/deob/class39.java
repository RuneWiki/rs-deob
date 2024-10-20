package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("as")
public final class class39 implements class159, MouseWheelListener {

    @ObfuscatedName("as.g")
    public int field369 = 0;

    @ObfuscatedName("as.g(Ljava/awt/Component;I)V")
    public void method643(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("as.r(Ljava/awt/Component;S)V")
    public void method649(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field369 += arg0.getWheelRotation();
    }

    @ObfuscatedName("as.e(B)I")
    public synchronized int method645() {
        int var1 = this.field369;
        this.field369 = 0;
        return var1;
    }
}
