package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cn")
public abstract class class85 {

    @ObfuscatedName("cn.n")
    public int[] field1455;

    @ObfuscatedName("cn.e")
    public int field1449;

    @ObfuscatedName("cn.l")
    public int field1450;

    @ObfuscatedName("cn.d")
    public Image field1454;

    @ObfuscatedName("bf.af(IILjava/awt/Component;B)Lcn;")
    public static class85 method1557(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1631(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1631(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cn.ai(I)V")
    public final void method1693() {
        class89.method1856(this.field1455, this.field1449, this.field1450);
    }

    @ObfuscatedName("cn.f(IILjava/awt/Component;I)V")
    public abstract void method1631(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cn.t(Ljava/awt/Graphics;IIB)V")
    public abstract void method1626(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cn.n(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1628(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
