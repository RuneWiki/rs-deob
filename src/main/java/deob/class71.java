package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bi")
public abstract class class71 {

    @ObfuscatedName("bi.s")
    public int[] field1272;

    @ObfuscatedName("bi.g")
    public int field1278;

    @ObfuscatedName("bi.h")
    public int field1276;

    @ObfuscatedName("bi.l")
    public Image field1274;

    @ObfuscatedName("d.aj(IILjava/awt/Component;I)Lbi;")
    public static class71 method119(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1340(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1340(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bi.ao(B)V")
    public final void method1412() {
        class73.method1559(this.field1272, this.field1278, this.field1276);
    }

    @ObfuscatedName("bi.y(Ljava/awt/Graphics;III)V")
    public abstract void method1345(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bi.s(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1342(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bi.k(IILjava/awt/Component;I)V")
    public abstract void method1340(int arg0, int arg1, Component arg2);
}
