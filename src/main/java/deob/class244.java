package deob;

import java.util.LinkedList;

@ObfuscatedName("ie")
public abstract class class244 {

    @ObfuscatedName("ie.h")
    public int field2890;

    @ObfuscatedName("ie.j")
    public int field2878;

    @ObfuscatedName("ie.y")
    public int field2879;

    @ObfuscatedName("ie.d")
    public int field2880;

    @ObfuscatedName("ie.n")
    public int field2884;

    @ObfuscatedName("ie.r")
    public int field2882;

    @ObfuscatedName("ie.l")
    public int field2883 = -1;

    @ObfuscatedName("ie.s")
    public int field2889 = -1;

    @ObfuscatedName("ie.p")
    public short[][][] field2885;

    @ObfuscatedName("ie.b")
    public short[][][] field2877;

    @ObfuscatedName("ie.o")
    public byte[][][] field2887;

    @ObfuscatedName("ie.u")
    public byte[][][] field2888;

    @ObfuscatedName("ie.z")
    public class246[][][][] field2881;

    @ObfuscatedName("ie.t")
    public static boolean field2886 = true;

    @ObfuscatedName("ie.w")
    public boolean field2891;

    @ObfuscatedName("ie.m")
    public boolean field2892;

    public class244() {
        new LinkedList();
        this.field2891 = false;
        this.field2892 = false;
    }

    @ObfuscatedName("ie.o(I)Z")
    public boolean method4674() {
        return this.field2891 && this.field2892;
    }

    @ObfuscatedName("ie.u(Llg;B)V")
    public void method4675(class330 arg0) {
        if (this.method4674()) {
            return;
        }
        byte[] var2 = arg0.method5859(this.field2883, this.field2889);
        if (var2 != null) {
            this.method4299(new class464(var2));
            this.field2891 = true;
            this.field2892 = true;
        }
    }

    @ObfuscatedName("ie.z(B)V")
    public void method4676() {
        this.field2885 = (short[][][]) null;
        this.field2877 = (short[][][]) null;
        this.field2887 = (byte[][][]) null;
        this.field2888 = (byte[][][]) null;
        this.field2881 = (class246[][][][]) null;
        this.field2891 = false;
        this.field2892 = false;
    }

    @ObfuscatedName("ie.t(IILqr;I)V")
    public void method4680(int arg0, int arg1, class464 arg2) {
        int var4 = arg2.method7735();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4679(arg0, arg1, arg2, var4);
        } else {
            this.method4678(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ie.w(IILqr;II)V")
    public void method4678(int arg0, int arg1, class464 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2877[0][arg0][arg1] = field2886 ? (short) arg2.method7716() : (short) arg2.method7735();
        }
        this.field2885[0][arg0][arg1] = field2886 ? (short) arg2.method7716() : (short) arg2.method7735();
    }

    @ObfuscatedName("ie.m(IILqr;IB)V")
    public void method4679(int arg0, int arg1, class464 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2885[0][arg0][arg1] = field2886 ? (short) arg2.method7716() : (short) arg2.method7735();
        if (var6) {
            int var8 = arg2.method7735();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = field2886 ? arg2.method7716() : arg2.method7735();
                if (var10 != 0) {
                    this.field2877[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method7735();
                    this.field2887[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2888[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method7735();
            if (var13 != 0) {
                class246[] var14 = this.field2881[var12][arg0][arg1] = new class246[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method7734();
                    int var17 = arg2.method7735();
                    var14[var15] = new class246(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ie.q(I)I")
    public int method4687() {
        return this.field2879;
    }

    @ObfuscatedName("ie.i(B)I")
    public int method4681() {
        return this.field2880;
    }

    @ObfuscatedName("ie.f(Lqr;I)V")
    public abstract void method4299(class464 arg0);
}
