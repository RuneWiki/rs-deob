package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("az")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("az.c")
    public int field625 = 0;

    @ObfuscatedName("az.c(Ljava/awt/Component;S)V")
    public void method610(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("az.o(Ljava/awt/Component;B)V")
    public void method619(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field625 += arg0.getWheelRotation();
    }

    @ObfuscatedName("az.i(I)I")
    public synchronized int method612() {
        int var1 = this.field625;
        this.field625 = 0;
        return var1;
    }
}
