package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bs")
public abstract class class72 {

    @ObfuscatedName("bs.f")
    public int[] field1295;

    @ObfuscatedName("bs.j")
    public int field1290;

    @ObfuscatedName("bs.l")
    public int field1293;

    @ObfuscatedName("bs.g")
    public Image field1292;

    @ObfuscatedName("dg.aj(IILjava/awt/Component;I)Lbs;")
    public static class72 method2424(int arg0, int arg1, Component arg2) {
        try {
            class76 var3 = new class76();
            var3.method1378(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class70 var5 = new class70();
            var5.method1378(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bs.aq(I)V")
    public final void method1414() {
        class74.method1512(this.field1295, this.field1290, this.field1293);
    }

    @ObfuscatedName("bs.t(Ljava/awt/Graphics;IIS)V")
    public abstract void method1346(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bs.f(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1347(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bs.v(IILjava/awt/Component;B)V")
    public abstract void method1378(int arg0, int arg1, Component arg2);
}
