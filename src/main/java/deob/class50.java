package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ai")
public final class class50 implements class159, MouseWheelListener {

    @ObfuscatedName("ai.n")
    public int field593 = 0;

    @ObfuscatedName("ai.n(Ljava/awt/Component;I)V")
    public void method627(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ai.v(Ljava/awt/Component;I)V")
    public void method628(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field593 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ai.y(S)I")
    public synchronized int method629() {
        int var1 = this.field593;
        this.field593 = 0;
        return var1;
    }
}
