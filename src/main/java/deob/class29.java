package deob;

import java.util.LinkedList;

@ObfuscatedName("ah")
public abstract class class29 {

    @ObfuscatedName("ah.d")
    public int field419;

    @ObfuscatedName("ah.k")
    public int field427;

    @ObfuscatedName("ah.e")
    public int field417;

    @ObfuscatedName("ah.p")
    public int field418;

    @ObfuscatedName("ah.q")
    public int field426;

    @ObfuscatedName("ah.s")
    public int field420;

    @ObfuscatedName("ah.r")
    public short[][][] field421;

    @ObfuscatedName("ah.g")
    public short[][][] field422;

    @ObfuscatedName("ah.v")
    public byte[][][] field423;

    @ObfuscatedName("ah.t")
    public byte[][][] field424;

    @ObfuscatedName("ah.y")
    public class32[][][][] field425;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("ah.q(IILfg;I)V")
    public void method219(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2955();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method214(arg0, arg1, arg2, var4);
        } else {
            this.method204(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ah.s(IILfg;II)V")
    public void method204(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field422[0][arg0][arg1] = (short) arg2.method2955();
        }
        this.field421[0][arg0][arg1] = (short) arg2.method2955();
    }

    @ObfuscatedName("ah.r(IILfg;II)V")
    public void method214(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field421[0][arg0][arg1] = (short) arg2.method2955();
        if (var6) {
            int var8 = arg2.method2955();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2955();
                if (var10 != 0) {
                    this.field422[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2955();
                    this.field423[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field424[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2955();
            if (var13 != 0) {
                class32[] var14 = this.field425[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2971();
                    int var17 = arg2.method2955();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ah.g(III)I")
    public int method203(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field421[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ah.v(I)I")
    public int method206() {
        return this.field417;
    }

    @ObfuscatedName("ah.t(I)I")
    public int method207() {
        return this.field418;
    }
}
