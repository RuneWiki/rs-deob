package deob;

@ObfuscatedName("fl")
public final class class159 {

    @ObfuscatedName("fl.x")
    public int field1977;

    @ObfuscatedName("fl.m")
    public int field1978;

    @ObfuscatedName("fl.k")
    public class326 field1979;

    @ObfuscatedName("fl.d")
    public class276 field1980 = new class276();

    @ObfuscatedName("fl.w")
    public class156 field1981;

    public class159(int arg0, int arg1) {
        this.field1977 = arg0;
        this.field1978 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1979 = new class326(var3);
    }

    @ObfuscatedName("fl.x(J)Ljava/lang/Object;")
    public Object method3180(long arg0) {
        class158 var3 = (class158) this.field1979.method5519(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3160();
        if (var4 == null) {
            var3.method3355();
            var3.method3351();
            this.field1978 += var3.field1976;
            return null;
        }
        if (var3.method3159()) {
            class157 var5 = new class157(var4, var3.field1976);
            this.field1979.method5514(var5, var3.field2117);
            this.field1980.method4627(var5);
            var5.field2109 = 0L;
            var3.method3355();
            var3.method3351();
        } else {
            this.field1980.method4627(var3);
            var3.field2109 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("fl.m(J)V")
    public void method3165(long arg0) {
        class158 var3 = (class158) this.field1979.method5519(arg0);
        this.method3169(var3);
    }

    @ObfuscatedName("fl.k(Lfw;)V")
    public void method3169(class158 arg0) {
        if (arg0 != null) {
            arg0.method3355();
            arg0.method3351();
            this.field1978 += arg0.field1976;
        }
    }

    @ObfuscatedName("fl.d(Ljava/lang/Object;JI)V")
    public void method3167(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1977) {
            throw new IllegalStateException();
        }
        this.method3165(arg1);
        this.field1978 -= arg2;
        while (this.field1978 < 0) {
            class158 var5 = (class158) this.field1980.method4621();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3159()) {
            }
            this.method3169(var5);
            if (this.field1981 != null) {
                this.field1981.method3156(var5.method3160());
            }
        }
        class157 var6 = new class157(arg0, arg2);
        this.field1979.method5514(var6, arg1);
        this.field1980.method4627(var6);
        var6.field2109 = 0L;
    }

    @ObfuscatedName("fl.w(I)V")
    public void method3168(int arg0) {
        for (class158 var2 = (class158) this.field1980.method4635(); var2 != null; var2 = (class158) this.field1980.method4624()) {
            if (var2.method3159()) {
                if (var2.method3160() == null) {
                    var2.method3355();
                    var2.method3351();
                    this.field1978 += var2.field1976;
                }
            } else if (++var2.field2109 > (long) arg0) {
                class160 var3 = new class160(var2.method3160(), var2.field1976);
                this.field1979.method5514(var3, var2.field2117);
                class276.method4620(var3, var2);
                var2.method3355();
                var2.method3351();
            }
        }
    }

    @ObfuscatedName("fl.v()V")
    public void method3179() {
        this.field1980.method4638();
        this.field1979.method5515();
        this.field1978 = this.field1977;
    }
}
