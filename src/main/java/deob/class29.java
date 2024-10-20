package deob;

import java.util.LinkedList;

@ObfuscatedName("au")
public abstract class class29 {

    @ObfuscatedName("au.a")
    public int field404;

    @ObfuscatedName("au.j")
    public int field401;

    @ObfuscatedName("au.n")
    public int field402;

    @ObfuscatedName("au.r")
    public int field400;

    @ObfuscatedName("au.v")
    public int field408;

    @ObfuscatedName("au.e")
    public int field405;

    @ObfuscatedName("au.l")
    public short[][][] field406;

    @ObfuscatedName("au.s")
    public short[][][] field411;

    @ObfuscatedName("au.w")
    public byte[][][] field407;

    @ObfuscatedName("au.p")
    public byte[][][] field409;

    @ObfuscatedName("au.m")
    public class32[][][][] field410;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("au.v(IILfe;I)V")
    public void method210(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2871();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method212(arg0, arg1, arg2, var4);
        } else {
            this.method222(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("au.e(IILfe;II)V")
    public void method222(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field411[0][arg0][arg1] = (short) arg2.method2871();
        }
        this.field406[0][arg0][arg1] = (short) arg2.method2871();
    }

    @ObfuscatedName("au.l(IILfe;II)V")
    public void method212(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field406[0][arg0][arg1] = (short) arg2.method2871();
        if (var6) {
            int var8 = arg2.method2871();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2871();
                if (var10 != 0) {
                    this.field411[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2871();
                    this.field407[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field409[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2871();
            if (var13 != 0) {
                class32[] var14 = this.field410[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2954();
                    int var17 = arg2.method2871();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("au.s(III)I")
    public int method213(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field406[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("au.w(I)I")
    public int method214() {
        return this.field402;
    }

    @ObfuscatedName("au.p(I)I")
    public int method225() {
        return this.field400;
    }
}
