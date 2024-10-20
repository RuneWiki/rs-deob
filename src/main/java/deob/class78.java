package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bu")
public abstract class class78 {

    @ObfuscatedName("bu.a")
    public int[] field1403;

    @ObfuscatedName("bu.i")
    public int field1401;

    @ObfuscatedName("bu.f")
    public int field1402;

    @ObfuscatedName("bu.m")
    public Image field1400;

    @ObfuscatedName("co.ax(IILjava/awt/Component;I)Lbu;")
    public static class78 method1939(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1507(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1507(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bu.ai(I)V")
    public final void method1565() {
        class80.method1666(this.field1403, this.field1401, this.field1402);
    }

    @ObfuscatedName("bu.j(IILjava/awt/Component;B)V")
    public abstract void method1507(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bu.a(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1508(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bu.l(Ljava/awt/Graphics;III)V")
    public abstract void method1518(Graphics arg0, int arg1, int arg2);
}
