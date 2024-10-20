package deob;

import java.util.LinkedList;

@ObfuscatedName("aq")
public abstract class class29 {

    @ObfuscatedName("aq.m")
    public int field400;

    @ObfuscatedName("aq.p")
    public int field393;

    @ObfuscatedName("aq.i")
    public int field394;

    @ObfuscatedName("aq.j")
    public int field395;

    @ObfuscatedName("aq.v")
    public int field396;

    @ObfuscatedName("aq.x")
    public int field392;

    @ObfuscatedName("aq.e")
    public short[][][] field397;

    @ObfuscatedName("aq.l")
    public short[][][] field398;

    @ObfuscatedName("aq.b")
    public byte[][][] field399;

    @ObfuscatedName("aq.n")
    public byte[][][] field401;

    @ObfuscatedName("aq.c")
    public class32[][][][] field402;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("aq.i(IILfv;I)V")
    public void method229(int arg0, int arg1, class181 arg2) {
        int var4 = arg2.method3012();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method231(arg0, arg1, arg2, var4);
        } else {
            this.method230(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("aq.j(IILfv;IB)V")
    public void method230(int arg0, int arg1, class181 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field398[0][arg0][arg1] = (short) arg2.method3012();
        }
        this.field397[0][arg0][arg1] = (short) arg2.method3012();
    }

    @ObfuscatedName("aq.v(IILfv;II)V")
    public void method231(int arg0, int arg1, class181 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field397[0][arg0][arg1] = (short) arg2.method3012();
        if (var6) {
            int var8 = arg2.method3012();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3012();
                if (var10 != 0) {
                    this.field398[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3012();
                    this.field399[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field401[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3012();
            if (var13 != 0) {
                class32[] var14 = this.field402[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3028();
                    int var17 = arg2.method3012();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("aq.x(III)I")
    public int method232(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field397[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aq.e(I)I")
    public int method250() {
        return this.field394;
    }

    @ObfuscatedName("aq.l(I)I")
    public int method234() {
        return this.field395;
    }
}
