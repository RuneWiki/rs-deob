package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ap")
public final class class50 implements class157, MouseWheelListener {

    @ObfuscatedName("ap.i")
    public int field654 = 0;

    @ObfuscatedName("ap.i(Ljava/awt/Component;I)V")
    public void method648(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ap.w(Ljava/awt/Component;I)V")
    public void method649(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field654 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ap.a(I)I")
    public synchronized int method651() {
        int var1 = this.field654;
        this.field654 = 0;
        return var1;
    }
}
