package deob;

import java.util.LinkedList;

@ObfuscatedName("z")
public abstract class class17 {

    @ObfuscatedName("z.y")
    public int field143;

    @ObfuscatedName("z.c")
    public int field130;

    @ObfuscatedName("z.n")
    public int field131;

    @ObfuscatedName("z.u")
    public int field138;

    @ObfuscatedName("z.i")
    public int field133;

    @ObfuscatedName("z.r")
    public int field134;

    @ObfuscatedName("z.j")
    public short[][][] field135;

    @ObfuscatedName("z.p")
    public short[][][] field141;

    @ObfuscatedName("z.e")
    public byte[][][] field137;

    @ObfuscatedName("z.s")
    public byte[][][] field129;

    @ObfuscatedName("z.v")
    public class20[][][][] field142;

    public class17() {
        new LinkedList();
    }

    @ObfuscatedName("z.c(IILge;B)V")
    public void method154(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3299();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method161(arg0, arg1, arg2, var4);
        } else {
            this.method155(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("z.n(IILge;II)V")
    public void method155(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field141[0][arg0][arg1] = (short) arg2.method3299();
        }
        this.field135[0][arg0][arg1] = (short) arg2.method3299();
    }

    @ObfuscatedName("z.u(IILge;IB)V")
    public void method161(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field135[0][arg0][arg1] = (short) arg2.method3299();
        if (var6) {
            int var8 = arg2.method3299();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3299();
                if (var10 != 0) {
                    this.field141[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3299();
                    this.field137[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field129[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3299();
            if (var13 != 0) {
                class20[] var14 = this.field142[var12][arg0][arg1] = new class20[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3284();
                    int var17 = arg2.method3299();
                    var14[var15] = new class20(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("z.i(IIB)I")
    public int method157(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field135[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("z.p(B)I")
    public int method158() {
        return this.field131;
    }

    @ObfuscatedName("z.e(I)I")
    public int method159() {
        return this.field138;
    }
}
