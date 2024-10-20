package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ci")
public abstract class class81 {

    @ObfuscatedName("ci.e")
    public int[] field1445;

    @ObfuscatedName("ci.g")
    public int field1452;

    @ObfuscatedName("ci.n")
    public int field1447;

    @ObfuscatedName("ci.u")
    public Image field1448;

    @ObfuscatedName("aj.ar(IILjava/awt/Component;B)Lci;")
    public static class81 method946(int arg0, int arg1, Component arg2) {
        try {
            class85 var3 = new class85();
            var3.method1552(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class79 var5 = new class79();
            var5.method1552(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ci.aw(B)V")
    public final void method1636() {
        class83.method1748(this.field1445, this.field1452, this.field1447);
    }

    @ObfuscatedName("ci.i(IILjava/awt/Component;B)V")
    public abstract void method1552(int arg0, int arg1, Component arg2);

    @ObfuscatedName("ci.h(Ljava/awt/Graphics;IIB)V")
    public abstract void method1553(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("ci.e(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1555(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
