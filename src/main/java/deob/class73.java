package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

@ObfuscatedName("bi")
public abstract class class73 {

    @ObfuscatedName("bi.z")
    public int[] field1333;

    @ObfuscatedName("bi.y")
    public int field1332;

    @ObfuscatedName("bi.e")
    public int field1325;

    @ObfuscatedName("bi.g")
    public Image field1328;

    @ObfuscatedName("dp.ax(IILjava/awt/Component;B)Lbi;")
    public static class73 method2658(int arg0, int arg1, Component arg2) {
        try {
            class77 var3 = new class77();
            var3.method1418(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class71 var5 = new class71();
            var5.method1418(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("bi.al(B)V")
    public final void method1493() {
        class75.method1597(this.field1333, this.field1332, this.field1325);
    }

    @ObfuscatedName("bi.n(IILjava/awt/Component;I)V")
    public abstract void method1418(int arg0, int arg1, Component arg2);

    @ObfuscatedName("bi.z(Ljava/awt/Graphics;IIIII)V")
    public abstract void method1422(Graphics arg0, int arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("bi.d(Ljava/awt/Graphics;IIB)V")
    public abstract void method1419(Graphics arg0, int arg1, int arg2);
}
