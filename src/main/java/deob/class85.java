package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cj")
public abstract class class85 {

    @ObfuscatedName("cj.a")
    public int[] field1472;

    @ObfuscatedName("cj.l")
    public int field1470;

    @ObfuscatedName("cj.q")
    public int field1471;

    @ObfuscatedName("cj.b")
    public Image field1473;

    @ObfuscatedName("s.ax(IILjava/awt/Component;I)Lcj;")
    public static class85 method178(int arg0, int arg1, Component arg2) {
        try {
            class88 var3 = new class88();
            var3.method1545(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class83 var5 = new class83();
            var5.method1545(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cj.aq(B)V")
    public final void method1606() {
        class89.method1720(this.field1472, this.field1470, this.field1471);
    }

    @ObfuscatedName("cj.p(Ljava/awt/Graphics;IIB)V")
    public abstract void method1573(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cj.i(IILjava/awt/Component;I)V")
    public abstract void method1545(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cj.a(Ljava/awt/Graphics;IIIIS)V")
    public abstract void method1546(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
