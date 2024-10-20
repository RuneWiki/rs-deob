package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("co")
public abstract class class85 {

    @ObfuscatedName("co.u")
    public int[] field1438;

    @ObfuscatedName("co.t")
    public int field1435;

    @ObfuscatedName("co.k")
    public int field1439;

    @ObfuscatedName("co.x")
    public Image field1437;

    @ObfuscatedName("dn.ag(IILjava/awt/Component;I)Lco;")
    public static class85 method2305(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1542(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1542(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("co.ab(I)V")
    public final void method1616() {
        class89.method1723(this.field1438, this.field1435, this.field1439);
    }

    @ObfuscatedName("co.a(IILjava/awt/Component;I)V")
    public abstract void method1542(int arg0, int arg1, Component arg2);

    @ObfuscatedName("co.r(Ljava/awt/Graphics;IIB)V")
    public abstract void method1543(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("co.u(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1550(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
