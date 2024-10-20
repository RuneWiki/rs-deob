package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bc")
public abstract class class71 {

    @ObfuscatedName("bc.h")
    public int[] field1299;

    @ObfuscatedName("bc.v")
    public int field1306;

    @ObfuscatedName("bc.q")
    public int field1300;

    @ObfuscatedName("bc.s")
    public Image field1297;

    @ObfuscatedName("g.aa(IILjava/awt/Component;I)Lbc;")
    public static class71 method86(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1354(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1354(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bc.ab(I)V")
    public final void method1429() {
        class73.method1559(this.field1299, this.field1306, this.field1300);
    }

    @ObfuscatedName("bc.h(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1385(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bc.c(Ljava/awt/Graphics;III)V")
    public abstract void method1355(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bc.i(IILjava/awt/Component;I)V")
    public abstract void method1354(int arg0, int arg1, Component arg2);
}
