package deob;

import java.util.LinkedList;

@ObfuscatedName("aa")
public abstract class class29 {

    @ObfuscatedName("aa.d")
    public int field392;

    @ObfuscatedName("aa.x")
    public int field380;

    @ObfuscatedName("aa.k")
    public int field386;

    @ObfuscatedName("aa.z")
    public int field382;

    @ObfuscatedName("aa.v")
    public int field390;

    @ObfuscatedName("aa.m")
    public int field384;

    @ObfuscatedName("aa.b")
    public short[][][] field385;

    @ObfuscatedName("aa.t")
    public short[][][] field387;

    @ObfuscatedName("aa.p")
    public byte[][][] field379;

    @ObfuscatedName("aa.r")
    public byte[][][] field388;

    @ObfuscatedName("aa.l")
    public class32[][][][] field389;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("aa.z(IILfr;I)V")
    public void method208(int arg0, int arg1, class181 arg2) {
        int var4 = arg2.method3204();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method210(arg0, arg1, arg2, var4);
        } else {
            this.method209(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("aa.v(IILfr;II)V")
    public void method209(int arg0, int arg1, class181 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field387[0][arg0][arg1] = (short) arg2.method3204();
        }
        this.field385[0][arg0][arg1] = (short) arg2.method3204();
    }

    @ObfuscatedName("aa.m(IILfr;II)V")
    public void method210(int arg0, int arg1, class181 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field385[0][arg0][arg1] = (short) arg2.method3204();
        if (var6) {
            int var8 = arg2.method3204();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3204();
                if (var10 != 0) {
                    this.field387[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3204();
                    this.field379[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field388[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3204();
            if (var13 != 0) {
                class32[] var14 = this.field389[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3184();
                    int var17 = arg2.method3204();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("aa.b(III)I")
    public int method221(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field385[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("aa.t(S)I")
    public int method211() {
        return this.field386;
    }

    @ObfuscatedName("aa.p(B)I")
    public int method212() {
        return this.field382;
    }
}
