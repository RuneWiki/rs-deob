package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ca")
public abstract class class85 {

    @ObfuscatedName("ca.d")
    public int[] field1451;

    @ObfuscatedName("ca.k")
    public int field1450;

    @ObfuscatedName("ca.n")
    public int field1455;

    @ObfuscatedName("ca.s")
    public Image field1452;

    @ObfuscatedName("ao.aj(IILjava/awt/Component;B)Lca;")
    public static class85 method896(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1600(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1600(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ca.ax(I)V")
    public final void method1672() {
        class89.method1793(this.field1451, this.field1450, this.field1455);
    }

    @ObfuscatedName("ca.d(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1602(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ca.y(IILjava/awt/Component;B)V")
    public abstract void method1600(int arg0, int arg1, Component arg2);

    @ObfuscatedName("ca.m(Ljava/awt/Graphics;III)V")
    public abstract void method1601(Graphics arg0, int arg1, int arg2);
}
