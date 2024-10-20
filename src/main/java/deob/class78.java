package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bh")
public abstract class class78 {

    @ObfuscatedName("bh.f")
    public int[] field1395;

    @ObfuscatedName("bh.s")
    public int field1396;

    @ObfuscatedName("bh.y")
    public int field1390;

    @ObfuscatedName("bh.e")
    public Image field1393;

    @ObfuscatedName("x.aw(IILjava/awt/Component;I)Lbh;")
    public static class78 method240(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1524(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1524(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bh.ax(I)V")
    public final void method1597() {
        class80.method1696(this.field1395, this.field1396, this.field1390);
    }

    @ObfuscatedName("bh.a(IILjava/awt/Component;B)V")
    public abstract void method1524(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bh.r(Ljava/awt/Graphics;III)V")
    public abstract void method1525(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bh.f(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1526(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
