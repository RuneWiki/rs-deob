package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bl")
public abstract class class71 {

    @ObfuscatedName("bl.a")
    public int[] field1271;

    @ObfuscatedName("bl.y")
    public int field1267;

    @ObfuscatedName("bl.i")
    public int field1266;

    @ObfuscatedName("bl.b")
    public Image field1269;

    @ObfuscatedName("j.as(IILjava/awt/Component;I)Lbl;")
    public static class71 method12(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1328(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1328(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bl.al(I)V")
    public final void method1403() {
        class73.method1500(this.field1271, this.field1267, this.field1266);
    }

    @ObfuscatedName("bl.z(IILjava/awt/Component;I)V")
    public abstract void method1328(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bl.a(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1326(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bl.j(Ljava/awt/Graphics;III)V")
    public abstract void method1325(Graphics arg0, int arg1, int arg2);
}
