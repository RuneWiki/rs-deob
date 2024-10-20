package deob;

import java.util.LinkedList;

@ObfuscatedName("al")
public abstract class class29 {

    @ObfuscatedName("al.c")
    public int field391;

    @ObfuscatedName("al.i")
    public int field388;

    @ObfuscatedName("al.o")
    public int field387;

    @ObfuscatedName("al.j")
    public int field390;

    @ObfuscatedName("al.k")
    public int field393;

    @ObfuscatedName("al.x")
    public int field392;

    @ObfuscatedName("al.z")
    public short[][][] field389;

    @ObfuscatedName("al.p")
    public short[][][] field394;

    @ObfuscatedName("al.w")
    public byte[][][] field395;

    @ObfuscatedName("al.r")
    public byte[][][] field396;

    @ObfuscatedName("al.d")
    public class32[][][][] field397;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("al.j(IILgp;I)V")
    public void method228(int arg0, int arg1, class195 arg2) {
        int var4 = arg2.method3429();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method231(arg0, arg1, arg2, var4);
        } else {
            this.method230(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("al.k(IILgp;II)V")
    public void method230(int arg0, int arg1, class195 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field394[0][arg0][arg1] = (short) arg2.method3429();
        }
        this.field389[0][arg0][arg1] = (short) arg2.method3429();
    }

    @ObfuscatedName("al.x(IILgp;II)V")
    public void method231(int arg0, int arg1, class195 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field389[0][arg0][arg1] = (short) arg2.method3429();
        if (var6) {
            int var8 = arg2.method3429();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3429();
                if (var10 != 0) {
                    this.field394[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3429();
                    this.field395[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field396[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3429();
            if (var13 != 0) {
                class32[] var14 = this.field397[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3309();
                    int var17 = arg2.method3429();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("al.z(IIB)I")
    public int method251(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field389[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("al.p(I)I")
    public int method247() {
        return this.field387;
    }

    @ObfuscatedName("al.w(I)I")
    public int method234() {
        return this.field390;
    }
}
