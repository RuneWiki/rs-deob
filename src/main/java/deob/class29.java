package deob;

import java.util.LinkedList;

@ObfuscatedName("av")
public abstract class class29 {

    @ObfuscatedName("av.t")
    public int field380;

    @ObfuscatedName("av.q")
    public int field379;

    @ObfuscatedName("av.i")
    public int field391;

    @ObfuscatedName("av.a")
    public int field386;

    @ObfuscatedName("av.l")
    public int field382;

    @ObfuscatedName("av.b")
    public int field383;

    @ObfuscatedName("av.e")
    public short[][][] field384;

    @ObfuscatedName("av.x")
    public short[][][] field385;

    @ObfuscatedName("av.p")
    public byte[][][] field390;

    @ObfuscatedName("av.g")
    public byte[][][] field387;

    @ObfuscatedName("av.n")
    public class32[][][][] field388;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("av.b(IILgb;B)V")
    public void method219(int arg0, int arg1, class195 arg2) {
        int var4 = arg2.method3236();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method221(arg0, arg1, arg2, var4);
        } else {
            this.method230(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("av.e(IILgb;IB)V")
    public void method230(int arg0, int arg1, class195 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field385[0][arg0][arg1] = (short) arg2.method3236();
        }
        this.field384[0][arg0][arg1] = (short) arg2.method3236();
    }

    @ObfuscatedName("av.x(IILgb;II)V")
    public void method221(int arg0, int arg1, class195 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field384[0][arg0][arg1] = (short) arg2.method3236();
        if (var6) {
            int var8 = arg2.method3236();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3236();
                if (var10 != 0) {
                    this.field385[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3236();
                    this.field390[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field387[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3236();
            if (var13 != 0) {
                class32[] var14 = this.field388[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3252();
                    int var17 = arg2.method3236();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("av.p(III)I")
    public int method222(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field384[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("av.o(I)I")
    public int method223() {
        return this.field391;
    }

    @ObfuscatedName("av.c(I)I")
    public int method224() {
        return this.field386;
    }
}
