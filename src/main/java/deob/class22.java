package deob;

import java.util.LinkedList;

@ObfuscatedName("w")
public abstract class class22 {

    @ObfuscatedName("w.a")
    public int field174;

    @ObfuscatedName("w.s")
    public int field170;

    @ObfuscatedName("w.g")
    public int field171;

    @ObfuscatedName("w.x")
    public int field172;

    @ObfuscatedName("w.h")
    public int field173;

    @ObfuscatedName("w.f")
    public int field169;

    @ObfuscatedName("w.p")
    public int field175 = -1;

    @ObfuscatedName("w.m")
    public int field178 = -1;

    @ObfuscatedName("w.q")
    public short[][][] field189;

    @ObfuscatedName("w.b")
    public short[][][] field186;

    @ObfuscatedName("w.n")
    public byte[][][] field179;

    @ObfuscatedName("w.e")
    public byte[][][] field180;

    @ObfuscatedName("w.r")
    public class26[][][][] field181;

    @ObfuscatedName("w.t")
    public boolean field182;

    @ObfuscatedName("w.l")
    public boolean field183;

    public class22() {
        new LinkedList();
        this.field182 = false;
        this.field183 = false;
    }

    @ObfuscatedName("w.m(I)Z")
    public boolean method247() {
        return this.field182 && this.field183;
    }

    @ObfuscatedName("w.q(Liz;I)V")
    public void method246(class255 arg0) {
        if (this.method247()) {
            return;
        }
        byte[] var2 = arg0.method4422(this.field175, this.field178);
        if (var2 != null) {
            this.method168(new class190(var2));
            this.field182 = true;
            this.field183 = true;
        }
    }

    @ObfuscatedName("w.b(I)V")
    public void method249() {
        this.field189 = (short[][][]) null;
        this.field186 = (short[][][]) null;
        this.field179 = (byte[][][]) null;
        this.field180 = (byte[][][]) null;
        this.field181 = (class26[][][][]) null;
        this.field182 = false;
        this.field183 = false;
    }

    @ObfuscatedName("w.n(IILgx;B)V")
    public void method250(int arg0, int arg1, class190 arg2) {
        int var4 = arg2.method3443();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method252(arg0, arg1, arg2, var4);
        } else {
            this.method251(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("w.e(IILgx;II)V")
    public void method251(int arg0, int arg1, class190 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field186[0][arg0][arg1] = (short) arg2.method3443();
        }
        this.field189[0][arg0][arg1] = (short) arg2.method3443();
    }

    @ObfuscatedName("w.r(IILgx;II)V")
    public void method252(int arg0, int arg1, class190 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field189[0][arg0][arg1] = (short) arg2.method3443();
        if (var6) {
            int var8 = arg2.method3443();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method3443();
                if (var10 != 0) {
                    this.field186[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method3443();
                    this.field179[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field180[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method3443();
            if (var13 != 0) {
                class26[] var14 = this.field181[var12][arg0][arg1] = new class26[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method3656();
                    int var17 = arg2.method3443();
                    var14[var15] = new class26(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("w.t(B)I")
    public int method253() {
        return this.field171;
    }

    @ObfuscatedName("w.l(I)I")
    public int method254() {
        return this.field172;
    }

    @ObfuscatedName("w.s(Lgx;I)V")
    public abstract void method168(class190 arg0);
}
