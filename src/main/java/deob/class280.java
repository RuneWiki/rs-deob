package deob;

import java.util.LinkedList;

@ObfuscatedName("kv")
public abstract class class280 {

    @ObfuscatedName("kv.ao")
    public int field3028;

    @ObfuscatedName("kv.ah")
    public int field3026;

    @ObfuscatedName("kv.ar")
    public int field3027;

    @ObfuscatedName("kv.ab")
    public int field3043;

    @ObfuscatedName("kv.am")
    public int field3029;

    @ObfuscatedName("kv.av")
    public int field3030;

    @ObfuscatedName("kv.ag")
    public int field3031 = -1;

    @ObfuscatedName("kv.aa")
    public int field3038 = -1;

    @ObfuscatedName("kv.ap")
    public short[][][] field3033;

    @ObfuscatedName("kv.ay")
    public short[][][] field3042;

    @ObfuscatedName("kv.as")
    public byte[][][] field3035;

    @ObfuscatedName("kv.aj")
    public byte[][][] field3036;

    @ObfuscatedName("kv.an")
    public class282[][][][] field3037;

    @ObfuscatedName("kv.au")
    public boolean field3025;

    @ObfuscatedName("kv.ai")
    public boolean field3039;

    public class280() {
        new LinkedList();
        this.field3025 = false;
        this.field3039 = false;
    }

    @ObfuscatedName("kv.at(I)Z")
    public boolean method5146() {
        return this.field3025 && this.field3039;
    }

    @ObfuscatedName("kv.af(Lom;I)V")
    public void method5137(class374 arg0) {
        if (this.method5146()) {
            return;
        }
        byte[] var2 = arg0.method6342(this.field3031, this.field3038);
        if (var2 != null) {
            this.method4783(new class530(var2));
            this.field3025 = true;
            this.field3039 = true;
        }
    }

    @ObfuscatedName("kv.ad(I)V")
    public void method5155() {
        this.field3033 = (short[][][]) null;
        this.field3042 = (short[][][]) null;
        this.field3035 = (byte[][][]) null;
        this.field3036 = (byte[][][]) null;
        this.field3037 = (class282[][][][]) null;
        this.field3025 = false;
        this.field3039 = false;
    }

    @ObfuscatedName("kv.bn(IILul;I)V")
    public void method5139(int arg0, int arg1, class530 arg2) {
        int var4 = arg2.method8365();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method5141(arg0, arg1, arg2, var4);
        } else {
            this.method5140(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("kv.bk(IILul;II)V")
    public void method5140(int arg0, int arg1, class530 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field3042[0][arg0][arg1] = (short) arg2.method8598();
        }
        this.field3033[0][arg0][arg1] = (short) arg2.method8598();
    }

    @ObfuscatedName("kv.by(IILul;II)V")
    public void method5141(int arg0, int arg1, class530 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field3033[0][arg0][arg1] = (short) arg2.method8598();
        if (var6) {
            int var8 = arg2.method8365();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8598();
                if (var10 != 0) {
                    this.field3042[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8365();
                    this.field3035[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field3036[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8365();
            if (var13 != 0) {
                class282[] var14 = this.field3037[var12][arg0][arg1] = new class282[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8385();
                    int var17 = arg2.method8365();
                    var14[var15] = new class282(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("kv.bd(B)I")
    public int method5138() {
        return this.field3027;
    }

    @ObfuscatedName("kv.be(I)I")
    public int method5143() {
        return this.field3043;
    }

    @ObfuscatedName("kv.al(Lul;I)V")
    public abstract void method4783(class530 arg0);
}
