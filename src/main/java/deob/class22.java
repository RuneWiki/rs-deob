package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ap")
public final class class22 implements class216, MouseWheelListener {

    @ObfuscatedName("ap.ab")
    public int field85 = 0;

    @ObfuscatedName("ap.ab(Ljava/awt/Component;I)V")
    public void method276(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ap.ay(Ljava/awt/Component;I)V")
    public void method275(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field85 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ap.an(I)I")
    public synchronized int method277() {
        int var1 = this.field85;
        this.field85 = 0;
        return var1;
    }
}
