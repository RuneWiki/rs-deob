package deob;

import java.util.LinkedList;

@ObfuscatedName("au")
public abstract class class31 {

    @ObfuscatedName("au.h")
    public int field188;

    @ObfuscatedName("au.v")
    public int field183;

    @ObfuscatedName("au.x")
    public int field181;

    @ObfuscatedName("au.w")
    public int field189;

    @ObfuscatedName("au.t")
    public int field182;

    @ObfuscatedName("au.j")
    public int field190;

    @ObfuscatedName("au.n")
    public int field184 = -1;

    @ObfuscatedName("au.p")
    public int field185 = -1;

    @ObfuscatedName("au.l")
    public short[][][] field186;

    @ObfuscatedName("au.z")
    public short[][][] field187;

    @ObfuscatedName("au.u")
    public byte[][][] field179;

    @ObfuscatedName("au.e")
    public byte[][][] field178;

    @ObfuscatedName("au.m")
    public class35[][][][] field180;

    @ObfuscatedName("au.c")
    public boolean field191;

    @ObfuscatedName("au.i")
    public boolean field192;

    public class31() {
        new LinkedList();
        this.field191 = false;
        this.field192 = false;
    }

    @ObfuscatedName("au.z(I)Z")
    public boolean method281() {
        return this.field191 && this.field192;
    }

    @ObfuscatedName("au.u(Lib;I)V")
    public void method290(class245 arg0) {
        if (this.method281()) {
            return;
        }
        byte[] var2 = arg0.method3834(this.field184, this.field185);
        if (var2 != null) {
            this.method206(new class311(var2));
            this.field191 = true;
            this.field192 = true;
        }
    }

    @ObfuscatedName("au.e(B)V")
    public void method278() {
        this.field186 = (short[][][]) null;
        this.field187 = (short[][][]) null;
        this.field179 = (byte[][][]) null;
        this.field178 = (byte[][][]) null;
        this.field180 = (class35[][][][]) null;
        this.field191 = false;
        this.field192 = false;
    }

    @ObfuscatedName("au.m(IILkj;I)V")
    public void method279(int arg0, int arg1, class311 arg2) {
        int var4 = arg2.method5274();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method286(arg0, arg1, arg2, var4);
        } else {
            this.method280(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("au.c(IILkj;II)V")
    public void method280(int arg0, int arg1, class311 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field187[0][arg0][arg1] = (short) arg2.method5274();
        }
        this.field186[0][arg0][arg1] = (short) arg2.method5274();
    }

    @ObfuscatedName("au.i(IILkj;II)V")
    public void method286(int arg0, int arg1, class311 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field186[0][arg0][arg1] = (short) arg2.method5274();
        if (var6) {
            int var8 = arg2.method5274();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5274();
                if (var10 != 0) {
                    this.field187[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5274();
                    this.field179[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field178[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5274();
            if (var13 != 0) {
                class35[] var14 = this.field180[var12][arg0][arg1] = new class35[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5132();
                    int var17 = arg2.method5274();
                    var14[var15] = new class35(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("au.f(I)I")
    public int method282() {
        return this.field181;
    }

    @ObfuscatedName("au.y(S)I")
    public int method283() {
        return this.field189;
    }

    @ObfuscatedName("au.v(Lkj;I)V")
    public abstract void method206(class311 arg0);
}
