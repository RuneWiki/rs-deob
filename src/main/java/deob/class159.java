package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cd")
public abstract class class159 {

    @ObfuscatedName("cd.b")
    public int[] field2386;

    @ObfuscatedName("cd.m")
    public int field2384;

    @ObfuscatedName("cd.i")
    public int field2385;

    @ObfuscatedName("cd.z")
    public Image field2387;

    @ObfuscatedName("cd.v(IILjava/awt/Component;S)V")
    public abstract void method2596(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cd.an(B)V")
    public final void method2826() {
        class106.method1548(this.field2386, this.field2385, this.field2384);
    }

    @ObfuscatedName("cd.c(Ljava/awt/Graphics;III)V")
    public abstract void method2597(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cd.b(Ljava/awt/Graphics;IIIII)V")
    public abstract void method2627(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bu.aa(IILjava/awt/Component;I)Lcd;")
    public static class159 method2078(int arg0, int arg1, Component arg2) {
        try {
            class143 var3 = new class143();
            var3.method2596(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class142 var5 = new class142();
            var5.method2596(arg0, arg1, arg2);
            return var5;
        }
    }
}
