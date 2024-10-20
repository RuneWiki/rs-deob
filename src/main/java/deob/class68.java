package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bg")
public abstract class class68 {

    @ObfuscatedName("bg.u")
    public int[] field1262;

    @ObfuscatedName("bg.t")
    public int field1260;

    @ObfuscatedName("bg.e")
    public int field1259;

    @ObfuscatedName("bg.a")
    public Image field1261;

    @ObfuscatedName("ae.an(IILjava/awt/Component;B)Lbg;")
    public static class68 method793(int arg0, int arg1, Component arg2) {
        try {
            class72 var3 = new class72();
            var3.method1346(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class66 var5 = new class66();
            var5.method1346(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bg.ah(S)V")
    public final void method1417() {
        class70.method1568(this.field1262, this.field1260, this.field1259);
    }

    @ObfuscatedName("bg.n(Ljava/awt/Graphics;IIS)V")
    public abstract void method1347(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("bg.z(IILjava/awt/Component;B)V")
    public abstract void method1346(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bg.u(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
