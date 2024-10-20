package deob;

@ObfuscatedName("hn")
public final class class219 {

    @ObfuscatedName("hn.v")
    public int field2563;

    @ObfuscatedName("hn.n")
    public int field2561;

    @ObfuscatedName("hn.f")
    public class361 field2562;

    @ObfuscatedName("hn.y")
    public class299 field2560;

    @ObfuscatedName("hn.p")
    public class218 field2564;

    public class219(int arg0) {
        this(arg0, arg0);
    }

    public class219(int arg0, int arg1) {
        this.field2560 = new class299();
        this.field2563 = arg0;
        this.field2561 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2562 = new class361(var3);
    }

    @ObfuscatedName("hn.v(J)Ljava/lang/Object;")
    public Object method3911(long arg0) {
        class223 var3 = (class223) this.field2562.method5752(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3938();
        if (var4 == null) {
            var3.method5496();
            var3.method5487();
            this.field2561 += var3.field2572;
            return null;
        }
        if (var3.method3941()) {
            class222 var5 = new class222(var4, var3.field2572);
            this.field2562.method5754(var5, var3.field3938);
            this.field2560.method4853(var5);
            var5.field3932 = 0L;
            var3.method5496();
            var3.method5487();
        } else {
            this.field2560.method4853(var3);
            var3.field3932 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hn.n(J)V")
    public void method3925(long arg0) {
        class223 var3 = (class223) this.field2562.method5752(arg0);
        this.method3918(var3);
    }

    @ObfuscatedName("hn.f(Lhe;)V")
    public void method3918(class223 arg0) {
        if (arg0 != null) {
            arg0.method5496();
            arg0.method5487();
            this.field2561 += arg0.field2572;
        }
    }

    @ObfuscatedName("hn.y(Ljava/lang/Object;J)V")
    public void method3914(Object arg0, long arg1) {
        this.method3913(arg0, arg1, 1);
    }

    @ObfuscatedName("hn.p(Ljava/lang/Object;JI)V")
    public void method3913(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2563) {
            throw new IllegalStateException();
        }
        this.method3925(arg1);
        this.field2561 -= arg2;
        while (this.field2561 < 0) {
            class223 var5 = (class223) this.field2560.method4855();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3941()) {
            }
            this.method3918(var5);
            if (this.field2564 != null) {
                this.field2564.method3906(var5.method3938());
            }
        }
        class222 var6 = new class222(arg0, arg2);
        this.field2562.method5754(var6, arg1);
        this.field2560.method4853(var6);
        var6.field3932 = 0L;
    }

    @ObfuscatedName("hn.j(I)V")
    public void method3916(int arg0) {
        for (class223 var2 = (class223) this.field2560.method4856(); var2 != null; var2 = (class223) this.field2560.method4858()) {
            if (var2.method3941()) {
                if (var2.method3938() == null) {
                    var2.method5496();
                    var2.method5487();
                    this.field2561 += var2.field2572;
                }
            } else if (++var2.field3932 > (long) arg0) {
                class220 var3 = new class220(var2.method3938(), var2.field2572);
                this.field2562.method5754(var3, var2.field3938);
                class299.method4854(var3, var2);
                var2.method5496();
                var2.method5487();
            }
        }
    }

    @ObfuscatedName("hn.r()V")
    public void method3917() {
        this.field2560.method4862();
        this.field2562.method5761();
        this.field2561 = this.field2563;
    }
}
