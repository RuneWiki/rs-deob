package deob;

import java.util.LinkedList;

@ObfuscatedName("aq")
public abstract class class29 {

    @ObfuscatedName("aq.s")
    public int field399;

    @ObfuscatedName("aq.g")
    public int field390;

    @ObfuscatedName("aq.m")
    public int field391;

    @ObfuscatedName("aq.h")
    public int field395;

    @ObfuscatedName("aq.i")
    public int field392;

    @ObfuscatedName("aq.w")
    public int field394;

    @ObfuscatedName("aq.t")
    public short[][][] field389;

    @ObfuscatedName("aq.d")
    public short[][][] field396;

    @ObfuscatedName("aq.z")
    public byte[][][] field397;

    @ObfuscatedName("aq.k")
    public byte[][][] field398;

    @ObfuscatedName("aq.c")
    public class32[][][][] field393;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("aq.m(IILgy;B)V")
    public void method207(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3239();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method209(arg0, arg1, arg2, var4);
        } else {
            this.method208(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("aq.h(IILgy;II)V")
    public void method208(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field396[0][arg0][arg1] = (short) arg2.method3239();
        }
        this.field389[0][arg0][arg1] = (short) arg2.method3239();
    }

    @ObfuscatedName("aq.i(IILgy;IB)V")
    public void method209(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field389[0][arg0][arg1] = (short) arg2.method3239();
        if (var6) {
            int var8 = arg2.method3239();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3239();
                if (var10 != 0) {
                    this.field396[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3239();
                    this.field397[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field398[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3239();
            if (var13 != 0) {
                class32[] var14 = this.field393[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3446();
                    int var17 = arg2.method3239();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("aq.w(III)I")
    public int method210(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field389[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aq.t(B)I")
    public int method211() {
        return this.field391;
    }

    @ObfuscatedName("aq.d(I)I")
    public int method212() {
        return this.field395;
    }
}
