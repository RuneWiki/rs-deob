package deob;

import java.util.LinkedList;

@ObfuscatedName("in")
public abstract class class247 {

    @ObfuscatedName("in.m")
    public int field2945;

    @ObfuscatedName("in.q")
    public int field2942;

    @ObfuscatedName("in.f")
    public int field2943;

    @ObfuscatedName("in.r")
    public int field2949;

    @ObfuscatedName("in.u")
    public int field2953;

    @ObfuscatedName("in.b")
    public int field2946;

    @ObfuscatedName("in.j")
    public int field2941 = -1;

    @ObfuscatedName("in.g")
    public int field2948 = -1;

    @ObfuscatedName("in.i")
    public short[][][] field2950;

    @ObfuscatedName("in.o")
    public short[][][] field2944;

    @ObfuscatedName("in.n")
    public byte[][][] field2951;

    @ObfuscatedName("in.k")
    public byte[][][] field2952;

    @ObfuscatedName("in.a")
    public class249[][][][] field2947;

    @ObfuscatedName("in.s")
    public static boolean field2954 = true;

    @ObfuscatedName("in.l")
    public boolean field2955;

    @ObfuscatedName("in.t")
    public boolean field2956;

    public class247() {
        new LinkedList();
        this.field2955 = false;
        this.field2956 = false;
    }

    @ObfuscatedName("in.w(I)Z")
    public boolean method4766() {
        return this.field2955 && this.field2956;
    }

    @ObfuscatedName("in.as(Lly;I)V")
    public void method4768(class333 arg0) {
        if (this.method4766()) {
            return;
        }
        byte[] var2 = arg0.method5909(this.field2941, this.field2948);
        if (var2 != null) {
            this.method4432(new class467(var2));
            this.field2955 = true;
            this.field2956 = true;
        }
    }

    @ObfuscatedName("in.ad(I)V")
    public void method4774() {
        this.field2950 = (short[][][]) null;
        this.field2944 = (short[][][]) null;
        this.field2951 = (byte[][][]) null;
        this.field2952 = (byte[][][]) null;
        this.field2947 = (class249[][][][]) null;
        this.field2955 = false;
        this.field2956 = false;
    }

    @ObfuscatedName("in.ao(IILqy;I)V")
    public void method4769(int arg0, int arg1, class467 arg2) {
        int var4 = arg2.method7792();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4771(arg0, arg1, arg2, var4);
        } else {
            this.method4770(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("in.am(IILqy;II)V")
    public void method4770(int arg0, int arg1, class467 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2944[0][arg0][arg1] = field2954 ? (short) arg2.method7794() : (short) arg2.method7792();
        }
        this.field2950[0][arg0][arg1] = field2954 ? (short) arg2.method7794() : (short) arg2.method7792();
    }

    @ObfuscatedName("in.av(IILqy;IB)V")
    public void method4771(int arg0, int arg1, class467 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2950[0][arg0][arg1] = field2954 ? (short) arg2.method7794() : (short) arg2.method7792();
        if (var6) {
            int var8 = arg2.method7792();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = field2954 ? arg2.method7794() : arg2.method7792();
                if (var10 != 0) {
                    this.field2944[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method7792();
                    this.field2951[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2952[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method7792();
            if (var13 != 0) {
                class249[] var14 = this.field2947[var12][arg0][arg1] = new class249[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method7810();
                    int var17 = arg2.method7792();
                    var14[var15] = new class249(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("in.au(I)I")
    public int method4773() {
        return this.field2943;
    }

    @ObfuscatedName("in.ar(I)I")
    public int method4778() {
        return this.field2949;
    }

    @ObfuscatedName("in.e(Lqy;I)V")
    public abstract void method4432(class467 arg0);
}
