package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ay")
public abstract class class40 {

    @ObfuscatedName("ay.t")
    public int[] field533;

    @ObfuscatedName("ay.n")
    public int field535;

    @ObfuscatedName("ay.q")
    public int field534;

    @ObfuscatedName("ay.h")
    public Image field536;

    @ObfuscatedName("el.n(IILjava/awt/Component;I)Lay;")
    public static class40 method2336(int arg0, int arg1, Component arg2) {
        try {
            class118 var3 = new class118();
            var3.method527(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class117 var5 = new class117();
            var5.method527(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ay.q(B)V")
    public final void method528() {
        class164.method2591(this.field533, this.field535, this.field534);
    }

    @ObfuscatedName("ay.h(Ljava/awt/Graphics;III)V")
    public abstract void method526(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("ay.t(IILjava/awt/Component;B)V")
    public abstract void method527(int arg0, int arg1, Component arg2);

    @ObfuscatedName("ay.k(Ljava/awt/Graphics;IIIII)V")
    public abstract void method530(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
