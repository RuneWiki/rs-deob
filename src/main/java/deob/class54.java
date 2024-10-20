package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("by")
public final class class54 implements class178, MouseWheelListener {

    @ObfuscatedName("by.h")
    public int field398 = 0;

    @ObfuscatedName("by.h(Ljava/awt/Component;B)V")
    public void method726(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("by.v(Ljava/awt/Component;I)V")
    public void method732(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field398 += arg0.getWheelRotation();
    }

    @ObfuscatedName("by.x(B)I")
    public synchronized int method729() {
        int var1 = this.field398;
        this.field398 = 0;
        return var1;
    }
}
