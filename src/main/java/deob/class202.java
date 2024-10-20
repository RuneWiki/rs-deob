package deob;

@ObfuscatedName("gl")
public final class class202 {

    @ObfuscatedName("gl.z")
    public int field2411;

    @ObfuscatedName("gl.w")
    public int field2412;

    @ObfuscatedName("gl.s")
    public class198 field2413;

    @ObfuscatedName("gl.l")
    public class216 field2414 = new class216();

    public class202(int arg0, int arg1) {
        this.field2411 = arg0;
        this.field2412 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2413 = new class198(var3);
    }

    @ObfuscatedName("gl.z(J)Ljava/lang/Object;")
    public Object method3689(long arg0) {
        class213 var3 = (class213) this.field2413.method3637(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3628();
        if (var4 == null) {
            var3.method3756();
            var3.method3793();
            this.field2412 += var3.field2440;
            return null;
        }
        if (var3.method3630()) {
            class197 var5 = new class197(var4, var3.field2440);
            this.field2413.method3636(var5, var3.field2422);
            this.field2414.method3831(var5);
            var5.field2429 = 0L;
            var3.method3756();
            var3.method3793();
        } else {
            this.field2414.method3831(var3);
            var3.field2429 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("gl.w(J)V")
    public void method3685(long arg0) {
        class213 var3 = (class213) this.field2413.method3637(arg0);
        this.method3688(var3);
    }

    @ObfuscatedName("gl.s(Lhh;)V")
    public void method3688(class213 arg0) {
        if (arg0 != null) {
            arg0.method3756();
            arg0.method3793();
            this.field2412 += arg0.field2440;
        }
    }

    @ObfuscatedName("gl.l(Ljava/lang/Object;J)V")
    public void method3699(Object arg0, long arg1) {
        this.method3690(arg0, arg1, 1);
    }

    @ObfuscatedName("gl.u(Ljava/lang/Object;JI)V")
    public void method3690(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2411) {
            throw new IllegalStateException();
        }
        this.method3685(arg1);
        this.field2412 -= arg2;
        while (this.field2412 < 0) {
            class213 var5 = (class213) this.field2414.method3832();
            this.method3688(var5);
        }
        class197 var6 = new class197(arg0, arg2);
        this.field2413.method3636(var6, arg1);
        this.field2414.method3831(var6);
        var6.field2429 = 0L;
    }

    @ObfuscatedName("gl.q(I)V")
    public void method3691(int arg0) {
        for (class213 var2 = (class213) this.field2414.method3853(); var2 != null; var2 = (class213) this.field2414.method3835()) {
            if (var2.method3630()) {
                if (var2.method3628() == null) {
                    var2.method3756();
                    var2.method3793();
                    this.field2412 += var2.field2440;
                }
            } else if (++var2.field2429 > (long) arg0) {
                class208 var3 = new class208(var2.method3628(), var2.field2440);
                this.field2413.method3636(var3, var2.field2422);
                class195.method3601(var3, var2);
                var2.method3756();
                var2.method3793();
            }
        }
    }

    @ObfuscatedName("gl.i()V")
    public void method3698() {
        this.field2414.method3844();
        this.field2413.method3643();
        this.field2412 = this.field2411;
    }
}
