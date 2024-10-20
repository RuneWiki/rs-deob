package deob;

import java.util.LinkedList;

@ObfuscatedName("o")
public abstract class class22 {

    @ObfuscatedName("o.q")
    public int field168;

    @ObfuscatedName("o.w")
    public int field157;

    @ObfuscatedName("o.e")
    public int field158;

    @ObfuscatedName("o.p")
    public int field159;

    @ObfuscatedName("o.k")
    public int field160;

    @ObfuscatedName("o.l")
    public int field161;

    @ObfuscatedName("o.b")
    public int field162 = -1;

    @ObfuscatedName("o.i")
    public int field163 = -1;

    @ObfuscatedName("o.c")
    public short[][][] field164;

    @ObfuscatedName("o.f")
    public short[][][] field171;

    @ObfuscatedName("o.m")
    public byte[][][] field166;

    @ObfuscatedName("o.u")
    public byte[][][] field167;

    @ObfuscatedName("o.x")
    public class26[][][][] field165;

    @ObfuscatedName("o.r")
    public boolean field169;

    @ObfuscatedName("o.v")
    public boolean field170;

    public class22() {
        new LinkedList();
        this.field169 = false;
        this.field170 = false;
    }

    @ObfuscatedName("o.c(I)Z")
    public boolean method228() {
        return this.field169 && this.field170;
    }

    @ObfuscatedName("o.u(Lhp;I)V")
    public void method229(class234 arg0) {
        if (this.method228()) {
            return;
        }
        byte[] var2 = arg0.method3775(this.field162, this.field163);
        if (var2 != null) {
            this.method149(new class301(var2));
            this.field169 = true;
            this.field170 = true;
        }
    }

    @ObfuscatedName("o.x(I)V")
    public void method230() {
        this.field164 = (short[][][]) null;
        this.field171 = (short[][][]) null;
        this.field166 = (byte[][][]) null;
        this.field167 = (byte[][][]) null;
        this.field165 = (class26[][][][]) null;
        this.field169 = false;
        this.field170 = false;
    }

    @ObfuscatedName("o.r(IILkf;I)V")
    public void method231(int arg0, int arg1, class301 arg2) {
        int var4 = arg2.method5077();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method236(arg0, arg1, arg2, var4);
        } else {
            this.method240(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("o.v(IILkf;IB)V")
    public void method240(int arg0, int arg1, class301 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field171[0][arg0][arg1] = (short) arg2.method5077();
        }
        this.field164[0][arg0][arg1] = (short) arg2.method5077();
    }

    @ObfuscatedName("o.y(IILkf;IB)V")
    public void method236(int arg0, int arg1, class301 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field164[0][arg0][arg1] = (short) arg2.method5077();
        if (var6) {
            int var8 = arg2.method5077();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5077();
                if (var10 != 0) {
                    this.field171[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5077();
                    this.field166[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field167[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5077();
            if (var13 != 0) {
                class26[] var14 = this.field165[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5084();
                    int var17 = arg2.method5077();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("o.g(I)I")
    public int method234() {
        return this.field158;
    }

    @ObfuscatedName("o.a(I)I")
    public int method235() {
        return this.field159;
    }

    @ObfuscatedName("o.w(Lkf;I)V")
    public abstract void method149(class301 arg0);
}
