package deob;

import java.util.LinkedList;

@ObfuscatedName("hx")
public abstract class class227 {

    @ObfuscatedName("hx.r")
    public int field2734;

    @ObfuscatedName("hx.o")
    public int field2728;

    @ObfuscatedName("hx.i")
    public int field2738;

    @ObfuscatedName("hx.w")
    public int field2730;

    @ObfuscatedName("hx.v")
    public int field2731;

    @ObfuscatedName("hx.a")
    public int field2735;

    @ObfuscatedName("hx.y")
    public int field2733 = -1;

    @ObfuscatedName("hx.u")
    public int field2727 = -1;

    @ObfuscatedName("hx.h")
    public short[][][] field2740;

    @ObfuscatedName("hx.q")
    public short[][][] field2736;

    @ObfuscatedName("hx.x")
    public byte[][][] field2737;

    @ObfuscatedName("hx.p")
    public byte[][][] field2732;

    @ObfuscatedName("hx.n")
    public class229[][][][] field2739;

    @ObfuscatedName("hx.m")
    public boolean field2729;

    @ObfuscatedName("hx.d")
    public boolean field2741;

    public class227() {
        new LinkedList();
        this.field2729 = false;
        this.field2741 = false;
    }

    @ObfuscatedName("hx.m(I)Z")
    public boolean method4316() {
        return this.field2729 && this.field2741;
    }

    @ObfuscatedName("hx.d(Lkq;B)V")
    public void method4317(class307 arg0) {
        if (this.method4316()) {
            return;
        }
        byte[] var2 = arg0.method5066(this.field2733, this.field2727);
        if (var2 != null) {
            this.method3952(new class421(var2));
            this.field2729 = true;
            this.field2741 = true;
        }
    }

    @ObfuscatedName("hx.j(I)V")
    public void method4333() {
        this.field2740 = (short[][][]) null;
        this.field2736 = (short[][][]) null;
        this.field2737 = (byte[][][]) null;
        this.field2732 = (byte[][][]) null;
        this.field2739 = (class229[][][][]) null;
        this.field2729 = false;
        this.field2741 = false;
    }

    @ObfuscatedName("hx.f(IILpi;I)V")
    public void method4319(int arg0, int arg1, class421 arg2) {
        int var4 = arg2.method6686();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4337(arg0, arg1, arg2, var4);
        } else {
            this.method4315(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("hx.g(IILpi;II)V")
    public void method4315(int arg0, int arg1, class421 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2736[0][arg0][arg1] = (short) arg2.method6686();
        }
        this.field2740[0][arg0][arg1] = (short) arg2.method6686();
    }

    @ObfuscatedName("hx.t(IILpi;IB)V")
    public void method4337(int arg0, int arg1, class421 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2740[0][arg0][arg1] = (short) arg2.method6686();
        if (var6) {
            int var8 = arg2.method6686();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method6686();
                if (var10 != 0) {
                    this.field2736[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method6686();
                    this.field2737[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2732[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method6686();
            if (var13 != 0) {
                class229[] var14 = this.field2739[var12][arg0][arg1] = new class229[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method6649();
                    int var17 = arg2.method6686();
                    var14[var15] = new class229(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("hx.k(I)I")
    public int method4321() {
        return this.field2738;
    }

    @ObfuscatedName("hx.b(B)I")
    public int method4322() {
        return this.field2730;
    }

    @ObfuscatedName("hx.l(Lpi;B)V")
    public abstract void method3952(class421 arg0);
}
