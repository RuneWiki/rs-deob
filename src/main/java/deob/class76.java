package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("be")
public abstract class class76 {

    @ObfuscatedName("be.z")
    public int[] field1368;

    @ObfuscatedName("be.l")
    public int field1358;

    @ObfuscatedName("be.w")
    public int field1361;

    @ObfuscatedName("be.d")
    public Image field1360;

    @ObfuscatedName("am.ad(IILjava/awt/Component;B)Lbe;")
    public static class76 method994(int arg0, int arg1, Component arg2) {
        try {
            class80 var3 = new class80();
            var3.method1551(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class74 var5 = new class74();
            var5.method1551(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("be.ap(S)V")
    public final void method1621() {
        class78.method1752(this.field1368, this.field1358, this.field1361);
    }

    @ObfuscatedName("be.j(IILjava/awt/Component;I)V")
    public abstract void method1551(int arg0, int arg1, Component arg2);

    @ObfuscatedName("be.y(Ljava/awt/Graphics;IIB)V")
    public abstract void method1552(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("be.z(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1553(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
