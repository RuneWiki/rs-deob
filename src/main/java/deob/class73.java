package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bz")
public abstract class class73 {

    @ObfuscatedName("bz.l")
    public int[] field1267;

    @ObfuscatedName("bz.c")
    public int field1264;

    @ObfuscatedName("bz.u")
    public int field1263;

    @ObfuscatedName("bz.w")
    public Image field1266;

    @ObfuscatedName("dq.au(IILjava/awt/Component;I)Lbz;")
    public static class73 method2612(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1398(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1398(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bz.ae(I)V")
    public final void method1465() {
        class75.method1570(this.field1267, this.field1264, this.field1263);
    }

    @ObfuscatedName("bz.e(IILjava/awt/Component;I)V")
    public abstract void method1398(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bz.a(Ljava/awt/Graphics;IIB)V")
    public abstract void method1395(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bz.l(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1396(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
