package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bd")
public abstract class class78 {

    @ObfuscatedName("bd.i")
    public int[] field1400;

    @ObfuscatedName("bd.q")
    public int field1398;

    @ObfuscatedName("bd.p")
    public int field1405;

    @ObfuscatedName("bd.c")
    public Image field1399;

    @ObfuscatedName("dc.ap(IILjava/awt/Component;B)Lbd;")
    public static class78 method2642(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1489(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1489(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bd.as(I)V")
    public final void method1563() {
        class80.method1655(this.field1400, this.field1398, this.field1405);
    }

    @ObfuscatedName("bd.h(IILjava/awt/Component;B)V")
    public abstract void method1489(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bd.i(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1491(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bd.m(Ljava/awt/Graphics;IIB)V")
    public abstract void method1518(Graphics arg0, int arg1, int arg2);
}
