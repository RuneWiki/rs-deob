package deob;

import java.util.LinkedList;

@ObfuscatedName("b")
public abstract class class22 {

    @ObfuscatedName("b.c")
    public int field183;

    @ObfuscatedName("b.t")
    public int field179;

    @ObfuscatedName("b.o")
    public int field177;

    @ObfuscatedName("b.e")
    public int field178;

    @ObfuscatedName("b.i")
    public int field188;

    @ObfuscatedName("b.g")
    public int field180;

    @ObfuscatedName("b.d")
    public int field185 = -1;

    @ObfuscatedName("b.l")
    public int field182 = -1;

    @ObfuscatedName("b.j")
    public short[][][] field181;

    @ObfuscatedName("b.m")
    public short[][][] field184;

    @ObfuscatedName("b.p")
    public byte[][][] field189;

    @ObfuscatedName("b.h")
    public byte[][][] field176;

    @ObfuscatedName("b.v")
    public class26[][][][] field187;

    @ObfuscatedName("b.n")
    public boolean field175;

    @ObfuscatedName("b.x")
    public boolean field186;

    public class22() {
        new LinkedList();
        this.field175 = false;
        this.field186 = false;
    }

    @ObfuscatedName("b.j(I)Z")
    public boolean method230() {
        return this.field175 && this.field186;
    }

    @ObfuscatedName("b.m(Lii;I)V")
    public void method231(class235 arg0) {
        if (this.method230()) {
            return;
        }
        byte[] var2 = arg0.method3845(this.field185, this.field182);
        if (var2 != null) {
            this.method157(new class301(var2));
            this.field175 = true;
            this.field186 = true;
        }
    }

    @ObfuscatedName("b.p(I)V")
    public void method232() {
        this.field181 = (short[][][]) null;
        this.field184 = (short[][][]) null;
        this.field189 = (byte[][][]) null;
        this.field176 = (byte[][][]) null;
        this.field187 = (class26[][][][]) null;
        this.field175 = false;
        this.field186 = false;
    }

    @ObfuscatedName("b.h(IILkp;I)V")
    public void method242(int arg0, int arg1, class301 arg2) {
        int var4 = arg2.method5129();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method235(arg0, arg1, arg2, var4);
        } else {
            this.method234(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("b.v(IILkp;II)V")
    public void method234(int arg0, int arg1, class301 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field184[0][arg0][arg1] = (short) arg2.method5129();
        }
        this.field181[0][arg0][arg1] = (short) arg2.method5129();
    }

    @ObfuscatedName("b.n(IILkp;II)V")
    public void method235(int arg0, int arg1, class301 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field181[0][arg0][arg1] = (short) arg2.method5129();
        if (var6) {
            int var8 = arg2.method5129();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5129();
                if (var10 != 0) {
                    this.field184[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5129();
                    this.field189[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field176[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5129();
            if (var13 != 0) {
                class26[] var14 = this.field187[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5146();
                    int var17 = arg2.method5129();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("b.x(I)I")
    public int method249() {
        return this.field177;
    }

    @ObfuscatedName("b.w(I)I")
    public int method236() {
        return this.field178;
    }

    @ObfuscatedName("b.t(Lkp;S)V")
    public abstract void method157(class301 arg0);
}
