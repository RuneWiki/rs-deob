package deob;

import java.util.LinkedList;

@ObfuscatedName("fk")
public abstract class class177 {

    @ObfuscatedName("fk.l")
    public int field2051;

    @ObfuscatedName("fk.n")
    public int field2048;

    @ObfuscatedName("fk.w")
    public int field2049;

    @ObfuscatedName("fk.f")
    public int field2053;

    @ObfuscatedName("fk.o")
    public int field2061;

    @ObfuscatedName("fk.x")
    public int field2052;

    @ObfuscatedName("fk.r")
    public int field2047 = -1;

    @ObfuscatedName("fk.p")
    public int field2054 = -1;

    @ObfuscatedName("fk.h")
    public short[][][] field2055;

    @ObfuscatedName("fk.k")
    public short[][][] field2062;

    @ObfuscatedName("fk.a")
    public byte[][][] field2057;

    @ObfuscatedName("fk.q")
    public byte[][][] field2058;

    @ObfuscatedName("fk.u")
    public class179[][][][] field2059;

    @ObfuscatedName("fk.e")
    public boolean field2060;

    @ObfuscatedName("fk.c")
    public boolean field2056;

    public class177() {
        new LinkedList();
        this.field2060 = false;
        this.field2056 = false;
    }

    @ObfuscatedName("fk.i(B)Z")
    public boolean method3238() {
        return this.field2060 && this.field2056;
    }

    @ObfuscatedName("fk.m(Ljy;I)V")
    public void method3231(class277 arg0) {
        if (this.method3238()) {
            return;
        }
        byte[] var2 = arg0.method4459(this.field2047, this.field2054);
        if (var2 != null) {
            this.method2904(new class385(var2));
            this.field2060 = true;
            this.field2056 = true;
        }
    }

    @ObfuscatedName("fk.b(I)V")
    public void method3229() {
        this.field2055 = (short[][][]) null;
        this.field2062 = (short[][][]) null;
        this.field2057 = (byte[][][]) null;
        this.field2058 = (byte[][][]) null;
        this.field2059 = (class179[][][][]) null;
        this.field2060 = false;
        this.field2056 = false;
    }

    @ObfuscatedName("fk.z(IILnv;B)V")
    public void method3251(int arg0, int arg1, class385 arg2) {
        int var4 = arg2.method5958();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method3233(arg0, arg1, arg2, var4);
        } else {
            this.method3234(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("fk.d(IILnv;II)V")
    public void method3234(int arg0, int arg1, class385 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2062[0][arg0][arg1] = (short) arg2.method5958();
        }
        this.field2055[0][arg0][arg1] = (short) arg2.method5958();
    }

    @ObfuscatedName("fk.y(IILnv;IB)V")
    public void method3233(int arg0, int arg1, class385 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2055[0][arg0][arg1] = (short) arg2.method5958();
        if (var6) {
            int var8 = arg2.method5958();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5958();
                if (var10 != 0) {
                    this.field2062[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5958();
                    this.field2057[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2058[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5958();
            if (var13 != 0) {
                class179[] var14 = this.field2059[var12][arg0][arg1] = new class179[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5975();
                    int var17 = arg2.method5958();
                    var14[var15] = new class179(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("fk.g(B)I")
    public int method3236() {
        return this.field2049;
    }

    @ObfuscatedName("fk.ae(I)I")
    public int method3235() {
        return this.field2053;
    }

    @ObfuscatedName("fk.t(Lnv;I)V")
    public abstract void method2904(class385 arg0);
}
