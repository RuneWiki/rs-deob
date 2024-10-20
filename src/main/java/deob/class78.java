package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("br")
public abstract class class78 {

    @ObfuscatedName("br.d")
    public int[] field1394;

    @ObfuscatedName("br.c")
    public int field1395;

    @ObfuscatedName("br.y")
    public int field1396;

    @ObfuscatedName("br.k")
    public Image field1397;

    @ObfuscatedName("aa.al(IILjava/awt/Component;I)Lbr;")
    public static class78 method1076(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1603(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1603(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("br.ai(B)V")
    public final void method1670() {
        class80.method1830(this.field1394, this.field1395, this.field1396);
    }

    @ObfuscatedName("br.a(IILjava/awt/Component;B)V")
    public abstract void method1603(int arg0, int arg1, Component arg2);

    @ObfuscatedName("br.w(Ljava/awt/Graphics;IIB)V")
    public abstract void method1604(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("br.d(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1607(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
