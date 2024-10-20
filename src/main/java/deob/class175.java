package deob;

import java.util.LinkedList;

@ObfuscatedName("fm")
public abstract class class175 {

    @ObfuscatedName("fm.p")
    public int field2056;

    @ObfuscatedName("fm.j")
    public int field2063;

    @ObfuscatedName("fm.r")
    public int field2058;

    @ObfuscatedName("fm.b")
    public int field2059;

    @ObfuscatedName("fm.d")
    public int field2060;

    @ObfuscatedName("fm.s")
    public int field2061;

    @ObfuscatedName("fm.u")
    public int field2071 = -1;

    @ObfuscatedName("fm.l")
    public int field2067 = -1;

    @ObfuscatedName("fm.o")
    public short[][][] field2064;

    @ObfuscatedName("fm.c")
    public short[][][] field2065;

    @ObfuscatedName("fm.e")
    public byte[][][] field2068;

    @ObfuscatedName("fm.g")
    public byte[][][] field2066;

    @ObfuscatedName("fm.a")
    public class177[][][][] field2057;

    @ObfuscatedName("fm.k")
    public boolean field2069;

    @ObfuscatedName("fm.m")
    public boolean field2070;

    public class175() {
        new LinkedList();
        this.field2069 = false;
        this.field2070 = false;
    }

    @ObfuscatedName("fm.ae(B)Z")
    public boolean method3297() {
        return this.field2069 && this.field2070;
    }

    @ObfuscatedName("fm.ap(Ljv;I)V")
    public void method3298(class275 arg0) {
        if (this.method3297()) {
            return;
        }
        byte[] var2 = arg0.method4468(this.field2071, this.field2067);
        if (var2 != null) {
            this.method2950(new class383(var2));
            this.field2069 = true;
            this.field2070 = true;
        }
    }

    @ObfuscatedName("fm.ab(I)V")
    public void method3296() {
        this.field2064 = (short[][][]) null;
        this.field2065 = (short[][][]) null;
        this.field2068 = (byte[][][]) null;
        this.field2066 = (byte[][][]) null;
        this.field2057 = (class177[][][][]) null;
        this.field2069 = false;
        this.field2070 = false;
    }

    @ObfuscatedName("fm.al(IILnd;I)V")
    public void method3300(int arg0, int arg1, class383 arg2) {
        int var4 = arg2.method5965();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method3319(arg0, arg1, arg2, var4);
        } else {
            this.method3301(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("fm.ad(IILnd;II)V")
    public void method3301(int arg0, int arg1, class383 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2065[0][arg0][arg1] = (short) arg2.method5965();
        }
        this.field2064[0][arg0][arg1] = (short) arg2.method5965();
    }

    @ObfuscatedName("fm.ai(IILnd;II)V")
    public void method3319(int arg0, int arg1, class383 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2064[0][arg0][arg1] = (short) arg2.method5965();
        if (var6) {
            int var8 = arg2.method5965();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5965();
                if (var10 != 0) {
                    this.field2065[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5965();
                    this.field2068[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2066[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5965();
            if (var13 != 0) {
                class177[] var14 = this.field2057[var12][arg0][arg1] = new class177[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5982();
                    int var17 = arg2.method5965();
                    var14[var15] = new class177(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("fm.ar(I)I")
    public int method3304() {
        return this.field2058;
    }

    @ObfuscatedName("fm.ag(B)I")
    public int method3305() {
        return this.field2059;
    }

    @ObfuscatedName("fm.n(Lnd;I)V")
    public abstract void method2950(class383 arg0);
}
