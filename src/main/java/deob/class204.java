package deob;

@ObfuscatedName("gw")
public final class class204 {

    @ObfuscatedName("gw.c")
    public int field2454;

    @ObfuscatedName("gw.q")
    public int field2455;

    @ObfuscatedName("gw.m")
    public class200 field2456;

    @ObfuscatedName("gw.j")
    public class218 field2457 = new class218();

    public class204(int arg0, int arg1) {
        this.field2454 = arg0;
        this.field2455 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2456 = new class200(var3);
    }

    @ObfuscatedName("gw.c(J)Ljava/lang/Object;")
    public Object method3667(long arg0) {
        class215 var3 = (class215) this.field2456.method3619(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3612();
        if (var4 == null) {
            var3.method3733();
            var3.method3765();
            this.field2455 += var3.field2483;
            return null;
        }
        if (var3.method3613()) {
            class199 var5 = new class199(var4, var3.field2483);
            this.field2456.method3626(var5, var3.field2466);
            this.field2457.method3802(var5);
            var5.field2470 = 0L;
            var3.method3733();
            var3.method3765();
        } else {
            this.field2457.method3802(var3);
            var3.field2470 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("gw.q(J)V")
    public void method3663(long arg0) {
        class215 var3 = (class215) this.field2456.method3619(arg0);
        this.method3672(var3);
    }

    @ObfuscatedName("gw.m(Lhq;)V")
    public void method3672(class215 arg0) {
        if (arg0 != null) {
            arg0.method3733();
            arg0.method3765();
            this.field2455 += arg0.field2483;
        }
    }

    @ObfuscatedName("gw.j(Ljava/lang/Object;J)V")
    public void method3665(Object arg0, long arg1) {
        this.method3666(arg0, arg1, 1);
    }

    @ObfuscatedName("gw.g(Ljava/lang/Object;JI)V")
    public void method3666(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2454) {
            throw new IllegalStateException();
        }
        this.method3663(arg1);
        this.field2455 -= arg2;
        while (this.field2455 < 0) {
            class215 var5 = (class215) this.field2457.method3803();
            this.method3672(var5);
        }
        class199 var6 = new class199(arg0, arg2);
        this.field2456.method3626(var6, arg1);
        this.field2457.method3802(var6);
        var6.field2470 = 0L;
    }

    @ObfuscatedName("gw.i(I)V")
    public void method3674(int arg0) {
        for (class215 var2 = (class215) this.field2457.method3825(); var2 != null; var2 = (class215) this.field2457.method3814()) {
            if (var2.method3613()) {
                if (var2.method3612() == null) {
                    var2.method3733();
                    var2.method3765();
                    this.field2455 += var2.field2483;
                }
            } else if (++var2.field2470 > (long) arg0) {
                class210 var3 = new class210(var2.method3612(), var2.field2483);
                this.field2456.method3626(var3, var2.field2466);
                class197.method3597(var3, var2);
                var2.method3733();
                var2.method3765();
            }
        }
    }

    @ObfuscatedName("gw.h()V")
    public void method3668() {
        this.field2457.method3801();
        this.field2456.method3620();
        this.field2455 = this.field2454;
    }
}
