package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("be")
public abstract class class73 {

    @ObfuscatedName("be.a")
    public int[] field1336;

    @ObfuscatedName("be.w")
    public int field1335;

    @ObfuscatedName("be.m")
    public int field1337;

    @ObfuscatedName("be.h")
    public Image field1338;

    @ObfuscatedName("p.an(IILjava/awt/Component;B)Lbe;")
    public static class73 method500(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1466(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1466(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("be.ao(I)V")
    public final void method1503() {
        class75.method1597(this.field1336, this.field1335, this.field1337);
    }

    @ObfuscatedName("be.o(Ljava/awt/Graphics;III)V")
    public abstract void method1435(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("be.a(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1436(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("be.n(IILjava/awt/Component;B)V")
    public abstract void method1466(int arg0, int arg1, Component arg2);
}
