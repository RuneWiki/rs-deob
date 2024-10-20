package deob;

@ObfuscatedName("gq")
public final class class204 {

    @ObfuscatedName("gq.f")
    public int field2485;

    @ObfuscatedName("gq.l")
    public int field2484;

    @ObfuscatedName("gq.w")
    public class200 field2486;

    @ObfuscatedName("gq.s")
    public class218 field2487 = new class218();

    public class204(int arg0, int arg1) {
        this.field2485 = arg0;
        this.field2484 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2486 = new class200(var3);
    }

    @ObfuscatedName("gq.f(J)Ljava/lang/Object;")
    public Object method3755(long arg0) {
        class215 var3 = (class215) this.field2486.method3706(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3702();
        if (var4 == null) {
            var3.method3818();
            var3.method3851();
            this.field2484 += var3.field2513;
            return null;
        }
        if (var3.method3703()) {
            class199 var5 = new class199(var4, var3.field2513);
            this.field2486.method3708(var5, var3.field2497);
            this.field2487.method3899(var5);
            var5.field2500 = 0L;
            var3.method3818();
            var3.method3851();
        } else {
            this.field2487.method3899(var3);
            var3.field2500 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("gq.l(J)V")
    public void method3766(long arg0) {
        class215 var3 = (class215) this.field2486.method3706(arg0);
        this.method3757(var3);
    }

    @ObfuscatedName("gq.w(Lhv;)V")
    public void method3757(class215 arg0) {
        if (arg0 != null) {
            arg0.method3818();
            arg0.method3851();
            this.field2484 += arg0.field2513;
        }
    }

    @ObfuscatedName("gq.s(Ljava/lang/Object;J)V")
    public void method3758(Object arg0, long arg1) {
        this.method3759(arg0, arg1, 1);
    }

    @ObfuscatedName("gq.e(Ljava/lang/Object;JI)V")
    public void method3759(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2485) {
            throw new IllegalStateException();
        }
        this.method3766(arg1);
        this.field2484 -= arg2;
        while (this.field2484 < 0) {
            class215 var5 = (class215) this.field2487.method3898();
            this.method3757(var5);
        }
        class199 var6 = new class199(arg0, arg2);
        this.field2486.method3708(var6, arg1);
        this.field2487.method3899(var6);
        var6.field2500 = 0L;
    }

    @ObfuscatedName("gq.c(I)V")
    public void method3756(int arg0) {
        for (class215 var2 = (class215) this.field2487.method3907(); var2 != null; var2 = (class215) this.field2487.method3896()) {
            if (var2.method3703()) {
                if (var2.method3702() == null) {
                    var2.method3818();
                    var2.method3851();
                    this.field2484 += var2.field2513;
                }
            } else if (++var2.field2500 > (long) arg0) {
                class210 var3 = new class210(var2.method3702(), var2.field2513);
                this.field2486.method3708(var3, var2.field2497);
                class197.method3687(var3, var2);
                var2.method3818();
                var2.method3851();
            }
        }
    }

    @ObfuscatedName("gq.p()V")
    public void method3760() {
        this.field2487.method3897();
        this.field2486.method3709();
        this.field2484 = this.field2485;
    }
}
