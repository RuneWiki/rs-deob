package deob;

import java.util.LinkedList;

@ObfuscatedName("s")
public abstract class class22 {

    @ObfuscatedName("s.n")
    public int field164;

    @ObfuscatedName("s.h")
    public int field149;

    @ObfuscatedName("s.l")
    public int field152;

    @ObfuscatedName("s.g")
    public int field151;

    @ObfuscatedName("s.b")
    public int field160;

    @ObfuscatedName("s.a")
    public int field161;

    @ObfuscatedName("s.c")
    public int field154 = -1;

    @ObfuscatedName("s.z")
    public int field155 = -1;

    @ObfuscatedName("s.j")
    public short[][][] field148;

    @ObfuscatedName("s.d")
    public short[][][] field157;

    @ObfuscatedName("s.t")
    public byte[][][] field158;

    @ObfuscatedName("s.f")
    public byte[][][] field159;

    @ObfuscatedName("s.i")
    public class26[][][][] field153;

    @ObfuscatedName("s.m")
    public boolean field150;

    @ObfuscatedName("s.v")
    public boolean field162;

    public class22() {
        new LinkedList();
        this.field150 = false;
        this.field162 = false;
    }

    @ObfuscatedName("s.j(B)Z")
    public boolean method258() {
        return this.field150 && this.field162;
    }

    @ObfuscatedName("s.d(Lij;B)V")
    public void method233(class254 arg0) {
        if (this.method258()) {
            return;
        }
        byte[] var2 = arg0.method4494(this.field154, this.field155);
        if (var2 != null) {
            this.method161(new class190(var2));
            this.field150 = true;
            this.field162 = true;
        }
    }

    @ObfuscatedName("s.i(I)V")
    public void method234() {
        this.field148 = (short[][][]) null;
        this.field157 = (short[][][]) null;
        this.field158 = (byte[][][]) null;
        this.field159 = (byte[][][]) null;
        this.field153 = (class26[][][][]) null;
        this.field150 = false;
        this.field162 = false;
    }

    @ObfuscatedName("s.m(IILgc;I)V")
    public void method235(int arg0, int arg1, class190 arg2) {
        int var4 = arg2.method3511();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method236(arg0, arg1, arg2, var4);
        } else {
            this.method250(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("s.v(IILgc;IB)V")
    public void method250(int arg0, int arg1, class190 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field157[0][arg0][arg1] = (short) arg2.method3511();
        }
        this.field148[0][arg0][arg1] = (short) arg2.method3511();
    }

    @ObfuscatedName("s.r(IILgc;II)V")
    public void method236(int arg0, int arg1, class190 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field148[0][arg0][arg1] = (short) arg2.method3511();
        if (var6) {
            int var8 = arg2.method3511();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3511();
                if (var10 != 0) {
                    this.field157[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3511();
                    this.field158[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field159[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3511();
            if (var13 != 0) {
                class26[] var14 = this.field153[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3516();
                    int var17 = arg2.method3511();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("s.x(I)I")
    public int method237() {
        return this.field152;
    }

    @ObfuscatedName("s.y(I)I")
    public int method262() {
        return this.field151;
    }

    @ObfuscatedName("s.h(Lgc;I)V")
    public abstract void method161(class190 arg0);
}
