package deob;

import java.util.LinkedList;

@ObfuscatedName("f")
public abstract class class22 {

    @ObfuscatedName("f.a")
    public int field159;

    @ObfuscatedName("f.t")
    public int field148;

    @ObfuscatedName("f.n")
    public int field149;

    @ObfuscatedName("f.q")
    public int field150;

    @ObfuscatedName("f.v")
    public int field151;

    @ObfuscatedName("f.l")
    public int field157;

    @ObfuscatedName("f.c")
    public int field153 = -1;

    @ObfuscatedName("f.o")
    public int field154 = -1;

    @ObfuscatedName("f.i")
    public short[][][] field147;

    @ObfuscatedName("f.d")
    public short[][][] field161;

    @ObfuscatedName("f.m")
    public byte[][][] field162;

    @ObfuscatedName("f.p")
    public byte[][][] field158;

    @ObfuscatedName("f.h")
    public class26[][][][] field164;

    @ObfuscatedName("f.k")
    public boolean field160;

    @ObfuscatedName("f.x")
    public boolean field152;

    public class22() {
        new LinkedList();
        this.field160 = false;
        this.field152 = false;
    }

    @ObfuscatedName("f.i(I)Z")
    public boolean method288() {
        return this.field160 && this.field152;
    }

    @ObfuscatedName("f.d(Lhq;I)V")
    public void method262(class234 arg0) {
        if (this.method288()) {
            return;
        }
        byte[] var2 = arg0.method3873(this.field153, this.field154);
        if (var2 != null) {
            this.method175(new class300(var2));
            this.field160 = true;
            this.field152 = true;
        }
    }

    @ObfuscatedName("f.m(B)V")
    public void method279() {
        this.field147 = (short[][][]) null;
        this.field161 = (short[][][]) null;
        this.field162 = (byte[][][]) null;
        this.field158 = (byte[][][]) null;
        this.field164 = (class26[][][][]) null;
        this.field160 = false;
        this.field152 = false;
    }

    @ObfuscatedName("f.p(IILkc;I)V")
    public void method264(int arg0, int arg1, class300 arg2) {
        int var4 = arg2.method5123();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method266(arg0, arg1, arg2, var4);
        } else {
            this.method280(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("f.h(IILkc;IB)V")
    public void method280(int arg0, int arg1, class300 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field161[0][arg0][arg1] = (short) arg2.method5123();
        }
        this.field147[0][arg0][arg1] = (short) arg2.method5123();
    }

    @ObfuscatedName("f.k(IILkc;IB)V")
    public void method266(int arg0, int arg1, class300 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field147[0][arg0][arg1] = (short) arg2.method5123();
        if (var6) {
            int var8 = arg2.method5123();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5123();
                if (var10 != 0) {
                    this.field161[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5123();
                    this.field162[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field158[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5123();
            if (var13 != 0) {
                class26[] var14 = this.field164[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5152();
                    int var17 = arg2.method5123();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("f.x(B)I")
    public int method268() {
        return this.field149;
    }

    @ObfuscatedName("f.j(B)I")
    public int method267() {
        return this.field150;
    }

    @ObfuscatedName("f.t(Lkc;I)V")
    public abstract void method175(class300 arg0);
}
