package deob;

@ObfuscatedName("hr")
public final class class209 {

    @ObfuscatedName("hr.n")
    public int field2489;

    @ObfuscatedName("hr.h")
    public int field2490;

    @ObfuscatedName("hr.l")
    public class205 field2491;

    @ObfuscatedName("hr.g")
    public class223 field2492 = new class223();

    public class209(int arg0, int arg1) {
        this.field2489 = arg0;
        this.field2490 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2491 = new class205(var3);
    }

    @ObfuscatedName("hr.n(J)Ljava/lang/Object;")
    public Object method3911(long arg0) {
        class220 var3 = (class220) this.field2491.method3870(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3861();
        if (var4 == null) {
            var3.method3973();
            var3.method4025();
            this.field2490 += var3.field2518;
            return null;
        }
        if (var3.method3866()) {
            class204 var5 = new class204(var4, var3.field2518);
            this.field2491.method3877(var5, var3.field2502);
            this.field2492.method4067(var5);
            var5.field2507 = 0L;
            var3.method3973();
            var3.method4025();
        } else {
            this.field2492.method4067(var3);
            var3.field2507 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hr.h(J)V")
    public void method3923(long arg0) {
        class220 var3 = (class220) this.field2491.method3870(arg0);
        this.method3913(var3);
    }

    @ObfuscatedName("hr.l(Lhs;)V")
    public void method3913(class220 arg0) {
        if (arg0 != null) {
            arg0.method3973();
            arg0.method4025();
            this.field2490 += arg0.field2518;
        }
    }

    @ObfuscatedName("hr.g(Ljava/lang/Object;JI)V")
    public void method3928(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2489) {
            throw new IllegalStateException();
        }
        this.method3923(arg1);
        this.field2490 -= arg2;
        while (this.field2490 < 0) {
            class220 var5 = (class220) this.field2492.method4060();
            this.method3913(var5);
        }
        class204 var6 = new class204(arg0, arg2);
        this.field2491.method3877(var6, arg1);
        this.field2492.method4067(var6);
        var6.field2507 = 0L;
    }

    @ObfuscatedName("hr.b(I)V")
    public void method3915(int arg0) {
        for (class220 var2 = (class220) this.field2492.method4062(); var2 != null; var2 = (class220) this.field2492.method4064()) {
            if (var2.method3866()) {
                if (var2.method3861() == null) {
                    var2.method3973();
                    var2.method4025();
                    this.field2490 += var2.field2518;
                }
            } else if (++var2.field2507 > (long) arg0) {
                class215 var3 = new class215(var2.method3861(), var2.field2518);
                this.field2491.method3877(var3, var2.field2502);
                class202.method3842(var3, var2);
                var2.method3973();
                var2.method4025();
            }
        }
    }

    @ObfuscatedName("hr.a()V")
    public void method3916() {
        this.field2492.method4061();
        this.field2491.method3872();
        this.field2490 = this.field2489;
    }
}
