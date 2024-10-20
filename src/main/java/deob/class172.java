package deob;

@ObfuscatedName("fh")
public final class class172 {

    @ObfuscatedName("fh.p")
    public class183 field2847 = new class183();

    @ObfuscatedName("fh.g")
    public int field2845;

    @ObfuscatedName("fh.x")
    public int field2843;

    @ObfuscatedName("fh.c")
    public class175 field2846;

    @ObfuscatedName("fh.n")
    public class182 field2844 = new class182();

    public class172(int arg0) {
        this.field2845 = arg0;
        this.field2843 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2846 = new class175(var2);
    }

    @ObfuscatedName("fh.p(J)Lgl;")
    public class183 method3225(long arg0) {
        class183 var3 = (class183) this.field2846.method3263(arg0);
        if (var3 != null) {
            this.field2844.method3341(var3);
        }
        return var3;
    }

    @ObfuscatedName("fh.g(J)V")
    public void method3231(long arg0) {
        class183 var3 = (class183) this.field2846.method3263(arg0);
        if (var3 != null) {
            var3.method3378();
            var3.method3356();
            this.field2843++;
        }
    }

    @ObfuscatedName("fh.x(Lgl;J)V")
    public void method3234(class183 arg0, long arg1) {
        if (this.field2843 == 0) {
            class183 var4 = this.field2844.method3343();
            var4.method3378();
            var4.method3356();
            if (this.field2847 == var4) {
                class183 var5 = this.field2844.method3343();
                var5.method3378();
                var5.method3356();
            }
        } else {
            this.field2843--;
        }
        this.field2846.method3264(arg0, arg1);
        this.field2844.method3341(arg0);
    }

    @ObfuscatedName("fh.c()V")
    public void method3227() {
        this.field2844.method3344();
        this.field2846.method3269();
        this.field2847 = new class183();
        this.field2843 = this.field2845;
    }
}
