package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("hj")
public abstract class class221 {

    @ObfuscatedName("hj.i")
    public int[] field3197;

    @ObfuscatedName("hj.u")
    public int field3199;

    @ObfuscatedName("hj.h")
    public int field3198;

    @ObfuscatedName("hj.r")
    public Image field3196;

    @ObfuscatedName("o.s(IILjava/awt/Component;I)Lhj;")
    public static class221 method70(int arg0, int arg1, Component arg2) {
        try {
            class219 var3 = new class219();
            var3.method3761(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class224 var5 = new class224();
            var5.method3761(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("hj.q(I)V")
    public final void method3843() {
        class220.method3771(this.field3197, this.field3199, this.field3198);
    }

    @ObfuscatedName("hj.f(IILjava/awt/Component;B)V")
    public abstract void method3761(int arg0, int arg1, Component arg2);

    @ObfuscatedName("hj.u(Ljava/awt/Graphics;IIIII)V")
    public abstract void method3763(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("hj.i(Ljava/awt/Graphics;IIB)V")
    public abstract void method3762(Graphics arg0, int arg1, int arg2);
}
