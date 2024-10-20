package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cn")
public abstract class class85 {

    @ObfuscatedName("cn.c")
    public int[] field1500;

    @ObfuscatedName("cn.d")
    public int field1496;

    @ObfuscatedName("cn.b")
    public int field1497;

    @ObfuscatedName("cn.i")
    public Image field1498;

    @ObfuscatedName("bu.ak(IILjava/awt/Component;I)Lcn;")
    public static class85 method1536(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1635(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1635(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cn.ap(I)V")
    public final void method1678() {
        class89.method1860(this.field1500, this.field1496, this.field1497);
    }

    @ObfuscatedName("cn.t(IILjava/awt/Component;I)V")
    public abstract void method1635(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cn.c(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1609(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("cn.l(Ljava/awt/Graphics;III)V")
    public abstract void method1611(Graphics arg0, int arg1, int arg2);
}
