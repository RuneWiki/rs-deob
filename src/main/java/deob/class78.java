package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bl")
public abstract class class78 {

    @ObfuscatedName("bl.i")
    public int[] field1377;

    @ObfuscatedName("bl.h")
    public int field1378;

    @ObfuscatedName("bl.q")
    public int field1379;

    @ObfuscatedName("bl.u")
    public Image field1380;

    @ObfuscatedName("fp.as(IILjava/awt/Component;I)Lbl;")
    public static class78 method3079(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1465(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1465(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bl.ac(B)V")
    public final void method1527() {
        class80.method1631(this.field1377, this.field1378, this.field1379);
    }

    @ObfuscatedName("bl.i(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1459(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bl.o(IILjava/awt/Component;I)V")
    public abstract void method1465(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bl.f(Ljava/awt/Graphics;III)V")
    public abstract void method1458(Graphics arg0, int arg1, int arg2);
}
