package deob;

import java.util.LinkedList;

@ObfuscatedName("hd")
public abstract class class234 {

    @ObfuscatedName("hd.j")
    public int field2800;

    @ObfuscatedName("hd.e")
    public int field2810;

    @ObfuscatedName("hd.g")
    public int field2798;

    @ObfuscatedName("hd.w")
    public int field2799;

    @ObfuscatedName("hd.y")
    public int field2803;

    @ObfuscatedName("hd.i")
    public int field2801;

    @ObfuscatedName("hd.s")
    public int field2807 = -1;

    @ObfuscatedName("hd.t")
    public int field2806 = -1;

    @ObfuscatedName("hd.z")
    public short[][][] field2804;

    @ObfuscatedName("hd.r")
    public short[][][] field2805;

    @ObfuscatedName("hd.u")
    public byte[][][] field2797;

    @ObfuscatedName("hd.k")
    public byte[][][] field2796;

    @ObfuscatedName("hd.h")
    public class236[][][][] field2808;

    @ObfuscatedName("hd.x")
    public boolean field2811;

    @ObfuscatedName("hd.l")
    public boolean field2809;

    public class234() {
        new LinkedList();
        this.field2811 = false;
        this.field2809 = false;
    }

    @ObfuscatedName("hd.a(S)Z")
    public boolean method4545() {
        return this.field2811 && this.field2809;
    }

    @ObfuscatedName("hd.p(Llh;B)V")
    public void method4569(class315 arg0) {
        if (this.method4545()) {
            return;
        }
        byte[] var2 = arg0.method5305(this.field2807, this.field2806);
        if (var2 != null) {
            this.method4206(new class443(var2));
            this.field2811 = true;
            this.field2809 = true;
        }
    }

    @ObfuscatedName("hd.b(B)V")
    public void method4546() {
        this.field2804 = (short[][][]) null;
        this.field2805 = (short[][][]) null;
        this.field2797 = (byte[][][]) null;
        this.field2796 = (byte[][][]) null;
        this.field2808 = (class236[][][][]) null;
        this.field2811 = false;
        this.field2809 = false;
    }

    @ObfuscatedName("hd.n(IILqt;I)V")
    public void method4544(int arg0, int arg1, class443 arg2) {
        int var4 = arg2.method7047();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4549(arg0, arg1, arg2, var4);
        } else {
            this.method4568(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("hd.o(IILqt;IS)V")
    public void method4568(int arg0, int arg1, class443 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2805[0][arg0][arg1] = (short) arg2.method7047();
        }
        this.field2804[0][arg0][arg1] = (short) arg2.method7047();
    }

    @ObfuscatedName("hd.m(IILqt;IB)V")
    public void method4549(int arg0, int arg1, class443 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2804[0][arg0][arg1] = (short) arg2.method7047();
        if (var6) {
            int var8 = arg2.method7047();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method7047();
                if (var10 != 0) {
                    this.field2805[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method7047();
                    this.field2797[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2796[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method7047();
            if (var13 != 0) {
                class236[] var14 = this.field2808[var12][arg0][arg1] = new class236[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method7066();
                    int var17 = arg2.method7047();
                    var14[var15] = new class236(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("hd.d(I)I")
    public int method4560() {
        return this.field2798;
    }

    @ObfuscatedName("hd.ad(I)I")
    public int method4551() {
        return this.field2799;
    }

    @ObfuscatedName("hd.v(Lqt;I)V")
    public abstract void method4206(class443 arg0);
}
