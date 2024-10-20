package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bc")
public abstract class class72 {

    @ObfuscatedName("bc.y")
    public int[] field1288;

    @ObfuscatedName("bc.r")
    public int field1292;

    @ObfuscatedName("bc.f")
    public int field1289;

    @ObfuscatedName("bc.l")
    public Image field1290;

    @ObfuscatedName("ci.an(IILjava/awt/Component;I)Lbc;")
    public static class72 method1799(int arg0, int arg1, Component arg2) {
        try {
            class76 var3 = new class76();
            var3.method1345(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class70 var5 = new class70();
            var5.method1345(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bc.ah(B)V")
    public final void method1417() {
        class74.method1522(this.field1288, this.field1292, this.field1289);
    }

    @ObfuscatedName("bc.j(Ljava/awt/Graphics;III)V")
    public abstract void method1367(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bc.y(Ljava/awt/Graphics;IIIIB)V")
    public abstract void method1346(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bc.c(IILjava/awt/Component;B)V")
    public abstract void method1345(int arg0, int arg1, Component arg2);
}
