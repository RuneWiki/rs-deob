package deob;

import java.util.LinkedList;

@ObfuscatedName("w")
public abstract class class22 {

    @ObfuscatedName("w.c")
    public int field165;

    @ObfuscatedName("w.x")
    public int field159;

    @ObfuscatedName("w.t")
    public int field156;

    @ObfuscatedName("w.g")
    public int field157;

    @ObfuscatedName("w.l")
    public int field158;

    @ObfuscatedName("w.u")
    public int field166;

    @ObfuscatedName("w.j")
    public int field169 = -1;

    @ObfuscatedName("w.v")
    public int field161 = -1;

    @ObfuscatedName("w.d")
    public short[][][] field162;

    @ObfuscatedName("w.z")
    public short[][][] field163;

    @ObfuscatedName("w.n")
    public byte[][][] field164;

    @ObfuscatedName("w.h")
    public byte[][][] field160;

    @ObfuscatedName("w.f")
    public class26[][][][] field155;

    @ObfuscatedName("w.s")
    public boolean field167;

    @ObfuscatedName("w.p")
    public boolean field168;

    public class22() {
        new LinkedList();
        this.field167 = false;
        this.field168 = false;
    }

    @ObfuscatedName("w.z(S)Z")
    public boolean method209() {
        return this.field167 && this.field168;
    }

    @ObfuscatedName("w.s(Lhz;B)V")
    public void method210(class234 arg0) {
        if (this.method209()) {
            return;
        }
        byte[] var2 = arg0.method3825(this.field169, this.field161);
        if (var2 != null) {
            this.method147(new class300(var2));
            this.field167 = true;
            this.field168 = true;
        }
    }

    @ObfuscatedName("w.p(I)V")
    public void method211() {
        this.field162 = (short[][][]) null;
        this.field163 = (short[][][]) null;
        this.field164 = (byte[][][]) null;
        this.field160 = (byte[][][]) null;
        this.field155 = (class26[][][][]) null;
        this.field167 = false;
        this.field168 = false;
    }

    @ObfuscatedName("w.e(IILkz;I)V")
    public void method212(int arg0, int arg1, class300 arg2) {
        int var4 = arg2.method5103();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method217(arg0, arg1, arg2, var4);
        } else {
            this.method222(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("w.i(IILkz;II)V")
    public void method222(int arg0, int arg1, class300 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field163[0][arg0][arg1] = (short) arg2.method5103();
        }
        this.field162[0][arg0][arg1] = (short) arg2.method5103();
    }

    @ObfuscatedName("w.q(IILkz;II)V")
    public void method217(int arg0, int arg1, class300 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field162[0][arg0][arg1] = (short) arg2.method5103();
        if (var6) {
            int var8 = arg2.method5103();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5103();
                if (var10 != 0) {
                    this.field163[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5103();
                    this.field164[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field160[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5103();
            if (var13 != 0) {
                class26[] var14 = this.field155[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5261();
                    int var17 = arg2.method5103();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("w.r(B)I")
    public int method215() {
        return this.field156;
    }

    @ObfuscatedName("w.k(B)I")
    public int method216() {
        return this.field157;
    }

    @ObfuscatedName("w.x(Lkz;I)V")
    public abstract void method147(class300 arg0);
}
