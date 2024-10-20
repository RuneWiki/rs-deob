package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bf")
public abstract class class78 {

    @ObfuscatedName("bf.y")
    public int[] field1349;

    @ObfuscatedName("bf.u")
    public int field1348;

    @ObfuscatedName("bf.k")
    public int field1350;

    @ObfuscatedName("bf.j")
    public Image field1351;

    @ObfuscatedName("y.ac(IILjava/awt/Component;I)Lbf;")
    public static class78 method43(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1556(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1556(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bf.ar(I)V")
    public final void method1628() {
        class80.method1771(this.field1349, this.field1348, this.field1350);
    }

    @ObfuscatedName("bf.l(Ljava/awt/Graphics;IIB)V")
    public abstract void method1557(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bf.y(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1558(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bf.m(IILjava/awt/Component;I)V")
    public abstract void method1556(int arg0, int arg1, Component arg2);
}
