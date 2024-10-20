package deob;

@ObfuscatedName("al")
public class class34 extends class44 {

    @ObfuscatedName("al.v")
    public class335 field246 = new class335();

    @ObfuscatedName("al.c")
    public class335 field245 = new class335();

    @ObfuscatedName("al.i")
    public int field247 = 0;

    @ObfuscatedName("al.f")
    public int field244 = -1;

    @ObfuscatedName("al.v(Laf;)V")
    public final synchronized void method623(class44 arg0) {
        this.field246.method5528(arg0);
    }

    @ObfuscatedName("al.c(Laf;)V")
    public final synchronized void method637(class44 arg0) {
        arg0.method6503();
    }

    @ObfuscatedName("al.i()V")
    public void method612() {
        if (this.field247 <= 0) {
            return;
        }
        for (class49 var1 = (class49) this.field245.method5540(); var1 != null; var1 = (class49) this.field245.method5534()) {
            var1.field391 -= this.field247;
        }
        this.field244 -= this.field247;
        this.field247 = 0;
    }

    @ObfuscatedName("al.f(Loq;Lap;)V")
    public void method613(class409 arg0, class49 arg1) {
        while (this.field245.field4082 != arg0 && ((class49) arg0).field391 <= arg1.field391) {
            arg0 = arg0.field4411;
        }
        class335.method5529(arg1, arg0);
        this.field244 = ((class49) this.field245.field4082.field4411).field391;
    }

    @ObfuscatedName("al.b(Lap;)V")
    public void method614(class49 arg0) {
        arg0.method6503();
        arg0.method963();
        class409 var2 = this.field245.field4082.field4411;
        if (this.field245.field4082 == var2) {
            this.field244 = -1;
        } else {
            this.field244 = ((class49) var2).field391;
        }
    }

    @ObfuscatedName("al.n()Laf;")
    public class44 method615() {
        return (class44) this.field246.method5540();
    }

    @ObfuscatedName("al.s()Laf;")
    public class44 method616() {
        return (class44) this.field246.method5534();
    }

    @ObfuscatedName("al.l()I")
    public int method617() {
        return 0;
    }

    @ObfuscatedName("al.q([III)V")
    public final synchronized void method618(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field244 < 0) {
                this.method638(arg0, arg1, arg2);
                return;
            }
            if (this.field247 + arg2 < this.field244) {
                this.field247 += arg2;
                this.method638(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field244 - this.field247;
            this.method638(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field247 += var4;
            this.method612();
            class49 var5 = (class49) this.field245.method5540();
            synchronized (var5) {
                int var7 = var5.method964(this);
                if (var7 < 0) {
                    var5.field391 = 0;
                    this.method614(var5);
                } else {
                    var5.field391 = var7;
                    this.method613(var5.field4411, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("al.o([III)V")
    public void method638(int[] arg0, int arg1, int arg2) {
        for (class44 var4 = (class44) this.field246.method5540(); var4 != null; var4 = (class44) this.field246.method5534()) {
            var4.method920(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("al.r(I)V")
    public final synchronized void method620(int arg0) {
        do {
            if (this.field244 < 0) {
                this.method630(arg0);
                return;
            }
            if (this.field247 + arg0 < this.field244) {
                this.field247 += arg0;
                this.method630(arg0);
                return;
            }
            int var2 = this.field244 - this.field247;
            this.method630(var2);
            arg0 -= var2;
            this.field247 += var2;
            this.method612();
            class49 var3 = (class49) this.field245.method5540();
            synchronized (var3) {
                int var5 = var3.method964(this);
                if (var5 < 0) {
                    var3.field391 = 0;
                    this.method614(var3);
                } else {
                    var3.field391 = var5;
                    this.method613(var3.field4411, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("al.p(I)V")
    public void method630(int arg0) {
        for (class44 var2 = (class44) this.field246.method5540(); var2 != null; var2 = (class44) this.field246.method5534()) {
            var2.method620(arg0);
        }
    }
}
