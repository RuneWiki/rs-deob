package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ba")
public abstract class class78 {

    @ObfuscatedName("ba.q")
    public int[] field1387;

    @ObfuscatedName("ba.o")
    public int field1383;

    @ObfuscatedName("ba.g")
    public int field1382;

    @ObfuscatedName("ba.m")
    public Image field1385;

    @ObfuscatedName("p.aq(IILjava/awt/Component;B)Lba;")
    public static class78 method98(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1559(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1559(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ba.ak(S)V")
    public final void method1595() {
        class80.method1699(this.field1387, this.field1383, this.field1382);
    }

    @ObfuscatedName("ba.q(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1537(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ba.e(Ljava/awt/Graphics;III)V")
    public abstract void method1536(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("ba.l(IILjava/awt/Component;I)V")
    public abstract void method1559(int arg0, int arg1, Component arg2);
}
