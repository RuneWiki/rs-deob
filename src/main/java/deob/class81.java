package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ca")
public abstract class class81 {

    @ObfuscatedName("ca.f")
    public int[] field1444;

    @ObfuscatedName("ca.c")
    public int field1445;

    @ObfuscatedName("ca.v")
    public int field1446;

    @ObfuscatedName("ca.j")
    public Image field1447;

    @ObfuscatedName("r.x(IILjava/awt/Component;I)Lca;")
    public static class81 method174(int arg0, int arg1, Component arg2) {
        try {
            class85 var3 = new class85();
            var3.method1585(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class79 var5 = new class79();
            var5.method1585(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ca.d(B)V")
    public final void method1624() {
        class83.method1750(this.field1444, this.field1445, this.field1446);
    }

    @ObfuscatedName("ca.k(IILjava/awt/Component;I)V")
    public abstract void method1585(int arg0, int arg1, Component arg2);

    @ObfuscatedName("ca.q(Ljava/awt/Graphics;IIB)V")
    public abstract void method1588(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("ca.f(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1567(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
