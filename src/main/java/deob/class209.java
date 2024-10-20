package deob;

@ObfuscatedName("ha")
public final class class209 {

    @ObfuscatedName("ha.a")
    public int field2500;

    @ObfuscatedName("ha.s")
    public int field2501;

    @ObfuscatedName("ha.g")
    public class205 field2499;

    @ObfuscatedName("ha.x")
    public class223 field2502 = new class223();

    public class209(int arg0, int arg1) {
        this.field2500 = arg0;
        this.field2501 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2499 = new class205(var3);
    }

    @ObfuscatedName("ha.a(J)Ljava/lang/Object;")
    public Object method3901(long arg0) {
        class220 var3 = (class220) this.field2499.method3851(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3844();
        if (var4 == null) {
            var3.method3960();
            var3.method3997();
            this.field2501 += var3.field2528;
            return null;
        }
        if (var3.method3845()) {
            class204 var5 = new class204(var4, var3.field2528);
            this.field2499.method3859(var5, var3.field2512);
            this.field2502.method4027(var5);
            var5.field2517 = 0L;
            var3.method3960();
            var3.method3997();
        } else {
            this.field2502.method4027(var3);
            var3.field2517 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ha.s(J)V")
    public void method3890(long arg0) {
        class220 var3 = (class220) this.field2499.method3851(arg0);
        this.method3891(var3);
    }

    @ObfuscatedName("ha.g(Lhg;)V")
    public void method3891(class220 arg0) {
        if (arg0 != null) {
            arg0.method3960();
            arg0.method3997();
            this.field2501 += arg0.field2528;
        }
    }

    @ObfuscatedName("ha.x(Ljava/lang/Object;JI)V")
    public void method3904(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2500) {
            throw new IllegalStateException();
        }
        this.method3890(arg1);
        this.field2501 -= arg2;
        while (this.field2501 < 0) {
            class220 var5 = (class220) this.field2502.method4028();
            this.method3891(var5);
        }
        class204 var6 = new class204(arg0, arg2);
        this.field2499.method3859(var6, arg1);
        this.field2502.method4027(var6);
        var6.field2517 = 0L;
    }

    @ObfuscatedName("ha.h(I)V")
    public void method3893(int arg0) {
        for (class220 var2 = (class220) this.field2502.method4025(); var2 != null; var2 = (class220) this.field2502.method4026()) {
            if (var2.method3845()) {
                if (var2.method3844() == null) {
                    var2.method3960();
                    var2.method3997();
                    this.field2501 += var2.field2528;
                }
            } else if (++var2.field2517 > (long) arg0) {
                class215 var3 = new class215(var2.method3844(), var2.field2528);
                this.field2499.method3859(var3, var2.field2512);
                class202.method3821(var3, var2);
                var2.method3960();
                var2.method3997();
            }
        }
    }

    @ObfuscatedName("ha.f()V")
    public void method3894() {
        this.field2502.method4034();
        this.field2499.method3853();
        this.field2501 = this.field2500;
    }
}
