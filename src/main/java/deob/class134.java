package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("ei")
public class class134 extends class435 {

    @ObfuscatedName("ei.f")
    public int field1605;

    @ObfuscatedName("ei.w")
    public class126[][] field1602 = (class126[][]) null;

    @ObfuscatedName("ei.v")
    public class126[][] field1603 = (class126[][]) null;

    @ObfuscatedName("ei.s")
    public class219 field1601;

    @ObfuscatedName("ei.z")
    public int field1600 = 0;

    @ObfuscatedName("ei.j")
    public boolean field1598;

    @ObfuscatedName("ei.l")
    public Future field1604;

    @ObfuscatedName("ei.k")
    public List field1599;

    @ObfuscatedName("bu.f(Lln;Lln;IZB)Lei;")
    public static class134 method2075(class337 arg0, class337 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method6001(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method6001(0, var7);
        } else {
            var8 = arg1.method6001(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        if (Statics.field3060 == null) {
            Statics.field4895 = Runtime.getRuntime().availableProcessors();
            Statics.field3060 = new ThreadPoolExecutor(0, Statics.field4895, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field4895 * 100 + 100), new class131());
        }
        try {
            return new class134(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class134(class337 arg0, class337 arg1, int arg2, boolean arg3) {
        this.field1605 = arg2;
        byte[] var5 = arg0.method5990(this.field1605 >> 16 & 0xFFFF, this.field1605 & 0xFFFF);
        class474 var6 = new class474(var5);
        int var7 = var6.method7964();
        int var8 = var6.method8032();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6001(0, var8);
        } else {
            var9 = arg1.method6001(var8, 0);
        }
        this.field1601 = new class219(var8, var9);
        this.field1599 = new ArrayList();
        this.field1604 = Statics.field3060.submit(new class133(this, var6, var7));
    }

    @ObfuscatedName("ei.w(Lrd;IS)V")
    public void method2968(class474 arg0, int arg1) {
        arg0.method8032();
        arg0.method8032();
        this.field1600 = arg0.method7964();
        int var3 = arg0.method8032();
        this.field1603 = new class126[this.field1601.method4106().method4084()][];
        this.field1602 = new class126[this.field1601.method4102()][];
        class125[] var4 = new class125[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method7964();
            class127[] var7 = new class127[] { class127.field1547, class127.field1549, class127.field1556, class127.field1551, class127.field1553, class127.field1552 };
            class127 var8 = (class127) class351.method19(var7, var6);
            if (var8 == null) {
                var8 = class127.field1547;
            }
            int var11 = arg0.method7978();
            int var12 = arg0.method7964();
            class128 var13 = (class128) class351.method19(class128.method2889(), var12);
            if (var13 == null) {
                var13 = class128.field1567;
            }
            class126 var16 = new class126();
            var16.method2922(arg0, arg1);
            var4[var5] = new class125(this, var16, var8, var13, var11);
            int var17 = var8.method2928();
            class126[][] var18;
            if (class127.field1549 == var8) {
                var18 = this.field1603;
            } else {
                var18 = this.field1602;
            }
            if (var18[var11] == null) {
                var18[var11] = new class126[var17];
            }
            if (class127.field1553 == var8) {
                this.field1598 = true;
            }
        }
        int var19 = var3 / Statics.field4895;
        int var20 = var3 % Statics.field4895;
        int var21 = 0;
        for (int var22 = 0; var22 < Statics.field4895; var22++) {
            int var23 = var21;
            var21 += var19;
            if (var20 > 0) {
                var21++;
                var20--;
            }
            if (var21 == var23) {
                break;
            }
            this.field1599.add(Statics.field3060.submit(new class129(this, var23, var21, var4)));
        }
    }

    @ObfuscatedName("ei.v(S)Z")
    public boolean method2948() {
        if (this.field1604 == null && this.field1599 == null) {
            return true;
        }
        if (this.field1604 != null) {
            if (!this.field1604.isDone()) {
                return false;
            }
            this.field1604 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1599.size(); var2++) {
            if (((Future) this.field1599.get(var2)).isDone()) {
                this.field1599.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1599 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ei.s(B)I")
    public int method2971() {
        return this.field1600;
    }

    @ObfuscatedName("ei.z(I)Z")
    public boolean method2950() {
        return this.field1598;
    }

    @ObfuscatedName("ei.j(ILdc;III)V")
    public void method2951(int arg0, class123 arg1, int arg2, int arg3) {
        class418[] var5 = class418.field4642;
        class418 var6;
        synchronized (class418.field4642) {
            if (class418.field4644 == 0) {
                var6 = new class418();
            } else {
                class418.field4642[--class418.field4644].method7336();
                var6 = class418.field4642[class418.field4644];
            }
        }
        this.method2946(var6, arg2, arg1, arg0);
        this.method2954(var6, arg2, arg1, arg0);
        this.method2953(var6, arg2, arg1, arg0);
        arg1.method2860(var6);
        var6.method7280();
    }

    @ObfuscatedName("ei.i(Lpb;ILdc;II)V")
    public void method2946(class418 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2864(this.field1600);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1603[arg1] != null) {
            class126 var9 = this.field1603[arg1][0];
            class126 var10 = this.field1603[arg1][1];
            class126 var11 = this.field1603[arg1][2];
            if (var9 != null) {
                var6 = var9.method2901(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2901(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2901(arg3);
            }
        }
        class417[] var12 = class417.field4636;
        class417 var13;
        synchronized (class417.field4636) {
            if (Statics.field4511 == 0) {
                var13 = new class417();
            } else {
                class417.field4636[--Statics.field4511].method7254();
                var13 = class417.field4636[Statics.field4511];
            }
        }
        var13.method7269(1.0F, 0.0F, 0.0F, var6);
        class417[] var16 = class417.field4636;
        class417 var17;
        synchronized (class417.field4636) {
            if (Statics.field4511 == 0) {
                var17 = new class417();
            } else {
                class417.field4636[--Statics.field4511].method7254();
                var17 = class417.field4636[Statics.field4511];
            }
        }
        var17.method7269(0.0F, 1.0F, 0.0F, var7);
        class417[] var20 = class417.field4636;
        class417 var21;
        synchronized (class417.field4636) {
            if (Statics.field4511 == 0) {
                var21 = new class417();
            } else {
                class417.field4636[--Statics.field4511].method7254();
                var21 = class417.field4636[Statics.field4511];
            }
        }
        var21.method7269(0.0F, 0.0F, 1.0F, var8);
        class417[] var24 = class417.field4636;
        class417 var25;
        synchronized (class417.field4636) {
            if (Statics.field4511 == 0) {
                var25 = new class417();
            } else {
                class417.field4636[--Statics.field4511].method7254();
                var25 = class417.field4636[Statics.field4511];
            }
        }
        var25.method7255(var21);
        var25.method7255(var13);
        var25.method7255(var17);
        class418[] var28 = class418.field4642;
        class418 var29;
        synchronized (class418.field4642) {
            if (class418.field4644 == 0) {
                var29 = new class418();
            } else {
                class418.field4642[--class418.field4644].method7336();
                var29 = class418.field4642[class418.field4644];
            }
        }
        var29.method7291(var25);
        arg0.method7286(var29);
        var13.method7266();
        var17.method7266();
        var21.method7266();
        var25.method7266();
        var29.method7280();
    }

    @ObfuscatedName("ei.n(Lpb;ILdc;IB)V")
    public void method2953(class418 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2872(this.field1600);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1603[arg1] != null) {
            class126 var9 = this.field1603[arg1][3];
            class126 var10 = this.field1603[arg1][4];
            class126 var11 = this.field1603[arg1][5];
            if (var9 != null) {
                var6 = var9.method2901(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2901(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2901(arg3);
            }
        }
        arg0.field4645[12] = var6;
        arg0.field4645[13] = var7;
        arg0.field4645[14] = var8;
    }

    @ObfuscatedName("ei.l(Lpb;ILdc;II)V")
    public void method2954(class418 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2866(this.field1600);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1603[arg1] != null) {
            class126 var9 = this.field1603[arg1][6];
            class126 var10 = this.field1603[arg1][7];
            class126 var11 = this.field1603[arg1][8];
            if (var9 != null) {
                var6 = var9.method2901(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2901(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2901(arg3);
            }
        }
        class418[] var12 = class418.field4642;
        class418 var13;
        synchronized (class418.field4642) {
            if (class418.field4644 == 0) {
                var13 = new class418();
            } else {
                class418.field4642[--class418.field4644].method7336();
                var13 = class418.field4642[class418.field4644];
            }
        }
        var13.method7295(var6, var7, var8);
        arg0.method7286(var13);
        var13.method7280();
    }
}
