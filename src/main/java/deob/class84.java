package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cz")
public abstract class class84 {

    @ObfuscatedName("cz.n")
    public int[] field1442;

    @ObfuscatedName("cz.c")
    public int field1435;

    @ObfuscatedName("cz.r")
    public int field1434;

    @ObfuscatedName("cz.k")
    public Image field1436;

    @ObfuscatedName("ab.ae(IILjava/awt/Component;B)Lcz;")
    public static class84 method782(int arg0, int arg1, Component arg2) {
        try {
            class87 var3 = new class87();
            var3.method1628(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class82 var5 = new class82();
            var5.method1628(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cz.ab(B)V")
    public final void method1698() {
        class88.method1835(this.field1442, this.field1435, this.field1434);
    }

    @ObfuscatedName("cz.f(Ljava/awt/Graphics;III)V")
    public abstract void method1641(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cz.n(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1630(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("cz.v(IILjava/awt/Component;B)V")
    public abstract void method1628(int arg0, int arg1, Component arg2);
}
