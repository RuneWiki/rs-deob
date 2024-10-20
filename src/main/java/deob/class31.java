package deob;

import java.util.LinkedList;

@ObfuscatedName("av")
public abstract class class31 {

    @ObfuscatedName("av.f")
    public int field200;

    @ObfuscatedName("av.b")
    public int field189;

    @ObfuscatedName("av.l")
    public int field194;

    @ObfuscatedName("av.m")
    public int field190;

    @ObfuscatedName("av.z")
    public int field191;

    @ObfuscatedName("av.q")
    public int field192;

    @ObfuscatedName("av.k")
    public int field193 = -1;

    @ObfuscatedName("av.c")
    public int field187 = -1;

    @ObfuscatedName("av.u")
    public short[][][] field195;

    @ObfuscatedName("av.t")
    public short[][][] field196;

    @ObfuscatedName("av.e")
    public byte[][][] field197;

    @ObfuscatedName("av.o")
    public byte[][][] field188;

    @ObfuscatedName("av.n")
    public class35[][][][] field198;

    @ObfuscatedName("av.x")
    public boolean field203;

    @ObfuscatedName("av.p")
    public boolean field201;

    public class31() {
        new LinkedList();
        this.field203 = false;
        this.field201 = false;
    }

    @ObfuscatedName("av.e(B)Z")
    public boolean method301() {
        return this.field203 && this.field201;
    }

    @ObfuscatedName("av.o(Liw;B)V")
    public void method302(class245 arg0) {
        if (this.method301()) {
            return;
        }
        byte[] var2 = arg0.method3905(this.field193, this.field187);
        if (var2 != null) {
            this.method223(new class311(var2));
            this.field203 = true;
            this.field201 = true;
        }
    }

    @ObfuscatedName("av.n(I)V")
    public void method303() {
        this.field195 = (short[][][]) null;
        this.field196 = (short[][][]) null;
        this.field197 = (byte[][][]) null;
        this.field188 = (byte[][][]) null;
        this.field198 = (class35[][][][]) null;
        this.field203 = false;
        this.field201 = false;
    }

    @ObfuscatedName("av.x(IILkb;I)V")
    public void method305(int arg0, int arg1, class311 arg2) {
        int var4 = arg2.method5276();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method306(arg0, arg1, arg2, var4);
        } else {
            this.method300(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("av.p(IILkb;IB)V")
    public void method300(int arg0, int arg1, class311 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field196[0][arg0][arg1] = (short) arg2.method5276();
        }
        this.field195[0][arg0][arg1] = (short) arg2.method5276();
    }

    @ObfuscatedName("av.r(IILkb;II)V")
    public void method306(int arg0, int arg1, class311 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field195[0][arg0][arg1] = (short) arg2.method5276();
        if (var6) {
            int var8 = arg2.method5276();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5276();
                if (var10 != 0) {
                    this.field196[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5276();
                    this.field197[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field188[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5276();
            if (var13 != 0) {
                class35[] var14 = this.field198[var12][arg0][arg1] = new class35[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5394();
                    int var17 = arg2.method5276();
                    var14[var15] = new class35(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("av.y(B)I")
    public int method307() {
        return this.field194;
    }

    @ObfuscatedName("av.s(B)I")
    public int method308() {
        return this.field190;
    }

    @ObfuscatedName("av.b(Lkb;I)V")
    public abstract void method223(class311 arg0);
}
