package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cl")
public abstract class class85 {

    @ObfuscatedName("cl.e")
    public int[] field1468;

    @ObfuscatedName("cl.r")
    public int field1466;

    @ObfuscatedName("cl.p")
    public int field1467;

    @ObfuscatedName("cl.n")
    public Image field1465;

    @ObfuscatedName("g.as(IILjava/awt/Component;B)Lcl;")
    public static class85 method195(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1570(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1570(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cl.aq(I)V")
    public final void method1627() {
        class89.method1738(this.field1468, this.field1466, this.field1467);
    }

    @ObfuscatedName("cl.a(IILjava/awt/Component;S)V")
    public abstract void method1570(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cl.x(Ljava/awt/Graphics;III)V")
    public abstract void method1563(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cl.e(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1580(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
