package deob;

import java.util.LinkedList;

@ObfuscatedName("lk")
public abstract class class294 {

    @ObfuscatedName("lk.ai")
    public int field3216;

    @ObfuscatedName("lk.ay")
    public int field3202;

    @ObfuscatedName("lk.as")
    public int field3205;

    @ObfuscatedName("lk.ae")
    public int field3209;

    @ObfuscatedName("lk.am")
    public int field3210;

    @ObfuscatedName("lk.at")
    public int field3203;

    @ObfuscatedName("lk.au")
    public int field3207 = -1;

    @ObfuscatedName("lk.an")
    public int field3208 = -1;

    @ObfuscatedName("lk.ao")
    public short[][][] field3206;

    @ObfuscatedName("lk.af")
    public short[][][] field3201;

    @ObfuscatedName("lk.ar")
    public byte[][][] field3211;

    @ObfuscatedName("lk.ab")
    public byte[][][] field3212;

    @ObfuscatedName("lk.az")
    public class296[][][][] field3213;

    @ObfuscatedName("lk.ag")
    public boolean field3214;

    @ObfuscatedName("lk.ad")
    public boolean field3215;

    public class294() {
        new LinkedList();
        this.field3214 = false;
        this.field3215 = false;
    }

    @ObfuscatedName("lk.ag(I)Z")
    public boolean method5786() {
        return this.field3214 && this.field3215;
    }

    @ObfuscatedName("lk.ad(Lpe;I)V")
    public void method5774(class392 arg0) {
        if (this.method5786()) {
            return;
        }
        byte[] var2 = arg0.method7009(this.field3207, this.field3208);
        if (var2 != null) {
            this.method5435(new class558(var2));
            this.field3214 = true;
            this.field3215 = true;
        }
    }

    @ObfuscatedName("lk.ac(B)V")
    public void method5793() {
        this.field3206 = (short[][][]) null;
        this.field3201 = (short[][][]) null;
        this.field3211 = (byte[][][]) null;
        this.field3212 = (byte[][][]) null;
        this.field3213 = (class296[][][][]) null;
        this.field3214 = false;
        this.field3215 = false;
    }

    @ObfuscatedName("lk.av(IILvl;S)V")
    public void method5773(int arg0, int arg1, class558 arg2) {
        int var4 = arg2.method9258();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method5779(arg0, arg1, arg2, var4);
        } else {
            this.method5791(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("lk.ax(IILvl;II)V")
    public void method5791(int arg0, int arg1, class558 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field3201[0][arg0][arg1] = (short) arg2.method9260();
        }
        this.field3206[0][arg0][arg1] = (short) arg2.method9260();
    }

    @ObfuscatedName("lk.aq(IILvl;II)V")
    public void method5779(int arg0, int arg1, class558 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field3206[0][arg0][arg1] = (short) arg2.method9260();
        if (var6) {
            int var8 = arg2.method9258();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method9260();
                if (var10 != 0) {
                    this.field3201[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method9258();
                    this.field3211[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field3212[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method9258();
            if (var13 != 0) {
                class296[] var14 = this.field3213[var12][arg0][arg1] = new class296[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method9278();
                    int var17 = arg2.method9258();
                    var14[var15] = new class296(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("lk.al(B)I")
    public int method5776() {
        return this.field3205;
    }

    @ObfuscatedName("lk.aa(B)I")
    public int method5782() {
        return this.field3209;
    }

    @ObfuscatedName("lk.aw(Lvl;I)V")
    public abstract void method5435(class558 arg0);
}
