package deob;

import java.util.LinkedList;

@ObfuscatedName("aa")
public abstract class class29 {

    @ObfuscatedName("aa.w")
    public int field424;

    @ObfuscatedName("aa.s")
    public int field417;

    @ObfuscatedName("aa.q")
    public int field421;

    @ObfuscatedName("aa.o")
    public int field419;

    @ObfuscatedName("aa.g")
    public int field420;

    @ObfuscatedName("aa.v")
    public int field416;

    @ObfuscatedName("aa.p")
    public short[][][] field422;

    @ObfuscatedName("aa.e")
    public short[][][] field418;

    @ObfuscatedName("aa.d")
    public byte[][][] field423;

    @ObfuscatedName("aa.x")
    public byte[][][] field425;

    @ObfuscatedName("aa.z")
    public class32[][][][] field426;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("aa.s(IILfz;I)V")
    public void method224(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2971();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method228(arg0, arg1, arg2, var4);
        } else {
            this.method210(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("aa.q(IILfz;II)V")
    public void method210(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field418[0][arg0][arg1] = (short) arg2.method2971();
        }
        this.field422[0][arg0][arg1] = (short) arg2.method2971();
    }

    @ObfuscatedName("aa.o(IILfz;II)V")
    public void method228(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field422[0][arg0][arg1] = (short) arg2.method2971();
        if (var6) {
            int var8 = arg2.method2971();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2971();
                if (var10 != 0) {
                    this.field418[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2971();
                    this.field423[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field425[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2971();
            if (var13 != 0) {
                class32[] var14 = this.field426[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3015();
                    int var17 = arg2.method2971();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("aa.g(III)I")
    public int method212(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field422[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aa.v(I)I")
    public int method211() {
        return this.field421;
    }

    @ObfuscatedName("aa.p(I)I")
    public int method214() {
        return this.field419;
    }
}
