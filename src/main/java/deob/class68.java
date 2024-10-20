package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bz")
public abstract class class68 {

    @ObfuscatedName("bz.y")
    public int[] field1258;

    @ObfuscatedName("bz.g")
    public int field1261;

    @ObfuscatedName("bz.r")
    public int field1259;

    @ObfuscatedName("bz.i")
    public Image field1260;

    @ObfuscatedName("dy.ao(IILjava/awt/Component;B)Lbz;")
    public static class68 method2523(int arg0, int arg1, Component arg2) {
        try {
            class72 var3 = new class72();
            var3.method1329(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class66 var5 = new class66();
            var5.method1329(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bz.aj(B)V")
    public final void method1391() {
        class70.method1518(this.field1258, this.field1261, this.field1259);
    }

    @ObfuscatedName("bz.m(IILjava/awt/Component;I)V")
    public abstract void method1329(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bz.k(Ljava/awt/Graphics;III)V")
    public abstract void method1325(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bz.y(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1337(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
