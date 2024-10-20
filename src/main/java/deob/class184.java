package deob;

@ObfuscatedName("ge")
public final class class184 {

    @ObfuscatedName("ge.y")
    public class195 field2990 = new class195();

    @ObfuscatedName("ge.k")
    public int field2988;

    @ObfuscatedName("ge.g")
    public int field2991;

    @ObfuscatedName("ge.n")
    public class187 field2989;

    @ObfuscatedName("ge.t")
    public class194 field2992 = new class194();

    public class184(int arg0) {
        this.field2988 = arg0;
        this.field2991 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2989 = new class187(var2);
    }

    @ObfuscatedName("ge.y(J)Lgp;")
    public class195 method3327(long arg0) {
        class195 var3 = (class195) this.field2989.method3357(arg0);
        if (var3 != null) {
            this.field2992.method3452(var3);
        }
        return var3;
    }

    @ObfuscatedName("ge.k(J)V")
    public void method3335(long arg0) {
        class195 var3 = (class195) this.field2989.method3357(arg0);
        if (var3 != null) {
            var3.method3482();
            var3.method3461();
            this.field2991++;
        }
    }

    @ObfuscatedName("ge.g(Lgp;J)V")
    public void method3340(class195 arg0, long arg1) {
        if (this.field2991 == 0) {
            class195 var4 = this.field2992.method3449();
            var4.method3482();
            var4.method3461();
            if (this.field2990 == var4) {
                class195 var5 = this.field2992.method3449();
                var5.method3482();
                var5.method3461();
            }
        } else {
            this.field2991--;
        }
        this.field2989.method3358(arg0, arg1);
        this.field2992.method3452(arg0);
    }

    @ObfuscatedName("ge.n()V")
    public void method3333() {
        this.field2992.method3451();
        this.field2989.method3356();
        this.field2990 = new class195();
        this.field2991 = this.field2988;
    }
}
