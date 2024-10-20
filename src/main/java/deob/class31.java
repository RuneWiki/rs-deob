package deob;

import java.util.LinkedList;

@ObfuscatedName("ax")
public abstract class class31 {

    @ObfuscatedName("ax.m")
    public int field181;

    @ObfuscatedName("ax.o")
    public int field190;

    @ObfuscatedName("ax.q")
    public int field178;

    @ObfuscatedName("ax.j")
    public int field182;

    @ObfuscatedName("ax.p")
    public int field192;

    @ObfuscatedName("ax.g")
    public int field187;

    @ObfuscatedName("ax.n")
    public int field177 = -1;

    @ObfuscatedName("ax.u")
    public int field183 = -1;

    @ObfuscatedName("ax.a")
    public short[][][] field184;

    @ObfuscatedName("ax.z")
    public short[][][] field185;

    @ObfuscatedName("ax.w")
    public byte[][][] field186;

    @ObfuscatedName("ax.y")
    public byte[][][] field176;

    @ObfuscatedName("ax.c")
    public class35[][][][] field188;

    @ObfuscatedName("ax.h")
    public boolean field189;

    @ObfuscatedName("ax.k")
    public boolean field180;

    public class31() {
        new LinkedList();
        this.field189 = false;
        this.field180 = false;
    }

    @ObfuscatedName("ax.u(I)Z")
    public boolean method281() {
        return this.field189 && this.field180;
    }

    @ObfuscatedName("ax.a(Lic;S)V")
    public void method282(class244 arg0) {
        if (this.method281()) {
            return;
        }
        byte[] var2 = arg0.method3891(this.field177, this.field183);
        if (var2 != null) {
            this.method202(new class310(var2));
            this.field189 = true;
            this.field180 = true;
        }
    }

    @ObfuscatedName("ax.z(I)V")
    public void method280() {
        this.field184 = (short[][][]) null;
        this.field185 = (short[][][]) null;
        this.field186 = (byte[][][]) null;
        this.field176 = (byte[][][]) null;
        this.field188 = (class35[][][][]) null;
        this.field189 = false;
        this.field180 = false;
    }

    @ObfuscatedName("ax.w(IILkn;I)V")
    public void method284(int arg0, int arg1, class310 arg2) {
        int var4 = arg2.method5227();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method286(arg0, arg1, arg2, var4);
        } else {
            this.method285(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ax.y(IILkn;II)V")
    public void method285(int arg0, int arg1, class310 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field185[0][arg0][arg1] = (short) arg2.method5227();
        }
        this.field184[0][arg0][arg1] = (short) arg2.method5227();
    }

    @ObfuscatedName("ax.c(IILkn;IB)V")
    public void method286(int arg0, int arg1, class310 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field184[0][arg0][arg1] = (short) arg2.method5227();
        if (var6) {
            int var8 = arg2.method5227();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5227();
                if (var10 != 0) {
                    this.field185[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5227();
                    this.field186[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field176[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5227();
            if (var13 != 0) {
                class35[] var14 = this.field188[var12][arg0][arg1] = new class35[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5353();
                    int var17 = arg2.method5227();
                    var14[var15] = new class35(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ax.h(B)I")
    public int method288() {
        return this.field178;
    }

    @ObfuscatedName("ax.k(B)I")
    public int method289() {
        return this.field182;
    }

    @ObfuscatedName("ax.o(Lkn;I)V")
    public abstract void method202(class310 arg0);
}
