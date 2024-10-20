package deob;

@ObfuscatedName("hk")
public final class class221 {

    @ObfuscatedName("hk.s")
    public int field2550;

    @ObfuscatedName("hk.t")
    public int field2551;

    @ObfuscatedName("hk.v")
    public class363 field2552;

    @ObfuscatedName("hk.j")
    public class301 field2553;

    @ObfuscatedName("hk.l")
    public class220 field2554;

    public class221(int arg0) {
        this(arg0, arg0);
    }

    public class221(int arg0, int arg1) {
        this.field2553 = new class301();
        this.field2550 = arg0;
        this.field2551 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2552 = new class363(var3);
    }

    @ObfuscatedName("hk.s(J)Ljava/lang/Object;")
    public Object method3896(long arg0) {
        class225 var3 = (class225) this.field2552.method5726(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3924();
        if (var4 == null) {
            var3.method5447();
            var3.method5445();
            this.field2551 += var3.field2562;
            return null;
        }
        if (var3.method3920()) {
            class224 var5 = new class224(var4, var3.field2562);
            this.field2552.method5737(var5, var3.field3966);
            this.field2553.method4845(var5);
            var5.field3958 = 0L;
            var3.method5447();
            var3.method5445();
        } else {
            this.field2553.method4845(var3);
            var3.field3958 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hk.t(J)V")
    public void method3897(long arg0) {
        class225 var3 = (class225) this.field2552.method5726(arg0);
        this.method3898(var3);
    }

    @ObfuscatedName("hk.v(Lhu;)V")
    public void method3898(class225 arg0) {
        if (arg0 != null) {
            arg0.method5447();
            arg0.method5445();
            this.field2551 += arg0.field2562;
        }
    }

    @ObfuscatedName("hk.j(Ljava/lang/Object;J)V")
    public void method3899(Object arg0, long arg1) {
        this.method3900(arg0, arg1, 1);
    }

    @ObfuscatedName("hk.l(Ljava/lang/Object;JI)V")
    public void method3900(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2550) {
            throw new IllegalStateException();
        }
        this.method3897(arg1);
        this.field2551 -= arg2;
        while (this.field2551 < 0) {
            class225 var5 = (class225) this.field2553.method4847();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3920()) {
            }
            this.method3898(var5);
            if (this.field2554 != null) {
                this.field2554.method3892(var5.method3924());
            }
        }
        class224 var6 = new class224(arg0, arg2);
        this.field2552.method5737(var6, arg1);
        this.field2553.method4845(var6);
        var6.field3958 = 0L;
    }

    @ObfuscatedName("hk.n(I)V")
    public void method3901(int arg0) {
        for (class225 var2 = (class225) this.field2553.method4848(); var2 != null; var2 = (class225) this.field2553.method4850()) {
            if (var2.method3920()) {
                if (var2.method3924() == null) {
                    var2.method5447();
                    var2.method5445();
                    this.field2551 += var2.field2562;
                }
            } else if (++var2.field3958 > (long) arg0) {
                class222 var3 = new class222(var2.method3924(), var2.field2562);
                this.field2552.method5737(var3, var2.field3966);
                class301.method4846(var3, var2);
                var2.method5447();
                var2.method5445();
            }
        }
    }

    @ObfuscatedName("hk.w()V")
    public void method3902() {
        this.field2553.method4844();
        this.field2552.method5725();
        this.field2551 = this.field2550;
    }
}
