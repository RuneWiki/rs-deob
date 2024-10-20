package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bq")
public abstract class class73 {

    @ObfuscatedName("bq.e")
    public int[] field1335;

    @ObfuscatedName("bq.f")
    public int field1334;

    @ObfuscatedName("bq.w")
    public int field1336;

    @ObfuscatedName("bq.t")
    public Image field1333;

    @ObfuscatedName("fv.u(IILjava/awt/Component;B)Lbq;")
    public static class73 method2998(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1382(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1382(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bq.j(I)V")
    public final void method1435() {
        class75.method1533(this.field1335, this.field1334, this.field1336);
    }

    @ObfuscatedName("bq.p(IILjava/awt/Component;B)V")
    public abstract void method1382(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bq.e(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1384(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bq.k(Ljava/awt/Graphics;III)V")
    public abstract void method1383(Graphics arg0, int arg1, int arg2);
}
