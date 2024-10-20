package deob;

import java.util.LinkedList;

@ObfuscatedName("aj")
public abstract class class29 {

    @ObfuscatedName("aj.g")
    public int field406;

    @ObfuscatedName("aj.e")
    public int field400;

    @ObfuscatedName("aj.b")
    public int field411;

    @ObfuscatedName("aj.z")
    public int field399;

    @ObfuscatedName("aj.n")
    public int field403;

    @ObfuscatedName("aj.l")
    public int field404;

    @ObfuscatedName("aj.s")
    public short[][][] field405;

    @ObfuscatedName("aj.y")
    public short[][][] field401;

    @ObfuscatedName("aj.c")
    public byte[][][] field407;

    @ObfuscatedName("aj.h")
    public byte[][][] field408;

    @ObfuscatedName("aj.i")
    public class32[][][][] field409;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("aj.n(IILgg;I)V")
    public void method208(int arg0, int arg1, class195 arg2) {
        int var4 = arg2.method3332();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method216(arg0, arg1, arg2, var4);
        } else {
            this.method221(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("aj.l(IILgg;II)V")
    public void method221(int arg0, int arg1, class195 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field401[0][arg0][arg1] = (short) arg2.method3332();
        }
        this.field405[0][arg0][arg1] = (short) arg2.method3332();
    }

    @ObfuscatedName("aj.s(IILgg;II)V")
    public void method216(int arg0, int arg1, class195 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field405[0][arg0][arg1] = (short) arg2.method3332();
        if (var6) {
            int var8 = arg2.method3332();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3332();
                if (var10 != 0) {
                    this.field401[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3332();
                    this.field407[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field408[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3332();
            if (var13 != 0) {
                class32[] var14 = this.field409[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3324();
                    int var17 = arg2.method3332();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("aj.y(IIB)I")
    public int method211(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field405[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aj.c(I)I")
    public int method212() {
        return this.field411;
    }

    @ObfuscatedName("aj.o(I)I")
    public int method213() {
        return this.field399;
    }
}
