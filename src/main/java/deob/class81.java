package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cd")
public abstract class class81 {

    @ObfuscatedName("cd.n")
    public int[] field1447;

    @ObfuscatedName("cd.t")
    public int field1444;

    @ObfuscatedName("cd.v")
    public int field1445;

    @ObfuscatedName("cd.b")
    public Image field1446;

    @ObfuscatedName("v.ar(IILjava/awt/Component;I)Lcd;")
    public static class81 method50(int arg0, int arg1, Component arg2) {
        try {
            class85 var3 = new class85();
            var3.method1577(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class79 var5 = new class79();
            var5.method1577(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cd.ae(I)V")
    public final void method1647() {
        class83.method1744(this.field1447, this.field1444, this.field1445);
    }

    @ObfuscatedName("cd.f(IILjava/awt/Component;B)V")
    public abstract void method1577(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cd.e(Ljava/awt/Graphics;IIB)V")
    public abstract void method1610(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cd.n(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1579(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
