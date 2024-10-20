package deob;

import java.util.LinkedList;

@ObfuscatedName("b")
public abstract class class17 {

    @ObfuscatedName("b.f")
    public int field157;

    @ObfuscatedName("b.l")
    public int field151;

    @ObfuscatedName("b.w")
    public int field145;

    @ObfuscatedName("b.s")
    public int field144;

    @ObfuscatedName("b.e")
    public int field153;

    @ObfuscatedName("b.a")
    public int field146;

    @ObfuscatedName("b.c")
    public short[][][] field147;

    @ObfuscatedName("b.p")
    public short[][][] field148;

    @ObfuscatedName("b.r")
    public byte[][][] field149;

    @ObfuscatedName("b.m")
    public byte[][][] field150;

    @ObfuscatedName("b.d")
    public class20[][][][] field156;

    public class17() {
        new LinkedList();
    }

    @ObfuscatedName("b.s(IILgm;B)V")
    public void method156(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3344();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method167(arg0, arg1, arg2, var4);
        } else {
            this.method157(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("b.e(IILgm;II)V")
    public void method157(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field148[0][arg0][arg1] = (short) arg2.method3344();
        }
        this.field147[0][arg0][arg1] = (short) arg2.method3344();
    }

    @ObfuscatedName("b.c(IILgm;IB)V")
    public void method167(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field147[0][arg0][arg1] = (short) arg2.method3344();
        if (var6) {
            int var8 = arg2.method3344();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3344();
                if (var10 != 0) {
                    this.field148[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3344();
                    this.field149[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field150[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3344();
            if (var13 != 0) {
                class20[] var14 = this.field156[var12][arg0][arg1] = new class20[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3381();
                    int var17 = arg2.method3344();
                    var14[var15] = new class20(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("b.p(III)I")
    public int method159(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field147[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("b.r(I)I")
    public int method160() {
        return this.field145;
    }

    @ObfuscatedName("b.m(I)I")
    public int method161() {
        return this.field144;
    }
}
