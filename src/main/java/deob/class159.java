package deob;

@ObfuscatedName("fr")
public final class class159 {

    @ObfuscatedName("fr.h")
    public int field1984;

    @ObfuscatedName("fr.v")
    public int field1982;

    @ObfuscatedName("fr.x")
    public class327 field1983;

    @ObfuscatedName("fr.w")
    public class277 field1981 = new class277();

    @ObfuscatedName("fr.t")
    public class156 field1985;

    public class159(int arg0, int arg1) {
        this.field1984 = arg0;
        this.field1982 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1983 = new class327(var3);
    }

    @ObfuscatedName("fr.h(J)Ljava/lang/Object;")
    public Object method3184(long arg0) {
        class158 var3 = (class158) this.field1983.method5494(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3157();
        if (var4 == null) {
            var3.method3359();
            var3.method3353();
            this.field1982 += var3.field1980;
            return null;
        }
        if (var3.method3158()) {
            class157 var5 = new class157(var4, var3.field1980);
            this.field1983.method5503(var5, var3.field2138);
            this.field1981.method4624(var5);
            var5.field2131 = 0L;
            var3.method3359();
            var3.method3353();
        } else {
            this.field1981.method4624(var3);
            var3.field2131 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("fr.v(J)V")
    public void method3166(long arg0) {
        class158 var3 = (class158) this.field1983.method5494(arg0);
        this.method3167(var3);
    }

    @ObfuscatedName("fr.x(Lft;)V")
    public void method3167(class158 arg0) {
        if (arg0 != null) {
            arg0.method3359();
            arg0.method3353();
            this.field1982 += arg0.field1980;
        }
    }

    @ObfuscatedName("fr.w(Ljava/lang/Object;JI)V")
    public void method3168(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1984) {
            throw new IllegalStateException();
        }
        this.method3166(arg1);
        this.field1982 -= arg2;
        while (this.field1982 < 0) {
            class158 var5 = (class158) this.field1981.method4605();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3158()) {
            }
            this.method3167(var5);
            if (this.field1985 != null) {
                this.field1985.method3154(var5.method3157());
            }
        }
        class157 var6 = new class157(arg0, arg2);
        this.field1983.method5503(var6, arg1);
        this.field1981.method4624(var6);
        var6.field2131 = 0L;
    }

    @ObfuscatedName("fr.t(I)V")
    public void method3178(int arg0) {
        for (class158 var2 = (class158) this.field1981.method4606(); var2 != null; var2 = (class158) this.field1981.method4630()) {
            if (var2.method3158()) {
                if (var2.method3157() == null) {
                    var2.method3359();
                    var2.method3353();
                    this.field1982 += var2.field1980;
                }
            } else if (++var2.field2131 > (long) arg0) {
                class160 var3 = new class160(var2.method3157(), var2.field1980);
                this.field1983.method5503(var3, var2.field2138);
                class277.method4604(var3, var2);
                var2.method3359();
                var2.method3353();
            }
        }
    }

    @ObfuscatedName("fr.j()V")
    public void method3170() {
        this.field1981.method4629();
        this.field1983.method5495();
        this.field1982 = this.field1984;
    }
}
