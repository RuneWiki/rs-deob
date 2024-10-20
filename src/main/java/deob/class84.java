package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cn")
public abstract class class84 {

    @ObfuscatedName("cn.x")
    public int[] field1437;

    @ObfuscatedName("cn.m")
    public int field1434;

    @ObfuscatedName("cn.n")
    public int field1435;

    @ObfuscatedName("cn.q")
    public Image field1436;

    @ObfuscatedName("bk.r(IILjava/awt/Component;B)Lcn;")
    public static class84 method1404(int arg0, int arg1, Component arg2) {
        try {
            class87 var3 = new class87();
            var3.method1602(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class82 var5 = new class82();
            var5.method1602(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cn.p(I)V")
    public final void method1666() {
        class88.method1796(this.field1437, this.field1434, this.field1435);
    }

    @ObfuscatedName("cn.u(IILjava/awt/Component;I)V")
    public abstract void method1602(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cn.k(Ljava/awt/Graphics;IIS)V")
    public abstract void method1603(Graphics arg0, int arg1, int arg2);

    @ObfuscatedName("cn.x(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1621(Graphics arg0, int arg1, int arg2, int arg3, int arg4);
}
