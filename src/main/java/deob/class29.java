package deob;

import java.util.LinkedList;

@ObfuscatedName("at")
public abstract class class29 {

    @ObfuscatedName("at.n")
    public int field391;

    @ObfuscatedName("at.v")
    public int field389;

    @ObfuscatedName("at.y")
    public int field393;

    @ObfuscatedName("at.r")
    public int field392;

    @ObfuscatedName("at.h")
    public int field390;

    @ObfuscatedName("at.d")
    public int field394;

    @ObfuscatedName("at.s")
    public short[][][] field395;

    @ObfuscatedName("at.b")
    public short[][][] field396;

    @ObfuscatedName("at.e")
    public byte[][][] field397;

    @ObfuscatedName("at.f")
    public byte[][][] field398;

    @ObfuscatedName("at.z")
    public class32[][][][] field399;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("at.h(IILgv;I)V")
    public void method202(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3021();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method204(arg0, arg1, arg2, var4);
        } else {
            this.method203(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("at.d(IILgv;II)V")
    public void method203(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field396[0][arg0][arg1] = (short) arg2.method3021();
        }
        this.field395[0][arg0][arg1] = (short) arg2.method3021();
    }

    @ObfuscatedName("at.s(IILgv;IB)V")
    public void method204(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field395[0][arg0][arg1] = (short) arg2.method3021();
        if (var6) {
            int var8 = arg2.method3021();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3021();
                if (var10 != 0) {
                    this.field396[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3021();
                    this.field397[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field398[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3021();
            if (var13 != 0) {
                class32[] var14 = this.field399[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3200();
                    int var17 = arg2.method3021();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("at.b(III)I")
    public int method209(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field395[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("at.e(I)I")
    public int method222() {
        return this.field393;
    }

    @ObfuscatedName("at.f(I)I")
    public int method205() {
        return this.field392;
    }
}
