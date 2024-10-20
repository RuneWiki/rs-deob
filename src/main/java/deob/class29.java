package deob;

import java.util.LinkedList;

@ObfuscatedName("ae")
public abstract class class29 {

    @ObfuscatedName("ae.b")
    public int field387;

    @ObfuscatedName("ae.s")
    public int field377;

    @ObfuscatedName("ae.r")
    public int field386;

    @ObfuscatedName("ae.g")
    public int field379;

    @ObfuscatedName("ae.x")
    public int field389;

    @ObfuscatedName("ae.f")
    public int field381;

    @ObfuscatedName("ae.u")
    public short[][][] field378;

    @ObfuscatedName("ae.t")
    public short[][][] field383;

    @ObfuscatedName("ae.k")
    public byte[][][] field384;

    @ObfuscatedName("ae.n")
    public byte[][][] field380;

    @ObfuscatedName("ae.d")
    public class32[][][][] field385;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("ae.x(IILfs;I)V")
    public void method206(int arg0, int arg1, class181 arg2) {
        int var4 = arg2.method2945();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method199(arg0, arg1, arg2, var4);
        } else {
            this.method198(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ae.f(IILfs;II)V")
    public void method198(int arg0, int arg1, class181 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field383[0][arg0][arg1] = (short) arg2.method2945();
        }
        this.field378[0][arg0][arg1] = (short) arg2.method2945();
    }

    @ObfuscatedName("ae.u(IILfs;II)V")
    public void method199(int arg0, int arg1, class181 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field378[0][arg0][arg1] = (short) arg2.method2945();
        if (var6) {
            int var8 = arg2.method2945();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2945();
                if (var10 != 0) {
                    this.field383[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2945();
                    this.field384[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field380[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2945();
            if (var13 != 0) {
                class32[] var14 = this.field385[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2960();
                    int var17 = arg2.method2945();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ae.t(IIS)I")
    public int method200(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field378[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ae.k(I)I")
    public int method201() {
        return this.field386;
    }

    @ObfuscatedName("ae.n(I)I")
    public int method203() {
        return this.field379;
    }
}
