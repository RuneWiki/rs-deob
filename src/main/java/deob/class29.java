package deob;

import java.util.LinkedList;

@ObfuscatedName("ag")
public abstract class class29 {

    @ObfuscatedName("ag.a")
    public int field384;

    @ObfuscatedName("ag.w")
    public int field375;

    @ObfuscatedName("ag.e")
    public int field381;

    @ObfuscatedName("ag.k")
    public int field377;

    @ObfuscatedName("ag.u")
    public int field378;

    @ObfuscatedName("ag.z")
    public int field379;

    @ObfuscatedName("ag.t")
    public short[][][] field380;

    @ObfuscatedName("ag.f")
    public short[][][] field376;

    @ObfuscatedName("ag.g")
    public byte[][][] field382;

    @ObfuscatedName("ag.j")
    public byte[][][] field383;

    @ObfuscatedName("ag.x")
    public class32[][][][] field385;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("ag.u(IILgh;B)V")
    public void method226(int arg0, int arg1, class185 arg2) {
        int var4 = arg2.method2962();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method210(arg0, arg1, arg2, var4);
        } else {
            this.method209(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ag.z(IILgh;II)V")
    public void method209(int arg0, int arg1, class185 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field376[0][arg0][arg1] = (short) arg2.method2962();
        }
        this.field380[0][arg0][arg1] = (short) arg2.method2962();
    }

    @ObfuscatedName("ag.t(IILgh;IB)V")
    public void method210(int arg0, int arg1, class185 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field380[0][arg0][arg1] = (short) arg2.method2962();
        if (var6) {
            int var8 = arg2.method2962();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2962();
                if (var10 != 0) {
                    this.field376[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2962();
                    this.field382[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field383[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2962();
            if (var13 != 0) {
                class32[] var14 = this.field385[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3073();
                    int var17 = arg2.method2962();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ag.f(III)I")
    public int method207(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field380[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ag.g(I)I")
    public int method212() {
        return this.field381;
    }

    @ObfuscatedName("ag.x(I)I")
    public int method213() {
        return this.field377;
    }
}
