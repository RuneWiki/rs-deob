package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("hn")
public abstract class class221 {

    @ObfuscatedName("hn.l")
    public int[] field3193;

    @ObfuscatedName("hn.i")
    public int field3191;

    @ObfuscatedName("hn.t")
    public int field3194;

    @ObfuscatedName("hn.k")
    public Image field3192;

    @ObfuscatedName("e.q(IILjava/awt/Component;I)Lhn;")
    public static class221 method224(int arg0, int arg1, Component arg2) {
        try {
            class219 var3 = new class219();
            var3.method3861(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class224 var5 = new class224();
            var5.method3861(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("hn.c(B)V")
    public final void method3948() {
        class220.method3875(this.field3193, this.field3191, this.field3194);
    }

    @ObfuscatedName("hn.b(IILjava/awt/Component;I)V")
    public abstract void method3861(int arg0, int arg1, Component arg2);

    @ObfuscatedName("hn.l(Ljava/awt/Graphics;III)V")
    public abstract void method3860(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("hn.i(Ljava/awt/Graphics;IIIII)V")
    public abstract void method3862(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
