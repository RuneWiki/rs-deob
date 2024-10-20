package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cw")
public abstract class class81 {

    @ObfuscatedName("cw.v")
    public int[] field1473;

    @ObfuscatedName("cw.r")
    public int field1469;

    @ObfuscatedName("cw.z")
    public int field1475;

    @ObfuscatedName("cw.t")
    public Image field1471;

    @ObfuscatedName("d.aa(IILjava/awt/Component;I)Lcw;")
    public static class81 method11(int arg0, int arg1, Component arg2) {
        try {
            class85 var3 = new class85();
            var3.method1557(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class79 var5 = new class79();
            var5.method1557(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cw.ar(I)V")
    public final void method1629() {
        class83.method1793(this.field1473, this.field1469, this.field1475);
    }

    @ObfuscatedName("cw.d(Ljava/awt/Graphics;III)V")
    public abstract void method1558(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cw.v(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1559(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("cw.a(IILjava/awt/Component;I)V")
    public abstract void method1557(int arg0, int arg1, Component arg2);
}
