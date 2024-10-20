package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bl")
public abstract class class78 {

    @ObfuscatedName("bl.s")
    public int[] field1377;

    @ObfuscatedName("bl.q")
    public int field1384;

    @ObfuscatedName("bl.j")
    public int field1389;

    @ObfuscatedName("bl.k")
    public Image field1379;

    @ObfuscatedName("dp.az(IILjava/awt/Component;I)Lbl;")
    public static class78 method2218(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1484(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1484(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bl.ab(I)V")
    public final void method1550() {
        class80.method1698(this.field1377, this.field1384, this.field1389);
    }

    @ObfuscatedName("bl.n(IILjava/awt/Component;S)V")
    public abstract void method1484(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bl.d(Ljava/awt/Graphics;III)V")
    public abstract void method1482(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bl.s(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1483(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
