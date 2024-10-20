package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cg")
public abstract class class85 {

    @ObfuscatedName("cg.v")
    public int[] field1443;

    @ObfuscatedName("cg.p")
    public int field1438;

    @ObfuscatedName("cg.e")
    public int field1444;

    @ObfuscatedName("cg.d")
    public Image field1440;

    @ObfuscatedName("ef.ae(IILjava/awt/Component;B)Lcg;")
    public static class85 method2917(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1610(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1610(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cg.as(B)V")
    public final void method1662() {
        class89.method1779(this.field1443, this.field1438, this.field1444);
    }

    @ObfuscatedName("cg.j(IILjava/awt/Component;I)V")
    public abstract void method1610(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cg.v(Ljava/awt/Graphics;IIIIS)V")
    public abstract void method1614(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("cg.r(Ljava/awt/Graphics;III)V")
    public abstract void method1594(Graphics arg0, int arg1, int arg2);
}
