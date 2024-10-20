package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("fo")
public class class146 extends class504 {

    @ObfuscatedName("fo.ac")
    public int field1671;

    @ObfuscatedName("fo.ae")
    public class138[][] field1673 = (class138[][]) null;

    @ObfuscatedName("fo.ag")
    public class138[][] field1675 = (class138[][]) null;

    @ObfuscatedName("fo.am")
    public class244 field1674;

    @ObfuscatedName("fo.ax")
    public int field1676 = 0;

    @ObfuscatedName("fo.aq")
    public boolean field1678;

    @ObfuscatedName("fo.au")
    public Future field1677;

    @ObfuscatedName("fo.ar")
    public List field1672;

    @ObfuscatedName("ef.ac(Lpo;Lpo;IZI)Lfo;")
    public static class146 method2817(class391 arg0, class391 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method6789(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method6789(0, var7);
        } else {
            var8 = arg1.method6789(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        if (Statics.field5252 == null) {
            Statics.field483 = Runtime.getRuntime().availableProcessors();
            Statics.field5252 = new ThreadPoolExecutor(0, Statics.field483, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field483 * 100 + 100), new class143());
        }
        try {
            return new class146(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class146(class391 arg0, class391 arg1, int arg2, boolean arg3) {
        this.field1671 = arg2;
        byte[] var5 = arg0.method6782(this.field1671 >> 16 & 0xFFFF, this.field1671 & 0xFFFF);
        class551 var6 = new class551(var5);
        int var7 = var6.method8955();
        int var8 = var6.method9119();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6789(0, var8);
        } else {
            var9 = arg1.method6789(var8, 0);
        }
        this.field1674 = new class244(var8, var9);
        this.field1672 = new ArrayList();
        this.field1677 = Statics.field5252.submit(new class145(this, var6, var7));
    }

    @ObfuscatedName("fo.ae(Lvf;II)V")
    public void method3234(class551 arg0, int arg1) {
        arg0.method9119();
        arg0.method9119();
        this.field1676 = arg0.method8955();
        int var3 = arg0.method9119();
        this.field1675 = new class138[this.field1674.method4491().method4427()][];
        this.field1673 = new class138[this.field1674.method4493()][];
        class137[] var4 = new class137[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method8955();
            class139[] var7 = new class139[] { class139.field1629, class139.field1632, class139.field1630, class139.field1631, class139.field1628, class139.field1633 };
            class139 var8 = (class139) class405.method6719(var7, var6);
            if (var8 == null) {
                var8 = class139.field1629;
            }
            int var11 = arg0.method8957();
            class140 var12 = class140.method3103(arg0.method8955());
            class138 var13 = new class138();
            var13.method3146(arg0, arg1);
            var4[var5] = new class137(this, var13, var8, var12, var11);
            int var14 = var8.method3180();
            class138[][] var15;
            if (class139.field1632 == var8) {
                var15 = this.field1675;
            } else {
                var15 = this.field1673;
            }
            if (var15[var11] == null) {
                var15[var11] = new class138[var14];
            }
            if (class139.field1628 == var8) {
                this.field1678 = true;
            }
        }
        int var16 = var3 / Statics.field483;
        int var17 = var3 % Statics.field483;
        int var18 = 0;
        for (int var19 = 0; var19 < Statics.field483; var19++) {
            int var20 = var18;
            var18 += var16;
            if (var17 > 0) {
                var18++;
                var17--;
            }
            if (var18 == var20) {
                break;
            }
            this.field1672.add(Statics.field5252.submit(new class141(this, var20, var18, var4)));
        }
    }

    @ObfuscatedName("fo.ag(I)Z")
    public boolean method3214() {
        if (this.field1677 == null && this.field1672 == null) {
            return true;
        }
        if (this.field1677 != null) {
            if (!this.field1677.isDone()) {
                return false;
            }
            this.field1677 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1672.size(); var2++) {
            if (((Future) this.field1672.get(var2)).isDone()) {
                this.field1672.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1672 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fo.am(B)I")
    public int method3215() {
        return this.field1676;
    }

    @ObfuscatedName("fo.ax(I)Z")
    public boolean method3213() {
        return this.field1678;
    }

    @ObfuscatedName("fo.aq(ILfb;IIB)V")
    public void method3217(int arg0, class135 arg1, int arg2, int arg3) {
        class428 var5 = class428.method3414();
        this.method3218(var5, arg2, arg1, arg0);
        this.method3220(var5, arg2, arg1, arg0);
        this.method3219(var5, arg2, arg1, arg0);
        arg1.method3137(var5);
        var5.method7357();
    }

    @ObfuscatedName("fo.af(Lqf;ILfb;IB)V")
    public void method3218(class428 arg0, int arg1, class135 arg2, int arg3) {
        float[] var5 = arg2.method3139(this.field1676);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1675[arg1] != null) {
            class138 var9 = this.field1675[arg1][0];
            class138 var10 = this.field1675[arg1][1];
            class138 var11 = this.field1675[arg1][2];
            if (var9 != null) {
                var6 = var9.method3149(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3149(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3149(arg3);
            }
        }
        class427 var12 = class427.method3295();
        var12.method7339(1.0F, 0.0F, 0.0F, var6);
        class427 var13 = class427.method3295();
        var13.method7339(0.0F, 1.0F, 0.0F, var7);
        class427 var14 = class427.method3295();
        var14.method7339(0.0F, 0.0F, 1.0F, var8);
        class427 var15 = class427.method3295();
        var15.method7335(var14);
        var15.method7335(var12);
        var15.method7335(var13);
        class428 var16 = class428.method3414();
        var16.method7369(var15);
        arg0.method7367(var16);
        var12.method7330();
        var13.method7330();
        var14.method7330();
        var15.method7330();
        var16.method7357();
    }

    @ObfuscatedName("fo.at(Lqf;ILfb;II)V")
    public void method3219(class428 arg0, int arg1, class135 arg2, int arg3) {
        float[] var5 = arg2.method3114(this.field1676);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1675[arg1] != null) {
            class138 var9 = this.field1675[arg1][3];
            class138 var10 = this.field1675[arg1][4];
            class138 var11 = this.field1675[arg1][5];
            if (var9 != null) {
                var6 = var9.method3149(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3149(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3149(arg3);
            }
        }
        arg0.field4738[12] = var6;
        arg0.field4738[13] = var7;
        arg0.field4738[14] = var8;
    }

    @ObfuscatedName("fo.au(Lqf;ILfb;II)V")
    public void method3220(class428 arg0, int arg1, class135 arg2, int arg3) {
        float[] var5 = arg2.method3124(this.field1676);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1675[arg1] != null) {
            class138 var9 = this.field1675[arg1][6];
            class138 var10 = this.field1675[arg1][7];
            class138 var11 = this.field1675[arg1][8];
            if (var9 != null) {
                var6 = var9.method3149(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3149(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3149(arg3);
            }
        }
        class428 var12 = class428.method3414();
        var12.method7365(var6, var7, var8);
        arg0.method7367(var12);
        var12.method7357();
    }
}
