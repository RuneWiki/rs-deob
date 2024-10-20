package deob;

import java.util.LinkedList;

@ObfuscatedName("ia")
public abstract class class251 {

    @ObfuscatedName("ia.z")
    public int field2955;

    @ObfuscatedName("ia.j")
    public int field2945;

    @ObfuscatedName("ia.i")
    public int field2946;

    @ObfuscatedName("ia.n")
    public int field2947;

    @ObfuscatedName("ia.l")
    public int field2948;

    @ObfuscatedName("ia.k")
    public int field2949;

    @ObfuscatedName("ia.c")
    public int field2950 = -1;

    @ObfuscatedName("ia.r")
    public int field2951 = -1;

    @ObfuscatedName("ia.b")
    public short[][][] field2944;

    @ObfuscatedName("ia.m")
    public short[][][] field2954;

    @ObfuscatedName("ia.t")
    public byte[][][] field2961;

    @ObfuscatedName("ia.h")
    public byte[][][] field2957;

    @ObfuscatedName("ia.p")
    public class253[][][][] field2956;

    @ObfuscatedName("ia.o")
    public static boolean field2952 = true;

    @ObfuscatedName("ia.u")
    public boolean field2958;

    @ObfuscatedName("ia.x")
    public boolean field2959;

    public class251() {
        new LinkedList();
        this.field2958 = false;
        this.field2959 = false;
    }

    @ObfuscatedName("ia.a(I)Z")
    public boolean method4873() {
        return this.field2958 && this.field2959;
    }

    @ObfuscatedName("ia.q(Lln;B)V")
    public void method4885(class337 arg0) {
        if (this.method4873()) {
            return;
        }
        byte[] var2 = arg0.method5990(this.field2950, this.field2951);
        if (var2 != null) {
            this.method4506(new class474(var2));
            this.field2958 = true;
            this.field2959 = true;
        }
    }

    @ObfuscatedName("ia.d(B)V")
    public void method4875() {
        this.field2944 = (short[][][]) null;
        this.field2954 = (short[][][]) null;
        this.field2961 = (byte[][][]) null;
        this.field2957 = (byte[][][]) null;
        this.field2956 = (class253[][][][]) null;
        this.field2958 = false;
        this.field2959 = false;
    }

    @ObfuscatedName("ia.e(IILrd;B)V")
    public void method4876(int arg0, int arg1, class474 arg2) {
        int var4 = arg2.method7964();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4898(arg0, arg1, arg2, var4);
        } else {
            this.method4877(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ia.g(IILrd;II)V")
    public void method4877(int arg0, int arg1, class474 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2954[0][arg0][arg1] = field2952 ? (short) arg2.method8032() : (short) arg2.method7964();
        }
        this.field2944[0][arg0][arg1] = field2952 ? (short) arg2.method8032() : (short) arg2.method7964();
    }

    @ObfuscatedName("ia.y(IILrd;II)V")
    public void method4898(int arg0, int arg1, class474 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2944[0][arg0][arg1] = field2952 ? (short) arg2.method8032() : (short) arg2.method7964();
        if (var6) {
            int var8 = arg2.method7964();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = field2952 ? arg2.method8032() : arg2.method7964();
                if (var10 != 0) {
                    this.field2954[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method7964();
                    this.field2961[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2957[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method7964();
            if (var13 != 0) {
                class253[] var14 = this.field2956[var12][arg0][arg1] = new class253[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8029();
                    int var17 = arg2.method7964();
                    var14[var15] = new class253(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ia.af(I)I")
    public int method4878() {
        return this.field2946;
    }

    @ObfuscatedName("ia.aa(I)I")
    public int method4887() {
        return this.field2947;
    }

    @ObfuscatedName("ia.w(Lrd;B)V")
    public abstract void method4506(class474 arg0);
}
