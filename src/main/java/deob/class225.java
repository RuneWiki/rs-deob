package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("hs")
public abstract class class225 {

    @ObfuscatedName("hs.c")
    public int[] field3217;

    @ObfuscatedName("hs.n")
    public int field3219;

    @ObfuscatedName("hs.q")
    public int field3218;

    @ObfuscatedName("hs.t")
    public Image field3216;

    @ObfuscatedName("gx.e(IILjava/awt/Component;I)Lhs;")
    public static class225 method3592(int arg0, int arg1, Component arg2) {
        try {
            class223 var3 = new class223();
            var3.method3847(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class228 var5 = new class228();
            var5.method3847(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("hs.j(I)V")
    public final void method3923() {
        class224.method3858(this.field3217, this.field3219, this.field3218);
    }

    @ObfuscatedName("hs.c(Ljava/awt/Graphics;III)V")
    public abstract void method3848(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("hs.n(Ljava/awt/Graphics;IIIII)V")
    public abstract void method3849(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("hs.d(IILjava/awt/Component;B)V")
    public abstract void method3847(int arg0, int arg1, Component arg2);
}
