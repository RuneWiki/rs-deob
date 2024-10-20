package deob;

import java.util.LinkedList;

@ObfuscatedName("hc")
public abstract class class234 {

    @ObfuscatedName("hc.c")
    public int field2812;

    @ObfuscatedName("hc.q")
    public int field2816;

    @ObfuscatedName("hc.i")
    public int field2807;

    @ObfuscatedName("hc.k")
    public int field2808;

    @ObfuscatedName("hc.o")
    public int field2813;

    @ObfuscatedName("hc.n")
    public int field2805;

    @ObfuscatedName("hc.d")
    public int field2811 = -1;

    @ObfuscatedName("hc.a")
    public int field2820 = -1;

    @ObfuscatedName("hc.m")
    public short[][][] field2810;

    @ObfuscatedName("hc.u")
    public short[][][] field2814;

    @ObfuscatedName("hc.l")
    public byte[][][] field2815;

    @ObfuscatedName("hc.z")
    public byte[][][] field2809;

    @ObfuscatedName("hc.r")
    public class236[][][][] field2817;

    @ObfuscatedName("hc.y")
    public boolean field2818;

    @ObfuscatedName("hc.p")
    public boolean field2819;

    public class234() {
        new LinkedList();
        this.field2818 = false;
        this.field2819 = false;
    }

    @ObfuscatedName("hc.e(I)Z")
    public boolean method4446() {
        return this.field2818 && this.field2819;
    }

    @ObfuscatedName("hc.b(Lls;I)V")
    public void method4471(class316 arg0) {
        if (this.method4446()) {
            return;
        }
        byte[] var2 = arg0.method5179(this.field2811, this.field2820);
        if (var2 != null) {
            this.method4074(new class444(var2));
            this.field2818 = true;
            this.field2819 = true;
        }
    }

    @ObfuscatedName("hc.x(I)V")
    public void method4448() {
        this.field2810 = (short[][][]) null;
        this.field2814 = (short[][][]) null;
        this.field2815 = (byte[][][]) null;
        this.field2809 = (byte[][][]) null;
        this.field2817 = (class236[][][][]) null;
        this.field2818 = false;
        this.field2819 = false;
    }

    @ObfuscatedName("hc.f(IILqr;B)V")
    public void method4454(int arg0, int arg1, class444 arg2) {
        int var4 = arg2.method6929();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4451(arg0, arg1, arg2, var4);
        } else {
            this.method4450(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("hc.t(IILqr;II)V")
    public void method4450(int arg0, int arg1, class444 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2814[0][arg0][arg1] = (short) arg2.method6929();
        }
        this.field2810[0][arg0][arg1] = (short) arg2.method6929();
    }

    @ObfuscatedName("hc.j(IILqr;II)V")
    public void method4451(int arg0, int arg1, class444 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2810[0][arg0][arg1] = (short) arg2.method6929();
        if (var6) {
            int var8 = arg2.method6929();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method6929();
                if (var10 != 0) {
                    this.field2814[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method6929();
                    this.field2815[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2809[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method6929();
            if (var13 != 0) {
                class236[] var14 = this.field2817[var12][arg0][arg1] = new class236[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method6945();
                    int var17 = arg2.method6929();
                    var14[var15] = new class236(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("hc.g(I)I")
    public int method4452() {
        return this.field2807;
    }

    @ObfuscatedName("hc.ar(I)I")
    public int method4453() {
        return this.field2808;
    }

    @ObfuscatedName("hc.h(Lqr;B)V")
    public abstract void method4074(class444 arg0);
}
