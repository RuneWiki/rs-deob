package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("hk")
public abstract class class221 {

    @ObfuscatedName("hk.e")
    public int[] field3193;

    @ObfuscatedName("hk.c")
    public int field3195;

    @ObfuscatedName("hk.l")
    public int field3194;

    @ObfuscatedName("hk.y")
    public Image field3196;

    @ObfuscatedName("m.f(IILjava/awt/Component;I)Lhk;")
    public static class221 method271(int arg0, int arg1, Component arg2) {
        try {
            class219 var3 = new class219();
            var3.method3799(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class224 var5 = new class224();
            var5.method3799(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("hk.a(I)V")
    public final void method3880() {
        class220.method3807(this.field3193, this.field3195, this.field3194);
    }

    @ObfuscatedName("hk.b(IILjava/awt/Component;B)V")
    public abstract void method3799(int arg0, int arg1, Component arg2);

    @ObfuscatedName("hk.e(Ljava/awt/Graphics;IIB)V")
    public abstract void method3798(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("hk.c(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method3801(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
