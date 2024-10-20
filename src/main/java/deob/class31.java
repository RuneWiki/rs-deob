package deob;

import java.util.LinkedList;

@ObfuscatedName("an")
public abstract class class31 {

    @ObfuscatedName("an.z")
    public int field184;

    @ObfuscatedName("an.k")
    public int field182;

    @ObfuscatedName("an.s")
    public int field198;

    @ObfuscatedName("an.t")
    public int field181;

    @ObfuscatedName("an.i")
    public int field188;

    @ObfuscatedName("an.o")
    public int field186;

    @ObfuscatedName("an.x")
    public int field187 = -1;

    @ObfuscatedName("an.w")
    public int field194 = -1;

    @ObfuscatedName("an.g")
    public short[][][] field191;

    @ObfuscatedName("an.m")
    public short[][][] field190;

    @ObfuscatedName("an.n")
    public byte[][][] field199;

    @ObfuscatedName("an.d")
    public byte[][][] field192;

    @ObfuscatedName("an.h")
    public class35[][][][] field193;

    @ObfuscatedName("an.a")
    public boolean field183;

    @ObfuscatedName("an.q")
    public boolean field195;

    public class31() {
        new LinkedList();
        this.field183 = false;
        this.field195 = false;
    }

    @ObfuscatedName("an.w(B)Z")
    public boolean method290() {
        return this.field183 && this.field195;
    }

    @ObfuscatedName("an.g(Lic;B)V")
    public void method315(class244 arg0) {
        if (this.method290()) {
            return;
        }
        byte[] var2 = arg0.method3873(this.field187, this.field194);
        if (var2 != null) {
            this.method219(new class310(var2));
            this.field183 = true;
            this.field195 = true;
        }
    }

    @ObfuscatedName("an.m(I)V")
    public void method292() {
        this.field191 = (short[][][]) null;
        this.field190 = (short[][][]) null;
        this.field199 = (byte[][][]) null;
        this.field192 = (byte[][][]) null;
        this.field193 = (class35[][][][]) null;
        this.field183 = false;
        this.field195 = false;
    }

    @ObfuscatedName("an.n(IILkf;I)V")
    public void method298(int arg0, int arg1, class310 arg2) {
        int var4 = arg2.method5193();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method295(arg0, arg1, arg2, var4);
        } else {
            this.method289(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("an.d(IILkf;II)V")
    public void method289(int arg0, int arg1, class310 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field190[0][arg0][arg1] = (short) arg2.method5193();
        }
        this.field191[0][arg0][arg1] = (short) arg2.method5193();
    }

    @ObfuscatedName("an.h(IILkf;II)V")
    public void method295(int arg0, int arg1, class310 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field191[0][arg0][arg1] = (short) arg2.method5193();
        if (var6) {
            int var8 = arg2.method5193();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5193();
                if (var10 != 0) {
                    this.field190[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5193();
                    this.field199[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field192[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5193();
            if (var13 != 0) {
                class35[] var14 = this.field193[var12][arg0][arg1] = new class35[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5210();
                    int var17 = arg2.method5193();
                    var14[var15] = new class35(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("an.a(I)I")
    public int method294() {
        return this.field198;
    }

    @ObfuscatedName("an.q(I)I")
    public int method297() {
        return this.field181;
    }

    @ObfuscatedName("an.k(Lkf;I)V")
    public abstract void method219(class310 arg0);
}
