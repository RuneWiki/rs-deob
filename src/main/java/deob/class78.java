package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bo")
public abstract class class78 {

    @ObfuscatedName("bo.i")
    public int[] field1392;

    @ObfuscatedName("bo.d")
    public int field1388;

    @ObfuscatedName("bo.o")
    public int field1391;

    @ObfuscatedName("bo.c")
    public Image field1390;

    @ObfuscatedName("ab.g(IILjava/awt/Component;B)Lbo;")
    public static class78 method971(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1508(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1508(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bo.af(I)V")
    public final void method1598() {
        class80.method1682(this.field1392, this.field1388, this.field1391);
    }

    @ObfuscatedName("bo.f(Ljava/awt/Graphics;III)V")
    public abstract void method1509(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bo.v(IILjava/awt/Component;B)V")
    public abstract void method1508(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bo.i(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1510(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
