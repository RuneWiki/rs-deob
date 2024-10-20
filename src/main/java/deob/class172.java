package deob;

@ObfuscatedName("fr")
public final class class172 {

    @ObfuscatedName("fr.g")
    public class183 field2846 = new class183();

    @ObfuscatedName("fr.s")
    public int field2850;

    @ObfuscatedName("fr.v")
    public int field2848;

    @ObfuscatedName("fr.o")
    public class175 field2849;

    @ObfuscatedName("fr.k")
    public class182 field2847 = new class182();

    public class172(int arg0) {
        this.field2850 = arg0;
        this.field2848 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2849 = new class175(var2);
    }

    @ObfuscatedName("fr.g(J)Lgk;")
    public class183 method3112(long arg0) {
        class183 var3 = (class183) this.field2849.method3155(arg0);
        if (var3 != null) {
            this.field2847.method3239(var3);
        }
        return var3;
    }

    @ObfuscatedName("fr.s(J)V")
    public void method3125(long arg0) {
        class183 var3 = (class183) this.field2849.method3155(arg0);
        if (var3 != null) {
            var3.method3285();
            var3.method3257();
            this.field2848++;
        }
    }

    @ObfuscatedName("fr.v(Lgk;J)V")
    public void method3115(class183 arg0, long arg1) {
        if (this.field2848 == 0) {
            class183 var4 = this.field2847.method3254();
            var4.method3285();
            var4.method3257();
            if (this.field2846 == var4) {
                class183 var5 = this.field2847.method3254();
                var5.method3285();
                var5.method3257();
            }
        } else {
            this.field2848--;
        }
        this.field2849.method3152(arg0, arg1);
        this.field2847.method3239(arg0);
    }

    @ObfuscatedName("fr.o()V")
    public void method3116() {
        this.field2847.method3250();
        this.field2849.method3153();
        this.field2846 = new class183();
        this.field2848 = this.field2850;
    }
}
