package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ct")
public abstract class class81 {

    @ObfuscatedName("ct.e")
    public int[] field1468;

    @ObfuscatedName("ct.o")
    public int field1469;

    @ObfuscatedName("ct.g")
    public int field1470;

    @ObfuscatedName("ct.l")
    public Image field1471;

    @ObfuscatedName("az.ax(IILjava/awt/Component;I)Lct;")
    public static class81 method1009(int arg0, int arg1, Component arg2) {
        try {
            class85 var3 = new class85();
            var3.method1601(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class79 var5 = new class79();
            var5.method1601(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ct.ad(I)V")
    public final void method1676() {
        class83.method1765(this.field1468, this.field1469, this.field1470);
    }

    @ObfuscatedName("ct.w(Ljava/awt/Graphics;III)V")
    public abstract void method1597(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("ct.e(Ljava/awt/Graphics;IIIIS)V")
    public abstract void method1599(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ct.m(IILjava/awt/Component;B)V")
    public abstract void method1601(int arg0, int arg1, Component arg2);
}
