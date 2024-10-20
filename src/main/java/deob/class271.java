package deob;

@ObfuscatedName("jp")
public final class class271 {

    @ObfuscatedName("jp.f")
    public int field3039;

    @ObfuscatedName("jp.w")
    public int field3040;

    @ObfuscatedName("jp.v")
    public class450 field3041;

    @ObfuscatedName("jp.s")
    public class361 field3043;

    @ObfuscatedName("jp.z")
    public class270 field3042;

    public class271(int arg0) {
        this(arg0, arg0);
    }

    public class271(int arg0, int arg1) {
        this.field3043 = new class361();
        this.field3039 = arg0;
        this.field3040 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3041 = new class450(var3);
    }

    @ObfuscatedName("jp.f(J)Ljava/lang/Object;")
    public Object method4996(long arg0) {
        class275 var3 = (class275) this.field3041.method7691(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5024();
        if (var4 == null) {
            var3.method7431();
            var3.method7429();
            this.field3040 += var3.field3051;
            return null;
        }
        if (var3.method5022()) {
            class274 var5 = new class274(var4, var3.field3051);
            this.field3041.method7693(var5, var3.field4711);
            this.field3043.method6371(var5);
            var5.field4704 = 0L;
            var3.method7431();
            var3.method7429();
        } else {
            this.field3043.method6371(var3);
            var3.field4704 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("jp.w(J)V")
    public void method4994(long arg0) {
        class275 var3 = (class275) this.field3041.method7691(arg0);
        this.method4998(var3);
    }

    @ObfuscatedName("jp.v(Ljr;)V")
    public void method4998(class275 arg0) {
        if (arg0 != null) {
            arg0.method7431();
            arg0.method7429();
            this.field3040 += arg0.field3051;
        }
    }

    @ObfuscatedName("jp.s(Ljava/lang/Object;J)V")
    public void method5001(Object arg0, long arg1) {
        this.method5017(arg0, arg1, 1);
    }

    @ObfuscatedName("jp.z(Ljava/lang/Object;JI)V")
    public void method5017(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3039) {
            throw new IllegalStateException();
        }
        this.method4994(arg1);
        this.field3040 -= arg2;
        while (this.field3040 < 0) {
            class275 var5 = (class275) this.field3043.method6373();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5022()) {
            }
            this.method4998(var5);
            if (this.field3042 != null) {
                this.field3042.method4993(var5.method5024());
            }
        }
        class274 var6 = new class274(arg0, arg2);
        this.field3041.method7693(var6, arg1);
        this.field3043.method6371(var6);
        var6.field4704 = 0L;
    }

    @ObfuscatedName("jp.j(I)V")
    public void method4997(int arg0) {
        for (class275 var2 = (class275) this.field3043.method6374(); var2 != null; var2 = (class275) this.field3043.method6376()) {
            if (var2.method5022()) {
                if (var2.method5024() == null) {
                    var2.method7431();
                    var2.method7429();
                    this.field3040 += var2.field3051;
                }
            } else if (++var2.field4704 > (long) arg0) {
                class272 var3 = new class272(var2.method5024(), var2.field3051);
                this.field3041.method7693(var3, var2.field4711);
                class361.method6372(var3, var2);
                var2.method7431();
                var2.method7429();
            }
        }
    }

    @ObfuscatedName("jp.i()V")
    public void method5000() {
        this.field3043.method6370();
        this.field3041.method7698();
        this.field3040 = this.field3039;
    }
}
