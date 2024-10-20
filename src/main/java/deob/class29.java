package deob;

import java.util.LinkedList;

@ObfuscatedName("af")
public abstract class class29 {

    @ObfuscatedName("af.p")
    public int field425;

    @ObfuscatedName("af.m")
    public int field421;

    @ObfuscatedName("af.e")
    public int field422;

    @ObfuscatedName("af.t")
    public int field423;

    @ObfuscatedName("af.w")
    public int field424;

    @ObfuscatedName("af.z")
    public int field431;

    @ObfuscatedName("af.j")
    public short[][][] field426;

    @ObfuscatedName("af.i")
    public short[][][] field420;

    @ObfuscatedName("af.f")
    public byte[][][] field428;

    @ObfuscatedName("af.c")
    public byte[][][] field429;

    @ObfuscatedName("af.o")
    public class32[][][][] field430;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("af.j(IILfr;I)V")
    public void method217(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2810();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method219(arg0, arg1, arg2, var4);
        } else {
            this.method218(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("af.c(IILfr;II)V")
    public void method218(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field420[0][arg0][arg1] = (short) arg2.method2810();
        }
        this.field426[0][arg0][arg1] = (short) arg2.method2810();
    }

    @ObfuscatedName("af.o(IILfr;II)V")
    public void method219(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field426[0][arg0][arg1] = (short) arg2.method2810();
        if (var6) {
            int var8 = arg2.method2810();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2810();
                if (var10 != 0) {
                    this.field420[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2810();
                    this.field428[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field429[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2810();
            if (var13 != 0) {
                class32[] var14 = this.field430[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2825();
                    int var17 = arg2.method2810();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("af.q(III)I")
    public int method220(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field426[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("af.n(I)I")
    public int method221() {
        return this.field422;
    }

    @ObfuscatedName("af.a(S)I")
    public int method222() {
        return this.field423;
    }
}
