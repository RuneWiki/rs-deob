package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("fh")
public class class134 extends class444 {

    @ObfuscatedName("fh.af")
    public int field1588;

    @ObfuscatedName("fh.an")
    public class126[][] field1593 = (class126[][]) null;

    @ObfuscatedName("fh.aw")
    public class126[][] field1590 = (class126[][]) null;

    @ObfuscatedName("fh.ac")
    public class222 field1591;

    @ObfuscatedName("fh.au")
    public int field1592 = 0;

    @ObfuscatedName("fh.ab")
    public boolean field1599;

    @ObfuscatedName("fh.at")
    public Future field1595;

    @ObfuscatedName("fh.aa")
    public List field1596;

    @ObfuscatedName("iw.af(Lnm;Lnm;IZI)Lfh;")
    public static class134 method3949(class344 arg0, class344 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method6078(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method6078(0, var7);
        } else {
            var8 = arg1.method6078(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        if (Statics.field4388 == null) {
            Statics.field1594 = Runtime.getRuntime().availableProcessors();
            Statics.field4388 = new ThreadPoolExecutor(0, Statics.field1594, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1594 * 100 + 100), new class131());
        }
        try {
            return new class134(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class134(class344 arg0, class344 arg1, int arg2, boolean arg3) {
        this.field1588 = arg2;
        byte[] var5 = arg0.method6090(this.field1588 >> 16 & 0xFFFF, this.field1588 & 0xFFFF);
        class489 var6 = new class489(var5);
        int var7 = var6.method8248();
        int var8 = var6.method8250();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6078(0, var8);
        } else {
            var9 = arg1.method6078(var8, 0);
        }
        this.field1591 = new class222(var8, var9);
        this.field1596 = new ArrayList();
        this.field1595 = Statics.field4388.submit(new class133(this, var6, var7));
    }

    @ObfuscatedName("fh.an(Lsg;IB)V")
    public void method2975(class489 arg0, int arg1) {
        arg0.method8250();
        arg0.method8250();
        this.field1592 = arg0.method8248();
        int var3 = arg0.method8250();
        this.field1590 = new class126[this.field1591.method4165().method4100()][];
        this.field1593 = new class126[this.field1591.method4164()][];
        class125[] var4 = new class125[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.method8248();
            class127 var7 = (class127) Statics.method3600(Statics.method3345(), var6);
            if (var7 == null) {
                var7 = class127.field1536;
            }
            int var10 = arg0.method8263();
            class128 var11 = class128.method2792(arg0.method8248());
            class126 var12 = new class126();
            var12.method2908(arg0, arg1);
            var4[var5] = new class125(this, var12, var7, var11, var10);
            int var13 = var7.method2945();
            class126[][] var14;
            if (class127.field1533 == var7) {
                var14 = this.field1590;
            } else {
                var14 = this.field1593;
            }
            if (var14[var10] == null) {
                var14[var10] = new class126[var13];
            }
            if (class127.field1540 == var7) {
                this.field1599 = true;
            }
        }
        int var15 = var3 / Statics.field1594;
        int var16 = var3 % Statics.field1594;
        int var17 = 0;
        for (int var18 = 0; var18 < Statics.field1594; var18++) {
            int var19 = var17;
            var17 += var15;
            if (var16 > 0) {
                var17++;
                var16--;
            }
            if (var17 == var19) {
                break;
            }
            this.field1596.add(Statics.field4388.submit(new class129(this, var19, var17, var4)));
        }
    }

    @ObfuscatedName("fh.aw(I)Z")
    public boolean method2996() {
        if (this.field1595 == null && this.field1596 == null) {
            return true;
        }
        if (this.field1595 != null) {
            if (!this.field1595.isDone()) {
                return false;
            }
            this.field1595 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1596.size(); var2++) {
            if (((Future) this.field1596.get(var2)).isDone()) {
                this.field1596.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1596 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fh.ac(I)I")
    public int method2981() {
        return this.field1592;
    }

    @ObfuscatedName("fh.au(I)Z")
    public boolean method2976() {
        return this.field1599;
    }

    @ObfuscatedName("fh.ab(ILew;III)V")
    public void method2979(int arg0, class123 arg1, int arg2, int arg3) {
        class426[] var5 = class426.field4666;
        class426 var6;
        synchronized (class426.field4666) {
            if (Statics.field4668 == 0) {
                var6 = new class426();
            } else {
                class426.field4666[--Statics.field4668].method7460();
                var6 = class426.field4666[Statics.field4668];
            }
        }
        this.method3000(var6, arg2, arg1, arg0);
        this.method3004(var6, arg2, arg1, arg0);
        this.method2980(var6, arg2, arg1, arg0);
        arg1.method2863(var6);
        var6.method7459();
    }

    @ObfuscatedName("fh.aq(Lqj;ILew;II)V")
    public void method3000(class426 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2869(this.field1592);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1590[arg1] != null) {
            class126 var9 = this.field1590[arg1][0];
            class126 var10 = this.field1590[arg1][1];
            class126 var11 = this.field1590[arg1][2];
            if (var9 != null) {
                var6 = var9.method2910(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2910(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2910(arg3);
            }
        }
        class425 var12 = class425.method2970();
        var12.method7422(1.0F, 0.0F, 0.0F, var6);
        class425 var13 = class425.method2970();
        var13.method7422(0.0F, 1.0F, 0.0F, var7);
        class425 var14 = class425.method2970();
        var14.method7422(0.0F, 0.0F, 1.0F, var8);
        class425 var15 = class425.method2970();
        var15.method7424(var14);
        var15.method7424(var12);
        var15.method7424(var13);
        class426[] var16 = class426.field4666;
        class426 var17;
        synchronized (class426.field4666) {
            if (Statics.field4668 == 0) {
                var17 = new class426();
            } else {
                class426.field4666[--Statics.field4668].method7460();
                var17 = class426.field4666[Statics.field4668];
            }
        }
        var17.method7467(var15);
        arg0.method7466(var17);
        var12.method7427();
        var13.method7427();
        var14.method7427();
        var15.method7427();
        var17.method7459();
    }

    @ObfuscatedName("fh.al(Lqj;ILew;II)V")
    public void method2980(class426 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2855(this.field1592);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1590[arg1] != null) {
            class126 var9 = this.field1590[arg1][3];
            class126 var10 = this.field1590[arg1][4];
            class126 var11 = this.field1590[arg1][5];
            if (var9 != null) {
                var6 = var9.method2910(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2910(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2910(arg3);
            }
        }
        arg0.field4671[12] = var6;
        arg0.field4671[13] = var7;
        arg0.field4671[14] = var8;
    }

    @ObfuscatedName("fh.at(Lqj;ILew;II)V")
    public void method3004(class426 arg0, int arg1, class123 arg2, int arg3) {
        float[] var5 = arg2.method2856(this.field1592);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1590[arg1] != null) {
            class126 var9 = this.field1590[arg1][6];
            class126 var10 = this.field1590[arg1][7];
            class126 var11 = this.field1590[arg1][8];
            if (var9 != null) {
                var6 = var9.method2910(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2910(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2910(arg3);
            }
        }
        class426[] var12 = class426.field4666;
        class426 var13;
        synchronized (class426.field4666) {
            if (Statics.field4668 == 0) {
                var13 = new class426();
            } else {
                class426.field4666[--Statics.field4668].method7460();
                var13 = class426.field4666[Statics.field4668];
            }
        }
        var13.method7506(var6, var7, var8);
        arg0.method7466(var13);
        var13.method7459();
    }
}
