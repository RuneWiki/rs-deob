package deob;

@ObfuscatedName("gq")
public final class class190 {

    @ObfuscatedName("gq.c")
    public class195 field2427 = new class195();

    @ObfuscatedName("gq.o")
    public int field2426;

    @ObfuscatedName("gq.i")
    public int field2429;

    @ObfuscatedName("gq.u")
    public class191 field2425;

    @ObfuscatedName("gq.g")
    public class185 field2428 = new class185();

    public class190(int arg0) {
        this.field2426 = arg0;
        this.field2429 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2425 = new class191(var2);
    }

    @ObfuscatedName("gq.c(J)Lgc;")
    public class195 method3220(long arg0) {
        class195 var3 = (class195) this.field2425.method3251(arg0);
        if (var3 != null) {
            this.field2428.method3186(var3);
        }
        return var3;
    }

    @ObfuscatedName("gq.o(J)V")
    public void method3222(long arg0) {
        class195 var3 = (class195) this.field2425.method3251(arg0);
        if (var3 != null) {
            var3.method3287();
            var3.method3320();
            this.field2429++;
        }
    }

    @ObfuscatedName("gq.i(Lgc;J)V")
    public void method3233(class195 arg0, long arg1) {
        if (this.field2429 == 0) {
            class195 var4 = this.field2428.method3174();
            var4.method3287();
            var4.method3320();
            if (this.field2427 == var4) {
                class195 var5 = this.field2428.method3174();
                var5.method3287();
                var5.method3320();
            }
        } else {
            this.field2429--;
        }
        this.field2425.method3239(arg0, arg1);
        this.field2428.method3186(arg0);
    }

    @ObfuscatedName("gq.u()V")
    public void method3223() {
        this.field2428.method3176();
        this.field2425.method3246();
        this.field2427 = new class195();
        this.field2429 = this.field2426;
    }
}
