package deob;

import java.util.LinkedList;

@ObfuscatedName("am")
public abstract class class29 {

    @ObfuscatedName("am.s")
    public int field409;

    @ObfuscatedName("am.c")
    public int field410;

    @ObfuscatedName("am.f")
    public int field411;

    @ObfuscatedName("am.m")
    public int field412;

    @ObfuscatedName("am.h")
    public int field413;

    @ObfuscatedName("am.t")
    public int field416;

    @ObfuscatedName("am.p")
    public short[][][] field415;

    @ObfuscatedName("am.d")
    public short[][][] field420;

    @ObfuscatedName("am.n")
    public byte[][][] field417;

    @ObfuscatedName("am.z")
    public byte[][][] field414;

    @ObfuscatedName("am.o")
    public class32[][][][] field419;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("am.h(IILfs;I)V")
    public void method222(int arg0, int arg1, class177 arg2) {
        int var4 = arg2.method2965();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method240(arg0, arg1, arg2, var4);
        } else {
            this.method223(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("am.t(IILfs;IS)V")
    public void method223(int arg0, int arg1, class177 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field420[0][arg0][arg1] = (short) arg2.method2965();
        }
        this.field415[0][arg0][arg1] = (short) arg2.method2965();
    }

    @ObfuscatedName("am.p(IILfs;II)V")
    public void method240(int arg0, int arg1, class177 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field415[0][arg0][arg1] = (short) arg2.method2965();
        if (var6) {
            int var8 = arg2.method2965();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2965();
                if (var10 != 0) {
                    this.field420[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2965();
                    this.field417[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field414[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2965();
            if (var13 != 0) {
                class32[] var14 = this.field419[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2980();
                    int var17 = arg2.method2965();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("am.d(III)I")
    public int method225(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field415[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("am.n(I)I")
    public int method226() {
        return this.field411;
    }

    @ObfuscatedName("am.z(B)I")
    public int method227() {
        return this.field412;
    }
}
