package deob;

import java.util.LinkedList;

@ObfuscatedName("ao")
public abstract class class29 {

    @ObfuscatedName("ao.p")
    public int field385;

    @ObfuscatedName("ao.i")
    public int field377;

    @ObfuscatedName("ao.w")
    public int field378;

    @ObfuscatedName("ao.s")
    public int field379;

    @ObfuscatedName("ao.j")
    public int field380;

    @ObfuscatedName("ao.a")
    public int field382;

    @ObfuscatedName("ao.t")
    public short[][][] field381;

    @ObfuscatedName("ao.r")
    public short[][][] field383;

    @ObfuscatedName("ao.m")
    public byte[][][] field387;

    @ObfuscatedName("ao.h")
    public byte[][][] field384;

    @ObfuscatedName("ao.o")
    public class32[][][][] field386;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("ao.s(IILgj;I)V")
    public void method239(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3197();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method224(arg0, arg1, arg2, var4);
        } else {
            this.method228(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ao.j(IILgj;II)V")
    public void method228(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field383[0][arg0][arg1] = (short) arg2.method3197();
        }
        this.field381[0][arg0][arg1] = (short) arg2.method3197();
    }

    @ObfuscatedName("ao.a(IILgj;IB)V")
    public void method224(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field381[0][arg0][arg1] = (short) arg2.method3197();
        if (var6) {
            int var8 = arg2.method3197();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3197();
                if (var10 != 0) {
                    this.field383[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3197();
                    this.field387[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field384[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3197();
            if (var13 != 0) {
                class32[] var14 = this.field386[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3132();
                    int var17 = arg2.method3197();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ao.t(III)I")
    public int method225(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field381[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ao.r(B)I")
    public int method226() {
        return this.field378;
    }

    @ObfuscatedName("ao.m(I)I")
    public int method222() {
        return this.field379;
    }
}
