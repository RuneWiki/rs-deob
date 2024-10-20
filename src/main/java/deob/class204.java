package deob;

@ObfuscatedName("gc")
public final class class204 {

    @ObfuscatedName("gc.v")
    public int field2452;

    @ObfuscatedName("gc.s")
    public int field2453;

    @ObfuscatedName("gc.o")
    public class200 field2454;

    @ObfuscatedName("gc.k")
    public class218 field2455 = new class218();

    public class204(int arg0, int arg1) {
        this.field2452 = arg0;
        this.field2453 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2454 = new class200(var3);
    }

    @ObfuscatedName("gc.v(J)Ljava/lang/Object;")
    public Object method3706(long arg0) {
        class215 var3 = (class215) this.field2454.method3659(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3652();
        if (var4 == null) {
            var3.method3787();
            var3.method3826();
            this.field2453 += var3.field2481;
            return null;
        }
        if (var3.method3653()) {
            class199 var5 = new class199(var4, var3.field2481);
            this.field2454.method3660(var5, var3.field2464);
            this.field2455.method3860(var5);
            var5.field2468 = 0L;
            var3.method3787();
            var3.method3826();
        } else {
            this.field2455.method3860(var3);
            var3.field2468 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("gc.s(J)V")
    public void method3707(long arg0) {
        class215 var3 = (class215) this.field2454.method3659(arg0);
        this.method3711(var3);
    }

    @ObfuscatedName("gc.o(Lhp;)V")
    public void method3711(class215 arg0) {
        if (arg0 != null) {
            arg0.method3787();
            arg0.method3826();
            this.field2453 += arg0.field2481;
        }
    }

    @ObfuscatedName("gc.k(Ljava/lang/Object;J)V")
    public void method3732(Object arg0, long arg1) {
        this.method3709(arg0, arg1, 1);
    }

    @ObfuscatedName("gc.u(Ljava/lang/Object;JI)V")
    public void method3709(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2452) {
            throw new IllegalStateException();
        }
        this.method3707(arg1);
        this.field2453 -= arg2;
        while (this.field2453 < 0) {
            class215 var5 = (class215) this.field2455.method3862();
            this.method3711(var5);
        }
        class199 var6 = new class199(arg0, arg2);
        this.field2454.method3660(var6, arg1);
        this.field2455.method3860(var6);
        var6.field2468 = 0L;
    }

    @ObfuscatedName("gc.i(I)V")
    public void method3710(int arg0) {
        for (class215 var2 = (class215) this.field2455.method3863(); var2 != null; var2 = (class215) this.field2455.method3867()) {
            if (var2.method3653()) {
                if (var2.method3652() == null) {
                    var2.method3787();
                    var2.method3826();
                    this.field2453 += var2.field2481;
                }
            } else if (++var2.field2468 > (long) arg0) {
                class210 var3 = new class210(var2.method3652(), var2.field2481);
                this.field2454.method3660(var3, var2.field2464);
                class197.method3648(var3, var2);
                var2.method3787();
                var2.method3826();
            }
        }
    }

    @ObfuscatedName("gc.t()V")
    public void method3729() {
        this.field2455.method3875();
        this.field2454.method3661();
        this.field2453 = this.field2452;
    }
}
