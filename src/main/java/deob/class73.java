package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bm")
public abstract class class73 {

    @ObfuscatedName("bm.p")
    public int[] field1311;

    @ObfuscatedName("bm.e")
    public int field1300;

    @ObfuscatedName("bm.i")
    public int field1302;

    @ObfuscatedName("bm.o")
    public Image field1303;

    @ObfuscatedName("f.z(IILjava/awt/Component;I)Lbm;")
    public static class73 method93(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1434(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1434(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bm.m(S)V")
    public final void method1468() {
        class75.method1583(this.field1311, this.field1300, this.field1302);
    }

    @ObfuscatedName("bm.b(Ljava/awt/Graphics;III)V")
    public abstract void method1419(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bm.p(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1420(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bm.t(IILjava/awt/Component;I)V")
    public abstract void method1434(int arg0, int arg1, Component arg2);
}
