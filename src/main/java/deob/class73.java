package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bp")
public abstract class class73 {

    @ObfuscatedName("bp.g")
    public int[] field1319;

    @ObfuscatedName("bp.u")
    public int field1320;

    @ObfuscatedName("bp.q")
    public int field1321;

    @ObfuscatedName("bp.r")
    public Image field1323;

    @ObfuscatedName("aw.e(IILjava/awt/Component;I)Lbp;")
    public static class73 method813(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1407(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1407(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bp.ar(I)V")
    public final void method1475() {
        class75.method1584(this.field1319, this.field1320, this.field1321);
    }

    @ObfuscatedName("bp.o(IILjava/awt/Component;B)V")
    public abstract void method1407(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bp.l(Ljava/awt/Graphics;IIB)V")
    public abstract void method1408(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bp.g(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1409(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
