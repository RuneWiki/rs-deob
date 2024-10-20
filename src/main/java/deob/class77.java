package deob;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("by")
public class class77 extends class65 implements MouseWheelListener {

    @ObfuscatedName("by.z")
    public int field1402 = 0;

    @ObfuscatedName("by.h(Ljava/awt/Component;I)V")
    public void method1332(Component arg0) {
        arg0.addMouseWheelListener(this);
    }

    @ObfuscatedName("by.c(Ljava/awt/Component;I)V")
    public void method1334(Component arg0) {
        arg0.removeMouseWheelListener(this);
    }

    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1402 += arg0.getWheelRotation();
    }

    @ObfuscatedName("by.p(B)I")
    public synchronized int method1335() {
        int var1 = this.field1402;
        this.field1402 = 0;
        return var1;
    }
}
