package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ak")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("ak.i")
    public int field632 = 0;

    @ObfuscatedName("ak.i(Ljava/awt/Component;B)V")
    public void method615(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ak.c(Ljava/awt/Component;I)V")
    public void method616(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field632 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ak.e(I)I")
    public synchronized int method617() {
        int var1 = this.field632;
        this.field632 = 0;
        return var1;
    }
}
