package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bt")
public abstract class class78 {

    @ObfuscatedName("bt.t")
    public int[] field1396;

    @ObfuscatedName("bt.p")
    public int field1397;

    @ObfuscatedName("bt.e")
    public int field1398;

    @ObfuscatedName("bt.y")
    public Image field1399;

    @ObfuscatedName("g.g(IILjava/awt/Component;B)Lbt;")
    public static class78 method607(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1523(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1523(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bt.b(I)V")
    public final void method1571() {
        class80.method1664(this.field1396, this.field1397, this.field1398);
    }

    @ObfuscatedName("bt.w(IILjava/awt/Component;B)V")
    public abstract void method1523(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bt.t(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1504(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bt.x(Ljava/awt/Graphics;III)V")
    public abstract void method1503(Graphics arg0, int arg1, int arg2);
}
