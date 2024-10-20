package deob;

import java.util.LinkedList;

@ObfuscatedName("hz")
public abstract class class227 {

    @ObfuscatedName("hz.t")
    public int field2708;

    @ObfuscatedName("hz.s")
    public int field2709;

    @ObfuscatedName("hz.j")
    public int field2698;

    @ObfuscatedName("hz.w")
    public int field2701;

    @ObfuscatedName("hz.n")
    public int field2711;

    @ObfuscatedName("hz.r")
    public int field2704;

    @ObfuscatedName("hz.o")
    public int field2702 = -1;

    @ObfuscatedName("hz.v")
    public int field2703 = -1;

    @ObfuscatedName("hz.d")
    public short[][][] field2696;

    @ObfuscatedName("hz.h")
    public short[][][] field2705;

    @ObfuscatedName("hz.g")
    public byte[][][] field2700;

    @ObfuscatedName("hz.e")
    public byte[][][] field2707;

    @ObfuscatedName("hz.a")
    public class229[][][][] field2706;

    @ObfuscatedName("hz.u")
    public boolean field2697;

    @ObfuscatedName("hz.k")
    public boolean field2710;

    public class227() {
        new LinkedList();
        this.field2697 = false;
        this.field2710 = false;
    }

    @ObfuscatedName("hz.x(I)Z")
    public boolean method4354() {
        return this.field2697 && this.field2710;
    }

    @ObfuscatedName("hz.z(Lku;S)V")
    public void method4364(class302 arg0) {
        if (this.method4354()) {
            return;
        }
        byte[] var2 = arg0.method5053(this.field2702, this.field2703);
        if (var2 != null) {
            this.method4002(new class419(var2));
            this.field2697 = true;
            this.field2710 = true;
        }
    }

    @ObfuscatedName("hz.i(B)V")
    public void method4355() {
        this.field2696 = (short[][][]) null;
        this.field2705 = (short[][][]) null;
        this.field2700 = (byte[][][]) null;
        this.field2707 = (byte[][][]) null;
        this.field2706 = (class229[][][][]) null;
        this.field2697 = false;
        this.field2710 = false;
    }

    @ObfuscatedName("hz.y(IILpi;I)V")
    public void method4357(int arg0, int arg1, class419 arg2) {
        int var4 = arg2.method6781();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4359(arg0, arg1, arg2, var4);
        } else {
            this.method4358(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("hz.ah(IILpi;II)V")
    public void method4358(int arg0, int arg1, class419 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2705[0][arg0][arg1] = (short) arg2.method6781();
        }
        this.field2696[0][arg0][arg1] = (short) arg2.method6781();
    }

    @ObfuscatedName("hz.ao(IILpi;IB)V")
    public void method4359(int arg0, int arg1, class419 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2696[0][arg0][arg1] = (short) arg2.method6781();
        if (var6) {
            int var8 = arg2.method6781();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method6781();
                if (var10 != 0) {
                    this.field2705[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method6781();
                    this.field2700[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2707[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method6781();
            if (var13 != 0) {
                class229[] var14 = this.field2706[var12][arg0][arg1] = new class229[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method6708();
                    int var17 = arg2.method6781();
                    var14[var15] = new class229(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("hz.ab(I)I")
    public int method4360() {
        return this.field2698;
    }

    @ObfuscatedName("hz.an(I)I")
    public int method4372() {
        return this.field2701;
    }

    @ObfuscatedName("hz.b(Lpi;B)V")
    public abstract void method4002(class419 arg0);
}
