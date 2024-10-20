package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ca")
public abstract class class81 {

    @ObfuscatedName("ca.r")
    public int[] field1475;

    @ObfuscatedName("ca.e")
    public int field1471;

    @ObfuscatedName("ca.h")
    public int field1473;

    @ObfuscatedName("ca.s")
    public Image field1476;

    @ObfuscatedName("x.as(IILjava/awt/Component;I)Lca;")
    public static class81 method566(int arg0, int arg1, Component arg2) {
        try {
            class85 var3 = new class85();
            var3.method1621(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class79 var5 = new class79();
            var5.method1621(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ca.ac(B)V")
    public final void method1691() {
        class83.method1782(this.field1475, this.field1471, this.field1473);
    }

    @ObfuscatedName("ca.l(IILjava/awt/Component;B)V")
    public abstract void method1621(int arg0, int arg1, Component arg2);

    @ObfuscatedName("ca.r(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1623(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ca.g(Ljava/awt/Graphics;III)V")
    public abstract void method1622(Graphics arg0, int arg1, int arg2);
}
