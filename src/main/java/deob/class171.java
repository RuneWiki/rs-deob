package deob;

@ObfuscatedName("fw")
public final class class171 {

    @ObfuscatedName("fw.k")
    public class182 field2831 = new class182();

    @ObfuscatedName("fw.b")
    public int field2834;

    @ObfuscatedName("fw.e")
    public int field2832;

    @ObfuscatedName("fw.i")
    public class174 field2833;

    @ObfuscatedName("fw.t")
    public class181 field2830 = new class181();

    public class171(int arg0) {
        this.field2834 = arg0;
        this.field2832 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2833 = new class174(var2);
    }

    @ObfuscatedName("fw.k(J)Lfl;")
    public class182 method3166(long arg0) {
        class182 var3 = (class182) this.field2833.method3197(arg0);
        if (var3 != null) {
            this.field2830.method3283(var3);
        }
        return var3;
    }

    @ObfuscatedName("fw.b(J)V")
    public void method3159(long arg0) {
        class182 var3 = (class182) this.field2833.method3197(arg0);
        if (var3 != null) {
            var3.method3321();
            var3.method3302();
            this.field2832++;
        }
    }

    @ObfuscatedName("fw.e(Lfl;J)V")
    public void method3161(class182 arg0, long arg1) {
        if (this.field2832 == 0) {
            class182 var4 = this.field2830.method3292();
            var4.method3321();
            var4.method3302();
            if (this.field2831 == var4) {
                class182 var5 = this.field2830.method3292();
                var5.method3321();
                var5.method3302();
            }
        } else {
            this.field2832--;
        }
        this.field2833.method3191(arg0, arg1);
        this.field2830.method3283(arg0);
    }

    @ObfuscatedName("fw.i()V")
    public void method3162() {
        this.field2830.method3287();
        this.field2833.method3192();
        this.field2831 = new class182();
        this.field2832 = this.field2834;
    }
}
