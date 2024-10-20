package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("ap")
public final class class50 implements class168, MouseWheelListener {

    @ObfuscatedName("ap.b")
    public int field569 = 0;

    @ObfuscatedName("ap.b(Ljava/awt/Component;I)V")
    public void method661(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("ap.q(Ljava/awt/Component;B)V")
    public void method663(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field569 += arg0.getWheelRotation();
    }

    @ObfuscatedName("ap.o(I)I")
    public synchronized int method664() {
        int var1 = this.field569;
        this.field569 = 0;
        return var1;
    }
}
