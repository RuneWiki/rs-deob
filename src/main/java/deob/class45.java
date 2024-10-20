package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ao")
public final class class45 implements class169, MouseWheelListener {

    @ObfuscatedName("ao.c")
    public int field386 = 0;

    @ObfuscatedName("ao.c(Ljava/awt/Component;I)V")
    public void method672(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ao.t(Ljava/awt/Component;B)V")
    public void method673(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field386 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ao.o(B)I")
    public synchronized int method678() {
        int var1 = this.field386;
        this.field386 = 0;
        return var1;
    }
}
