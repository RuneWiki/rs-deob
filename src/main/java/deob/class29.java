package deob;

import java.util.LinkedList;

@ObfuscatedName("am")
public abstract class class29 {

    @ObfuscatedName("am.e")
    public int field417;

    @ObfuscatedName("am.o")
    public int field403;

    @ObfuscatedName("am.m")
    public int field402;

    @ObfuscatedName("am.g")
    public int field404;

    @ObfuscatedName("am.d")
    public int field406;

    @ObfuscatedName("am.b")
    public int field407;

    @ObfuscatedName("am.k")
    public short[][][] field408;

    @ObfuscatedName("am.f")
    public short[][][] field405;

    @ObfuscatedName("am.j")
    public byte[][][] field410;

    @ObfuscatedName("am.q")
    public byte[][][] field411;

    @ObfuscatedName("am.h")
    public class32[][][][] field412;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("am.d(IILfw;I)V")
    public void method213(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2891();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method199(arg0, arg1, arg2, var4);
        } else {
            this.method198(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("am.b(IILfw;IB)V")
    public void method198(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field405[0][arg0][arg1] = (short) arg2.method2891();
        }
        this.field408[0][arg0][arg1] = (short) arg2.method2891();
    }

    @ObfuscatedName("am.k(IILfw;II)V")
    public void method199(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field408[0][arg0][arg1] = (short) arg2.method2891();
        if (var6) {
            int var8 = arg2.method2891();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2891();
                if (var10 != 0) {
                    this.field405[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2891();
                    this.field410[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field411[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2891();
            if (var13 != 0) {
                class32[] var14 = this.field412[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3012();
                    int var17 = arg2.method2891();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("am.q(III)I")
    public int method210(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field408[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("am.h(B)I")
    public int method201() {
        return this.field402;
    }

    @ObfuscatedName("am.i(I)I")
    public int method202() {
        return this.field404;
    }
}
