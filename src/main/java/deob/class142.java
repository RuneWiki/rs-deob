package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("fo")
public class class142 extends class500 {

    @ObfuscatedName("fo.ak")
    public int field1652;

    @ObfuscatedName("fo.al")
    public class134[][] field1654 = (class134[][]) null;

    @ObfuscatedName("fo.aj")
    public class134[][] field1648 = (class134[][]) null;

    @ObfuscatedName("fo.az")
    public class252 field1651;

    @ObfuscatedName("fo.af")
    public int field1649 = 0;

    @ObfuscatedName("fo.aa")
    public boolean field1653;

    @ObfuscatedName("fo.ac")
    public Future field1655;

    @ObfuscatedName("fo.ao")
    public List field1656;

    @ObfuscatedName("my.ak(Lor;Lor;IZI)Lfo;")
    public static class142 method5826(class387 arg0, class387 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method6579(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method6579(0, var7);
        } else {
            var8 = arg1.method6579(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        if (Statics.field280 == null) {
            Statics.field1650 = Runtime.getRuntime().availableProcessors();
            Statics.field280 = new ThreadPoolExecutor(0, Statics.field1650, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1650 * 100 + 100), new class139());
        }
        try {
            return new class142(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    public class142(class387 arg0, class387 arg1, int arg2, boolean arg3) {
        this.field1652 = arg2;
        byte[] var5 = arg0.method6573(this.field1652 >> 16 & 0xFFFF, this.field1652 & 0xFFFF);
        class546 var6 = new class546(var5);
        int var7 = var6.method8796();
        int var8 = var6.method8798();
        byte[] var9;
        if (arg3) {
            var9 = arg1.method6579(0, var8);
        } else {
            var9 = arg1.method6579(var8, 0);
        }
        this.field1651 = new class252(var8, var9);
        this.field1656 = new ArrayList();
        this.field1655 = Statics.field280.submit(new class141(this, var6, var7));
    }

    @ObfuscatedName("fo.al(Lua;IS)V")
    public void method3001(class546 arg0, int arg1) {
        arg0.method8798();
        arg0.method8798();
        this.field1649 = arg0.method8796();
        int var3 = arg0.method8798();
        this.field1648 = new class134[this.field1651.method4494().method4427()][];
        this.field1654 = new class134[this.field1651.method4496()][];
        class133[] var4 = new class133[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class135 var6 = class135.method5435(arg0.method8796());
            int var7 = arg0.method8848();
            class136 var8 = class136.method2240(arg0.method8796());
            class134 var9 = new class134();
            var9.method2956(arg0, arg1);
            var4[var5] = new class133(this, var9, var6, var8, var7);
            int var10 = var6.method2961();
            class134[][] var11;
            if (class135.field1605 == var6) {
                var11 = this.field1648;
            } else {
                var11 = this.field1654;
            }
            if (var11[var7] == null) {
                var11[var7] = new class134[var10];
            }
            if (class135.field1615 == var6) {
                this.field1653 = true;
            }
        }
        int var12 = var3 / Statics.field1650;
        int var13 = var3 % Statics.field1650;
        int var14 = 0;
        for (int var15 = 0; var15 < Statics.field1650; var15++) {
            int var16 = var14;
            var14 += var12;
            if (var13 > 0) {
                var14++;
                var13--;
            }
            if (var14 == var16) {
                break;
            }
            this.field1656.add(Statics.field280.submit(new class137(this, var16, var14, var4)));
        }
    }

    @ObfuscatedName("fo.aj(I)Z")
    public boolean method3002() {
        if (this.field1655 == null && this.field1656 == null) {
            return true;
        }
        if (this.field1655 != null) {
            if (!this.field1655.isDone()) {
                return false;
            }
            this.field1655 = null;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1656.size(); var2++) {
            if (((Future) this.field1656.get(var2)).isDone()) {
                this.field1656.remove(var2);
                var2--;
            } else {
                var1 = false;
            }
        }
        if (var1) {
            this.field1656 = null;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fo.az(B)I")
    public int method3003() {
        return this.field1649;
    }

    @ObfuscatedName("fo.af(I)Z")
    public boolean method3004() {
        return this.field1653;
    }

    @ObfuscatedName("fo.aa(ILfh;III)V")
    public void method3005(int arg0, class131 arg1, int arg2, int arg3) {
        class424[] var5 = class424.field4692;
        class424 var6;
        synchronized (class424.field4692) {
            if (Statics.field5240 == 0) {
                var6 = new class424();
            } else {
                class424.field4692[--Statics.field5240].method7210();
                var6 = class424.field4692[Statics.field5240];
            }
        }
        this.method3027(var6, arg2, arg1, arg0);
        this.method3007(var6, arg2, arg1, arg0);
        this.method3006(var6, arg2, arg1, arg0);
        arg1.method2923(var6);
        var6.method7197();
    }

    @ObfuscatedName("fo.at(Lql;ILfh;II)V")
    public void method3027(class424 arg0, int arg1, class131 arg2, int arg3) {
        float[] var5 = arg2.method2911(this.field1649);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1648[arg1] != null) {
            class134 var9 = this.field1648[arg1][0];
            class134 var10 = this.field1648[arg1][1];
            class134 var11 = this.field1648[arg1][2];
            if (var9 != null) {
                var6 = var9.method2938(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2938(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2938(arg3);
            }
        }
        class423 var12 = class423.method2787();
        var12.method7139(1.0F, 0.0F, 0.0F, var6);
        class423 var13 = class423.method2787();
        var13.method7139(0.0F, 1.0F, 0.0F, var7);
        class423 var14 = class423.method2787();
        var14.method7139(0.0F, 0.0F, 1.0F, var8);
        class423 var15 = class423.method2787();
        var15.method7142(var14);
        var15.method7142(var12);
        var15.method7142(var13);
        class424[] var16 = class424.field4692;
        class424 var17;
        synchronized (class424.field4692) {
            if (Statics.field5240 == 0) {
                var17 = new class424();
            } else {
                class424.field4692[--Statics.field5240].method7210();
                var17 = class424.field4692[Statics.field5240];
            }
        }
        var17.method7173(var15);
        arg0.method7224(var17);
        var12.method7160();
        var13.method7160();
        var14.method7160();
        var15.method7160();
        var17.method7197();
    }

    @ObfuscatedName("fo.ab(Lql;ILfh;IB)V")
    public void method3006(class424 arg0, int arg1, class131 arg2, int arg3) {
        float[] var5 = arg2.method2912(this.field1649);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1648[arg1] != null) {
            class134 var9 = this.field1648[arg1][3];
            class134 var10 = this.field1648[arg1][4];
            class134 var11 = this.field1648[arg1][5];
            if (var9 != null) {
                var6 = var9.method2938(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2938(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2938(arg3);
            }
        }
        arg0.field4695[12] = var6;
        arg0.field4695[13] = var7;
        arg0.field4695[14] = var8;
    }

    @ObfuscatedName("fo.ac(Lql;ILfh;II)V")
    public void method3007(class424 arg0, int arg1, class131 arg2, int arg3) {
        float[] var5 = arg2.method2908(this.field1649);
        float var6 = var5[0];
        float var7 = var5[1];
        float var8 = var5[2];
        if (this.field1648[arg1] != null) {
            class134 var9 = this.field1648[arg1][6];
            class134 var10 = this.field1648[arg1][7];
            class134 var11 = this.field1648[arg1][8];
            if (var9 != null) {
                var6 = var9.method2938(arg3);
            }
            if (var10 != null) {
                var7 = var10.method2938(arg3);
            }
            if (var11 != null) {
                var8 = var11.method2938(arg3);
            }
        }
        class424[] var12 = class424.field4692;
        class424 var13;
        synchronized (class424.field4692) {
            if (Statics.field5240 == 0) {
                var13 = new class424();
            } else {
                class424.field4692[--Statics.field5240].method7210();
                var13 = class424.field4692[Statics.field5240];
            }
        }
        var13.method7177(var6, var7, var8);
        arg0.method7224(var13);
        var13.method7197();
    }
}
