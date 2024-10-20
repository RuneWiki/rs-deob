package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("fq")
public class class143 extends class502 {

    @ObfuscatedName("fq.ab")
    public int field1639;

    @ObfuscatedName("fq.ay")
    public class135[][] field1631 = (class135[][]) null;

    @ObfuscatedName("fq.an")
    public class135[][] field1638 = (class135[][]) null;

    @ObfuscatedName("fq.au")
    public class185 field1633;

    @ObfuscatedName("fq.ax")
    public int field1634 = 0;

    @ObfuscatedName("fq.ao")
    public boolean field1630;

    @ObfuscatedName("fq.ae")
    public Future field1637;

    @ObfuscatedName("fq.ad")
    public List field1632;

    @ObfuscatedName("kt.ab(Lob;Lob;IZI)Lfq;")
    public static class143 method4731(class389 arg0, class389 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method6645(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method6645(0, var7);
        } else {
            var8 = arg1.method6645(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        if (Statics.field4746 == null) {
            Statics.field1636 = Runtime.getRuntime().availableProcessors();
            Statics.field4746 = new ThreadPoolExecutor(0, Statics.field1636, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1636 * 100 + 100), new class140());
        }
        try {
            return new class143(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class143(class389 arg0, class389 arg1, int arg2, boolean arg3) {
        this.field1639 = arg2;
        byte[] var5 = arg0.method6670(this.field1639 >> 16 & 0xFFFF, this.field1639 & 0xFFFF);
        class549 var6 = new class549(var5);
        int var7 = var6.method9025();
        int var8 = var6.method8968();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6645(0, var8);
        } else {
            var9 = arg1.method6645(var8, 0);
        }
        this.field1633 = new class185(var8, var9);
        this.field1632 = new ArrayList();
        this.field1637 = Statics.field4746.submit(new class142(this, var6, var7));
    }

    @ObfuscatedName("fq.ay(Lvg;II)V")
    public void method3133(class549 arg0, int arg1) {
        arg0.method8968();
        arg0.method8968();
        this.field1634 = arg0.method9025();
        int var3 = arg0.method8968();
        this.field1638 = new class135[this.field1633.method3589().method3537()][];
        this.field1631 = new class135[this.field1633.method3588()][];
        class134[] var4 = new class134[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method9025();
            class136[] var7 = new class136[] { class136.field1590, class136.field1587, class136.field1581, class136.field1584, class136.field1585, class136.field1586 };
            class136 var8 = (class136) class403.method3083(var7, var6);
            if (var8 == null) {
                var8 = class136.field1590;
            }
            int var11 = arg0.method8812();
            class137 var12 = class137.method4459(arg0.method9025());
            class135 var13 = new class135();
            var13.method3078(arg0, arg1);
            var4[var5] = new class134(this, var13, var8, var12, var11);
            int var14 = var8.method3085();
            class135[][] var15;
            if (class136.field1587 == var8) {
                var15 = this.field1638;
            } else {
                var15 = this.field1631;
            }
            if (var15[var11] == null) {
                var15[var11] = new class135[var14];
            }
            if (class136.field1585 == var8) {
                this.field1630 = true;
            }
        }
        int var16 = var3 / Statics.field1636;
        int var17 = var3 % Statics.field1636;
        int var18 = 0;
        for (int var19 = 0; var19 < Statics.field1636; var19++) {
            int var20 = var18;
            var18 += var16;
            if (var17 > 0) {
                var18++;
                var17--;
            }
            if (var18 == var20) {
                break;
            }
            this.field1632.add(Statics.field4746.submit(new class138(this, var20, var18, var4)));
        }
    }

    @ObfuscatedName("fq.an(I)Z")
    public boolean method3144() {
        if (this.field1637 == null && this.field1632 == null) {
            return true;
        }
        if (this.field1637 != null) {
            if (!this.field1637.isDone()) {
                return false;
            }
            this.field1637 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1632.size(); var2++) {
            if (((Future) this.field1632.get(var2)).isDone()) {
                this.field1632.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1632 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fq.au(I)I")
    public int method3119() {
        return this.field1634;
    }

    @ObfuscatedName("fq.ax(I)Z")
    public boolean method3118() {
        return this.field1630;
    }

    @ObfuscatedName("fq.ao(ILfm;IIB)V")
    public void method3142(int arg0, class132 arg1, int arg2, int arg3) {
        class426[] var5 = class426.field4685;
        class426 var6;
        synchronized (class426.field4685) {
            if (class426.field4684 == 0) {
                var6 = new class426();
            } else {
                class426.field4685[--class426.field4684].method7237();
                var6 = class426.field4685[class426.field4684];
            }
        }
        this.method3122(var6, arg2, arg1, arg0);
        this.method3123(var6, arg2, arg1, arg0);
        this.method3135(var6, arg2, arg1, arg0);
        arg1.method3018(var6);
        var6.method7275();
    }

    @ObfuscatedName("fq.am(Lqy;ILfm;II)V")
    public void method3122(class426 arg0, int arg1, class132 arg2, int arg3) {
        float[] var5 = arg2.method3007(this.field1634);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1638[arg1] != null) {
            class135 var9 = this.field1638[arg1][0];
            class135 var10 = this.field1638[arg1][1];
            class135 var11 = this.field1638[arg1][2];
            if (var9 != null) {
                var6 = var9.method3050(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3050(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3050(arg3);
            }
        }
        class425 var12 = class425.method6787();
        var12.method7209(1.0F, 0.0F, 0.0F, var6);
        class425 var13 = class425.method6787();
        var13.method7209(0.0F, 1.0F, 0.0F, var7);
        class425 var14 = class425.method6787();
        var14.method7209(0.0F, 0.0F, 1.0F, var8);
        class425 var15 = class425.method6787();
        var15.method7206(var14);
        var15.method7206(var12);
        var15.method7206(var13);
        class426[] var16 = class426.field4685;
        class426 var17;
        synchronized (class426.field4685) {
            if (class426.field4684 == 0) {
                var17 = new class426();
            } else {
                class426.field4685[--class426.field4684].method7237();
                var17 = class426.field4685[class426.field4684];
            }
        }
        var17.method7306(var15);
        arg0.method7263(var17);
        var12.method7201();
        var13.method7201();
        var14.method7201();
        var15.method7201();
        var17.method7275();
    }

    @ObfuscatedName("fq.ac(Lqy;ILfm;II)V")
    public void method3135(class426 arg0, int arg1, class132 arg2, int arg3) {
        float[] var5 = arg2.method3001(this.field1634);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1638[arg1] != null) {
            class135 var9 = this.field1638[arg1][3];
            class135 var10 = this.field1638[arg1][4];
            class135 var11 = this.field1638[arg1][5];
            if (var9 != null) {
                var6 = var9.method3050(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3050(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3050(arg3);
            }
        }
        arg0.field4687[12] = var6;
        arg0.field4687[13] = var7;
        arg0.field4687[14] = var8;
    }

    @ObfuscatedName("fq.ae(Lqy;ILfm;II)V")
    public void method3123(class426 arg0, int arg1, class132 arg2, int arg3) {
        float[] var5 = arg2.method3009(this.field1634);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1638[arg1] != null) {
            class135 var9 = this.field1638[arg1][6];
            class135 var10 = this.field1638[arg1][7];
            class135 var11 = this.field1638[arg1][8];
            if (var9 != null) {
                var6 = var9.method3050(arg3);
            }
            if (var10 != null) {
                var7 = var10.method3050(arg3);
            }
            if (var11 != null) {
                var8 = var11.method3050(arg3);
            }
        }
        class426[] var12 = class426.field4685;
        class426 var13;
        synchronized (class426.field4685) {
            if (class426.field4684 == 0) {
                var13 = new class426();
            } else {
                class426.field4685[--class426.field4684].method7237();
                var13 = class426.field4685[class426.field4684];
            }
        }
        var13.method7270(var6, var7, var8);
        arg0.method7263(var13);
        var13.method7275();
    }
}
