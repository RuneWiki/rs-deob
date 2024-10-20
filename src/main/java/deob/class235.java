package deob;

import java.util.LinkedList;

@ObfuscatedName("ig")
public abstract class class235 {

    @ObfuscatedName("ig.k")
    public int field2841;

    @ObfuscatedName("ig.w")
    public int field2839;

    @ObfuscatedName("ig.s")
    public int field2831;

    @ObfuscatedName("ig.q")
    public int field2829;

    @ObfuscatedName("ig.m")
    public int field2833;

    @ObfuscatedName("ig.x")
    public int field2834;

    @ObfuscatedName("ig.j")
    public int field2830 = -1;

    @ObfuscatedName("ig.v")
    public int field2832 = -1;

    @ObfuscatedName("ig.h")
    public short[][][] field2837;

    @ObfuscatedName("ig.t")
    public short[][][] field2838;

    @ObfuscatedName("ig.u")
    public byte[][][] field2840;

    @ObfuscatedName("ig.d")
    public byte[][][] field2835;

    @ObfuscatedName("ig.b")
    public class237[][][][] field2836;

    @ObfuscatedName("ig.a")
    public boolean field2842;

    @ObfuscatedName("ig.l")
    public boolean field2843;

    public class235() {
        new LinkedList();
        this.field2842 = false;
        this.field2843 = false;
    }

    @ObfuscatedName("ig.g(I)Z")
    public boolean method4648() {
        return this.field2842 && this.field2843;
    }

    @ObfuscatedName("ig.y(Llv;I)V")
    public void method4621(class317 arg0) {
        if (this.method4648()) {
            return;
        }
        byte[] var2 = arg0.method5499(this.field2830, this.field2832);
        if (var2 != null) {
            this.method4277(new class445(var2));
            this.field2842 = true;
            this.field2843 = true;
        }
    }

    @ObfuscatedName("ig.i(I)V")
    public void method4622() {
        this.field2837 = (short[][][]) null;
        this.field2838 = (short[][][]) null;
        this.field2840 = (byte[][][]) null;
        this.field2835 = (byte[][][]) null;
        this.field2836 = (class237[][][][]) null;
        this.field2842 = false;
        this.field2843 = false;
    }

    @ObfuscatedName("ig.r(IILqq;I)V")
    public void method4623(int arg0, int arg1, class445 arg2) {
        int var4 = arg2.method7196();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4625(arg0, arg1, arg2, var4);
        } else {
            this.method4627(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ig.z(IILqq;II)V")
    public void method4627(int arg0, int arg1, class445 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2838[0][arg0][arg1] = (short) arg2.method7196();
        }
        this.field2837[0][arg0][arg1] = (short) arg2.method7196();
    }

    @ObfuscatedName("ig.o(IILqq;IS)V")
    public void method4625(int arg0, int arg1, class445 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2837[0][arg0][arg1] = (short) arg2.method7196();
        if (var6) {
            int var8 = arg2.method7196();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method7196();
                if (var10 != 0) {
                    this.field2838[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method7196();
                    this.field2840[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2835[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method7196();
            if (var13 != 0) {
                class237[] var14 = this.field2836[var12][arg0][arg1] = new class237[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method7301();
                    int var17 = arg2.method7196();
                    var14[var15] = new class237(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ig.as(S)I")
    public int method4640() {
        return this.field2831;
    }

    @ObfuscatedName("ig.ac(I)I")
    public int method4642() {
        return this.field2829;
    }

    @ObfuscatedName("ig.p(Lqq;I)V")
    public abstract void method4277(class445 arg0);
}
