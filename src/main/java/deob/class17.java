package deob;

import java.util.LinkedList;

@ObfuscatedName("h")
public abstract class class17 {

    @ObfuscatedName("h.g")
    public int field147;

    @ObfuscatedName("h.r")
    public int field152;

    @ObfuscatedName("h.e")
    public int field148;

    @ObfuscatedName("h.q")
    public int field150;

    @ObfuscatedName("h.c")
    public int field151;

    @ObfuscatedName("h.l")
    public int field149;

    @ObfuscatedName("h.b")
    public short[][][] field153;

    @ObfuscatedName("h.w")
    public short[][][] field154;

    @ObfuscatedName("h.n")
    public byte[][][] field155;

    @ObfuscatedName("h.i")
    public byte[][][] field156;

    @ObfuscatedName("h.p")
    public class20[][][][] field157;

    public class17() {
        new LinkedList();
    }

    @ObfuscatedName("h.c(IILgl;I)V")
    public void method182(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3679();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method184(arg0, arg1, arg2, var4);
        } else {
            this.method202(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("h.i(IILgl;II)V")
    public void method202(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field154[0][arg0][arg1] = (short) arg2.method3679();
        }
        this.field153[0][arg0][arg1] = (short) arg2.method3679();
    }

    @ObfuscatedName("h.p(IILgl;IB)V")
    public void method184(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field153[0][arg0][arg1] = (short) arg2.method3679();
        if (var6) {
            int var8 = arg2.method3679();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3679();
                if (var10 != 0) {
                    this.field154[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3679();
                    this.field155[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field156[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3679();
            if (var13 != 0) {
                class20[] var14 = this.field157[var12][arg0][arg1] = new class20[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3594();
                    int var17 = arg2.method3679();
                    var14[var15] = new class20(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("h.m(III)I")
    public int method185(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field153[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("h.d(I)I")
    public int method205() {
        return this.field148;
    }

    @ObfuscatedName("h.j(B)I")
    public int method181() {
        return this.field150;
    }
}
