package deob;

import java.util.LinkedList;

@ObfuscatedName("al")
public abstract class class29 {

    @ObfuscatedName("al.i")
    public int field416;

    @ObfuscatedName("al.j")
    public int field417;

    @ObfuscatedName("al.a")
    public int field415;

    @ObfuscatedName("al.r")
    public int field418;

    @ObfuscatedName("al.o")
    public int field423;

    @ObfuscatedName("al.n")
    public int field420;

    @ObfuscatedName("al.q")
    public short[][][] field421;

    @ObfuscatedName("al.b")
    public short[][][] field419;

    @ObfuscatedName("al.k")
    public byte[][][] field422;

    @ObfuscatedName("al.s")
    public byte[][][] field424;

    @ObfuscatedName("al.d")
    public class32[][][][] field425;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("al.o(IILfp;I)V")
    public void method252(int arg0, int arg1, class175 arg2) {
        int var4 = arg2.method2999();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method236(arg0, arg1, arg2, var4);
        } else {
            this.method235(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("al.n(IILfp;II)V")
    public void method235(int arg0, int arg1, class175 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field419[0][arg0][arg1] = (short) arg2.method2999();
        }
        this.field421[0][arg0][arg1] = (short) arg2.method2999();
    }

    @ObfuscatedName("al.q(IILfp;IS)V")
    public void method236(int arg0, int arg1, class175 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field421[0][arg0][arg1] = (short) arg2.method2999();
        if (var6) {
            int var8 = arg2.method2999();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2999();
                if (var10 != 0) {
                    this.field419[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2999();
                    this.field422[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field424[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2999();
            if (var13 != 0) {
                class32[] var14 = this.field425[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3009();
                    int var17 = arg2.method2999();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("al.b(IIB)I")
    public int method237(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field421[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("al.k(I)I")
    public int method233() {
        return this.field415;
    }

    @ObfuscatedName("al.s(I)I")
    public int method239() {
        return this.field418;
    }
}
