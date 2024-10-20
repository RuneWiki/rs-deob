package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bp")
public abstract class class73 {

    @ObfuscatedName("bp.a")
    public int[] field1350;

    @ObfuscatedName("bp.m")
    public int field1351;

    @ObfuscatedName("bp.s")
    public int field1352;

    @ObfuscatedName("bp.j")
    public Image field1353;

    @ObfuscatedName("bz.ah(IILjava/awt/Component;I)Lbp;")
    public static class73 method1496(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1426(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1426(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bp.ag(B)V")
    public final void method1500() {
        class75.method1638(this.field1350, this.field1351, this.field1352);
    }

    @ObfuscatedName("bp.n(IILjava/awt/Component;I)V")
    public abstract void method1426(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bp.g(Ljava/awt/Graphics;III)V")
    public abstract void method1454(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bp.a(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1430(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
