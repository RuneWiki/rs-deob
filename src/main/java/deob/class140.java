package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cv")
public abstract class class140 {

    @ObfuscatedName("cv.d")
    public Image field2148;

    @ObfuscatedName("cv.k")
    public int[] field2149;

    @ObfuscatedName("cv.w")
    public int field2145;

    @ObfuscatedName("cv.t")
    public int field2151;

    @ObfuscatedName("cv.k(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1496(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("cv.b(IILjava/awt/Component;I)V")
    public abstract void method1464(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cv.ar(I)V")
    public final void method2374() {
        class146.method2392(this.field2149, this.field2145, this.field2151);
    }

    @ObfuscatedName("cv.h(Ljava/awt/Graphics;IIB)V")
    public abstract void method1475(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("dg.ab(IILjava/awt/Component;I)Lcv;")
    public static class140 method550(int arg0, int arg1, Component arg2) {
        try {
            class159 var3 = new class159();
            var3.method1464(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class106 var5 = new class106();
            var5.method1464(arg0, arg1, arg2);
            return var5;
        }
    }
}
