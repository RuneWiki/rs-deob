package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cc")
public abstract class class85 {

    @ObfuscatedName("cc.f")
    public int[] field1457;

    @ObfuscatedName("cc.e")
    public int field1456;

    @ObfuscatedName("cc.t")
    public int field1460;

    @ObfuscatedName("cc.d")
    public Image field1459;

    @ObfuscatedName("cs.an(IILjava/awt/Component;I)Lcc;")
    public static class85 method2034(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1581(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1581(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cc.av(B)V")
    public final void method1667() {
        class89.method1785(this.field1457, this.field1456, this.field1460);
    }

    @ObfuscatedName("cc.i(IILjava/awt/Component;B)V")
    public abstract void method1581(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cc.w(Ljava/awt/Graphics;III)V")
    public abstract void method1587(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cc.f(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1583(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
