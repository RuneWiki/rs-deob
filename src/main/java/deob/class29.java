package deob;

import java.util.LinkedList;

@ObfuscatedName("aw")
public abstract class class29 {

    @ObfuscatedName("aw.i")
    public int field421;

    @ObfuscatedName("aw.w")
    public int field410;

    @ObfuscatedName("aw.a")
    public int field411;

    @ObfuscatedName("aw.t")
    public int field412;

    @ObfuscatedName("aw.s")
    public int field413;

    @ObfuscatedName("aw.r")
    public int field414;

    @ObfuscatedName("aw.v")
    public short[][][] field415;

    @ObfuscatedName("aw.y")
    public short[][][] field422;

    @ObfuscatedName("aw.j")
    public byte[][][] field409;

    @ObfuscatedName("aw.k")
    public byte[][][] field420;

    @ObfuscatedName("aw.e")
    public class32[][][][] field419;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("aw.v(IILfp;I)V")
    public void method215(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method3061();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method209(arg0, arg1, arg2, var4);
        } else {
            this.method199(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("aw.y(IILfp;IB)V")
    public void method199(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field422[0][arg0][arg1] = (short) arg2.method3061();
        }
        this.field415[0][arg0][arg1] = (short) arg2.method3061();
    }

    @ObfuscatedName("aw.j(IILfp;IB)V")
    public void method209(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field415[0][arg0][arg1] = (short) arg2.method3061();
        if (var6) {
            int var8 = arg2.method3061();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3061();
                if (var10 != 0) {
                    this.field422[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3061();
                    this.field409[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field420[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3061();
            if (var13 != 0) {
                class32[] var14 = this.field419[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2864();
                    int var17 = arg2.method3061();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("aw.k(III)I")
    public int method200(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field415[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aw.e(B)I")
    public int method201() {
        return this.field411;
    }

    @ObfuscatedName("aw.o(I)I")
    public int method202() {
        return this.field412;
    }
}
