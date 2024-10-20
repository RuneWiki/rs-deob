package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cc")
public abstract class class85 {

    @ObfuscatedName("cc.p")
    public int[] field1470;

    @ObfuscatedName("cc.z")
    public int field1467;

    @ObfuscatedName("cc.m")
    public int field1468;

    @ObfuscatedName("cc.k")
    public Image field1469;

    @ObfuscatedName("dg.ae(IILjava/awt/Component;I)Lcc;")
    public static class85 method2203(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1636(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1636(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cc.az(I)V")
    public final void method1677() {
        class89.method1784(this.field1470, this.field1467, this.field1468);
    }

    @ObfuscatedName("cc.c(Ljava/awt/Graphics;III)V")
    public abstract void method1645(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cc.q(IILjava/awt/Component;I)V")
    public abstract void method1636(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cc.p(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1618(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
