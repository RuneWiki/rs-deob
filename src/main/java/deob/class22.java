package deob;

import java.util.LinkedList;

@ObfuscatedName("b")
public abstract class class22 {

    @ObfuscatedName("b.m")
    public int field150;

    @ObfuscatedName("b.f")
    public int field147;

    @ObfuscatedName("b.q")
    public int field160;

    @ObfuscatedName("b.w")
    public int field148;

    @ObfuscatedName("b.o")
    public int field149;

    @ObfuscatedName("b.u")
    public int field157;

    @ObfuscatedName("b.g")
    public int field151 = -1;

    @ObfuscatedName("b.l")
    public int field153 = -1;

    @ObfuscatedName("b.e")
    public short[][][] field152;

    @ObfuscatedName("b.x")
    public short[][][] field146;

    @ObfuscatedName("b.d")
    public byte[][][] field155;

    @ObfuscatedName("b.k")
    public byte[][][] field156;

    @ObfuscatedName("b.n")
    public class26[][][][] field145;

    @ObfuscatedName("b.i")
    public boolean field158;

    @ObfuscatedName("b.a")
    public boolean field154;

    public class22() {
        new LinkedList();
        this.field158 = false;
        this.field154 = false;
    }

    @ObfuscatedName("b.l(I)Z")
    public boolean method249() {
        return this.field158 && this.field154;
    }

    @ObfuscatedName("b.e(Lir;B)V")
    public void method242(class245 arg0) {
        if (this.method249()) {
            return;
        }
        byte[] var2 = arg0.method4156(this.field151, this.field153);
        if (var2 != null) {
            this.method157(new class202(var2));
            this.field158 = true;
            this.field154 = true;
        }
    }

    @ObfuscatedName("b.x(I)V")
    public void method259() {
        this.field152 = (short[][][]) null;
        this.field146 = (short[][][]) null;
        this.field155 = (byte[][][]) null;
        this.field156 = (byte[][][]) null;
        this.field145 = (class26[][][][]) null;
        this.field158 = false;
        this.field154 = false;
    }

    @ObfuscatedName("b.d(IILgr;I)V")
    public void method239(int arg0, int arg1, class202 arg2) {
        int var4 = arg2.method3551();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method237(arg0, arg1, arg2, var4);
        } else {
            this.method240(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("b.a(IILgr;IB)V")
    public void method240(int arg0, int arg1, class202 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field146[0][arg0][arg1] = (short) arg2.method3551();
        }
        this.field152[0][arg0][arg1] = (short) arg2.method3551();
    }

    @ObfuscatedName("b.z(IILgr;II)V")
    public void method237(int arg0, int arg1, class202 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field152[0][arg0][arg1] = (short) arg2.method3551();
        if (var6) {
            int var8 = arg2.method3551();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3551();
                if (var10 != 0) {
                    this.field146[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3551();
                    this.field155[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field156[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3551();
            if (var13 != 0) {
                class26[] var14 = this.field145[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3434();
                    int var17 = arg2.method3551();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("b.j(I)I")
    public int method236() {
        return this.field160;
    }

    @ObfuscatedName("b.s(B)I")
    public int method243() {
        return this.field148;
    }

    @ObfuscatedName("b.f(Lgr;I)V")
    public abstract void method157(class202 arg0);
}
