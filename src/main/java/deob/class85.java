package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cb")
public abstract class class85 {

    @ObfuscatedName("cb.g")
    public int[] field1442;

    @ObfuscatedName("cb.o")
    public int field1444;

    @ObfuscatedName("cb.a")
    public int field1443;

    @ObfuscatedName("cb.h")
    public Image field1446;

    @ObfuscatedName("m.at(IILjava/awt/Component;I)Lcb;")
    public static class85 method214(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1599(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1599(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cb.as(I)V")
    public final void method1659() {
        class89.method1768(this.field1442, this.field1444, this.field1443);
    }

    @ObfuscatedName("cb.b(IILjava/awt/Component;B)V")
    public abstract void method1599(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cb.g(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1601(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("cb.e(Ljava/awt/Graphics;III)V")
    public abstract void method1616(Graphics arg0, int arg1, int arg2);
}
