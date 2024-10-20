package deob;

import java.util.LinkedList;

@ObfuscatedName("jz")
public abstract class class258 {

    @ObfuscatedName("jz.au")
    public int field2996;

    @ObfuscatedName("jz.ab")
    public int field3001;

    @ObfuscatedName("jz.aq")
    public int field2988;

    @ObfuscatedName("jz.al")
    public int field2989;

    @ObfuscatedName("jz.at")
    public int field2990;

    @ObfuscatedName("jz.aa")
    public int field2995;

    @ObfuscatedName("jz.ay")
    public int field2992 = -1;

    @ObfuscatedName("jz.ao")
    public int field2993 = -1;

    @ObfuscatedName("jz.ax")
    public short[][][] field2994;

    @ObfuscatedName("jz.ai")
    public short[][][] field2987;

    @ObfuscatedName("jz.ag")
    public byte[][][] field2991;

    @ObfuscatedName("jz.ah")
    public byte[][][] field2997;

    @ObfuscatedName("jz.av")
    public class260[][][][] field2998;

    @ObfuscatedName("jz.ar")
    public boolean field2999;

    @ObfuscatedName("jz.am")
    public boolean field3000;

    public class258() {
        new LinkedList();
        this.field2999 = false;
        this.field3000 = false;
    }

    @ObfuscatedName("jz.ae(I)Z")
    public boolean method4955() {
        return this.field2999 && this.field3000;
    }

    @ObfuscatedName("jz.ap(Lnm;B)V")
    public void method4956(class344 arg0) {
        if (this.method4955()) {
            return;
        }
        byte[] var2 = arg0.method6090(this.field2992, this.field2993);
        if (var2 != null) {
            this.method4632(new class489(var2));
            this.field2999 = true;
            this.field3000 = true;
        }
    }

    @ObfuscatedName("jz.by(I)V")
    public void method4964() {
        this.field2994 = (short[][][]) null;
        this.field2987 = (short[][][]) null;
        this.field2991 = (byte[][][]) null;
        this.field2997 = (byte[][][]) null;
        this.field2998 = (class260[][][][]) null;
        this.field2999 = false;
        this.field3000 = false;
    }

    @ObfuscatedName("jz.bb(IILsg;I)V")
    public void method4957(int arg0, int arg1, class489 arg2) {
        int var4 = arg2.method8248();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4960(arg0, arg1, arg2, var4);
        } else {
            this.method4959(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("jz.bi(IILsg;IB)V")
    public void method4959(int arg0, int arg1, class489 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2987[0][arg0][arg1] = (short) arg2.method8250();
        }
        this.field2994[0][arg0][arg1] = (short) arg2.method8250();
    }

    @ObfuscatedName("jz.be(IILsg;II)V")
    public void method4960(int arg0, int arg1, class489 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2994[0][arg0][arg1] = (short) arg2.method8250();
        if (var6) {
            int var8 = arg2.method8248();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8250();
                if (var10 != 0) {
                    this.field2987[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8248();
                    this.field2991[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2997[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8248();
            if (var13 != 0) {
                class260[] var14 = this.field2998[var12][arg0][arg1] = new class260[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8300();
                    int var17 = arg2.method8248();
                    var14[var15] = new class260(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("jz.bk(I)I")
    public int method4961() {
        return this.field2988;
    }

    @ObfuscatedName("jz.bx(I)I")
    public int method4962() {
        return this.field2989;
    }

    @ObfuscatedName("jz.an(Lsg;S)V")
    public abstract void method4632(class489 arg0);
}
