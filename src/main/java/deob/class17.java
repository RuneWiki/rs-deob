package deob;

import java.util.LinkedList;

@ObfuscatedName("r")
public abstract class class17 {

    @ObfuscatedName("r.z")
    public int field128;

    @ObfuscatedName("r.w")
    public int field118;

    @ObfuscatedName("r.s")
    public int field119;

    @ObfuscatedName("r.l")
    public int field120;

    @ObfuscatedName("r.u")
    public int field121;

    @ObfuscatedName("r.q")
    public int field122;

    @ObfuscatedName("r.k")
    public short[][][] field126;

    @ObfuscatedName("r.i")
    public short[][][] field124;

    @ObfuscatedName("r.x")
    public byte[][][] field125;

    @ObfuscatedName("r.e")
    public byte[][][] field117;

    @ObfuscatedName("r.p")
    public class20[][][][] field127;

    public class17() {
        new LinkedList();
    }

    @ObfuscatedName("r.s(IILgk;I)V")
    public void method151(int arg0, int arg1, class183 arg2) {
        int var4 = arg2.method3247();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method153(arg0, arg1, arg2, var4);
        } else {
            this.method168(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("r.l(IILgk;IB)V")
    public void method168(int arg0, int arg1, class183 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field124[0][arg0][arg1] = (short) arg2.method3247();
        }
        this.field126[0][arg0][arg1] = (short) arg2.method3247();
    }

    @ObfuscatedName("r.u(IILgk;II)V")
    public void method153(int arg0, int arg1, class183 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field126[0][arg0][arg1] = (short) arg2.method3247();
        if (var6) {
            int var8 = arg2.method3247();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3247();
                if (var10 != 0) {
                    this.field124[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3247();
                    this.field125[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field117[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3247();
            if (var13 != 0) {
                class20[] var14 = this.field127[var12][arg0][arg1] = new class20[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3249();
                    int var17 = arg2.method3247();
                    var14[var15] = new class20(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("r.q(IIB)I")
    public int method154(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field126[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("r.i(I)I")
    public int method150() {
        return this.field119;
    }

    @ObfuscatedName("r.x(B)I")
    public int method169() {
        return this.field120;
    }
}
