package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bv")
public abstract class class72 {

    @ObfuscatedName("bv.m")
    public int[] field1299;

    @ObfuscatedName("bv.e")
    public int field1298;

    @ObfuscatedName("bv.h")
    public int field1297;

    @ObfuscatedName("bv.p")
    public Image field1300;

    @ObfuscatedName("am.am(IILjava/awt/Component;I)Lbv;")
    public static class72 method602(int arg0, int arg1, Component arg2) {
        try {
            class76 var3 = new class76();
            var3.method1374(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class70 var5 = new class70();
            var5.method1374(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bv.au(I)V")
    public final void method1443() {
        class74.method1536(this.field1299, this.field1298, this.field1297);
    }

    @ObfuscatedName("bv.x(IILjava/awt/Component;I)V")
    public abstract void method1374(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bv.m(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1367(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bv.v(Ljava/awt/Graphics;III)V")
    public abstract void method1366(Graphics arg0, int arg1, int arg2);
}
