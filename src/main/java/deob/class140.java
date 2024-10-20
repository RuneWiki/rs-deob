package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("fo")
public class class140 extends class481 {

    @ObfuscatedName("fo.at")
    public int field1600;

    @ObfuscatedName("fo.ah")
    public class132[][] field1597 = (class132[][]) null;

    @ObfuscatedName("fo.ar")
    public class132[][] field1598 = (class132[][]) null;

    @ObfuscatedName("fo.ao")
    public class270 field1601;

    @ObfuscatedName("fo.ab")
    public int field1599 = 0;

    @ObfuscatedName("fo.au")
    public boolean field1607;

    @ObfuscatedName("fo.al")
    public Future field1603;

    @ObfuscatedName("fo.az")
    public List field1604;

    @ObfuscatedName("cy.at(Lol;Lol;IZI)Lfo;")
    public static class140 method2091(class371 arg0, class371 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method6354(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method6354(0, var7);
        } else {
            var8 = arg1.method6354(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        if (Statics.field1596 == null) {
            Statics.field2714 = Runtime.getRuntime().availableProcessors();
            Statics.field1596 = new ThreadPoolExecutor(0, Statics.field2714, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field2714 * 100 + 100), new class137());
        }
        try {
            return new class140(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class140(class371 arg0, class371 arg1, int arg2, boolean arg3) {
        this.field1600 = arg2;
        byte[] var5 = arg0.method6284(this.field1600 >> 16 & 0xFFFF, this.field1600 & 0xFFFF);
        class527 var6 = new class527(var5);
        int var7 = var6.method8410();
        int var8 = var6.method8412();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6354(0, var8);
        } else {
            var9 = arg1.method6354(var8, 0);
        }
        this.field1601 = new class270(var8, var9);
        this.field1604 = new ArrayList();
        this.field1603 = Statics.field1596.submit(new class139(this, var6, var7));
    }

    @ObfuscatedName("fo.ah(Luj;II)V")
    public void method3004(class527 arg0, int arg1) {
        arg0.method8412();
        arg0.method8412();
        this.field1599 = arg0.method8410();
        int var3 = arg0.method8412();
        this.field1598 = new class132[this.field1601.method4788().method4740()][];
        this.field1597 = new class132[this.field1601.method4787()][];
        class131[] var4 = new class131[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method8410();
            class133 var7 = (class133) class385.method164(class133.method6507(), var6);
            if (var7 == null) {
                var7 = class133.field1550;
            }
            int var10 = arg0.method8675();
            int var11 = arg0.method8410();
            class134[] var12 = new class134[] { class134.field1576, class134.field1560, class134.field1569, class134.field1580, class134.field1563, class134.field1561, class134.field1565, class134.field1566, class134.field1567, class134.field1568, class134.field1564, class134.field1574, class134.field1571, class134.field1572, class134.field1573, class134.field1562, class134.field1570 };
            class134 var13 = (class134) class385.method164(var12, var11);
            if (var13 == null) {
                var13 = class134.field1576;
            }
            class132 var16 = new class132();
            var16.method2973(arg0, arg1);
            var4[var5] = new class131(this, var16, var7, var13, var10);
            int var17 = var7.method2979();
            class132[][] var18;
            if (class133.field1551 == var7) {
                var18 = this.field1598;
            } else {
                var18 = this.field1597;
            }
            if (var18[var10] == null) {
                var18[var10] = new class132[var17];
            }
            if (class133.field1558 == var7) {
                this.field1607 = true;
            }
        }
        int var19 = var3 / Statics.field2714;
        int var20 = var3 % Statics.field2714;
        int var21 = 0;
        for (int var22 = 0; var22 < Statics.field2714; var22++) {
            int var23 = var21;
            var21 += var19;
            if (var20 > 0) {
                var21++;
                var20--;
            }
            if (var21 == var23) {
                break;
            }
            this.field1604.add(Statics.field1596.submit(new class135(this, var23, var21, var4)));
        }
    }

    @ObfuscatedName("fo.ar(S)Z")
    public boolean method3005() {
        if (this.field1603 == null && this.field1604 == null) {
            return true;
        }
        if (this.field1603 != null) {
            if (!this.field1603.isDone()) {
                return false;
            }
            this.field1603 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1604.size(); var2++) {
            if (((Future) this.field1604.get(var2)).isDone()) {
                this.field1604.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1604 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fo.ao(B)I")
    public int method3031() {
        return this.field1599;
    }

    @ObfuscatedName("fo.ab(B)Z")
    public boolean method3028() {
        return this.field1607;
    }

    @ObfuscatedName("fo.au(ILej;III)V")
    public void method3008(int arg0, class129 arg1, int arg2, int arg3) {
        class463 var5 = class463.method4469();
        this.method3007(var5, arg2, arg1, arg0);
        this.method3033(var5, arg2, arg1, arg0);
        this.method3010(var5, arg2, arg1, arg0);
        arg1.method2891(var5);
        var5.method7688();
    }

    @ObfuscatedName("fo.aa(Lrz;ILej;II)V")
    public void method3007(class463 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2894(this.field1599);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1598[arg1] != null) {
            class132 var9 = this.field1598[arg1][0];
            class132 var10 = this.field1598[arg1][1];
            class132 var11 = this.field1598[arg1][2];
            if (var9 != null) {
                var6 = var9.method2945(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2945(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2945(arg3);
            }
        }
        class462 var12 = class462.method3909();
        var12.method7637(1.0F, 0.0F, 0.0F, var6);
        class462 var13 = class462.method3909();
        var13.method7637(0.0F, 1.0F, 0.0F, var7);
        class462 var14 = class462.method3909();
        var14.method7637(0.0F, 0.0F, 1.0F, var8);
        class462 var15 = class462.method3909();
        var15.method7639(var14);
        var15.method7639(var12);
        var15.method7639(var13);
        class463 var16 = class463.method4469();
        var16.method7675(var15);
        arg0.method7674(var16);
        var12.method7653();
        var13.method7653();
        var14.method7653();
        var15.method7653();
        var16.method7688();
    }

    @ObfuscatedName("fo.ac(Lrz;ILej;II)V")
    public void method3010(class463 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2896(this.field1599);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1598[arg1] != null) {
            class132 var9 = this.field1598[arg1][3];
            class132 var10 = this.field1598[arg1][4];
            class132 var11 = this.field1598[arg1][5];
            if (var9 != null) {
                var6 = var9.method2945(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2945(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2945(arg3);
            }
        }
        arg0.field4773[12] = var6;
        arg0.field4773[13] = var7;
        arg0.field4773[14] = var8;
    }

    @ObfuscatedName("fo.al(Lrz;ILej;IB)V")
    public void method3033(class463 arg0, int arg1, class129 arg2, int arg3) {
        float[] var5 = arg2.method2897(this.field1599);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1598[arg1] != null) {
            class132 var9 = this.field1598[arg1][6];
            class132 var10 = this.field1598[arg1][7];
            class132 var11 = this.field1598[arg1][8];
            if (var9 != null) {
                var6 = var9.method2945(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2945(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2945(arg3);
            }
        }
        class463 var12 = class463.method4469();
        var12.method7672(var6, var7, var8);
        arg0.method7674(var12);
        var12.method7688();
    }
}
