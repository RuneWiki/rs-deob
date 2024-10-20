package deob;

import java.util.LinkedList;

@ObfuscatedName("ac")
public abstract class class31 {

    @ObfuscatedName("ac.n")
    public int field200;

    @ObfuscatedName("ac.v")
    public int field195;

    @ObfuscatedName("ac.d")
    public int field196;

    @ObfuscatedName("ac.c")
    public int field207;

    @ObfuscatedName("ac.y")
    public int field198;

    @ObfuscatedName("ac.h")
    public int field199;

    @ObfuscatedName("ac.z")
    public int field197 = -1;

    @ObfuscatedName("ac.e")
    public int field201 = -1;

    @ObfuscatedName("ac.q")
    public short[][][] field202;

    @ObfuscatedName("ac.l")
    public short[][][] field203;

    @ObfuscatedName("ac.s")
    public byte[][][] field194;

    @ObfuscatedName("ac.b")
    public byte[][][] field205;

    @ObfuscatedName("ac.a")
    public class35[][][][] field206;

    @ObfuscatedName("ac.w")
    public boolean field204;

    @ObfuscatedName("ac.k")
    public boolean field208;

    public class31() {
        new LinkedList();
        this.field204 = false;
        this.field208 = false;
    }

    @ObfuscatedName("ac.e(I)Z")
    public boolean method295() {
        return this.field204 && this.field208;
    }

    @ObfuscatedName("ac.q(Lig;B)V")
    public void method296(class245 arg0) {
        if (this.method295()) {
            return;
        }
        byte[] var2 = arg0.method4032(this.field197, this.field201);
        if (var2 != null) {
            this.method221(new class311(var2));
            this.field204 = true;
            this.field208 = true;
        }
    }

    @ObfuscatedName("ac.l(B)V")
    public void method297() {
        this.field202 = (short[][][]) null;
        this.field203 = (short[][][]) null;
        this.field194 = (byte[][][]) null;
        this.field205 = (byte[][][]) null;
        this.field206 = (class35[][][][]) null;
        this.field204 = false;
        this.field208 = false;
    }

    @ObfuscatedName("ac.s(IILkx;I)V")
    public void method318(int arg0, int arg1, class311 arg2) {
        int var4 = arg2.method5310();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method300(arg0, arg1, arg2, var4);
        } else {
            this.method299(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ac.b(IILkx;IB)V")
    public void method299(int arg0, int arg1, class311 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field203[0][arg0][arg1] = (short) arg2.method5310();
        }
        this.field202[0][arg0][arg1] = (short) arg2.method5310();
    }

    @ObfuscatedName("ac.a(IILkx;II)V")
    public void method300(int arg0, int arg1, class311 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field202[0][arg0][arg1] = (short) arg2.method5310();
        if (var6) {
            int var8 = arg2.method5310();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5310();
                if (var10 != 0) {
                    this.field203[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5310();
                    this.field194[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field205[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5310();
            if (var13 != 0) {
                class35[] var14 = this.field206[var12][arg0][arg1] = new class35[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5389();
                    int var17 = arg2.method5310();
                    var14[var15] = new class35(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ac.w(I)I")
    public int method301() {
        return this.field196;
    }

    @ObfuscatedName("ac.k(I)I")
    public int method307() {
        return this.field207;
    }

    @ObfuscatedName("ac.v(Lkx;B)V")
    public abstract void method221(class311 arg0);
}
