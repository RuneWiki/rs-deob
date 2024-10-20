package deob;

@ObfuscatedName("gz")
public final class class204 {

    @ObfuscatedName("gz.g")
    public int field2487;

    @ObfuscatedName("gz.r")
    public int field2486;

    @ObfuscatedName("gz.e")
    public class200 field2488;

    @ObfuscatedName("gz.q")
    public class218 field2485 = new class218();

    public class204(int arg0, int arg1) {
        this.field2487 = arg0;
        this.field2486 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2488 = new class200(var3);
    }

    @ObfuscatedName("gz.g(J)Ljava/lang/Object;")
    public Object method3895(long arg0) {
        class215 var3 = (class215) this.field2488.method3866(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3846();
        if (var4 == null) {
            var3.method3952();
            var3.method3989();
            this.field2486 += var3.field2514;
            return null;
        }
        if (var3.method3845()) {
            class199 var5 = new class199(var4, var3.field2514);
            this.field2488.method3851(var5, var3.field2497);
            this.field2485.method4027(var5);
            var5.field2502 = 0L;
            var3.method3952();
            var3.method3989();
        } else {
            this.field2485.method4027(var3);
            var3.field2502 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("gz.r(J)V")
    public void method3891(long arg0) {
        class215 var3 = (class215) this.field2488.method3866(arg0);
        this.method3892(var3);
    }

    @ObfuscatedName("gz.e(Lhr;)V")
    public void method3892(class215 arg0) {
        if (arg0 != null) {
            arg0.method3952();
            arg0.method3989();
            this.field2486 += arg0.field2514;
        }
    }

    @ObfuscatedName("gz.q(Ljava/lang/Object;J)V")
    public void method3893(Object arg0, long arg1) {
        this.method3894(arg0, arg1, 1);
    }

    @ObfuscatedName("gz.c(Ljava/lang/Object;JI)V")
    public void method3894(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2487) {
            throw new IllegalStateException();
        }
        this.method3891(arg1);
        this.field2486 -= arg2;
        while (this.field2486 < 0) {
            class215 var5 = (class215) this.field2485.method4029();
            this.method3892(var5);
        }
        class199 var6 = new class199(arg0, arg2);
        this.field2488.method3851(var6, arg1);
        this.field2485.method4027(var6);
        var6.field2502 = 0L;
    }

    @ObfuscatedName("gz.i(I)V")
    public void method3897(int arg0) {
        for (class215 var2 = (class215) this.field2485.method4022(); var2 != null; var2 = (class215) this.field2485.method4026()) {
            if (var2.method3845()) {
                if (var2.method3846() == null) {
                    var2.method3952();
                    var2.method3989();
                    this.field2486 += var2.field2514;
                }
            } else if (++var2.field2502 > (long) arg0) {
                class210 var3 = new class210(var2.method3846(), var2.field2514);
                this.field2488.method3851(var3, var2.field2497);
                class197.method3832(var3, var2);
                var2.method3952();
                var2.method3989();
            }
        }
    }

    @ObfuscatedName("gz.p()V")
    public void method3900() {
        this.field2485.method4021();
        this.field2488.method3859();
        this.field2486 = this.field2487;
    }
}
