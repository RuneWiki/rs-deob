package deob;

import java.util.LinkedList;

@ObfuscatedName("q")
public abstract class class17 {

    @ObfuscatedName("q.v")
    public int field133;

    @ObfuscatedName("q.s")
    public int field142;

    @ObfuscatedName("q.o")
    public int field131;

    @ObfuscatedName("q.k")
    public int field132;

    @ObfuscatedName("q.u")
    public int field137;

    @ObfuscatedName("q.i")
    public int field134;

    @ObfuscatedName("q.t")
    public short[][][] field135;

    @ObfuscatedName("q.p")
    public short[][][] field136;

    @ObfuscatedName("q.l")
    public byte[][][] field130;

    @ObfuscatedName("q.b")
    public byte[][][] field138;

    @ObfuscatedName("q.c")
    public class20[][][][] field139;

    public class17() {
        new LinkedList();
    }

    @ObfuscatedName("q.i(IILgx;I)V")
    public void method186(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method3274();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method188(arg0, arg1, arg2, var4);
        } else {
            this.method191(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("q.t(IILgx;II)V")
    public void method191(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field136[0][arg0][arg1] = (short) arg2.method3274();
        }
        this.field135[0][arg0][arg1] = (short) arg2.method3274();
    }

    @ObfuscatedName("q.c(IILgx;II)V")
    public void method188(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field135[0][arg0][arg1] = (short) arg2.method3274();
        if (var6) {
            int var8 = arg2.method3274();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3274();
                if (var10 != 0) {
                    this.field136[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3274();
                    this.field130[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field138[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3274();
            if (var13 != 0) {
                class20[] var14 = this.field139[var12][arg0][arg1] = new class20[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3291();
                    int var17 = arg2.method3274();
                    var14[var15] = new class20(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("q.w(III)I")
    public int method189(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field135[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("q.a(I)I")
    public int method190() {
        return this.field131;
    }

    @ObfuscatedName("q.z(I)I")
    public int method185() {
        return this.field132;
    }
}
