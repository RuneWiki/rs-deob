package deob;

import java.util.LinkedList;

@ObfuscatedName("m")
public abstract class class22 {

    @ObfuscatedName("m.u")
    public int field158;

    @ObfuscatedName("m.f")
    public int field171;

    @ObfuscatedName("m.b")
    public int field159;

    @ObfuscatedName("m.g")
    public int field157;

    @ObfuscatedName("m.z")
    public int field172;

    @ObfuscatedName("m.p")
    public int field173;

    @ObfuscatedName("m.h")
    public int field163 = -1;

    @ObfuscatedName("m.y")
    public int field164 = -1;

    @ObfuscatedName("m.w")
    public short[][][] field165;

    @ObfuscatedName("m.i")
    public short[][][] field166;

    @ObfuscatedName("m.k")
    public byte[][][] field167;

    @ObfuscatedName("m.x")
    public byte[][][] field161;

    @ObfuscatedName("m.o")
    public class26[][][][] field169;

    @ObfuscatedName("m.e")
    public boolean field170;

    @ObfuscatedName("m.n")
    public boolean field168;

    public class22() {
        new LinkedList();
        this.field170 = false;
        this.field168 = false;
    }

    @ObfuscatedName("m.p(I)Z")
    public boolean method248() {
        return this.field170 && this.field168;
    }

    @ObfuscatedName("m.h(Lhf;I)V")
    public void method261(class234 arg0) {
        if (this.method248()) {
            return;
        }
        byte[] var2 = arg0.method3928(this.field163, this.field164);
        if (var2 != null) {
            this.method162(new class300(var2));
            this.field170 = true;
            this.field168 = true;
        }
    }

    @ObfuscatedName("m.y(I)V")
    public void method249() {
        this.field165 = (short[][][]) null;
        this.field166 = (short[][][]) null;
        this.field167 = (byte[][][]) null;
        this.field161 = (byte[][][]) null;
        this.field169 = (class26[][][][]) null;
        this.field170 = false;
        this.field168 = false;
    }

    @ObfuscatedName("m.w(IILkg;B)V")
    public void method250(int arg0, int arg1, class300 arg2) {
        int var4 = arg2.method5138();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method252(arg0, arg1, arg2, var4);
        } else {
            this.method251(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("m.i(IILkg;IB)V")
    public void method251(int arg0, int arg1, class300 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field166[0][arg0][arg1] = (short) arg2.method5138();
        }
        this.field165[0][arg0][arg1] = (short) arg2.method5138();
    }

    @ObfuscatedName("m.k(IILkg;II)V")
    public void method252(int arg0, int arg1, class300 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field165[0][arg0][arg1] = (short) arg2.method5138();
        if (var6) {
            int var8 = arg2.method5138();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5138();
                if (var10 != 0) {
                    this.field166[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5138();
                    this.field167[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field161[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5138();
            if (var13 != 0) {
                class26[] var14 = this.field169[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5155();
                    int var17 = arg2.method5138();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("m.x(I)I")
    public int method259() {
        return this.field159;
    }

    @ObfuscatedName("m.o(B)I")
    public int method269() {
        return this.field157;
    }

    @ObfuscatedName("m.f(Lkg;B)V")
    public abstract void method162(class300 arg0);
}
