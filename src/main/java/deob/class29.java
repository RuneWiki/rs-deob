package deob;

import java.util.LinkedList;

@ObfuscatedName("au")
public abstract class class29 {

    @ObfuscatedName("au.e")
    public int field412;

    @ObfuscatedName("au.n")
    public int field410;

    @ObfuscatedName("au.g")
    public int field405;

    @ObfuscatedName("au.y")
    public int field406;

    @ObfuscatedName("au.w")
    public int field403;

    @ObfuscatedName("au.k")
    public int field408;

    @ObfuscatedName("au.v")
    public short[][][] field409;

    @ObfuscatedName("au.z")
    public short[][][] field404;

    @ObfuscatedName("au.r")
    public byte[][][] field411;

    @ObfuscatedName("au.u")
    public byte[][][] field414;

    @ObfuscatedName("au.d")
    public class32[][][][] field413;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("au.g(IILfh;I)V")
    public void method216(int arg0, int arg1, class175 arg2) {
        int var4 = arg2.method2928();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method218(arg0, arg1, arg2, var4);
        } else {
            this.method227(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("au.y(IILfh;II)V")
    public void method227(int arg0, int arg1, class175 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field404[0][arg0][arg1] = (short) arg2.method2928();
        }
        this.field409[0][arg0][arg1] = (short) arg2.method2928();
    }

    @ObfuscatedName("au.w(IILfh;IB)V")
    public void method218(int arg0, int arg1, class175 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field409[0][arg0][arg1] = (short) arg2.method2928();
        if (var6) {
            int var8 = arg2.method2928();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2928();
                if (var10 != 0) {
                    this.field404[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2928();
                    this.field411[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field414[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2928();
            if (var13 != 0) {
                class32[] var14 = this.field413[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2943();
                    int var17 = arg2.method2928();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("au.k(IIB)I")
    public int method219(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field409[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("au.v(I)I")
    public int method228() {
        return this.field405;
    }

    @ObfuscatedName("au.z(I)I")
    public int method220() {
        return this.field406;
    }
}
