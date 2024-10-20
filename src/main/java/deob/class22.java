package deob;

import java.util.LinkedList;

@ObfuscatedName("l")
public abstract class class22 {

    @ObfuscatedName("l.s")
    public int field155;

    @ObfuscatedName("l.j")
    public int field147;

    @ObfuscatedName("l.i")
    public int field148;

    @ObfuscatedName("l.k")
    public int field156;

    @ObfuscatedName("l.u")
    public int field150;

    @ObfuscatedName("l.n")
    public int field153;

    @ObfuscatedName("l.t")
    public int field152 = -1;

    @ObfuscatedName("l.q")
    public int field149 = -1;

    @ObfuscatedName("l.x")
    public short[][][] field154;

    @ObfuscatedName("l.d")
    public short[][][] field151;

    @ObfuscatedName("l.f")
    public byte[][][] field146;

    @ObfuscatedName("l.c")
    public byte[][][] field157;

    @ObfuscatedName("l.r")
    public class26[][][][] field158;

    @ObfuscatedName("l.y")
    public boolean field159;

    @ObfuscatedName("l.p")
    public boolean field160;

    public class22() {
        new LinkedList();
        this.field159 = false;
        this.field160 = false;
    }

    @ObfuscatedName("l.n(B)Z")
    public boolean method240() {
        return this.field159 && this.field160;
    }

    @ObfuscatedName("l.t(Lhz;I)V")
    public void method217(class234 arg0) {
        if (this.method240()) {
            return;
        }
        byte[] var2 = arg0.method3790(this.field152, this.field149);
        if (var2 != null) {
            this.method145(new class300(var2));
            this.field159 = true;
            this.field160 = true;
        }
    }

    @ObfuscatedName("l.q(I)V")
    public void method218() {
        this.field154 = (short[][][]) null;
        this.field151 = (short[][][]) null;
        this.field146 = (byte[][][]) null;
        this.field157 = (byte[][][]) null;
        this.field158 = (class26[][][][]) null;
        this.field159 = false;
        this.field160 = false;
    }

    @ObfuscatedName("l.x(IILky;I)V")
    public void method219(int arg0, int arg1, class300 arg2) {
        int var4 = arg2.method5179();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method230(arg0, arg1, arg2, var4);
        } else {
            this.method220(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("l.d(IILky;IB)V")
    public void method220(int arg0, int arg1, class300 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field151[0][arg0][arg1] = (short) arg2.method5179();
        }
        this.field154[0][arg0][arg1] = (short) arg2.method5179();
    }

    @ObfuscatedName("l.f(IILky;IS)V")
    public void method230(int arg0, int arg1, class300 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field154[0][arg0][arg1] = (short) arg2.method5179();
        if (var6) {
            int var8 = arg2.method5179();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5179();
                if (var10 != 0) {
                    this.field151[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5179();
                    this.field146[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field157[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5179();
            if (var13 != 0) {
                class26[] var14 = this.field158[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5246();
                    int var17 = arg2.method5179();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("l.c(B)I")
    public int method222() {
        return this.field148;
    }

    @ObfuscatedName("l.r(B)I")
    public int method225() {
        return this.field156;
    }

    @ObfuscatedName("l.j(Lky;B)V")
    public abstract void method145(class300 arg0);
}
