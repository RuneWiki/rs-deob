package deob;

import java.util.LinkedList;

@ObfuscatedName("c")
public abstract class class17 {

    @ObfuscatedName("c.w")
    public int field132;

    @ObfuscatedName("c.m")
    public int field136;

    @ObfuscatedName("c.q")
    public int field142;

    @ObfuscatedName("c.b")
    public int field133;

    @ObfuscatedName("c.f")
    public int field134;

    @ObfuscatedName("c.n")
    public int field135;

    @ObfuscatedName("c.h")
    public short[][][] field130;

    @ObfuscatedName("c.x")
    public short[][][] field131;

    @ObfuscatedName("c.j")
    public byte[][][] field138;

    @ObfuscatedName("c.a")
    public byte[][][] field139;

    @ObfuscatedName("c.l")
    public class20[][][][] field140;

    public class17() {
        new LinkedList();
    }

    @ObfuscatedName("c.q(IILgy;I)V")
    public void method166(int arg0, int arg1, class183 arg2) {
        int var4 = arg2.method3436();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method176(arg0, arg1, arg2, var4);
        } else {
            this.method168(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("c.x(IILgy;II)V")
    public void method168(int arg0, int arg1, class183 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field131[0][arg0][arg1] = (short) arg2.method3436();
        }
        this.field130[0][arg0][arg1] = (short) arg2.method3436();
    }

    @ObfuscatedName("c.j(IILgy;II)V")
    public void method176(int arg0, int arg1, class183 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field130[0][arg0][arg1] = (short) arg2.method3436();
        if (var6) {
            int var8 = arg2.method3436();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3436();
                if (var10 != 0) {
                    this.field131[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3436();
                    this.field138[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field139[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3436();
            if (var13 != 0) {
                class20[] var14 = this.field140[var12][arg0][arg1] = new class20[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3279();
                    int var17 = arg2.method3436();
                    var14[var15] = new class20(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("c.a(III)I")
    public int method169(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field130[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("c.l(I)I")
    public int method183() {
        return this.field142;
    }

    @ObfuscatedName("c.d(I)I")
    public int method171() {
        return this.field133;
    }
}
