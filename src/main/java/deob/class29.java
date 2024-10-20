package deob;

import java.util.LinkedList;

@ObfuscatedName("ad")
public abstract class class29 {

    @ObfuscatedName("ad.n")
    public int field412;

    @ObfuscatedName("ad.p")
    public int field411;

    @ObfuscatedName("ad.i")
    public int field419;

    @ObfuscatedName("ad.j")
    public int field413;

    @ObfuscatedName("ad.f")
    public int field414;

    @ObfuscatedName("ad.m")
    public int field415;

    @ObfuscatedName("ad.c")
    public short[][][] field410;

    @ObfuscatedName("ad.z")
    public short[][][] field417;

    @ObfuscatedName("ad.h")
    public byte[][][] field418;

    @ObfuscatedName("ad.g")
    public byte[][][] field421;

    @ObfuscatedName("ad.e")
    public class32[][][][] field420;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("ad.j(IILfl;I)V")
    public void method222(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2925();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method238(arg0, arg1, arg2, var4);
        } else {
            this.method225(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ad.f(IILfl;IB)V")
    public void method225(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field417[0][arg0][arg1] = (short) arg2.method2925();
        }
        this.field410[0][arg0][arg1] = (short) arg2.method2925();
    }

    @ObfuscatedName("ad.m(IILfl;II)V")
    public void method238(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field410[0][arg0][arg1] = (short) arg2.method2925();
        if (var6) {
            int var8 = arg2.method2925();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2925();
                if (var10 != 0) {
                    this.field417[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2925();
                    this.field418[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field421[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2925();
            if (var13 != 0) {
                class32[] var14 = this.field420[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3100();
                    int var17 = arg2.method2925();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ad.c(III)I")
    public int method237(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field410[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ad.z(B)I")
    public int method223() {
        return this.field419;
    }

    @ObfuscatedName("ad.h(I)I")
    public int method226() {
        return this.field413;
    }
}
