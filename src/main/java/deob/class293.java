package deob;

import java.util.LinkedList;

@ObfuscatedName("li")
public abstract class class293 {

    @ObfuscatedName("li.ax")
    public int field3157;

    @ObfuscatedName("li.ao")
    public int field3150;

    @ObfuscatedName("li.am")
    public int field3163;

    @ObfuscatedName("li.ac")
    public int field3164;

    @ObfuscatedName("li.ae")
    public int field3162;

    @ObfuscatedName("li.ad")
    public int field3154;

    @ObfuscatedName("li.aq")
    public int field3155 = -1;

    @ObfuscatedName("li.al")
    public int field3151 = -1;

    @ObfuscatedName("li.aj")
    public short[][][] field3152;

    @ObfuscatedName("li.as")
    public short[][][] field3158;

    @ObfuscatedName("li.aw")
    public byte[][][] field3159;

    @ObfuscatedName("li.af")
    public byte[][][] field3160;

    @ObfuscatedName("li.aa")
    public class295[][][][] field3161;

    @ObfuscatedName("li.ah")
    public boolean field3149;

    @ObfuscatedName("li.ag")
    public boolean field3153;

    public class293() {
        new LinkedList();
        this.field3149 = false;
        this.field3153 = false;
    }

    @ObfuscatedName("li.at(B)Z")
    public boolean method5428() {
        return this.field3149 && this.field3153;
    }

    @ObfuscatedName("li.az(Lob;I)V")
    public void method5429(class389 arg0) {
        if (this.method5428()) {
            return;
        }
        byte[] var2 = arg0.method6670(this.field3155, this.field3151);
        if (var2 != null) {
            this.method5082(new class549(var2));
            this.field3149 = true;
            this.field3153 = true;
        }
    }

    @ObfuscatedName("li.bg(B)V")
    public void method5433() {
        this.field3152 = (short[][][]) null;
        this.field3158 = (short[][][]) null;
        this.field3159 = (byte[][][]) null;
        this.field3160 = (byte[][][]) null;
        this.field3161 = (class295[][][][]) null;
        this.field3149 = false;
        this.field3153 = false;
    }

    @ObfuscatedName("li.bz(IILvg;B)V")
    public void method5431(int arg0, int arg1, class549 arg2) {
        int var4 = arg2.method9025();
        if (var4 == 0) {
            return;
        }
        if ((var4 & 0x1) == 0) {
            this.method5434(arg0, arg1, arg2, var4);
        } else {
            this.method5432(arg0, arg1, arg2, var4);
        }
    }

    @ObfuscatedName("li.bj(IILvg;II)V")
    public void method5432(int arg0, int arg1, class549 arg2, int arg3) {
        boolean var5 = (arg3 & 0x2) != 0;
        if (var5) {
            this.field3158[0][arg0][arg1] = (short) arg2.method8968();
        }
        this.field3152[0][arg0][arg1] = (short) arg2.method8968();
    }

    @ObfuscatedName("li.bc(IILvg;II)V")
    public void method5434(int arg0, int arg1, class549 arg2, int arg3) {
        int var5 = ((arg3 & 0x18) >> 3) + 1;
        boolean var6 = (arg3 & 0x2) != 0;
        boolean var7 = (arg3 & 0x4) != 0;
        this.field3152[0][arg0][arg1] = (short) arg2.method8968();
        if (var6) {
            int var8 = arg2.method9025();
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method8968();
                if (var10 != 0) {
                    this.field3158[var9][arg0][arg1] = (short) var10;
                    int var11 = arg2.method9025();
                    this.field3159[var9][arg0][arg1] = (byte) (var11 >> 2);
                    this.field3160[var9][arg0][arg1] = (byte) (var11 & 0x3);
                }
            }
        }
        if (!var7) {
            return;
        }
        for (int var12 = 0; var12 < var5; var12++) {
            int var13 = arg2.method9025();
            if (var13 != 0) {
                class295[] var14 = this.field3161[var12][arg0][arg1] = new class295[var13];
                for (int var15 = 0; var15 < var13; var15++) {
                    int var16 = arg2.method8863();
                    int var17 = arg2.method9025();
                    var14[var15] = new class295(var16, var17 >> 2, var17 & 0x3);
                }
            }
        }
    }

    @ObfuscatedName("li.bo(I)I")
    public int method5443() {
        return this.field3163;
    }

    @ObfuscatedName("li.bm(B)I")
    public int method5435() {
        return this.field3164;
    }

    @ObfuscatedName("li.ay(Lvg;I)V")
    public abstract void method5082(class549 arg0);
}
