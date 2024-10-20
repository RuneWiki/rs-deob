package deob;

@ObfuscatedName("ed")
public final class class150 {

    @ObfuscatedName("ed.q")
    public int field1970;

    @ObfuscatedName("ed.w")
    public int field1968;

    @ObfuscatedName("ed.e")
    public class317 field1966;

    @ObfuscatedName("ed.p")
    public class266 field1969 = new class266();

    @ObfuscatedName("ed.k")
    public class147 field1967;

    public class150(int arg0, int arg1) {
        this.field1970 = arg0;
        this.field1968 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1966 = new class317(var3);
    }

    @ObfuscatedName("ed.q(J)Ljava/lang/Object;")
    public Object method3063(long arg0) {
        class149 var3 = (class149) this.field1966.method5451(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3058();
        if (var4 == null) {
            var3.method3286();
            var3.method3276();
            this.field1968 += var3.field1965;
            return null;
        }
        if (var3.method3059()) {
            class148 var5 = new class148(var4, var3.field1965);
            this.field1966.method5465(var5, var3.field2114);
            this.field1969.method4565(var5);
            var5.field2106 = 0L;
            var3.method3286();
            var3.method3276();
        } else {
            this.field1969.method4565(var3);
            var3.field2106 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ed.w(J)V")
    public void method3070(long arg0) {
        class149 var3 = (class149) this.field1966.method5451(arg0);
        this.method3062(var3);
    }

    @ObfuscatedName("ed.e(Lew;)V")
    public void method3062(class149 arg0) {
        if (arg0 != null) {
            arg0.method3286();
            arg0.method3276();
            this.field1968 += arg0.field1965;
        }
    }

    @ObfuscatedName("ed.p(Ljava/lang/Object;JI)V")
    public void method3066(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1970) {
            throw new IllegalStateException();
        }
        this.method3070(arg1);
        this.field1968 -= arg2;
        while (this.field1968 < 0) {
            class149 var5 = (class149) this.field1969.method4567();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3059()) {
            }
            this.method3062(var5);
            if (this.field1967 != null) {
                this.field1967.method3057(var5.method3058());
            }
        }
        class148 var6 = new class148(arg0, arg2);
        this.field1966.method5465(var6, arg1);
        this.field1969.method4565(var6);
        var6.field2106 = 0L;
    }

    @ObfuscatedName("ed.k(I)V")
    public void method3065(int arg0) {
        for (class149 var2 = (class149) this.field1969.method4568(); var2 != null; var2 = (class149) this.field1969.method4598()) {
            if (var2.method3059()) {
                if (var2.method3058() == null) {
                    var2.method3286();
                    var2.method3276();
                    this.field1968 += var2.field1965;
                }
            } else if (++var2.field2106 > (long) arg0) {
                class151 var3 = new class151(var2.method3058(), var2.field1965);
                this.field1966.method5465(var3, var2.field2114);
                class266.method4573(var3, var2);
                var2.method3286();
                var2.method3276();
            }
        }
    }

    @ObfuscatedName("ed.l()V")
    public void method3072() {
        this.field1969.method4564();
        this.field1966.method5453();
        this.field1968 = this.field1970;
    }
}
