package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ai")
public final class class22 implements class172, MouseWheelListener {

    @ObfuscatedName("ai.aj")
    public int field118 = 0;

    @ObfuscatedName("ai.aj(Ljava/awt/Component;I)V")
    public void method291(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ai.al(Ljava/awt/Component;B)V")
    public void method297(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field118 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ai.ac(I)I")
    public synchronized int method292() {
        int var1 = this.field118;
        this.field118 = 0;
        return var1;
    }
}
