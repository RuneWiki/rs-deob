package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bv")
public abstract class class73 {

    @ObfuscatedName("bv.g")
    public int[] field1319;

    @ObfuscatedName("bv.n")
    public int field1320;

    @ObfuscatedName("bv.t")
    public int field1324;

    @ObfuscatedName("bv.e")
    public Image field1322;

    @ObfuscatedName("bp.am(IILjava/awt/Component;B)Lbv;")
    public static class73 method1363(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1390(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1390(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bv.ar(I)V")
    public final void method1439() {
        class75.method1547(this.field1319, this.field1320, this.field1324);
    }

    @ObfuscatedName("bv.y(IILjava/awt/Component;I)V")
    public abstract void method1390(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bv.g(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1392(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bv.k(Ljava/awt/Graphics;III)V")
    public abstract void method1393(Graphics arg0, int arg1, int arg2);
}
