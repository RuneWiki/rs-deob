package deob;

import java.util.LinkedList;

@ObfuscatedName("am")
public abstract class class29 {

    @ObfuscatedName("am.b")
    public int field384;

    @ObfuscatedName("am.q")
    public int field374;

    @ObfuscatedName("am.o")
    public int field375;

    @ObfuscatedName("am.p")
    public int field382;

    @ObfuscatedName("am.a")
    public int field385;

    @ObfuscatedName("am.h")
    public int field378;

    @ObfuscatedName("am.l")
    public short[][][] field379;

    @ObfuscatedName("am.y")
    public short[][][] field380;

    @ObfuscatedName("am.g")
    public byte[][][] field387;

    @ObfuscatedName("am.c")
    public byte[][][] field381;

    @ObfuscatedName("am.u")
    public class32[][][][] field383;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("am.a(IILgn;I)V")
    public void method225(int arg0, int arg1, class194 arg2) {
        int var4 = arg2.method3247();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method232(arg0, arg1, arg2, var4);
        } else {
            this.method247(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("am.h(IILgn;IB)V")
    public void method247(int arg0, int arg1, class194 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field380[0][arg0][arg1] = (short) arg2.method3247();
        }
        this.field379[0][arg0][arg1] = (short) arg2.method3247();
    }

    @ObfuscatedName("am.l(IILgn;II)V")
    public void method232(int arg0, int arg1, class194 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field379[0][arg0][arg1] = (short) arg2.method3247();
        if (var6) {
            int var8 = arg2.method3247();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3247();
                if (var10 != 0) {
                    this.field380[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3247();
                    this.field387[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field381[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3247();
            if (var13 != 0) {
                class32[] var14 = this.field383[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3432();
                    int var17 = arg2.method3247();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("am.y(III)I")
    public int method234(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field379[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("am.g(S)I")
    public int method228() {
        return this.field375;
    }

    @ObfuscatedName("am.c(I)I")
    public int method238() {
        return this.field382;
    }
}
