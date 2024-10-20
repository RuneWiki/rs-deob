package deob;

import java.util.LinkedList;

@ObfuscatedName("la")
public abstract class class295 {

    @ObfuscatedName("la.ax")
    public int field3200;

    @ObfuscatedName("la.aq")
    public int field3191;

    @ObfuscatedName("la.af")
    public int field3190;

    @ObfuscatedName("la.at")
    public int field3193;

    @ObfuscatedName("la.au")
    public int field3194;

    @ObfuscatedName("la.ar")
    public int field3195;

    @ObfuscatedName("la.al")
    public int field3196 = -1;

    @ObfuscatedName("la.ad")
    public int field3197 = -1;

    @ObfuscatedName("la.ah")
    public short[][][] field3192;

    @ObfuscatedName("la.ap")
    public short[][][] field3199;

    @ObfuscatedName("la.ab")
    public byte[][][] field3198;

    @ObfuscatedName("la.az")
    public byte[][][] field3201;

    @ObfuscatedName("la.aa")
    public class297[][][][] field3202;

    @ObfuscatedName("la.ai")
    public boolean field3203;

    @ObfuscatedName("la.ao")
    public boolean field3204;

    public class295() {
        new LinkedList();
        this.field3203 = false;
        this.field3204 = false;
    }

    @ObfuscatedName("la.as(B)Z")
    public boolean method5569() {
        return this.field3203 && this.field3204;
    }

    @ObfuscatedName("la.ay(Lpo;B)V")
    public void method5570(class391 arg0) {
        if (this.method5569()) {
            return;
        }
        byte[] var2 = arg0.method6782(this.field3196, this.field3197);
        if (var2 != null) {
            this.method5225(new class551(var2));
            this.field3203 = true;
            this.field3204 = true;
        }
    }

    @ObfuscatedName("la.aj(I)V")
    public void method5589() {
        this.field3192 = (short[][][]) null;
        this.field3199 = (short[][][]) null;
        this.field3198 = (byte[][][]) null;
        this.field3201 = (byte[][][]) null;
        this.field3202 = (class297[][][][]) null;
        this.field3203 = false;
        this.field3204 = false;
    }

    @ObfuscatedName("la.av(IILvf;I)V")
    public void method5572(int arg0, int arg1, class551 arg2) {
        int var4 = arg2.method8955();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method5573(arg0, arg1, arg2, var4);
        } else {
            this.method5575(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("la.aw(IILvf;II)V")
    public void method5575(int arg0, int arg1, class551 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field3199[0][arg0][arg1] = (short) arg2.method9119();
        }
        this.field3192[0][arg0][arg1] = (short) arg2.method9119();
    }

    @ObfuscatedName("la.an(IILvf;II)V")
    public void method5573(int arg0, int arg1, class551 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field3192[0][arg0][arg1] = (short) arg2.method9119();
        if (var6) {
            int var8 = arg2.method8955();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method9119();
                if (var10 != 0) {
                    this.field3199[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method8955();
                    this.field3198[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field3201[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method8955();
            if (var13 != 0) {
                class297[] var14 = this.field3202[var12][arg0][arg1] = new class297[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method9205();
                    int var17 = arg2.method8955();
                    var14[var15] = new class297(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("la.ak(I)I")
    public int method5574() {
        return this.field3190;
    }

    @ObfuscatedName("la.bn(B)I")
    public int method5592() {
        return this.field3193;
    }

    @ObfuscatedName("la.ae(Lvf;I)V")
    public abstract void method5225(class551 arg0);
}
