package deob;

@ObfuscatedName("ao")
public class class34 extends class44 {

    @ObfuscatedName("ao.l")
    public class309 field238 = new class309();

    @ObfuscatedName("ao.q")
    public class309 field239 = new class309();

    @ObfuscatedName("ao.f")
    public int field240 = 0;

    @ObfuscatedName("ao.j")
    public int field241 = -1;

    @ObfuscatedName("ao.l(Lav;)V")
    public final synchronized void method636(class44 arg0) {
        this.field238.method5037(arg0);
    }

    @ObfuscatedName("ao.q(Lav;)V")
    public final synchronized void method611(class44 arg0) {
        arg0.method5775();
    }

    @ObfuscatedName("ao.f()V")
    public void method612() {
        if (this.field240 <= 0) {
            return;
        }
        for (class49 var1 = (class49) this.field239.method5035(); var1 != null; var1 = (class49) this.field239.method5022()) {
            var1.field383 -= this.field240;
        }
        this.field241 -= this.field240;
        this.field240 = 0;
    }

    @ObfuscatedName("ao.j(Lnv;Laz;)V")
    public void method638(class370 arg0, class49 arg1) {
        while (this.field239.field3825 != arg0 && ((class49) arg0).field383 <= arg1.field383) {
            arg0 = arg0.field4076;
        }
        class309.method5017(arg1, arg0);
        this.field241 = ((class49) this.field239.field3825.field4076).field383;
    }

    @ObfuscatedName("ao.m(Laz;)V")
    public void method614(class49 arg0) {
        arg0.method5775();
        arg0.method947();
        class370 var2 = this.field239.field3825.field4076;
        if (this.field239.field3825 == var2) {
            this.field241 = -1;
        } else {
            this.field241 = ((class49) var2).field383;
        }
    }

    @ObfuscatedName("ao.k()Lav;")
    public class44 method615() {
        return (class44) this.field238.method5035();
    }

    @ObfuscatedName("ao.t()Lav;")
    public class44 method616() {
        return (class44) this.field238.method5022();
    }

    @ObfuscatedName("ao.a()I")
    public int method624() {
        return 0;
    }

    @ObfuscatedName("ao.e([III)V")
    public final synchronized void method618(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field241 < 0) {
                this.method619(arg0, arg1, arg2);
                return;
            }
            if (this.field240 + arg2 < this.field241) {
                this.field240 += arg2;
                this.method619(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field241 - this.field240;
            this.method619(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field240 += var4;
            this.method612();
            class49 var5 = (class49) this.field239.method5035();
            synchronized (var5) {
                int var7 = var5.method948(this);
                if (var7 < 0) {
                    var5.field383 = 0;
                    this.method614(var5);
                } else {
                    var5.field383 = var7;
                    this.method638(var5.field4076, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ao.i([III)V")
    public void method619(int[] arg0, int arg1, int arg2) {
        for (class44 var4 = (class44) this.field238.method5035(); var4 != null; var4 = (class44) this.field238.method5022()) {
            var4.method894(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ao.y(I)V")
    public final synchronized void method613(int arg0) {
        do {
            if (this.field241 < 0) {
                this.method621(arg0);
                return;
            }
            if (this.field240 + arg0 < this.field241) {
                this.field240 += arg0;
                this.method621(arg0);
                return;
            }
            int var2 = this.field241 - this.field240;
            this.method621(var2);
            arg0 -= var2;
            this.field240 += var2;
            this.method612();
            class49 var3 = (class49) this.field239.method5035();
            synchronized (var3) {
                int var5 = var3.method948(this);
                if (var5 < 0) {
                    var3.field383 = 0;
                    this.method614(var3);
                } else {
                    var3.field383 = var5;
                    this.method638(var3.field4076, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ao.w(I)V")
    public void method621(int arg0) {
        for (class44 var2 = (class44) this.field238.method5035(); var2 != null; var2 = (class44) this.field238.method5022()) {
            var2.method613(arg0);
        }
    }
}
