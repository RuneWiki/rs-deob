package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ci")
public abstract class class85 {

    @ObfuscatedName("ci.s")
    public int[] field1454;

    @ObfuscatedName("ci.o")
    public int field1451;

    @ObfuscatedName("ci.p")
    public int field1448;

    @ObfuscatedName("ci.x")
    public Image field1449;

    @ObfuscatedName("m.aw(IILjava/awt/Component;I)Lci;")
    public static class85 method171(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1629(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1629(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ci.ax(B)V")
    public final void method1702() {
        class89.method1822(this.field1454, this.field1451, this.field1448);
    }

    @ObfuscatedName("ci.g(IILjava/awt/Component;B)V")
    public abstract void method1629(int arg0, int arg1, Component arg2);

    @ObfuscatedName("ci.s(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1655(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ci.h(Ljava/awt/Graphics;III)V")
    public abstract void method1643(Graphics arg0, int arg1, int arg2);
}
