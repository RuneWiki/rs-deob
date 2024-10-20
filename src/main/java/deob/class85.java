package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("co")
public abstract class class85 {

    @ObfuscatedName("co.a")
    public int[] field1452;

    @ObfuscatedName("co.t")
    public int field1457;

    @ObfuscatedName("co.f")
    public int field1453;

    @ObfuscatedName("co.c")
    public Image field1451;

    @ObfuscatedName("bs.j(IILjava/awt/Component;I)Lco;")
    public static class85 method1318(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1563(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1563(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("co.ae(B)V")
    public final void method1626() {
        class89.method1739(this.field1452, this.field1457, this.field1453);
    }

    @ObfuscatedName("co.d(IILjava/awt/Component;B)V")
    public abstract void method1563(int arg0, int arg1, Component arg2);

    @ObfuscatedName("co.g(Ljava/awt/Graphics;III)V")
    public abstract void method1572(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("co.a(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1564(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
