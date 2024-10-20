package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bx")
public abstract class class78 {

    @ObfuscatedName("bx.f")
    public int[] field1362;

    @ObfuscatedName("bx.s")
    public int field1367;

    @ObfuscatedName("bx.p")
    public int field1363;

    @ObfuscatedName("bx.h")
    public Image field1361;

    @ObfuscatedName("j.az(IILjava/awt/Component;I)Lbx;")
    public static class78 method162(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1496(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1496(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bx.ah(I)V")
    public final void method1561() {
        class80.method1695(this.field1362, this.field1367, this.field1363);
    }

    @ObfuscatedName("bx.w(Ljava/awt/Graphics;III)V")
    public abstract void method1497(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bx.f(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1498(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bx.e(IILjava/awt/Component;I)V")
    public abstract void method1496(int arg0, int arg1, Component arg2);
}
