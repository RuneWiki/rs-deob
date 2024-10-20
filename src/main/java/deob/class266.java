package deob;

import java.util.LinkedList;

@ObfuscatedName("ke")
public abstract class class266 {

    @ObfuscatedName("ke.ac")
    public int field3009;

    @ObfuscatedName("ke.ai")
    public int field3007;

    @ObfuscatedName("ke.az")
    public int field3002;

    @ObfuscatedName("ke.ap")
    public int field3010;

    @ObfuscatedName("ke.aa")
    public int field3004;

    @ObfuscatedName("ke.af")
    public int field3005;

    @ObfuscatedName("ke.ad")
    public int field3011 = -1;

    @ObfuscatedName("ke.aq")
    public int field3000 = -1;

    @ObfuscatedName("ke.al")
    public short[][][] field3008;

    @ObfuscatedName("ke.an")
    public short[][][] field3006;

    @ObfuscatedName("ke.ar")
    public byte[][][] field3015;

    @ObfuscatedName("ke.ab")
    public byte[][][] field3001;

    @ObfuscatedName("ke.ag")
    public class268[][][][] field3012;

    @ObfuscatedName("ke.am")
    public boolean field3013;

    @ObfuscatedName("ke.ax")
    public boolean field3014;

    public class266() {
        new LinkedList();
        this.field3013 = false;
        this.field3014 = false;
    }

    @ObfuscatedName("ke.aw(I)Z")
    public boolean method5011() {
        return this.field3013 && this.field3014;
    }

    @ObfuscatedName("ke.ak(Lnu;I)V")
    public void method5012(class359 arg0) {
        if (this.method5011()) {
            return;
        }
        byte[] var2 = arg0.method6128(this.field3011, this.field3000);
        if (var2 != null) {
            this.method4666(new class515(var2));
            this.field3013 = true;
            this.field3014 = true;
        }
    }

    @ObfuscatedName("ke.bh(I)V")
    public void method5013() {
        this.field3008 = (short[][][]) null;
        this.field3006 = (short[][][]) null;
        this.field3015 = (byte[][][]) null;
        this.field3001 = (byte[][][]) null;
        this.field3012 = (class268[][][][]) null;
        this.field3013 = false;
        this.field3014 = false;
    }

    @ObfuscatedName("ke.bj(IILtm;I)V")
    public void method5015(int arg0, int arg1, class515 arg2) {
        int var4 = arg2.method8300();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method5036(arg0, arg1, arg2, var4);
        } else {
            this.method5014(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("ke.bk(IILtm;IS)V")
    public void method5014(int arg0, int arg1, class515 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field3006[0][arg0][arg1] = (short) arg2.method8448();
        }
        this.field3008[0][arg0][arg1] = (short) arg2.method8448();
    }

    @ObfuscatedName("ke.bv(IILtm;II)V")
    public void method5036(int arg0, int arg1, class515 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field3008[0][arg0][arg1] = (short) arg2.method8448();
        if (var6) {
            int var8 = arg2.method8300();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8448();
                if (var10 != 0) {
                    this.field3006[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8300();
                    this.field3015[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field3001[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8300();
            if (var13 != 0) {
                class268[] var14 = this.field3012[var12][arg0][arg1] = new class268[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8440();
                    int var17 = arg2.method8300();
                    var14[var15] = new class268(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("ke.bt(I)I")
    public int method5016() {
        return this.field3002;
    }

    @ObfuscatedName("ke.bd(I)I")
    public int method5026() {
        return this.field3010;
    }

    @ObfuscatedName("ke.ae(Ltm;I)V")
    public abstract void method4666(class515 arg0);
}
