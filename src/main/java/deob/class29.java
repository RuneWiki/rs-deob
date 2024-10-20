package deob;

import java.util.LinkedList;

@ObfuscatedName("an")
public abstract class class29 {

    @ObfuscatedName("an.i")
    public int field410;

    @ObfuscatedName("an.c")
    public int field418;

    @ObfuscatedName("an.e")
    public int field409;

    @ObfuscatedName("an.v")
    public int field416;

    @ObfuscatedName("an.b")
    public int field411;

    @ObfuscatedName("an.y")
    public int field412;

    @ObfuscatedName("an.h")
    public short[][][] field413;

    @ObfuscatedName("an.x")
    public short[][][] field414;

    @ObfuscatedName("an.f")
    public byte[][][] field408;

    @ObfuscatedName("an.n")
    public byte[][][] field407;

    @ObfuscatedName("an.a")
    public class32[][][][] field417;

    public class29() {
        new LinkedList();
    }

    @ObfuscatedName("an.y(IILfx;I)V")
    public void method218(int arg0, int arg1, class174 arg2) {
        int var4 = arg2.method2870();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method198(arg0, arg1, arg2, var4);
        } else {
            this.method197(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("an.h(IILfx;II)V")
    public void method197(int arg0, int arg1, class174 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field414[0][arg0][arg1] = (short) arg2.method2870();
        }
        this.field413[0][arg0][arg1] = (short) arg2.method2870();
    }

    @ObfuscatedName("an.x(IILfx;II)V")
    public void method198(int arg0, int arg1, class174 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field413[0][arg0][arg1] = (short) arg2.method2870();
        if (var6) {
            int var8 = arg2.method2870();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method2870();
                if (var10 != 0) {
                    this.field414[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method2870();
                    this.field408[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field407[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method2870();
            if (var13 != 0) {
                class32[] var14 = this.field417[var12][arg0][arg1] = new class32[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method2885();
                    int var17 = arg2.method2870();
                    var14[var15] = new class32(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("an.f(IIB)I")
    public int method199(int arg0, int arg1) {
        if (arg0 >= 0 && arg1 >= 0) {
            return arg0 < 64 && arg1 < 64 ? this.field413[0][arg0][arg1] - 1 : -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("an.n(I)I")
    public int method200() {
        return this.field409;
    }

    @ObfuscatedName("an.a(I)I")
    public int method201() {
        return this.field416;
    }
}
