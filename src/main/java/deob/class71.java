package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bp")
public abstract class class71 {

    @ObfuscatedName("bp.z")
    public int[] field1287;

    @ObfuscatedName("bp.h")
    public int field1294;

    @ObfuscatedName("bp.k")
    public int field1288;

    @ObfuscatedName("bp.l")
    public Image field1289;

    @ObfuscatedName("af.am(IILjava/awt/Component;I)Lbp;")
    public static class71 method917(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1385(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1385(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bp.av(I)V")
    public final void method1432() {
        class73.method1565(this.field1287, this.field1294, this.field1288);
    }

    @ObfuscatedName("bp.g(IILjava/awt/Component;I)V")
    public abstract void method1385(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bp.v(Ljava/awt/Graphics;III)V")
    public abstract void method1360(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bp.z(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1361(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
