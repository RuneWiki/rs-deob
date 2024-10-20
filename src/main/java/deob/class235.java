package deob;

import java.util.LinkedList;

@ObfuscatedName("ib")
public abstract class class235 {

    @ObfuscatedName("ib.a")
    public int field2850;

    @ObfuscatedName("ib.m")
    public int field2838;

    @ObfuscatedName("ib.p")
    public int field2842;

    @ObfuscatedName("ib.s")
    public int field2840;

    @ObfuscatedName("ib.r")
    public int field2841;

    @ObfuscatedName("ib.v")
    public int field2844;

    @ObfuscatedName("ib.y")
    public int field2843 = -1;

    @ObfuscatedName("ib.c")
    public int field2837 = -1;

    @ObfuscatedName("ib.w")
    public short[][][] field2845;

    @ObfuscatedName("ib.b")
    public short[][][] field2847;

    @ObfuscatedName("ib.t")
    public byte[][][] field2846;

    @ObfuscatedName("ib.g")
    public byte[][][] field2848;

    @ObfuscatedName("ib.x")
    public class237[][][][] field2839;

    @ObfuscatedName("ib.n")
    public boolean field2849;

    @ObfuscatedName("ib.e")
    public boolean field2851;

    public class235() {
        new LinkedList();
        this.field2849 = false;
        this.field2851 = false;
    }

    @ObfuscatedName("ib.f(B)Z")
    public boolean method4397() {
        return this.field2849 && this.field2851;
    }

    @ObfuscatedName("ib.d(Llp;B)V")
    public void method4399(class316 arg0) {
        if (this.method4397()) {
            return;
        }
        byte[] var2 = arg0.method5249(this.field2843, this.field2837);
        if (var2 != null) {
            this.method4078(new class440(var2));
            this.field2849 = true;
            this.field2851 = true;
        }
    }

    @ObfuscatedName("ib.j(I)V")
    public void method4425() {
        this.field2845 = (short[][][]) null;
        this.field2847 = (short[][][]) null;
        this.field2846 = (byte[][][]) null;
        this.field2848 = (byte[][][]) null;
        this.field2839 = (class237[][][][]) null;
        this.field2849 = false;
        this.field2851 = false;
    }

    @ObfuscatedName("ib.z(IILpx;I)V")
    public void method4401(int arg0, int arg1, class440 arg2) {
        int var4 = arg2.method7071();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4403(arg0, arg1, arg2, var4);
        } else {
            this.method4402(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ib.i(IILpx;IB)V")
    public void method4402(int arg0, int arg1, class440 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2847[0][arg0][arg1] = (short) arg2.method7071();
        }
        this.field2845[0][arg0][arg1] = (short) arg2.method7071();
    }

    @ObfuscatedName("ib.u(IILpx;IB)V")
    public void method4403(int arg0, int arg1, class440 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2845[0][arg0][arg1] = (short) arg2.method7071();
        if (var6) {
            int var8 = arg2.method7071();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method7071();
                if (var10 != 0) {
                    this.field2847[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method7071();
                    this.field2846[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2848[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method7071();
            if (var13 != 0) {
                class237[] var14 = this.field2839[var12][arg0][arg1] = new class237[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method6910();
                    int var17 = arg2.method7071();
                    var14[var15] = new class237(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ib.ag(I)I")
    public int method4404() {
        return this.field2842;
    }

    @ObfuscatedName("ib.ar(I)I")
    public int method4405() {
        return this.field2840;
    }

    @ObfuscatedName("ib.q(Lpx;I)V")
    public abstract void method4078(class440 arg0);
}
