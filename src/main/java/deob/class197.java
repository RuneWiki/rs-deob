package deob;

@ObfuscatedName("go")
public final class class197 {

    @ObfuscatedName("go.f")
    public int field2202;

    @ObfuscatedName("go.o")
    public int field2204;

    @ObfuscatedName("go.u")
    public class360 field2203;

    @ObfuscatedName("go.p")
    public class277 field2201 = new class277();

    @ObfuscatedName("go.b")
    public class196 field2205;

    public class197(int arg0, int arg1) {
        this.field2202 = arg0;
        this.field2204 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2203 = new class360(var3);
    }

    @ObfuscatedName("go.f(J)Ljava/lang/Object;")
    public Object method3353(long arg0) {
        class201 var3 = (class201) this.field2203.method5621(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3381();
        if (var4 == null) {
            var3.method5354();
            var3.method5349();
            this.field2204 += var3.field2213;
            return null;
        }
        if (var3.method3382()) {
            class200 var5 = new class200(var4, var3.field2213);
            this.field2203.method5630(var5, var3.field3941);
            this.field2201.method4297(var5);
            var5.field3935 = 0L;
            var3.method5354();
            var3.method5349();
        } else {
            this.field2201.method4297(var3);
            var3.field3935 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("go.o(J)V")
    public void method3354(long arg0) {
        class201 var3 = (class201) this.field2203.method5621(arg0);
        this.method3355(var3);
    }

    @ObfuscatedName("go.u(Lgm;)V")
    public void method3355(class201 arg0) {
        if (arg0 != null) {
            arg0.method5354();
            arg0.method5349();
            this.field2204 += arg0.field2213;
        }
    }

    @ObfuscatedName("go.p(Ljava/lang/Object;J)V")
    public void method3362(Object arg0, long arg1) {
        this.method3357(arg0, arg1, 1);
    }

    @ObfuscatedName("go.b(Ljava/lang/Object;JI)V")
    public void method3357(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2202) {
            throw new IllegalStateException();
        }
        this.method3354(arg1);
        this.field2204 -= arg2;
        while (this.field2204 < 0) {
            class201 var5 = (class201) this.field2201.method4299();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3382()) {
            }
            this.method3355(var5);
            if (this.field2205 != null) {
                this.field2205.method3351(var5.method3381());
            }
        }
        class200 var6 = new class200(arg0, arg2);
        this.field2203.method5630(var6, arg1);
        this.field2201.method4297(var6);
        var6.field3935 = 0L;
    }

    @ObfuscatedName("go.e(I)V")
    public void method3358(int arg0) {
        for (class201 var2 = (class201) this.field2201.method4300(); var2 != null; var2 = (class201) this.field2201.method4302()) {
            if (var2.method3382()) {
                if (var2.method3381() == null) {
                    var2.method5354();
                    var2.method5349();
                    this.field2204 += var2.field2213;
                }
            } else if (++var2.field3935 > (long) arg0) {
                class198 var3 = new class198(var2.method3381(), var2.field2213);
                this.field2203.method5630(var3, var2.field3941);
                class277.method4309(var3, var2);
                var2.method5354();
                var2.method5349();
            }
        }
    }

    @ObfuscatedName("go.k()V")
    public void method3373() {
        this.field2201.method4296();
        this.field2203.method5623();
        this.field2204 = this.field2202;
    }
}
