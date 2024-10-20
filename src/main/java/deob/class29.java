package deob;

import java.util.LinkedList;

@ObfuscatedName("ax")
public abstract class class29 {

    @ObfuscatedName("ax.d")
    public int field385;

    @ObfuscatedName("ax.q")
    public int field381;

    @ObfuscatedName("ax.x")
    public int field382;

    @ObfuscatedName("ax.y")
    public int field391;

    @ObfuscatedName("ax.e")
    public int field384;

    @ObfuscatedName("ax.f")
    public int field383;

    @ObfuscatedName("ax.v")
    public short[][][] field386;

    @ObfuscatedName("ax.t")
    public short[][][] field387;

    @ObfuscatedName("ax.i")
    public byte[][][] field389;

    @ObfuscatedName("ax.r")
    public byte[][][] field388;

    @ObfuscatedName("ax.g")
    public class32[][][][] field390;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("ax.e(IILfw;I)V")
    public void method201(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2921();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method222(arg0, arg1, arg2, var4);
        } else {
            this.method202(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ax.f(IILfw;II)V")
    public void method202(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field387[0][arg0][arg1] = (short) arg2.method2921();
        }
        this.field386[0][arg0][arg1] = (short) arg2.method2921();
    }

    @ObfuscatedName("ax.v(IILfw;II)V")
    public void method222(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field386[0][arg0][arg1] = (short) arg2.method2921();
        if (var6) {
            int var8 = arg2.method2921();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2921();
                if (var10 != 0) {
                    this.field387[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2921();
                    this.field389[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field388[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2921();
            if (var13 != 0) {
                class32[] var14 = this.field390[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2929();
                    int var17 = arg2.method2921();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ax.t(III)I")
    public int method204(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field386[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ax.i(I)I")
    public int method205() {
        return this.field382;
    }

    @ObfuscatedName("ax.r(I)I")
    public int method215() {
        return this.field391;
    }
}
