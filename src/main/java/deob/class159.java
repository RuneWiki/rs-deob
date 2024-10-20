package deob;

@ObfuscatedName("fi")
public final class class159 {

    @ObfuscatedName("fi.f")
    public int field1984;

    @ObfuscatedName("fi.b")
    public int field1985;

    @ObfuscatedName("fi.l")
    public class327 field1983;

    @ObfuscatedName("fi.m")
    public class277 field1986 = new class277();

    @ObfuscatedName("fi.z")
    public class156 field1987;

    public class159(int arg0, int arg1) {
        this.field1984 = arg0;
        this.field1985 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1983 = new class327(var3);
    }

    @ObfuscatedName("fi.f(J)Ljava/lang/Object;")
    public Object method3200(long arg0) {
        class158 var3 = (class158) this.field1983.method5561(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3171();
        if (var4 == null) {
            var3.method3407();
            var3.method3400();
            this.field1985 += var3.field1982;
            return null;
        }
        if (var3.method3173()) {
            class157 var5 = new class157(var4, var3.field1982);
            this.field1983.method5576(var5, var3.field2140);
            this.field1986.method4694(var5);
            var5.field2132 = 0L;
            var3.method3407();
            var3.method3400();
        } else {
            this.field1986.method4694(var3);
            var3.field2132 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("fi.b(J)V")
    public void method3187(long arg0) {
        class158 var3 = (class158) this.field1983.method5561(arg0);
        this.method3180(var3);
    }

    @ObfuscatedName("fi.l(Lfw;)V")
    public void method3180(class158 arg0) {
        if (arg0 != null) {
            arg0.method3407();
            arg0.method3400();
            this.field1985 += arg0.field1982;
        }
    }

    @ObfuscatedName("fi.m(Ljava/lang/Object;JI)V")
    public void method3198(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1984) {
            throw new IllegalStateException();
        }
        this.method3187(arg1);
        this.field1985 -= arg2;
        while (this.field1985 < 0) {
            class158 var5 = (class158) this.field1986.method4696();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3173()) {
            }
            this.method3180(var5);
            if (this.field1987 != null) {
                this.field1987.method3166(var5.method3171());
            }
        }
        class157 var6 = new class157(arg0, arg2);
        this.field1983.method5576(var6, arg1);
        this.field1986.method4694(var6);
        var6.field2132 = 0L;
    }

    @ObfuscatedName("fi.z(I)V")
    public void method3195(int arg0) {
        for (class158 var2 = (class158) this.field1986.method4700(); var2 != null; var2 = (class158) this.field1986.method4699()) {
            if (var2.method3173()) {
                if (var2.method3171() == null) {
                    var2.method3407();
                    var2.method3400();
                    this.field1985 += var2.field1982;
                }
            } else if (++var2.field2132 > (long) arg0) {
                class160 var3 = new class160(var2.method3171(), var2.field1982);
                this.field1983.method5576(var3, var2.field2140);
                class277.method4716(var3, var2);
                var2.method3407();
                var2.method3400();
            }
        }
    }

    @ObfuscatedName("fi.q()V")
    public void method3183() {
        this.field1986.method4693();
        this.field1983.method5563();
        this.field1985 = this.field1984;
    }
}
