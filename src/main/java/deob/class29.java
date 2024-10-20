package deob;

import java.util.LinkedList;

@ObfuscatedName("ac")
public abstract class class29 {

    @ObfuscatedName("ac.d")
    public int field412;

    @ObfuscatedName("ac.z")
    public int field421;

    @ObfuscatedName("ac.n")
    public int field423;

    @ObfuscatedName("ac.r")
    public int field414;

    @ObfuscatedName("ac.e")
    public int field415;

    @ObfuscatedName("ac.y")
    public int field411;

    @ObfuscatedName("ac.k")
    public short[][][] field424;

    @ObfuscatedName("ac.s")
    public short[][][] field417;

    @ObfuscatedName("ac.p")
    public byte[][][] field419;

    @ObfuscatedName("ac.x")
    public byte[][][] field420;

    @ObfuscatedName("ac.m")
    public class32[][][][] field418;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("ac.y(IILgy;B)V")
    public void method214(int arg0, int arg1, class195 arg2) {
        int var4 = arg2.method3330();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method217(arg0, arg1, arg2, var4);
        } else {
            this.method232(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ac.k(IILgy;II)V")
    public void method232(int arg0, int arg1, class195 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field417[0][arg0][arg1] = (short) arg2.method3330();
        }
        this.field424[0][arg0][arg1] = (short) arg2.method3330();
    }

    @ObfuscatedName("ac.s(IILgy;II)V")
    public void method217(int arg0, int arg1, class195 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field424[0][arg0][arg1] = (short) arg2.method3330();
        if (var6) {
            int var8 = arg2.method3330();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3330();
                if (var10 != 0) {
                    this.field417[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3330();
                    this.field419[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field420[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3330();
            if (var13 != 0) {
                class32[] var14 = this.field418[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3295();
                    int var17 = arg2.method3330();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ac.x(III)I")
    public int method218(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field424[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ac.h(I)I")
    public int method219() {
        return this.field423;
    }

    @ObfuscatedName("ac.t(B)I")
    public int method220() {
        return this.field414;
    }
}
