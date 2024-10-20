package deob;

@ObfuscatedName("ic")
public final class class247 {

    @ObfuscatedName("ic.c")
    public int field2792;

    @ObfuscatedName("ic.b")
    public int field2791;

    @ObfuscatedName("ic.p")
    public class396 field2793;

    @ObfuscatedName("ic.m")
    public class326 field2790;

    @ObfuscatedName("ic.t")
    public class246 field2794;

    public class247(int arg0) {
        this(arg0, arg0);
    }

    public class247(int arg0, int arg1) {
        this.field2790 = new class326();
        this.field2792 = arg0;
        this.field2791 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2793 = new class396(var3);
    }

    @ObfuscatedName("ic.c(J)Ljava/lang/Object;")
    public Object method4487(long arg0) {
        class251 var3 = (class251) this.field2793.method6429(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4506();
        if (var4 == null) {
            var3.method6163();
            var3.method6159();
            this.field2791 += var3.field2802;
            return null;
        }
        if (var3.method4507()) {
            class250 var5 = new class250(var4, var3.field2802);
            this.field2793.method6431(var5, var3.field4257);
            this.field2790.method5441(var5);
            var5.field4252 = 0L;
            var3.method6163();
            var3.method6159();
        } else {
            this.field2790.method5441(var3);
            var3.field4252 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ic.b(J)V")
    public void method4492(long arg0) {
        class251 var3 = (class251) this.field2793.method6429(arg0);
        this.method4489(var3);
    }

    @ObfuscatedName("ic.p(Lie;)V")
    public void method4489(class251 arg0) {
        if (arg0 != null) {
            arg0.method6163();
            arg0.method6159();
            this.field2791 += arg0.field2802;
        }
    }

    @ObfuscatedName("ic.m(Ljava/lang/Object;J)V")
    public void method4497(Object arg0, long arg1) {
        this.method4491(arg0, arg1, 1);
    }

    @ObfuscatedName("ic.t(Ljava/lang/Object;JI)V")
    public void method4491(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2792) {
            throw new IllegalStateException();
        }
        this.method4492(arg1);
        this.field2791 -= arg2;
        while (this.field2791 < 0) {
            class251 var5 = (class251) this.field2790.method5424();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4507()) {
            }
            this.method4489(var5);
            if (this.field2794 != null) {
                this.field2794.method4483(var5.method4506());
            }
        }
        class250 var6 = new class250(arg0, arg2);
        this.field2793.method6431(var6, arg1);
        this.field2790.method5441(var6);
        var6.field4252 = 0L;
    }

    @ObfuscatedName("ic.s(I)V")
    public void method4493(int arg0) {
        for (class251 var2 = (class251) this.field2790.method5425(); var2 != null; var2 = (class251) this.field2790.method5427()) {
            if (var2.method4507()) {
                if (var2.method4506() == null) {
                    var2.method6163();
                    var2.method6159();
                    this.field2791 += var2.field2802;
                }
            } else if (++var2.field4252 > (long) arg0) {
                class248 var3 = new class248(var2.method4506(), var2.field2802);
                this.field2793.method6431(var3, var2.field4257);
                class326.method5423(var3, var2);
                var2.method6163();
                var2.method6159();
            }
        }
    }

    @ObfuscatedName("ic.j()V")
    public void method4490() {
        this.field2790.method5421();
        this.field2793.method6432();
        this.field2791 = this.field2792;
    }
}
