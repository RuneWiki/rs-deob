package deob;

import java.util.LinkedList;

@ObfuscatedName("gy")
public abstract class class190 {

    @ObfuscatedName("gy.o")
    public int field2139;

    @ObfuscatedName("gy.g")
    public int field2135;

    @ObfuscatedName("gy.z")
    public int field2136;

    @ObfuscatedName("gy.a")
    public int field2137;

    @ObfuscatedName("gy.u")
    public int field2138;

    @ObfuscatedName("gy.e")
    public int field2146;

    @ObfuscatedName("gy.l")
    public int field2141 = -1;

    @ObfuscatedName("gy.y")
    public int field2143 = -1;

    @ObfuscatedName("gy.v")
    public short[][][] field2142;

    @ObfuscatedName("gy.f")
    public short[][][] field2134;

    @ObfuscatedName("gy.s")
    public byte[][][] field2144;

    @ObfuscatedName("gy.h")
    public byte[][][] field2145;

    @ObfuscatedName("gy.d")
    public class192[][][][] field2140;

    @ObfuscatedName("gy.q")
    public boolean field2147;

    @ObfuscatedName("gy.j")
    public boolean field2148;

    public class190() {
        new LinkedList();
        this.field2147 = false;
        this.field2148 = false;
    }

    @ObfuscatedName("gy.x(B)Z")
    public boolean method3475() {
        return this.field2147 && this.field2148;
    }

    @ObfuscatedName("gy.b(Lkk;I)V")
    public void method3476(class290 arg0) {
        if (this.method3475()) {
            return;
        }
        byte[] var2 = arg0.method4710(this.field2141, this.field2143);
        if (var2 != null) {
            this.method3122(new class400(var2));
            this.field2147 = true;
            this.field2148 = true;
        }
    }

    @ObfuscatedName("gy.t(B)V")
    public void method3493() {
        this.field2142 = (short[][][]) null;
        this.field2134 = (short[][][]) null;
        this.field2144 = (byte[][][]) null;
        this.field2145 = (byte[][][]) null;
        this.field2140 = (class192[][][][]) null;
        this.field2147 = false;
        this.field2148 = false;
    }

    @ObfuscatedName("gy.r(IILot;B)V")
    public void method3499(int arg0, int arg1, class400 arg2) {
        int var4 = arg2.method6217();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method3479(arg0, arg1, arg2, var4);
        } else {
            this.method3478(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("gy.p(IILot;IB)V")
    public void method3478(int arg0, int arg1, class400 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2134[0][arg0][arg1] = (short) arg2.method6217();
        }
        this.field2142[0][arg0][arg1] = (short) arg2.method6217();
    }

    @ObfuscatedName("gy.w(IILot;IB)V")
    public void method3479(int arg0, int arg1, class400 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2142[0][arg0][arg1] = (short) arg2.method6217();
        if (var6) {
            int var8 = arg2.method6217();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method6217();
                if (var10 != 0) {
                    this.field2134[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method6217();
                    this.field2144[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2145[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method6217();
            if (var13 != 0) {
                class192[] var14 = this.field2140[var12][arg0][arg1] = new class192[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method6387();
                    int var17 = arg2.method6217();
                    var14[var15] = new class192(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("gy.i(I)I")
    public int method3480() {
        return this.field2136;
    }

    @ObfuscatedName("gy.aq(I)I")
    public int method3494() {
        return this.field2137;
    }

    @ObfuscatedName("gy.c(Lot;B)V")
    public abstract void method3122(class400 arg0);
}
