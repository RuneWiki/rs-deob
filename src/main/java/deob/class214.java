package deob;

@ObfuscatedName("he")
public final class class214 {

    @ObfuscatedName("he.t")
    public int field2626;

    @ObfuscatedName("he.q")
    public int field2625;

    @ObfuscatedName("he.i")
    public class210 field2627;

    @ObfuscatedName("he.a")
    public class228 field2628 = new class228();

    public class214(int arg0, int arg1) {
        this.field2626 = arg0;
        this.field2625 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2627 = new class210(var3);
    }

    @ObfuscatedName("he.t(J)Ljava/lang/Object;")
    public Object method3640(long arg0) {
        class225 var3 = (class225) this.field2627.method3594(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3588();
        if (var4 == null) {
            var3.method3721();
            var3.method3761();
            this.field2625 += var3.field2654;
            return null;
        }
        if (var3.method3589()) {
            class209 var5 = new class209(var4, var3.field2654);
            this.field2627.method3609(var5, var3.field2636);
            this.field2628.method3794(var5);
            var5.field2642 = 0L;
            var3.method3721();
            var3.method3761();
        } else {
            this.field2628.method3794(var3);
            var3.field2642 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("he.q(J)V")
    public void method3641(long arg0) {
        class225 var3 = (class225) this.field2627.method3594(arg0);
        this.method3642(var3);
    }

    @ObfuscatedName("he.i(Lhs;)V")
    public void method3642(class225 arg0) {
        if (arg0 != null) {
            arg0.method3721();
            arg0.method3761();
            this.field2625 += arg0.field2654;
        }
    }

    @ObfuscatedName("he.a(Ljava/lang/Object;J)V")
    public void method3656(Object arg0, long arg1) {
        this.method3643(arg0, arg1, 1);
    }

    @ObfuscatedName("he.l(Ljava/lang/Object;JI)V")
    public void method3643(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2626) {
            throw new IllegalStateException();
        }
        this.method3641(arg1);
        this.field2625 -= arg2;
        while (this.field2625 < 0) {
            class225 var5 = (class225) this.field2628.method3795();
            this.method3642(var5);
        }
        class209 var6 = new class209(arg0, arg2);
        this.field2627.method3609(var6, arg1);
        this.field2628.method3794(var6);
        var6.field2642 = 0L;
    }

    @ObfuscatedName("he.b(I)V")
    public void method3639(int arg0) {
        for (class225 var2 = (class225) this.field2628.method3796(); var2 != null; var2 = (class225) this.field2628.method3813()) {
            if (var2.method3589()) {
                if (var2.method3588() == null) {
                    var2.method3721();
                    var2.method3761();
                    this.field2625 += var2.field2654;
                }
            } else if (++var2.field2642 > (long) arg0) {
                class220 var3 = new class220(var2.method3588(), var2.field2654);
                this.field2627.method3609(var3, var2.field2636);
                class207.method3577(var3, var2);
                var2.method3721();
                var2.method3761();
            }
        }
    }

    @ObfuscatedName("he.e()V")
    public void method3645() {
        this.field2628.method3793();
        this.field2627.method3597();
        this.field2625 = this.field2626;
    }
}
