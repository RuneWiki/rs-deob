package deob;

import java.util.LinkedList;

@ObfuscatedName("u")
public abstract class class17 {

    @ObfuscatedName("u.f")
    public int field134;

    @ObfuscatedName("u.h")
    public int field136;

    @ObfuscatedName("u.e")
    public int field129;

    @ObfuscatedName("u.b")
    public int field127;

    @ObfuscatedName("u.l")
    public int field128;

    @ObfuscatedName("u.w")
    public int field138;

    @ObfuscatedName("u.d")
    public short[][][] field124;

    @ObfuscatedName("u.n")
    public short[][][] field131;

    @ObfuscatedName("u.s")
    public byte[][][] field130;

    @ObfuscatedName("u.g")
    public byte[][][] field133;

    @ObfuscatedName("u.a")
    public class20[][][][] field125;

    public class17() {
        new LinkedList();
    }

    @ObfuscatedName("u.l(IILgx;I)V")
    public void method185(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3323();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method204(arg0, arg1, arg2, var4);
        } else {
            this.method186(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("u.w(IILgx;IB)V")
    public void method186(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field131[0][arg0][arg1] = (short) arg2.method3323();
        }
        this.field124[0][arg0][arg1] = (short) arg2.method3323();
    }

    @ObfuscatedName("u.d(IILgx;IB)V")
    public void method204(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field124[0][arg0][arg1] = (short) arg2.method3323();
        if (var6) {
            int var8 = arg2.method3323();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3323();
                if (var10 != 0) {
                    this.field131[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3323();
                    this.field130[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field133[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3323();
            if (var13 != 0) {
                class20[] var14 = this.field125[var12][arg0][arg1] = new class20[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3340();
                    int var17 = arg2.method3323();
                    var14[var15] = new class20(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("u.n(III)I")
    public int method188(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field124[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("u.s(I)I")
    public int method189() {
        return this.field129;
    }

    @ObfuscatedName("u.g(I)I")
    public int method190() {
        return this.field127;
    }
}
