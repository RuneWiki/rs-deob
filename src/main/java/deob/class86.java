package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("cn")
public abstract class class86 {

    @ObfuscatedName("cn.k")
    public int[] field1451;

    @ObfuscatedName("cn.q")
    public int field1452;

    @ObfuscatedName("cn.j")
    public int field1456;

    @ObfuscatedName("cn.z")
    public Image field1454;

    @ObfuscatedName("e.ax(IILjava/awt/Component;S)Lcn;")
    public static class86 method5(int arg0, int arg1, Component arg2) {
        try {
            class89 var3 = new class89();
            var3.method1653(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class84 var5 = new class84();
            var5.method1653(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("cn.ao(I)V")
    public final void method1718() {
        class90.method1819(this.field1451, this.field1452, this.field1456);
    }

    @ObfuscatedName("cn.e(IILjava/awt/Component;B)V")
    public abstract void method1653(int arg0, int arg1, Component arg2);

    @ObfuscatedName("cn.k(Ljava/awt/Graphics;IIIIS)V")
    public abstract void method1647(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("cn.i(Ljava/awt/Graphics;III)V")
    public abstract void method1648(Graphics arg0, int arg1, int arg2);
}
