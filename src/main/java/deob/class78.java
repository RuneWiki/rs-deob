package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bo")
public abstract class class78 {

    @ObfuscatedName("bo.p")
    public int[] field1402;

    @ObfuscatedName("bo.x")
    public int field1398;

    @ObfuscatedName("bo.d")
    public int field1399;

    @ObfuscatedName("bo.u")
    public Image field1401;

    @ObfuscatedName("de.ab(IILjava/awt/Component;B)Lbo;")
    public static class78 method2267(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1492(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1492(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bo.ad(B)V")
    public final void method1548() {
        class80.method1694(this.field1402, this.field1398, this.field1399);
    }

    @ObfuscatedName("bo.p(Ljava/awt/Graphics;IIIIS)V")
    public abstract void method1494(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bo.s(IILjava/awt/Component;B)V")
    public abstract void method1492(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bo.j(Ljava/awt/Graphics;III)V")
    public abstract void method1493(Graphics arg0, int arg1, int arg2);
}
