package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bz")
public abstract class class71 {

    @ObfuscatedName("bz.y")
    public int[] field1299;

    @ObfuscatedName("bz.h")
    public int field1294;

    @ObfuscatedName("bz.r")
    public int field1295;

    @ObfuscatedName("bz.e")
    public Image field1296;

    @ObfuscatedName("aq.x(IILjava/awt/Component;B)Lbz;")
    public static class71 method698(int arg0, int arg1, Component arg2) {
        try {
            class75 var3 = new class75();
            var3.method1364(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class69 var5 = new class69();
            var5.method1364(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bz.aj(B)V")
    public final void method1418() {
        class73.method1516(this.field1299, this.field1294, this.field1295);
    }

    @ObfuscatedName("bz.j(IILjava/awt/Component;I)V")
    public abstract void method1364(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bz.y(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1339(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bz.z(Ljava/awt/Graphics;III)V")
    public abstract void method1338(Graphics arg0, int arg1, int arg2);
}
