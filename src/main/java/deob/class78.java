package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bz")
public abstract class class78 {

    @ObfuscatedName("bz.g")
    public int[] field1402;

    @ObfuscatedName("bz.h")
    public int field1403;

    @ObfuscatedName("bz.z")
    public int field1397;

    @ObfuscatedName("bz.r")
    public Image field1396;

    @ObfuscatedName("k.av(IILjava/awt/Component;I)Lbz;")
    public static class78 method129(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1458(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1458(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bz.ar(I)V")
    public final void method1539() {
        class80.method1632(this.field1402, this.field1403, this.field1397);
    }

    @ObfuscatedName("bz.i(Ljava/awt/Graphics;III)V")
    public abstract void method1459(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bz.g(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1460(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bz.t(IILjava/awt/Component;I)V")
    public abstract void method1458(int arg0, int arg1, Component arg2);
}
