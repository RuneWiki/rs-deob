package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("he")
public abstract class class221 {

    @ObfuscatedName("he.d")
    public int[] field3197;

    @ObfuscatedName("he.h")
    public int field3199;

    @ObfuscatedName("he.p")
    public int field3198;

    @ObfuscatedName("he.j")
    public Image field3200;

    @ObfuscatedName("gh.t(IILjava/awt/Component;B)Lhe;")
    public static class221 method3365(int arg0, int arg1, Component arg2) {
        try {
            class219 var3 = new class219();
            var3.method3793(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class224 var5 = new class224();
            var5.method3793(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("he.y(I)V")
    public final void method3884() {
        class220.method3804(this.field3197, this.field3199, this.field3198);
    }

    @ObfuscatedName("he.q(IILjava/awt/Component;I)V")
    public abstract void method3793(int arg0, int arg1, Component arg2);

    @ObfuscatedName("he.d(Ljava/awt/Graphics;III)V")
    public abstract void method3802(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("he.h(Ljava/awt/Graphics;IIIII)V")
    public abstract void method3791(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
