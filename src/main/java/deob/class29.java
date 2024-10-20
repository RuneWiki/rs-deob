package deob;

import java.util.LinkedList;

@ObfuscatedName("an")
public abstract class class29 {

    @ObfuscatedName("an.j")
    public int field417;

    @ObfuscatedName("an.h")
    public int field412;

    @ObfuscatedName("an.f")
    public int field425;

    @ObfuscatedName("an.p")
    public int field414;

    @ObfuscatedName("an.x")
    public int field415;

    @ObfuscatedName("an.g")
    public int field416;

    @ObfuscatedName("an.c")
    public short[][][] field420;

    @ObfuscatedName("an.l")
    public short[][][] field418;

    @ObfuscatedName("an.w")
    public byte[][][] field413;

    @ObfuscatedName("an.b")
    public byte[][][] field424;

    @ObfuscatedName("an.o")
    public class32[][][][] field421;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("an.p(IILfb;S)V")
    public void method222(int arg0, int arg1, class175 arg2) {
        int var4 = arg2.method2903();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method239(arg0, arg1, arg2, var4);
        } else {
            this.method223(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("an.x(IILfb;II)V")
    public void method223(int arg0, int arg1, class175 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field418[0][arg0][arg1] = (short) arg2.method2903();
        }
        this.field420[0][arg0][arg1] = (short) arg2.method2903();
    }

    @ObfuscatedName("an.g(IILfb;II)V")
    public void method239(int arg0, int arg1, class175 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field420[0][arg0][arg1] = (short) arg2.method2903();
        if (var6) {
            int var8 = arg2.method2903();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2903();
                if (var10 != 0) {
                    this.field418[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2903();
                    this.field413[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field424[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2903();
            if (var13 != 0) {
                class32[] var14 = this.field421[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2918();
                    int var17 = arg2.method2903();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("an.c(III)I")
    public int method224(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field420[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("an.l(I)I")
    public int method221() {
        return this.field425;
    }

    @ObfuscatedName("an.w(I)I")
    public int method225() {
        return this.field414;
    }
}
