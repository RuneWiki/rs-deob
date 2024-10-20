package deob;

import java.util.LinkedList;

@ObfuscatedName("lq")
public abstract class class290 {

    @ObfuscatedName("lq.af")
    public int field3173;

    @ObfuscatedName("lq.aa")
    public int field3172;

    @ObfuscatedName("lq.at")
    public int field3184;

    @ObfuscatedName("lq.ab")
    public int field3174;

    @ObfuscatedName("lq.ac")
    public int field3175;

    @ObfuscatedName("lq.ao")
    public int field3176;

    @ObfuscatedName("lq.ah")
    public int field3178 = -1;

    @ObfuscatedName("lq.av")
    public int field3177 = -1;

    @ObfuscatedName("lq.aq")
    public short[][][] field3179;

    @ObfuscatedName("lq.ap")
    public short[][][] field3180;

    @ObfuscatedName("lq.ae")
    public byte[][][] field3171;

    @ObfuscatedName("lq.ax")
    public byte[][][] field3182;

    @ObfuscatedName("lq.ay")
    public class292[][][][] field3183;

    @ObfuscatedName("lq.au")
    public boolean field3181;

    @ObfuscatedName("lq.as")
    public boolean field3185;

    public class290() {
        new LinkedList();
        this.field3181 = false;
        this.field3185 = false;
    }

    @ObfuscatedName("lq.au(I)Z")
    public boolean method5393() {
        return this.field3181 && this.field3185;
    }

    @ObfuscatedName("lq.as(Lor;I)V")
    public void method5394(class387 arg0) {
        if (this.method5393()) {
            return;
        }
        byte[] var2 = arg0.method6573(this.field3178, this.field3177);
        if (var2 != null) {
            this.method5040(new class546(var2));
            this.field3181 = true;
            this.field3185 = true;
        }
    }

    @ObfuscatedName("lq.aw(I)V")
    public void method5410() {
        this.field3179 = (short[][][]) null;
        this.field3180 = (short[][][]) null;
        this.field3171 = (byte[][][]) null;
        this.field3182 = (byte[][][]) null;
        this.field3183 = (class292[][][][]) null;
        this.field3181 = false;
        this.field3185 = false;
    }

    @ObfuscatedName("lq.ad(IILua;B)V")
    public void method5406(int arg0, int arg1, class546 arg2) {
        int var4 = arg2.method8796();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method5398(arg0, arg1, arg2, var4);
        } else {
            this.method5400(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("lq.ai(IILua;II)V")
    public void method5400(int arg0, int arg1, class546 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field3180[0][arg0][arg1] = (short) arg2.method8798();
        }
        this.field3179[0][arg0][arg1] = (short) arg2.method8798();
    }

    @ObfuscatedName("lq.an(IILua;II)V")
    public void method5398(int arg0, int arg1, class546 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field3179[0][arg0][arg1] = (short) arg2.method8798();
        if (var6) {
            int var8 = arg2.method8796();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8798();
                if (var10 != 0) {
                    this.field3180[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8796();
                    this.field3171[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field3182[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8796();
            if (var13 != 0) {
                class292[] var14 = this.field3183[var12][arg0][arg1] = new class292[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8814();
                    int var17 = arg2.method8796();
                    var14[var15] = new class292(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("lq.am(I)I")
    public int method5392() {
        return this.field3184;
    }

    @ObfuscatedName("lq.ar(B)I")
    public int method5396() {
        return this.field3174;
    }

    @ObfuscatedName("lq.al(Lua;I)V")
    public abstract void method5040(class546 arg0);
}
