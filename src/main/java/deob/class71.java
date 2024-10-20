package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bj")
public abstract class class71 {

    @ObfuscatedName("bj.k")
    public int[] field1283;

    @ObfuscatedName("bj.i")
    public int field1280;

    @ObfuscatedName("bj.d")
    public int field1281;

    @ObfuscatedName("bj.q")
    public Image field1285;

    @ObfuscatedName("ci.b(IILjava/awt/Component;I)Lbj;")
    public static class71 method1977(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1375(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1375(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bj.l(I)V")
    public final void method1424() {
        class73.method1526(this.field1283, this.field1280, this.field1281);
    }

    @ObfuscatedName("bj.n(IILjava/awt/Component;I)V")
    public abstract void method1375(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bj.x(Ljava/awt/Graphics;IIS)V")
    public abstract void method1348(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bj.k(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
