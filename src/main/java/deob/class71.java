package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bq")
public abstract class class71 {

    @ObfuscatedName("bq.a")
    public int[] field1285;

    @ObfuscatedName("bq.g")
    public int field1282;

    @ObfuscatedName("bq.u")
    public int field1281;

    @ObfuscatedName("bq.k")
    public Image field1284;

    @ObfuscatedName("j.as(IILjava/awt/Component;S)Lbq;")
    public static class71 method507(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1357(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1357(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bq.aq(I)V")
    public final void method1426() {
        class73.method1521(this.field1285, this.field1282, this.field1281);
    }

    @ObfuscatedName("bq.a(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1359(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bq.p(Ljava/awt/Graphics;III)V")
    public abstract void method1358(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bq.e(IILjava/awt/Component;I)V")
    public abstract void method1357(int arg0, int arg1, Component arg2);
}
