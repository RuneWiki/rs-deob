package deob;

import java.util.LinkedList;

@ObfuscatedName("h")
public abstract class class22 {

    @ObfuscatedName("h.f")
    public int field143;

    @ObfuscatedName("h.i")
    public int field142;

    @ObfuscatedName("h.y")
    public int field156;

    @ObfuscatedName("h.w")
    public int field144;

    @ObfuscatedName("h.p")
    public int field145;

    @ObfuscatedName("h.b")
    public int field146;

    @ObfuscatedName("h.e")
    public int field157 = -1;

    @ObfuscatedName("h.x")
    public int field152 = -1;

    @ObfuscatedName("h.a")
    public short[][][] field149;

    @ObfuscatedName("h.d")
    public short[][][] field159;

    @ObfuscatedName("h.c")
    public byte[][][] field151;

    @ObfuscatedName("h.o")
    public byte[][][] field150;

    @ObfuscatedName("h.v")
    public class26[][][][] field153;

    @ObfuscatedName("h.k")
    public boolean field154;

    @ObfuscatedName("h.s")
    public boolean field155;

    public class22() {
        new LinkedList();
        this.field154 = false;
        this.field155 = false;
    }

    @ObfuscatedName("h.e(I)Z")
    public boolean method231() {
        return this.field154 && this.field155;
    }

    @ObfuscatedName("h.x(Lhz;I)V")
    public void method220(class234 arg0) {
        if (this.method231()) {
            return;
        }
        byte[] var2 = arg0.method3752(this.field157, this.field152);
        if (var2 != null) {
            this.method142(new class300(var2));
            this.field154 = true;
            this.field155 = true;
        }
    }

    @ObfuscatedName("h.a(I)V")
    public void method239() {
        this.field149 = (short[][][]) null;
        this.field159 = (short[][][]) null;
        this.field151 = (byte[][][]) null;
        this.field150 = (byte[][][]) null;
        this.field153 = (class26[][][][]) null;
        this.field154 = false;
        this.field155 = false;
    }

    @ObfuscatedName("h.d(IILkq;I)V")
    public void method221(int arg0, int arg1, class300 arg2) {
        int var4 = arg2.method5110();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method241(arg0, arg1, arg2, var4);
        } else {
            this.method222(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("h.c(IILkq;II)V")
    public void method222(int arg0, int arg1, class300 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field159[0][arg0][arg1] = (short) arg2.method5110();
        }
        this.field149[0][arg0][arg1] = (short) arg2.method5110();
    }

    @ObfuscatedName("h.o(IILkq;IB)V")
    public void method241(int arg0, int arg1, class300 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field149[0][arg0][arg1] = (short) arg2.method5110();
        if (var6) {
            int var8 = arg2.method5110();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5110();
                if (var10 != 0) {
                    this.field159[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5110();
                    this.field151[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field150[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5110();
            if (var13 != 0) {
                class26[] var14 = this.field153[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5127();
                    int var17 = arg2.method5110();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("h.l(B)I")
    public int method224() {
        return this.field156;
    }

    @ObfuscatedName("h.t(B)I")
    public int method218() {
        return this.field144;
    }

    @ObfuscatedName("h.i(Lkq;I)V")
    public abstract void method142(class300 arg0);
}
