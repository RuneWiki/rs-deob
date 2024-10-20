package deob;

import java.util.LinkedList;

@ObfuscatedName("af")
public abstract class class29 {

    @ObfuscatedName("af.w")
    public int field427;

    @ObfuscatedName("af.o")
    public int field416;

    @ObfuscatedName("af.x")
    public int field417;

    @ObfuscatedName("af.k")
    public int field422;

    @ObfuscatedName("af.f")
    public int field415;

    @ObfuscatedName("af.i")
    public int field421;

    @ObfuscatedName("af.j")
    public short[][][] field418;

    @ObfuscatedName("af.m")
    public short[][][] field419;

    @ObfuscatedName("af.u")
    public byte[][][] field423;

    @ObfuscatedName("af.r")
    public byte[][][] field424;

    @ObfuscatedName("af.v")
    public class32[][][][] field425;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("af.x(IILfi;B)V")
    public void method210(int arg0, int arg1, class177 arg2) {
        int var4 = arg2.method2931();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method212(arg0, arg1, arg2, var4);
        } else {
            this.method234(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("af.k(IILfi;II)V")
    public void method234(int arg0, int arg1, class177 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field419[0][arg0][arg1] = (short) arg2.method2931();
        }
        this.field418[0][arg0][arg1] = (short) arg2.method2931();
    }

    @ObfuscatedName("af.f(IILfi;IB)V")
    public void method212(int arg0, int arg1, class177 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field418[0][arg0][arg1] = (short) arg2.method2931();
        if (var6) {
            int var8 = arg2.method2931();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2931();
                if (var10 != 0) {
                    this.field419[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2931();
                    this.field423[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field424[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2931();
            if (var13 != 0) {
                class32[] var14 = this.field425[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2899();
                    int var17 = arg2.method2931();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("af.i(III)I")
    public int method222(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field418[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("af.j(I)I")
    public int method214() {
        return this.field417;
    }

    @ObfuscatedName("af.m(I)I")
    public int method215() {
        return this.field422;
    }
}
