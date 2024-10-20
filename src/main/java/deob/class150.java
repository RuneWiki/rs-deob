package deob;

@ObfuscatedName("eu")
public final class class150 {

    @ObfuscatedName("eu.z")
    public int field1944;

    @ObfuscatedName("eu.n")
    public int field1942;

    @ObfuscatedName("eu.v")
    public class316 field1943;

    @ObfuscatedName("eu.u")
    public class266 field1941 = new class266();

    @ObfuscatedName("eu.r")
    public class147 field1945;

    public class150(int arg0, int arg1) {
        this.field1944 = arg0;
        this.field1942 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1943 = new class316(var3);
    }

    @ObfuscatedName("eu.z(J)Ljava/lang/Object;")
    public Object method3024(long arg0) {
        class149 var3 = (class149) this.field1943.method5362(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3015();
        if (var4 == null) {
            var3.method3249();
            var3.method3240();
            this.field1942 += var3.field1940;
            return null;
        }
        if (var3.method3018()) {
            class148 var5 = new class148(var4, var3.field1940);
            this.field1943.method5363(var5, var3.field2094);
            this.field1941.method4507(var5);
            var5.field2085 = 0L;
            var3.method3249();
            var3.method3240();
        } else {
            this.field1941.method4507(var3);
            var3.field2085 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("eu.n(J)V")
    public void method3021(long arg0) {
        class149 var3 = (class149) this.field1943.method5362(arg0);
        this.method3023(var3);
    }

    @ObfuscatedName("eu.v(Lec;)V")
    public void method3023(class149 arg0) {
        if (arg0 != null) {
            arg0.method3249();
            arg0.method3240();
            this.field1942 += arg0.field1940;
        }
    }

    @ObfuscatedName("eu.u(Ljava/lang/Object;JI)V")
    public void method3036(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1944) {
            throw new IllegalStateException();
        }
        this.method3021(arg1);
        this.field1942 -= arg2;
        while (this.field1942 < 0) {
            class149 var5 = (class149) this.field1941.method4523();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3018()) {
            }
            this.method3023(var5);
            if (this.field1945 != null) {
                this.field1945.method3013(var5.method3015());
            }
        }
        class148 var6 = new class148(arg0, arg2);
        this.field1943.method5363(var6, arg1);
        this.field1941.method4507(var6);
        var6.field2085 = 0L;
    }

    @ObfuscatedName("eu.r(I)V")
    public void method3025(int arg0) {
        for (class149 var2 = (class149) this.field1941.method4501(); var2 != null; var2 = (class149) this.field1941.method4505()) {
            if (var2.method3018()) {
                if (var2.method3015() == null) {
                    var2.method3249();
                    var2.method3240();
                    this.field1942 += var2.field1940;
                }
            } else if (++var2.field2085 > (long) arg0) {
                class151 var3 = new class151(var2.method3015(), var2.field1940);
                this.field1943.method5363(var3, var2.field2094);
                class266.method4502(var3, var2);
                var2.method3249();
                var2.method3240();
            }
        }
    }

    @ObfuscatedName("eu.p()V")
    public void method3026() {
        this.field1941.method4500();
        this.field1943.method5364();
        this.field1942 = this.field1944;
    }
}
