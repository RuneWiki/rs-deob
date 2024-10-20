package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bz")
public abstract class class78 {

    @ObfuscatedName("bz.w")
    public int[] field1396;

    @ObfuscatedName("bz.d")
    public int field1388;

    @ObfuscatedName("bz.z")
    public int field1394;

    @ObfuscatedName("bz.l")
    public Image field1390;

    @ObfuscatedName("dx.h(IILjava/awt/Component;I)Lbz;")
    public static class78 method2289(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1541(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1541(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bz.ay(I)V")
    public final void method1608() {
        class80.method1746(this.field1396, this.field1388, this.field1394);
    }

    @ObfuscatedName("bz.g(IILjava/awt/Component;B)V")
    public abstract void method1541(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bz.w(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1568(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bz.b(Ljava/awt/Graphics;III)V")
    public abstract void method1542(Graphics arg0, int arg1, int arg2);
}
