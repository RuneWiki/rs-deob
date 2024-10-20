package deob;

@ObfuscatedName("je")
public final class class264 {

    @ObfuscatedName("je.a")
    public int field2973;

    @ObfuscatedName("je.f")
    public int field2974;

    @ObfuscatedName("je.c")
    public class440 field2975;

    @ObfuscatedName("je.x")
    public class354 field2976;

    @ObfuscatedName("je.h")
    public class263 field2977;

    public class264(int arg0) {
        this(arg0, arg0);
    }

    public class264(int arg0, int arg1) {
        this.field2976 = new class354();
        this.field2973 = arg0;
        this.field2974 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2975 = new class440(var3);
    }

    @ObfuscatedName("je.a(J)Ljava/lang/Object;")
    public Object method4812(long arg0) {
        class268 var3 = (class268) this.field2975.method7455(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4832();
        if (var4 == null) {
            var3.method7170();
            var3.method7169();
            this.field2974 += var3.field2985;
            return null;
        }
        if (var3.method4831()) {
            class267 var5 = new class267(var4, var3.field2985);
            this.field2975.method7448(var5, var3.field4635);
            this.field2976.method6180(var5);
            var5.field4628 = 0L;
            var3.method7170();
            var3.method7169();
        } else {
            this.field2976.method6180(var3);
            var3.field4628 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("je.f(J)V")
    public void method4807(long arg0) {
        class268 var3 = (class268) this.field2975.method7455(arg0);
        this.method4808(var3);
    }

    @ObfuscatedName("je.c(Ljy;)V")
    public void method4808(class268 arg0) {
        if (arg0 != null) {
            arg0.method7170();
            arg0.method7169();
            this.field2974 += arg0.field2985;
        }
    }

    @ObfuscatedName("je.x(Ljava/lang/Object;J)V")
    public void method4809(Object arg0, long arg1) {
        this.method4805(arg0, arg1, 1);
    }

    @ObfuscatedName("je.h(Ljava/lang/Object;JI)V")
    public void method4805(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2973) {
            throw new IllegalStateException();
        }
        this.method4807(arg1);
        this.field2974 -= arg2;
        while (this.field2974 < 0) {
            class268 var5 = (class268) this.field2976.method6169();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4831()) {
            }
            this.method4808(var5);
            if (this.field2977 != null) {
                this.field2977.method4803(var5.method4832());
            }
        }
        class267 var6 = new class267(arg0, arg2);
        this.field2975.method7448(var6, arg1);
        this.field2976.method6180(var6);
        var6.field4628 = 0L;
    }

    @ObfuscatedName("je.j(I)V")
    public void method4828(int arg0) {
        for (class268 var2 = (class268) this.field2976.method6170(); var2 != null; var2 = (class268) this.field2976.method6172()) {
            if (var2.method4831()) {
                if (var2.method4832() == null) {
                    var2.method7170();
                    var2.method7169();
                    this.field2974 += var2.field2985;
                }
            } else if (++var2.field4628 > (long) arg0) {
                class265 var3 = new class265(var2.method4832(), var2.field2985);
                this.field2975.method7448(var3, var2.field4635);
                class354.method6168(var3, var2);
                var2.method7170();
                var2.method7169();
            }
        }
    }

    @ObfuscatedName("je.y()V")
    public void method4820() {
        this.field2976.method6178();
        this.field2975.method7449();
        this.field2974 = this.field2973;
    }
}
