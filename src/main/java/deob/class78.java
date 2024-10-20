package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bp")
public abstract class class78 {

    @ObfuscatedName("bp.r")
    public int[] field1401;

    @ObfuscatedName("bp.n")
    public int field1394;

    @ObfuscatedName("bp.x")
    public int field1395;

    @ObfuscatedName("bp.q")
    public Image field1396;

    @ObfuscatedName("cb.ar(IILjava/awt/Component;I)Lbp;")
    public static class78 method2029(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1527(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1527(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bp.ah(B)V")
    public final void method1579() {
        class80.method1685(this.field1401, this.field1394, this.field1395);
    }

    @ObfuscatedName("bp.v(Ljava/awt/Graphics;III)V")
    public abstract void method1528(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bp.r(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1529(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bp.i(IILjava/awt/Component;B)V")
    public abstract void method1527(int arg0, int arg1, Component arg2);
}
