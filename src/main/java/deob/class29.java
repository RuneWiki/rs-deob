package deob;

import java.util.LinkedList;

@ObfuscatedName("ag")
public abstract class class29 {

    @ObfuscatedName("ag.o")
    public int field407;

    @ObfuscatedName("ag.k")
    public int field408;

    @ObfuscatedName("ag.t")
    public int field421;

    @ObfuscatedName("ag.d")
    public int field410;

    @ObfuscatedName("ag.h")
    public int field411;

    @ObfuscatedName("ag.m")
    public int field412;

    @ObfuscatedName("ag.z")
    public short[][][] field415;

    @ObfuscatedName("ag.i")
    public short[][][] field414;

    @ObfuscatedName("ag.u")
    public byte[][][] field409;

    @ObfuscatedName("ag.x")
    public byte[][][] field416;

    @ObfuscatedName("ag.y")
    public class32[][][][] field413;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("ag.h(IILgc;I)V")
    public void method238(int arg0, int arg1, class195 arg2) {
        int var4 = arg2.method3205();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method253(arg0, arg1, arg2, var4);
        } else {
            this.method239(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ag.m(IILgc;IB)V")
    public void method239(int arg0, int arg1, class195 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field414[0][arg0][arg1] = (short) arg2.method3205();
        }
        this.field415[0][arg0][arg1] = (short) arg2.method3205();
    }

    @ObfuscatedName("ag.z(IILgc;II)V")
    public void method253(int arg0, int arg1, class195 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field415[0][arg0][arg1] = (short) arg2.method3205();
        if (var6) {
            int var8 = arg2.method3205();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3205();
                if (var10 != 0) {
                    this.field414[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3205();
                    this.field409[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field416[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3205();
            if (var13 != 0) {
                class32[] var14 = this.field413[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3264();
                    int var17 = arg2.method3205();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ag.i(IIS)I")
    public int method256(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field415[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ag.u(I)I")
    public int method242() {
        return this.field421;
    }

    @ObfuscatedName("ag.x(I)I")
    public int method243() {
        return this.field410;
    }
}
