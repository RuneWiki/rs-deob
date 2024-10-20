package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ae")
public final class class22 implements class216, MouseWheelListener {

    @ObfuscatedName("ae.aq")
    public int field102 = 0;

    @ObfuscatedName("ae.aq(Ljava/awt/Component;I)V")
    public void method273(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ae.aw(Ljava/awt/Component;I)V")
    public void method269(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field102 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ae.al(I)I")
    public synchronized int method272() {
        int var1 = this.field102;
        this.field102 = 0;
        return var1;
    }
}
