package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bs")
public abstract class class73 {

    @ObfuscatedName("bs.i")
    public int[] field1320;

    @ObfuscatedName("bs.e")
    public int field1321;

    @ObfuscatedName("bs.h")
    public int field1322;

    @ObfuscatedName("bs.q")
    public Image field1324;

    @ObfuscatedName("cg.ap(IILjava/awt/Component;B)Lbs;")
    public static class73 method1903(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1366(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1366(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bs.an(I)V")
    public final void method1446() {
        class75.method1533(this.field1320, this.field1321, this.field1322);
    }

    @ObfuscatedName("bs.i(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1368(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bs.w(Ljava/awt/Graphics;IIS)V")
    public abstract void method1367(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bs.n(IILjava/awt/Component;I)V")
    public abstract void method1366(int arg0, int arg1, Component arg2);
}
