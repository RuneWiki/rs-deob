package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bm")
public abstract class class71 {

    @ObfuscatedName("bm.f")
    public int[] field1281;

    @ObfuscatedName("bm.e")
    public int field1286;

    @ObfuscatedName("bm.d")
    public int field1282;

    @ObfuscatedName("bm.n")
    public Image field1280;

    @ObfuscatedName("fa.af(IILjava/awt/Component;B)Lbm;")
    public static class71 method3032(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1352(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1352(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bm.ab(I)V")
    public final void method1391() {
        class73.method1489(this.field1281, this.field1286, this.field1282);
    }

    @ObfuscatedName("bm.t(IILjava/awt/Component;B)V")
    public abstract void method1352(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bm.s(Ljava/awt/Graphics;IIB)V")
    public abstract void method1330(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bm.f(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1345(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
