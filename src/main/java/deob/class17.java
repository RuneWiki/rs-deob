package deob;

import java.util.LinkedList;

@ObfuscatedName("r")
public abstract class class17 {

    @ObfuscatedName("r.c")
    public int field144;

    @ObfuscatedName("r.q")
    public int field143;

    @ObfuscatedName("r.m")
    public int field152;

    @ObfuscatedName("r.j")
    public int field145;

    @ObfuscatedName("r.g")
    public int field150;

    @ObfuscatedName("r.i")
    public int field147;

    @ObfuscatedName("r.h")
    public short[][][] field142;

    @ObfuscatedName("r.l")
    public short[][][] field149;

    @ObfuscatedName("r.d")
    public byte[][][] field148;

    @ObfuscatedName("r.o")
    public byte[][][] field151;

    @ObfuscatedName("r.s")
    public class20[][][][] field146;

    public class17() {
        new LinkedList();
    }

    @ObfuscatedName("r.j(IILgg;I)V")
    public void method167(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3243();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method169(arg0, arg1, arg2, var4);
        } else {
            this.method168(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("r.g(IILgg;II)V")
    public void method168(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field149[0][arg0][arg1] = (short) arg2.method3243();
        }
        this.field142[0][arg0][arg1] = (short) arg2.method3243();
    }

    @ObfuscatedName("r.i(IILgg;II)V")
    public void method169(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field142[0][arg0][arg1] = (short) arg2.method3243();
        if (var6) {
            int var8 = arg2.method3243();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3243();
                if (var10 != 0) {
                    this.field149[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3243();
                    this.field148[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field151[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3243();
            if (var13 != 0) {
                class20[] var14 = this.field146[var12][arg0][arg1] = new class20[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3338();
                    int var17 = arg2.method3243();
                    var14[var15] = new class20(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("r.h(III)I")
    public int method174(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field142[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("r.l(I)I")
    public int method171() {
        return this.field152;
    }

    @ObfuscatedName("r.o(I)I")
    public int method172() {
        return this.field145;
    }
}
