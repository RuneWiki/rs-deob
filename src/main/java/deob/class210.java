package deob;

import java.util.LinkedList;

@ObfuscatedName("hz")
public abstract class class210 {

    @ObfuscatedName("hz.b")
    public int field2344;

    @ObfuscatedName("hz.n")
    public int field2339;

    @ObfuscatedName("hz.s")
    public int field2336;

    @ObfuscatedName("hz.l")
    public int field2337;

    @ObfuscatedName("hz.q")
    public int field2345;

    @ObfuscatedName("hz.o")
    public int field2334;

    @ObfuscatedName("hz.r")
    public int field2340 = -1;

    @ObfuscatedName("hz.p")
    public int field2341 = -1;

    @ObfuscatedName("hz.w")
    public short[][][] field2342;

    @ObfuscatedName("hz.k")
    public short[][][] field2338;

    @ObfuscatedName("hz.d")
    public byte[][][] field2335;

    @ObfuscatedName("hz.m")
    public byte[][][] field2343;

    @ObfuscatedName("hz.u")
    public class212[][][][] field2346;

    @ObfuscatedName("hz.t")
    public boolean field2347;

    @ObfuscatedName("hz.g")
    public boolean field2348;

    public class210() {
        new LinkedList();
        this.field2347 = false;
        this.field2348 = false;
    }

    @ObfuscatedName("hz.y(B)Z")
    public boolean method3902() {
        return this.field2347 && this.field2348;
    }

    @ObfuscatedName("hz.j(Lln;B)V")
    public void method3912(class316 arg0) {
        if (this.method3902()) {
            return;
        }
        byte[] var2 = arg0.method5296(this.field2340, this.field2341);
        if (var2 != null) {
            this.method3548(new class438(var2));
            this.field2347 = true;
            this.field2348 = true;
        }
    }

    @ObfuscatedName("hz.e(B)V")
    public void method3904() {
        this.field2342 = (short[][][]) null;
        this.field2338 = (short[][][]) null;
        this.field2335 = (byte[][][]) null;
        this.field2343 = (byte[][][]) null;
        this.field2346 = (class212[][][][]) null;
        this.field2347 = false;
        this.field2348 = false;
    }

    @ObfuscatedName("hz.z(IILpi;I)V")
    public void method3905(int arg0, int arg1, class438 arg2) {
        int var4 = arg2.method6971();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method3907(arg0, arg1, arg2, var4);
        } else {
            this.method3906(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("hz.h(IILpi;II)V")
    public void method3906(int arg0, int arg1, class438 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2338[0][arg0][arg1] = (short) arg2.method6971();
        }
        this.field2342[0][arg0][arg1] = (short) arg2.method6971();
    }

    @ObfuscatedName("hz.ae(IILpi;IB)V")
    public void method3907(int arg0, int arg1, class438 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2342[0][arg0][arg1] = (short) arg2.method6971();
        if (var6) {
            int var8 = arg2.method6971();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method6971();
                if (var10 != 0) {
                    this.field2338[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method6971();
                    this.field2335[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2343[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method6971();
            if (var13 != 0) {
                class212[] var14 = this.field2346[var12][arg0][arg1] = new class212[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method6989();
                    int var17 = arg2.method6971();
                    var14[var15] = new class212(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("hz.aq(I)I")
    public int method3924() {
        return this.field2336;
    }

    @ObfuscatedName("hz.aw(I)I")
    public int method3909() {
        return this.field2337;
    }

    @ObfuscatedName("hz.c(Lpi;I)V")
    public abstract void method3548(class438 arg0);
}
