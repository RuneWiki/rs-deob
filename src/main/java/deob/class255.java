package deob;

@ObfuscatedName("ic")
public final class class255 {

    @ObfuscatedName("ic.o")
    public int field2932;

    @ObfuscatedName("ic.q")
    public int field2930;

    @ObfuscatedName("ic.l")
    public class420 field2931;

    @ObfuscatedName("ic.k")
    public class340 field2929;

    @ObfuscatedName("ic.a")
    public class254 field2933;

    public class255(int arg0) {
        this(arg0, arg0);
    }

    public class255(int arg0, int arg1) {
        this.field2929 = new class340();
        this.field2932 = arg0;
        this.field2930 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2931 = new class420(var3);
    }

    @ObfuscatedName("ic.o(J)Ljava/lang/Object;")
    public Object method4532(long arg0) {
        class259 var3 = (class259) this.field2931.method6665(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4562();
        if (var4 == null) {
            var3.method6399();
            var3.method6393();
            this.field2930 += var3.field2941;
            return null;
        }
        if (var3.method4560()) {
            class258 var5 = new class258(var4, var3.field2941);
            this.field2931.method6666(var5, var3.field4468);
            this.field2929.method5572(var5);
            var5.field4459 = 0L;
            var3.method6399();
            var3.method6393();
        } else {
            this.field2929.method5572(var3);
            var3.field4459 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ic.q(J)V")
    public void method4546(long arg0) {
        class259 var3 = (class259) this.field2931.method6665(arg0);
        this.method4533(var3);
    }

    @ObfuscatedName("ic.l(Lim;)V")
    public void method4533(class259 arg0) {
        if (arg0 != null) {
            arg0.method6399();
            arg0.method6393();
            this.field2930 += arg0.field2941;
        }
    }

    @ObfuscatedName("ic.k(Ljava/lang/Object;J)V")
    public void method4534(Object arg0, long arg1) {
        this.method4552(arg0, arg1, 1);
    }

    @ObfuscatedName("ic.a(Ljava/lang/Object;JI)V")
    public void method4552(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2932) {
            throw new IllegalStateException();
        }
        this.method4546(arg1);
        this.field2930 -= arg2;
        while (this.field2930 < 0) {
            class259 var5 = (class259) this.field2929.method5582();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4560()) {
            }
            this.method4533(var5);
            if (this.field2933 != null) {
                this.field2933.method4529(var5.method4562());
            }
        }
        class258 var6 = new class258(arg0, arg2);
        this.field2931.method6666(var6, arg1);
        this.field2929.method5572(var6);
        var6.field4459 = 0L;
    }

    @ObfuscatedName("ic.m(I)V")
    public void method4542(int arg0) {
        for (class259 var2 = (class259) this.field2929.method5589(); var2 != null; var2 = (class259) this.field2929.method5577()) {
            if (var2.method4560()) {
                if (var2.method4562() == null) {
                    var2.method6399();
                    var2.method6393();
                    this.field2930 += var2.field2941;
                }
            } else if (++var2.field4459 > (long) arg0) {
                class256 var3 = new class256(var2.method4562(), var2.field2941);
                this.field2931.method6666(var3, var2.field4468);
                class340.method5573(var3, var2);
                var2.method6399();
                var2.method6393();
            }
        }
    }

    @ObfuscatedName("ic.p()V")
    public void method4537() {
        this.field2929.method5571();
        this.field2931.method6668();
        this.field2930 = this.field2932;
    }
}
