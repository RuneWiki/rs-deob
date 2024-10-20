package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("fr")
public class class146 extends class511 {

    @ObfuscatedName("fr.ap")
    public int field1660;

    @ObfuscatedName("fr.aw")
    public class138[][] field1661 = (class138[][]) null;

    @ObfuscatedName("fr.ak")
    public class138[][] field1662 = (class138[][]) null;

    @ObfuscatedName("fr.aj")
    public class244 field1664;

    @ObfuscatedName("fr.ai")
    public int field1663 = 0;

    @ObfuscatedName("fr.ay")
    public boolean field1665;

    @ObfuscatedName("fr.am")
    public Future field1666;

    @ObfuscatedName("fr.at")
    public List field1668;

    @ObfuscatedName("lt.ap(Lpe;Lpe;IZB)Lfr;")
    public static class146 method5823(class392 arg0, class392 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method7001(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method7001(0, var7);
        } else {
            var8 = arg1.method7001(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        if (Statics.field5449 == null) {
            Statics.field1670 = Runtime.getRuntime().availableProcessors();
            Statics.field5449 = new ThreadPoolExecutor(0, Statics.field1670, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1670 * 100 + 100), new class143());
        }
        try {
            return new class146(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class146(class392 arg0, class392 arg1, int arg2, boolean arg3) {
        this.field1660 = arg2;
        byte[] var5 = arg0.method7009(this.field1660 >> 16 & 0xFFFF, this.field1660 & 0xFFFF);
        class558 var6 = new class558(var5);
        int var7 = var6.method9258();
        int var8 = var6.method9260();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method7001(0, var8);
        } else {
            var9 = arg1.method7001(var8, 0);
        }
        this.field1664 = new class244(var8, var9);
        this.field1668 = new ArrayList();
        this.field1666 = Statics.field5449.submit(new class145(this, var6, var7));
    }

    @ObfuscatedName("fr.aw(Lvl;IB)V")
    public void method3364(class558 arg0, int arg1) {
        arg0.method9260();
        arg0.method9260();
        this.field1663 = arg0.method9258();
        int var3 = arg0.method9260();
        this.field1662 = new class138[this.field1664.method4669().method4600()][];
        this.field1661 = new class138[this.field1664.method4668()][];
        class137[] var4 = new class137[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class139 var6 = Statics.method2486(arg0.method9258());
            int var7 = arg0.method9273();
            int var8 = arg0.method9258();
            class140 var9 = (class140) class406.method3580(class140.method9126(), var8);
            if (var9 == null) {
                var9 = class140.field1642;
            }
            class138 var12 = new class138();
            var12.method3317(arg0, arg1);
            var4[var5] = new class137(this, var12, var6, var9, var7);
            int var13 = var6.method3332();
            class138[][] var14;
            if (class139.field1617 == var6) {
                var14 = this.field1662;
            } else {
                var14 = this.field1661;
            }
            if (var14[var7] == null) {
                var14[var7] = new class138[var13];
            }
            if (class139.field1620 == var6) {
                this.field1665 = true;
            }
        }
        int var15 = var3 / Statics.field1670;
        int var16 = var3 % Statics.field1670;
        int var17 = 0;
        for (int var18 = 0; var18 < Statics.field1670; var18++) {
            int var19 = var17;
            var17 += var15;
            if (var16 > 0) {
                var17++;
                var16--;
            }
            if (var17 == var19) {
                break;
            }
            this.field1668.add(Statics.field5449.submit(new class141(this, var19, var17, var4)));
        }
    }

    @ObfuscatedName("fr.ak(I)Z")
    public boolean method3363() {
        if (this.field1666 == null && this.field1668 == null) {
            return true;
        }
        if (this.field1666 != null) {
            if (!this.field1666.isDone()) {
                return false;
            }
            this.field1666 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1668.size(); var2++) {
            if (((Future) this.field1668.get(var2)).isDone()) {
                this.field1668.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1668 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fr.aj(I)I")
    public int method3366() {
        return this.field1663;
    }

    @ObfuscatedName("fr.ai(B)Z")
    public boolean method3395() {
        return this.field1665;
    }

    @ObfuscatedName("fr.ay(ILfw;III)V")
    public void method3368(int arg0, class135 arg1, int arg2, int arg3) {
        class429 var5 = class429.method3581();
        this.method3369(var5, arg2, arg1, arg0);
        this.method3397(var5, arg2, arg1, arg0);
        this.method3370(var5, arg2, arg1, arg0);
        arg1.method3254(var5);
        var5.method7650();
    }

    @ObfuscatedName("fr.as(Lqs;ILfw;IB)V")
    public void method3369(class429 arg0, int arg1, class135 arg2, int arg3) {
        float[] var5 = arg2.method3258(this.field1663);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1662[arg1] != null) {
            class138 var9 = this.field1662[arg1][0];
            class138 var10 = this.field1662[arg1][1];
            class138 var11 = this.field1662[arg1][2];
            if (var9 != null) {
                var6 = var9.method3304(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3304(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3304(arg3);
            }
        }
        class428 var12 = class428.method4930();
        var12.method7595(1.0F, 0.0F, 0.0F, var6);
        class428 var13 = class428.method4930();
        var13.method7595(0.0F, 1.0F, 0.0F, var7);
        class428 var14 = class428.method4930();
        var14.method7595(0.0F, 0.0F, 1.0F, var8);
        class428 var15 = class428.method4930();
        var15.method7591(var14);
        var15.method7591(var12);
        var15.method7591(var13);
        class429 var16 = class429.method3581();
        var16.method7626(var15);
        arg0.method7644(var16);
        var12.method7593();
        var13.method7593();
        var14.method7593();
        var15.method7593();
        var16.method7650();
    }

    @ObfuscatedName("fr.ae(Lqs;ILfw;II)V")
    public void method3370(class429 arg0, int arg1, class135 arg2, int arg3) {
        float[] var5 = arg2.method3259(this.field1663);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1662[arg1] != null) {
            class138 var9 = this.field1662[arg1][3];
            class138 var10 = this.field1662[arg1][4];
            class138 var11 = this.field1662[arg1][5];
            if (var9 != null) {
                var6 = var9.method3304(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3304(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3304(arg3);
            }
        }
        arg0.field4784[12] = var6;
        arg0.field4784[13] = var7;
        arg0.field4784[14] = var8;
    }

    @ObfuscatedName("fr.am(Lqs;ILfw;II)V")
    public void method3397(class429 arg0, int arg1, class135 arg2, int arg3) {
        float[] var5 = arg2.method3267(this.field1663);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1662[arg1] != null) {
            class138 var9 = this.field1662[arg1][6];
            class138 var10 = this.field1662[arg1][7];
            class138 var11 = this.field1662[arg1][8];
            if (var9 != null) {
                var6 = var9.method3304(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3304(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3304(arg3);
            }
        }
        class429 var12 = class429.method3581();
        var12.method7622(var6, var7, var8);
        arg0.method7644(var12);
        var12.method7650();
    }
}
