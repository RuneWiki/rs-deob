package deob;

import java.util.LinkedList;

@ObfuscatedName("fy")
public abstract class class176 {

    @ObfuscatedName("fy.j")
    public int field2070;

    @ObfuscatedName("fy.o")
    public int field2060;

    @ObfuscatedName("fy.m")
    public int field2062;

    @ObfuscatedName("fy.r")
    public int field2063;

    @ObfuscatedName("fy.h")
    public int field2064;

    @ObfuscatedName("fy.d")
    public int field2065;

    @ObfuscatedName("fy.z")
    public int field2066 = -1;

    @ObfuscatedName("fy.b")
    public int field2072 = -1;

    @ObfuscatedName("fy.i")
    public short[][][] field2068;

    @ObfuscatedName("fy.k")
    public short[][][] field2071;

    @ObfuscatedName("fy.g")
    public byte[][][] field2069;

    @ObfuscatedName("fy.t")
    public byte[][][] field2075;

    @ObfuscatedName("fy.x")
    public class178[][][][] field2073;

    @ObfuscatedName("fy.u")
    public boolean field2067;

    @ObfuscatedName("fy.q")
    public boolean field2074;

    public class176() {
        new LinkedList();
        this.field2067 = false;
        this.field2074 = false;
    }

    @ObfuscatedName("fy.p(I)Z")
    public boolean method3314() {
        return this.field2067 && this.field2074;
    }

    @ObfuscatedName("fy.c(Ljp;I)V")
    public void method3290(class276 arg0) {
        if (this.method3314()) {
            return;
        }
        byte[] var2 = arg0.method4504(this.field2066, this.field2072);
        if (var2 != null) {
            this.method2942(new class384(var2));
            this.field2067 = true;
            this.field2074 = true;
        }
    }

    @ObfuscatedName("fy.n(B)V")
    public void method3291() {
        this.field2068 = (short[][][]) null;
        this.field2071 = (short[][][]) null;
        this.field2069 = (byte[][][]) null;
        this.field2075 = (byte[][][]) null;
        this.field2073 = (class178[][][][]) null;
        this.field2067 = false;
        this.field2074 = false;
    }

    @ObfuscatedName("fy.l(IILnt;B)V")
    public void method3292(int arg0, int arg1, class384 arg2) {
        int var4 = arg2.method5902();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method3300(arg0, arg1, arg2, var4);
        } else {
            this.method3293(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("fy.w(IILnt;IB)V")
    public void method3293(int arg0, int arg1, class384 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2071[0][arg0][arg1] = (short) arg2.method5902();
        }
        this.field2068[0][arg0][arg1] = (short) arg2.method5902();
    }

    @ObfuscatedName("fy.a(IILnt;II)V")
    public void method3300(int arg0, int arg1, class384 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2068[0][arg0][arg1] = (short) arg2.method5902();
        if (var6) {
            int var8 = arg2.method5902();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5902();
                if (var10 != 0) {
                    this.field2071[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5902();
                    this.field2069[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2075[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5902();
            if (var13 != 0) {
                class178[] var14 = this.field2073[var12][arg0][arg1] = new class178[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5914();
                    int var17 = arg2.method5902();
                    var14[var15] = new class178(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("fy.aw(I)I")
    public int method3309() {
        return this.field2062;
    }

    @ObfuscatedName("fy.ak(I)I")
    public int method3294() {
        return this.field2063;
    }

    @ObfuscatedName("fy.e(Lnt;I)V")
    public abstract void method2942(class384 arg0);
}
