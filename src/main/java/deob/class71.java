package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bt")
public abstract class class71 {

    @ObfuscatedName("bt.i")
    public int[] field1292;

    @ObfuscatedName("bt.p")
    public int field1296;

    @ObfuscatedName("bt.c")
    public int field1288;

    @ObfuscatedName("bt.y")
    public Image field1289;

    @ObfuscatedName("o.ak(IILjava/awt/Component;I)Lbt;")
    public static class71 method12(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1359(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1359(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bt.ah(I)V")
    public final void method1400() {
        class73.method1542(this.field1292, this.field1296, this.field1288);
    }

    @ObfuscatedName("bt.t(IILjava/awt/Component;B)V")
    public abstract void method1359(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bt.o(Ljava/awt/Graphics;IIB)V")
    public abstract void method1363(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bt.i(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
