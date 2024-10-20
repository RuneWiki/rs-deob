package deob;

import java.util.LinkedList;

@ObfuscatedName("ge")
public abstract class class190 {

    @ObfuscatedName("ge.m")
    public int field2157;

    @ObfuscatedName("ge.k")
    public int field2149;

    @ObfuscatedName("ge.t")
    public int field2153;

    @ObfuscatedName("ge.a")
    public int field2148;

    @ObfuscatedName("ge.e")
    public int field2146;

    @ObfuscatedName("ge.i")
    public int field2151;

    @ObfuscatedName("ge.y")
    public int field2152 = -1;

    @ObfuscatedName("ge.w")
    public int field2147 = -1;

    @ObfuscatedName("ge.g")
    public short[][][] field2154;

    @ObfuscatedName("ge.v")
    public short[][][] field2155;

    @ObfuscatedName("ge.s")
    public byte[][][] field2156;

    @ObfuscatedName("ge.c")
    public byte[][][] field2150;

    @ObfuscatedName("ge.b")
    public class192[][][][] field2158;

    @ObfuscatedName("ge.x")
    public boolean field2159;

    @ObfuscatedName("ge.p")
    public boolean field2160;

    public class190() {
        new LinkedList();
        this.field2159 = false;
        this.field2160 = false;
    }

    @ObfuscatedName("ge.u(I)Z")
    public boolean method3536() {
        return this.field2159 && this.field2160;
    }

    @ObfuscatedName("ge.d(Lkl;I)V")
    public void method3518(class290 arg0) {
        if (this.method3536()) {
            return;
        }
        byte[] var2 = arg0.method4756(this.field2152, this.field2147);
        if (var2 != null) {
            this.method3172(new class401(var2));
            this.field2159 = true;
            this.field2160 = true;
        }
    }

    @ObfuscatedName("ge.ab(I)V")
    public void method3519() {
        this.field2154 = (short[][][]) null;
        this.field2155 = (short[][][]) null;
        this.field2156 = (byte[][][]) null;
        this.field2150 = (byte[][][]) null;
        this.field2158 = (class192[][][][]) null;
        this.field2159 = false;
        this.field2160 = false;
    }

    @ObfuscatedName("ge.ad(IILot;B)V")
    public void method3524(int arg0, int arg1, class401 arg2) {
        int var4 = arg2.method6272();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method3533(arg0, arg1, arg2, var4);
        } else {
            this.method3521(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ge.as(IILot;II)V")
    public void method3521(int arg0, int arg1, class401 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2155[0][arg0][arg1] = (short) arg2.method6272();
        }
        this.field2154[0][arg0][arg1] = (short) arg2.method6272();
    }

    @ObfuscatedName("ge.ak(IILot;II)V")
    public void method3533(int arg0, int arg1, class401 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2154[0][arg0][arg1] = (short) arg2.method6272();
        if (var6) {
            int var8 = arg2.method6272();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method6272();
                if (var10 != 0) {
                    this.field2155[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method6272();
                    this.field2156[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2150[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method6272();
            if (var13 != 0) {
                class192[] var14 = this.field2158[var12][arg0][arg1] = new class192[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method6353();
                    int var17 = arg2.method6272();
                    var14[var15] = new class192(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ge.ah(I)I")
    public int method3525() {
        return this.field2153;
    }

    @ObfuscatedName("ge.ay(I)I")
    public int method3516() {
        return this.field2148;
    }

    @ObfuscatedName("ge.q(Lot;I)V")
    public abstract void method3172(class401 arg0);
}
