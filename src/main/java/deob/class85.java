package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cb")
public abstract class class85 {

    @ObfuscatedName("cb.a")
    public int[] field1474;

    @ObfuscatedName("cb.h")
    public int field1462;

    @ObfuscatedName("cb.y")
    public int field1464;

    @ObfuscatedName("cb.j")
    public Image field1465;

    @ObfuscatedName("br.ax(IILjava/awt/Component;I)Lcb;")
    public static class85 method1439(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1624(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1624(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cb.af(I)V")
    public final void method1699() {
        class89.method1808(this.field1474, this.field1462, this.field1464);
    }

    @ObfuscatedName("cb.e(Ljava/awt/Graphics;III)V")
    public abstract void method1625(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cb.a(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1626(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("cb.p(IILjava/awt/Component;I)V")
    public abstract void method1624(int arg0, int arg1, Component arg2);
}
