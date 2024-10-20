package deob;

import java.util.LinkedList;

@ObfuscatedName("az")
public abstract class class29 {

    @ObfuscatedName("az.i")
    public int field410;

    @ObfuscatedName("az.h")
    public int field405;

    @ObfuscatedName("az.u")
    public int field408;

    @ObfuscatedName("az.q")
    public int field407;

    @ObfuscatedName("az.g")
    public int field411;

    @ObfuscatedName("az.v")
    public int field409;

    @ObfuscatedName("az.t")
    public short[][][] field406;

    @ObfuscatedName("az.p")
    public short[][][] field404;

    @ObfuscatedName("az.l")
    public byte[][][] field412;

    @ObfuscatedName("az.a")
    public byte[][][] field413;

    @ObfuscatedName("az.k")
    public class32[][][][] field414;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("az.q(IILfv;B)V")
    public void method208(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2930();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method207(arg0, arg1, arg2, var4);
        } else {
            this.method206(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("az.g(IILfv;II)V")
    public void method206(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field404[0][arg0][arg1] = (short) arg2.method2930();
        }
        this.field406[0][arg0][arg1] = (short) arg2.method2930();
    }

    @ObfuscatedName("az.v(IILfv;II)V")
    public void method207(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field406[0][arg0][arg1] = (short) arg2.method2930();
        if (var6) {
            int var8 = arg2.method2930();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2930();
                if (var10 != 0) {
                    this.field404[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2930();
                    this.field412[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field413[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2930();
            if (var13 != 0) {
                class32[] var14 = this.field414[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2945();
                    int var17 = arg2.method2930();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("az.t(III)I")
    public int method211(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field406[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("az.p(I)I")
    public int method209() {
        return this.field408;
    }

    @ObfuscatedName("az.l(I)I")
    public int method210() {
        return this.field407;
    }
}
