package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("be")
public abstract class class71 {

    @ObfuscatedName("be.e")
    public int[] field1303;

    @ObfuscatedName("be.i")
    public int field1305;

    @ObfuscatedName("be.t")
    public int field1297;

    @ObfuscatedName("be.z")
    public Image field1296;

    @ObfuscatedName("t.aw(IILjava/awt/Component;B)Lbe;")
    public static class71 method29(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1337(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1337(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("be.at(I)V")
    public final void method1409() {
        class73.method1558(this.field1303, this.field1305, this.field1297);
    }

    @ObfuscatedName("be.k(IILjava/awt/Component;B)V")
    public abstract void method1337(int arg0, int arg1, Component arg2);

    @ObfuscatedName("be.e(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1343(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("be.b(Ljava/awt/Graphics;IIB)V")
    public abstract void method1338(Graphics arg0, int arg1, int arg2);
}
