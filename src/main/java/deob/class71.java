package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bk")
public abstract class class71 {

    @ObfuscatedName("bk.k")
    public int[] field1299;

    @ObfuscatedName("bk.e")
    public int field1301;

    @ObfuscatedName("bk.w")
    public int field1303;

    @ObfuscatedName("bk.m")
    public Image field1302;

    @ObfuscatedName("e.ah(IILjava/awt/Component;I)Lbk;")
    public static class71 method29(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1319(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1319(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bk.ap(I)V")
    public final void method1380() {
        class73.method1484(this.field1299, this.field1301, this.field1303);
    }

    @ObfuscatedName("bk.k(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1315(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bk.g(IILjava/awt/Component;B)V")
    public abstract void method1319(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bk.i(Ljava/awt/Graphics;III)V")
    public abstract void method1314(Graphics arg0, int arg1, int arg2);
}
