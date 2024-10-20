package deob;

import java.util.LinkedList;

@ObfuscatedName("am")
public abstract class class29 {

    @ObfuscatedName("am.c")
    public int field404;

    @ObfuscatedName("am.o")
    public int field394;

    @ObfuscatedName("am.i")
    public int field395;

    @ObfuscatedName("am.u")
    public int field393;

    @ObfuscatedName("am.g")
    public int field397;

    @ObfuscatedName("am.m")
    public int field406;

    @ObfuscatedName("am.s")
    public short[][][] field399;

    @ObfuscatedName("am.x")
    public short[][][] field400;

    @ObfuscatedName("am.p")
    public byte[][][] field401;

    @ObfuscatedName("am.k")
    public byte[][][] field402;

    @ObfuscatedName("am.r")
    public class32[][][][] field398;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("am.u(IILfp;I)V")
    public void method213(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2843();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method208(arg0, arg1, arg2, var4);
        } else {
            this.method212(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("am.g(IILfp;II)V")
    public void method212(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field400[0][arg0][arg1] = (short) arg2.method2843();
        }
        this.field399[0][arg0][arg1] = (short) arg2.method2843();
    }

    @ObfuscatedName("am.m(IILfp;II)V")
    public void method208(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field399[0][arg0][arg1] = (short) arg2.method2843();
        if (var6) {
            int var8 = arg2.method2843();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2843();
                if (var10 != 0) {
                    this.field400[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2843();
                    this.field401[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field402[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2843();
            if (var13 != 0) {
                class32[] var14 = this.field398[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3030();
                    int var17 = arg2.method2843();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("am.s(IIB)I")
    public int method209(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field399[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("am.x(B)I")
    public int method225() {
        return this.field395;
    }

    @ObfuscatedName("am.p(I)I")
    public int method211() {
        return this.field393;
    }
}
