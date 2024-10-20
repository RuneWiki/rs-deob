package deob;

import java.util.LinkedList;

@ObfuscatedName("f")
public abstract class class22 {

    @ObfuscatedName("f.z")
    public int field159;

    @ObfuscatedName("f.n")
    public int field154;

    @ObfuscatedName("f.v")
    public int field155;

    @ObfuscatedName("f.u")
    public int field156;

    @ObfuscatedName("f.r")
    public int field157;

    @ObfuscatedName("f.p")
    public int field158;

    @ObfuscatedName("f.q")
    public int field160 = -1;

    @ObfuscatedName("f.m")
    public int field168 = -1;

    @ObfuscatedName("f.y")
    public short[][][] field161;

    @ObfuscatedName("f.i")
    public short[][][] field162;

    @ObfuscatedName("f.c")
    public byte[][][] field165;

    @ObfuscatedName("f.b")
    public byte[][][] field153;

    @ObfuscatedName("f.o")
    public class26[][][][] field163;

    @ObfuscatedName("f.a")
    public boolean field166;

    @ObfuscatedName("f.e")
    public boolean field167;

    public class22() {
        new LinkedList();
        this.field166 = false;
        this.field167 = false;
    }

    @ObfuscatedName("f.y(I)Z")
    public boolean method240() {
        return this.field166 && this.field167;
    }

    @ObfuscatedName("f.i(Lhp;I)V")
    public void method241(class234 arg0) {
        if (this.method240()) {
            return;
        }
        byte[] var2 = arg0.method3726(this.field160, this.field168);
        if (var2 != null) {
            this.method165(new class300(var2));
            this.field166 = true;
            this.field167 = true;
        }
    }

    @ObfuscatedName("f.c(I)V")
    public void method242() {
        this.field161 = (short[][][]) null;
        this.field162 = (short[][][]) null;
        this.field165 = (byte[][][]) null;
        this.field153 = (byte[][][]) null;
        this.field163 = (class26[][][][]) null;
        this.field166 = false;
        this.field167 = false;
    }

    @ObfuscatedName("f.b(IILkl;B)V")
    public void method249(int arg0, int arg1, class300 arg2) {
        int var4 = arg2.method4990();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method248(arg0, arg1, arg2, var4);
        } else {
            this.method244(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("f.o(IILkl;II)V")
    public void method244(int arg0, int arg1, class300 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field162[0][arg0][arg1] = (short) arg2.method4990();
        }
        this.field161[0][arg0][arg1] = (short) arg2.method4990();
    }

    @ObfuscatedName("f.a(IILkl;IB)V")
    public void method248(int arg0, int arg1, class300 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field161[0][arg0][arg1] = (short) arg2.method4990();
        if (var6) {
            int var8 = arg2.method4990();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method4990();
                if (var10 != 0) {
                    this.field162[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method4990();
                    this.field165[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field153[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method4990();
            if (var13 != 0) {
                class26[] var14 = this.field163[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5001();
                    int var17 = arg2.method4990();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("f.e(I)I")
    public int method239() {
        return this.field155;
    }

    @ObfuscatedName("f.x(I)I")
    public int method247() {
        return this.field156;
    }

    @ObfuscatedName("f.n(Lkl;I)V")
    public abstract void method165(class300 arg0);
}
