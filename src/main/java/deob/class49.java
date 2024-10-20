package deob;

@ObfuscatedName("av")
public class class49 extends class59 {

    @ObfuscatedName("av.f")
    public class295 field373 = new class295();

    @ObfuscatedName("av.e")
    public class295 field375 = new class295();

    @ObfuscatedName("av.v")
    public int field374 = 0;

    @ObfuscatedName("av.y")
    public int field372 = -1;

    @ObfuscatedName("av.f(Lbc;)V")
    public final synchronized void method619(class59 arg0) {
        this.field373.method4748(arg0);
    }

    @ObfuscatedName("av.e(Lbc;)V")
    public final synchronized void method620(class59 arg0) {
        arg0.method5407();
    }

    @ObfuscatedName("av.v()V")
    public void method615() {
        if (this.field374 <= 0) {
            return;
        }
        for (class64 var1 = (class64) this.field375.method4721(); var1 != null; var1 = (class64) this.field375.method4723()) {
            var1.field520 -= this.field374;
        }
        this.field372 -= this.field374;
        this.field374 = 0;
    }

    @ObfuscatedName("av.y(Lmf;Lbw;)V")
    public void method592(class353 arg0, class64 arg1) {
        while (this.field375.field3709 != arg0 && ((class64) arg0).field520 <= arg1.field520) {
            arg0 = arg0.field3935;
        }
        class295.method4718(arg1, arg0);
        this.field372 = ((class64) this.field375.field3709.field3935).field520;
    }

    @ObfuscatedName("av.j(Lbw;)V")
    public void method593(class64 arg0) {
        arg0.method5407();
        arg0.method926();
        class353 var2 = this.field375.field3709.field3935;
        if (this.field375.field3709 == var2) {
            this.field372 = -1;
        } else {
            this.field372 = ((class64) var2).field520;
        }
    }

    @ObfuscatedName("av.o()Lbc;")
    public class59 method594() {
        return (class59) this.field373.method4721();
    }

    @ObfuscatedName("av.m()Lbc;")
    public class59 method595() {
        return (class59) this.field373.method4723();
    }

    @ObfuscatedName("av.r()I")
    public int method596() {
        return 0;
    }

    @ObfuscatedName("av.h([III)V")
    public final synchronized void method616(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field372 < 0) {
                this.method598(arg0, arg1, arg2);
                return;
            }
            if (this.field374 + arg2 < this.field372) {
                this.field374 += arg2;
                this.method598(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field372 - this.field374;
            this.method598(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field374 += var4;
            this.method615();
            class64 var5 = (class64) this.field375.method4721();
            synchronized (var5) {
                int var7 = var5.method927(this);
                if (var7 < 0) {
                    var5.field520 = 0;
                    this.method593(var5);
                } else {
                    var5.field520 = var7;
                    this.method592(var5.field3935, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("av.d([III)V")
    public void method598(int[] arg0, int arg1, int arg2) {
        for (class59 var4 = (class59) this.field373.method4721(); var4 != null; var4 = (class59) this.field373.method4723()) {
            var4.method880(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("av.z(I)V")
    public final synchronized void method599(int arg0) {
        do {
            if (this.field372 < 0) {
                this.method600(arg0);
                return;
            }
            if (this.field374 + arg0 < this.field372) {
                this.field374 += arg0;
                this.method600(arg0);
                return;
            }
            int var2 = this.field372 - this.field374;
            this.method600(var2);
            arg0 -= var2;
            this.field374 += var2;
            this.method615();
            class64 var3 = (class64) this.field375.method4721();
            synchronized (var3) {
                int var5 = var3.method927(this);
                if (var5 < 0) {
                    var3.field520 = 0;
                    this.method593(var3);
                } else {
                    var3.field520 = var5;
                    this.method592(var3.field3935, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("av.b(I)V")
    public void method600(int arg0) {
        for (class59 var2 = (class59) this.field373.method4721(); var2 != null; var2 = (class59) this.field373.method4723()) {
            var2.method599(arg0);
        }
    }
}
