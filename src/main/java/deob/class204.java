package deob;

@ObfuscatedName("gz")
public final class class204 {

    @ObfuscatedName("gz.y")
    public int field2462;

    @ObfuscatedName("gz.c")
    public int field2459;

    @ObfuscatedName("gz.n")
    public class200 field2461;

    @ObfuscatedName("gz.u")
    public class218 field2460 = new class218();

    public class204(int arg0, int arg1) {
        this.field2462 = arg0;
        this.field2459 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2461 = new class200(var3);
    }

    @ObfuscatedName("gz.y(J)Ljava/lang/Object;")
    public Object method3701(long arg0) {
        class215 var3 = (class215) this.field2461.method3667(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3642();
        if (var4 == null) {
            var3.method3766();
            var3.method3809();
            this.field2459 += var3.field2488;
            return null;
        }
        if (var3.method3641()) {
            class199 var5 = new class199(var4, var3.field2488);
            this.field2461.method3651(var5, var3.field2470);
            this.field2460.method3845(var5);
            var5.field2475 = 0L;
            var3.method3766();
            var3.method3809();
        } else {
            this.field2460.method3845(var3);
            var3.field2475 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("gz.c(J)V")
    public void method3700(long arg0) {
        class215 var3 = (class215) this.field2461.method3667(arg0);
        this.method3703(var3);
    }

    @ObfuscatedName("gz.n(Lhf;)V")
    public void method3703(class215 arg0) {
        if (arg0 != null) {
            arg0.method3766();
            arg0.method3809();
            this.field2459 += arg0.field2488;
        }
    }

    @ObfuscatedName("gz.u(Ljava/lang/Object;J)V")
    public void method3704(Object arg0, long arg1) {
        this.method3705(arg0, arg1, 1);
    }

    @ObfuscatedName("gz.i(Ljava/lang/Object;JI)V")
    public void method3705(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2462) {
            throw new IllegalStateException();
        }
        this.method3700(arg1);
        this.field2459 -= arg2;
        while (this.field2459 < 0) {
            class215 var5 = (class215) this.field2460.method3852();
            this.method3703(var5);
        }
        class199 var6 = new class199(arg0, arg2);
        this.field2461.method3651(var6, arg1);
        this.field2460.method3845(var6);
        var6.field2475 = 0L;
    }

    @ObfuscatedName("gz.p(I)V")
    public void method3706(int arg0) {
        for (class215 var2 = (class215) this.field2460.method3857(); var2 != null; var2 = (class215) this.field2460.method3849()) {
            if (var2.method3641()) {
                if (var2.method3642() == null) {
                    var2.method3766();
                    var2.method3809();
                    this.field2459 += var2.field2488;
                }
            } else if (++var2.field2475 > (long) arg0) {
                class210 var3 = new class210(var2.method3642(), var2.field2488);
                this.field2461.method3651(var3, var2.field2470);
                class197.method3625(var3, var2);
                var2.method3766();
                var2.method3809();
            }
        }
    }

    @ObfuscatedName("gz.e()V")
    public void method3707() {
        this.field2460.method3854();
        this.field2461.method3652();
        this.field2459 = this.field2462;
    }
}
