package deob;

@ObfuscatedName("ae")
public class class34 extends class44 {

    @ObfuscatedName("ae.n")
    public class309 field242 = new class309();

    @ObfuscatedName("ae.c")
    public class309 field243 = new class309();

    @ObfuscatedName("ae.m")
    public int field244 = 0;

    @ObfuscatedName("ae.k")
    public int field245 = -1;

    @ObfuscatedName("ae.n(Lap;)V")
    public final synchronized void method607(class44 arg0) {
        this.field242.method4968(arg0);
    }

    @ObfuscatedName("ae.c(Lap;)V")
    public final synchronized void method608(class44 arg0) {
        arg0.method5732();
    }

    @ObfuscatedName("ae.m()V")
    public void method638() {
        if (this.field244 <= 0) {
            return;
        }
        for (class49 var1 = (class49) this.field243.method4962(); var1 != null; var1 = (class49) this.field243.method4985()) {
            var1.field382 -= this.field244;
        }
        this.field245 -= this.field244;
        this.field244 = 0;
    }

    @ObfuscatedName("ae.k(Lnr;Laz;)V")
    public void method610(class369 arg0, class49 arg1) {
        while (this.field243.field3818 != arg0 && ((class49) arg0).field382 <= arg1.field382) {
            arg0 = arg0.field4055;
        }
        class309.method4961(arg1, arg0);
        this.field245 = ((class49) this.field243.field3818.field4055).field382;
    }

    @ObfuscatedName("ae.o(Laz;)V")
    public void method626(class49 arg0) {
        arg0.method5732();
        arg0.method959();
        class369 var2 = this.field243.field3818.field4055;
        if (this.field243.field3818 == var2) {
            this.field245 = -1;
        } else {
            this.field245 = ((class49) var2).field382;
        }
    }

    @ObfuscatedName("ae.g()Lap;")
    public class44 method612() {
        return (class44) this.field242.method4962();
    }

    @ObfuscatedName("ae.z()Lap;")
    public class44 method613() {
        return (class44) this.field242.method4985();
    }

    @ObfuscatedName("ae.a()I")
    public int method614() {
        return 0;
    }

    @ObfuscatedName("ae.u([III)V")
    public final synchronized void method615(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field245 < 0) {
                this.method616(arg0, arg1, arg2);
                return;
            }
            if (this.field244 + arg2 < this.field245) {
                this.field244 += arg2;
                this.method616(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field245 - this.field244;
            this.method616(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field244 += var4;
            this.method638();
            class49 var5 = (class49) this.field243.method4962();
            synchronized (var5) {
                int var7 = var5.method960(this);
                if (var7 < 0) {
                    var5.field382 = 0;
                    this.method626(var5);
                } else {
                    var5.field382 = var7;
                    this.method610(var5.field4055, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ae.e([III)V")
    public void method616(int[] arg0, int arg1, int arg2) {
        for (class44 var4 = (class44) this.field242.method4962(); var4 != null; var4 = (class44) this.field242.method4985()) {
            var4.method910(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ae.l(I)V")
    public final synchronized void method641(int arg0) {
        do {
            if (this.field245 < 0) {
                this.method618(arg0);
                return;
            }
            if (this.field244 + arg0 < this.field245) {
                this.field244 += arg0;
                this.method618(arg0);
                return;
            }
            int var2 = this.field245 - this.field244;
            this.method618(var2);
            arg0 -= var2;
            this.field244 += var2;
            this.method638();
            class49 var3 = (class49) this.field243.method4962();
            synchronized (var3) {
                int var5 = var3.method960(this);
                if (var5 < 0) {
                    var3.field382 = 0;
                    this.method626(var3);
                } else {
                    var3.field382 = var5;
                    this.method610(var3.field4055, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ae.y(I)V")
    public void method618(int arg0) {
        for (class44 var2 = (class44) this.field242.method4962(); var2 != null; var2 = (class44) this.field242.method4985()) {
            var2.method641(arg0);
        }
    }
}
