package deob;

import java.util.LinkedList;

@ObfuscatedName("js")
public abstract class class254 {

    @ObfuscatedName("js.an")
    public int field2944;

    @ObfuscatedName("js.ao")
    public int field2941;

    @ObfuscatedName("js.av")
    public int field2942;

    @ObfuscatedName("js.aq")
    public int field2943;

    @ObfuscatedName("js.ap")
    public int field2957;

    @ObfuscatedName("js.ar")
    public int field2945;

    @ObfuscatedName("js.ak")
    public int field2949 = -1;

    @ObfuscatedName("js.ax")
    public int field2946 = -1;

    @ObfuscatedName("js.as")
    public short[][][] field2948;

    @ObfuscatedName("js.ay")
    public short[][][] field2940;

    @ObfuscatedName("js.am")
    public byte[][][] field2950;

    @ObfuscatedName("js.az")
    public byte[][][] field2953;

    @ObfuscatedName("js.ae")
    public class256[][][][] field2952;

    @ObfuscatedName("js.au")
    public boolean field2947;

    @ObfuscatedName("js.ag")
    public boolean field2954;

    public class254() {
        new LinkedList();
        this.field2947 = false;
        this.field2954 = false;
    }

    @ObfuscatedName("js.aa(B)Z")
    public boolean method4756() {
        return this.field2947 && this.field2954;
    }

    @ObfuscatedName("js.ah(Lne;I)V")
    public void method4757(class340 arg0) {
        if (this.method4756()) {
            return;
        }
        byte[] var2 = arg0.method5860(this.field2949, this.field2946);
        if (var2 != null) {
            this.method4403(new class478(var2));
            this.field2947 = true;
            this.field2954 = true;
        }
    }

    @ObfuscatedName("js.ad(B)V")
    public void method4758() {
        this.field2948 = (short[][][]) null;
        this.field2940 = (short[][][]) null;
        this.field2950 = (byte[][][]) null;
        this.field2953 = (byte[][][]) null;
        this.field2952 = (class256[][][][]) null;
        this.field2947 = false;
        this.field2954 = false;
    }

    @ObfuscatedName("js.bm(IILsy;I)V")
    public void method4770(int arg0, int arg1, class478 arg2) {
        int var4 = arg2.method7909();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method4763(arg0, arg1, arg2, var4);
        } else {
            this.method4760(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("js.bv(IILsy;II)V")
    public void method4760(int arg0, int arg1, class478 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field2940[0][arg0][arg1] = (short) arg2.method7905();
        }
        this.field2948[0][arg0][arg1] = (short) arg2.method7905();
    }

    @ObfuscatedName("js.bo(IILsy;II)V")
    public void method4763(int arg0, int arg1, class478 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field2948[0][arg0][arg1] = (short) arg2.method7905();
        if (var6) {
            int var8 = arg2.method7909();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method7905();
                if (var10 != 0) {
                    this.field2940[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method7909();
                    this.field2950[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field2953[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method7909();
            if (var13 != 0) {
                class256[] var14 = this.field2952[var12][arg0][arg1] = new class256[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method7922();
                    int var17 = arg2.method7909();
                    var14[var15] = new class256(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("js.bs(I)I")
    public int method4764() {
        return this.field2942;
    }

    @ObfuscatedName("js.bg(I)I")
    public int method4762() {
        return this.field2943;
    }

    @ObfuscatedName("js.al(Lsy;I)V")
    public abstract void method4403(class478 arg0);
}
