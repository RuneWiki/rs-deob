package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("ba")
public abstract class class73 {

    @ObfuscatedName("ba.a")
    public int[] field1327;

    @ObfuscatedName("ba.k")
    public int field1324;

    @ObfuscatedName("ba.p")
    public int field1326;

    @ObfuscatedName("ba.l")
    public Image field1330;

    @ObfuscatedName("b.ax(IILjava/awt/Component;I)Lba;")
    public static class73 method5(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1355(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1355(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("ba.ag(I)V")
    public final void method1394() {
        class75.method1556(this.field1327, this.field1324, this.field1326);
    }

    @ObfuscatedName("ba.e(Ljava/awt/Graphics;III)V")
    public abstract void method1346(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("ba.b(IILjava/awt/Component;I)V")
    public abstract void method1355(int arg0, int arg1, Component arg2);

    @ObfuscatedName("ba.a(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1341(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
