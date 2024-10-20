package deob;

import java.util.LinkedList;

@ObfuscatedName("ee")
public abstract class class153 {

    @ObfuscatedName("ee.b")
    public int field1700;

    @ObfuscatedName("ee.e")
    public int field1705;

    @ObfuscatedName("ee.k")
    public int field1692;

    @ObfuscatedName("ee.g")
    public int field1693;

    @ObfuscatedName("ee.h")
    public int field1694;

    @ObfuscatedName("ee.n")
    public int field1695;

    @ObfuscatedName("ee.l")
    public int field1696 = -1;

    @ObfuscatedName("ee.m")
    public int field1697 = -1;

    @ObfuscatedName("ee.d")
    public short[][][] field1698;

    @ObfuscatedName("ee.c")
    public short[][][] field1699;

    @ObfuscatedName("ee.j")
    public byte[][][] field1691;

    @ObfuscatedName("ee.r")
    public byte[][][] field1701;

    @ObfuscatedName("ee.q")
    public class155[][][][] field1702;

    @ObfuscatedName("ee.t")
    public boolean field1703;

    @ObfuscatedName("ee.v")
    public boolean field1704;

    public class153() {
        new LinkedList();
        this.field1703 = false;
        this.field1704 = false;
    }

    @ObfuscatedName("ee.t(I)Z")
    public boolean method2697() {
        return this.field1703 && this.field1704;
    }

    @ObfuscatedName("ee.v(Lir;I)V")
    public void method2691(class253 arg0) {
        if (this.method2697()) {
            return;
        }
        byte[] var2 = arg0.method3933(this.field1696, this.field1697);
        if (var2 != null) {
            this.method2347(new class382(var2));
            this.field1703 = true;
            this.field1704 = true;
        }
    }

    @ObfuscatedName("ee.x(S)V")
    public void method2692() {
        this.field1698 = (short[][][]) null;
        this.field1699 = (short[][][]) null;
        this.field1691 = (byte[][][]) null;
        this.field1701 = (byte[][][]) null;
        this.field1702 = (class155[][][][]) null;
        this.field1703 = false;
        this.field1704 = false;
    }

    @ObfuscatedName("ee.z(IILnu;B)V")
    public void method2693(int arg0, int arg1, class382 arg2) {
        int var4 = arg2.method5856();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method2695(arg0, arg1, arg2, var4);
        } else {
            this.method2694(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ee.i(IILnu;II)V")
    public void method2694(int arg0, int arg1, class382 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field1699[0][arg0][arg1] = (short) arg2.method5856();
        }
        this.field1698[0][arg0][arg1] = (short) arg2.method5856();
    }

    @ObfuscatedName("ee.a(IILnu;II)V")
    public void method2695(int arg0, int arg1, class382 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field1698[0][arg0][arg1] = (short) arg2.method5856();
        if (var6) {
            int var8 = arg2.method5856();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method5856();
                if (var10 != 0) {
                    this.field1699[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method5856();
                    this.field1691[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field1701[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method5856();
            if (var13 != 0) {
                class155[] var14 = this.field1702[var12][arg0][arg1] = new class155[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method5873();
                    int var17 = arg2.method5856();
                    var14[var15] = new class155(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ee.w(I)I")
    public int method2711() {
        return this.field1692;
    }

    @ObfuscatedName("ee.s(B)I")
    public int method2698() {
        return this.field1693;
    }

    @ObfuscatedName("ee.o(Lnu;I)V")
    public abstract void method2347(class382 arg0);
}
