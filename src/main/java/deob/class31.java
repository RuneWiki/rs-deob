package deob;

import java.util.LinkedList;

@ObfuscatedName("ab")
public abstract class class31 {

    @ObfuscatedName("ab.x")
    public int field204;

    @ObfuscatedName("ab.m")
    public int field196;

    @ObfuscatedName("ab.k")
    public int field198;

    @ObfuscatedName("ab.d")
    public int field199;

    @ObfuscatedName("ab.w")
    public int field200;

    @ObfuscatedName("ab.v")
    public int field201;

    @ObfuscatedName("ab.q")
    public int field202 = -1;

    @ObfuscatedName("ab.z")
    public int field203 = -1;

    @ObfuscatedName("ab.t")
    public short[][][] field205;

    @ObfuscatedName("ab.e")
    public short[][][] field197;

    @ObfuscatedName("ab.s")
    public byte[][][] field206;

    @ObfuscatedName("ab.p")
    public byte[][][] field207;

    @ObfuscatedName("ab.n")
    public class35[][][][] field208;

    @ObfuscatedName("ab.u")
    public boolean field211;

    @ObfuscatedName("ab.h")
    public boolean field210;

    public class31() {
        new LinkedList();
        this.field211 = false;
        this.field210 = false;
    }

    @ObfuscatedName("ab.q(I)Z")
    public boolean method334() {
        return this.field211 && this.field210;
    }

    @ObfuscatedName("ab.z(Liy;I)V")
    public void method317(class244 arg0) {
        if (this.method334()) {
            return;
        }
        byte[] var2 = arg0.method3869(this.field202, this.field203);
        if (var2 != null) {
            this.method235(new class310(var2));
            this.field211 = true;
            this.field210 = true;
        }
    }

    @ObfuscatedName("ab.t(I)V")
    public void method324() {
        this.field205 = (short[][][]) null;
        this.field197 = (short[][][]) null;
        this.field206 = (byte[][][]) null;
        this.field207 = (byte[][][]) null;
        this.field208 = (class35[][][][]) null;
        this.field211 = false;
        this.field210 = false;
    }

    @ObfuscatedName("ab.e(IILkb;B)V")
    public void method319(int arg0, int arg1, class310 arg2) {
        int var4 = arg2.method5137();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method336(arg0, arg1, arg2, var4);
        } else {
            this.method320(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ab.s(IILkb;IB)V")
    public void method320(int arg0, int arg1, class310 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field197[0][arg0][arg1] = (short) arg2.method5137();
        }
        this.field205[0][arg0][arg1] = (short) arg2.method5137();
    }

    @ObfuscatedName("ab.p(IILkb;II)V")
    public void method336(int arg0, int arg1, class310 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field205[0][arg0][arg1] = (short) arg2.method5137();
        if (var6) {
            int var8 = arg2.method5137();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5137();
                if (var10 != 0) {
                    this.field197[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5137();
                    this.field206[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field207[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5137();
            if (var13 != 0) {
                class35[] var14 = this.field208[var12][arg0][arg1] = new class35[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5154();
                    int var17 = arg2.method5137();
                    var14[var15] = new class35(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ab.n(I)I")
    public int method322() {
        return this.field198;
    }

    @ObfuscatedName("ab.u(I)I")
    public int method323() {
        return this.field199;
    }

    @ObfuscatedName("ab.m(Lkb;B)V")
    public abstract void method235(class310 arg0);
}
