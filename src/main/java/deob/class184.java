package deob;

@ObfuscatedName("gp")
public final class class184 {

    @ObfuscatedName("gp.n")
    public class195 field2974 = new class195();

    @ObfuscatedName("gp.d")
    public int field2971;

    @ObfuscatedName("gp.z")
    public int field2973;

    @ObfuscatedName("gp.y")
    public class187 field2972;

    @ObfuscatedName("gp.e")
    public class194 field2975 = new class194();

    public class184(int arg0) {
        this.field2971 = arg0;
        this.field2973 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2972 = new class187(var2);
    }

    @ObfuscatedName("gp.n(J)Lgb;")
    public class195 method3411(long arg0) {
        class195 var3 = (class195) this.field2972.method3445(arg0);
        if (var3 != null) {
            this.field2975.method3526(var3);
        }
        return var3;
    }

    @ObfuscatedName("gp.d(J)V")
    public void method3421(long arg0) {
        class195 var3 = (class195) this.field2972.method3445(arg0);
        if (var3 != null) {
            var3.method3562();
            var3.method3541();
            this.field2973++;
        }
    }

    @ObfuscatedName("gp.z(Lgb;J)V")
    public void method3420(class195 arg0, long arg1) {
        if (this.field2973 == 0) {
            class195 var4 = this.field2975.method3528();
            var4.method3562();
            var4.method3541();
            if (this.field2974 == var4) {
                class195 var5 = this.field2975.method3528();
                var5.method3562();
                var5.method3541();
            }
        } else {
            this.field2973--;
        }
        this.field2972.method3446(arg0, arg1);
        this.field2975.method3526(arg0);
    }

    @ObfuscatedName("gp.y()V")
    public void method3412() {
        this.field2975.method3530();
        this.field2972.method3447();
        this.field2974 = new class195();
        this.field2973 = this.field2971;
    }
}
