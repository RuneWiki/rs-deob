package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("hw")
public abstract class class221 {

    @ObfuscatedName("hw.d")
    public int[] field3174;

    @ObfuscatedName("hw.m")
    public int field3176;

    @ObfuscatedName("hw.h")
    public int field3175;

    @ObfuscatedName("hw.w")
    public Image field3173;

    @ObfuscatedName("dy.l(IILjava/awt/Component;I)Lhw;")
    public static class221 method2128(int arg0, int arg1, Component arg2) {
        try {
            class219 var3 = new class219();
            var3.method3776(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class224 var5 = new class224();
            var5.method3776(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("hw.y(I)V")
    public final void method3856() {
        class220.method3785(this.field3174, this.field3176, this.field3175);
    }

    @ObfuscatedName("hw.n(IILjava/awt/Component;B)V")
    public abstract void method3776(int arg0, int arg1, Component arg2);

    @ObfuscatedName("hw.d(Ljava/awt/Graphics;III)V")
    public abstract void method3777(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("hw.m(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method3780(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
