package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("as")
public abstract class class41 {

    @ObfuscatedName("as.q")
    public int[] field549;

    @ObfuscatedName("as.l")
    public int field547;

    @ObfuscatedName("as.a")
    public int field548;

    @ObfuscatedName("as.o")
    public Image field546;

    @ObfuscatedName("bo.l(IILjava/awt/Component;I)Las;")
    public static class41 method907(int arg0, int arg1, Component arg2) {
        try {
            class119 var3 = new class119();
            var3.method533(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class118 var5 = new class118();
            var5.method533(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("as.a(I)V")
    public final void method524() {
        class165.method2584(this.field549, this.field547, this.field548);
    }

    @ObfuscatedName("as.c(Ljava/awt/Graphics;IIIII)V")
    public abstract void method526(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("as.o(Ljava/awt/Graphics;III)V")
    public abstract void method531(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("as.q(IILjava/awt/Component;I)V")
    public abstract void method533(int arg0, int arg1, Component arg2);
}
