package deob;

@ObfuscatedName("gg")
public final class class190 {

    @ObfuscatedName("gg.d")
    public class195 field2427 = new class195();

    @ObfuscatedName("gg.q")
    public int field2431;

    @ObfuscatedName("gg.x")
    public int field2429;

    @ObfuscatedName("gg.y")
    public class191 field2430;

    @ObfuscatedName("gg.e")
    public class185 field2428 = new class185();

    public class190(int arg0) {
        this.field2431 = arg0;
        this.field2429 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2430 = new class191(var2);
    }

    @ObfuscatedName("gg.d(J)Lgq;")
    public class195 method3252(long arg0) {
        class195 var3 = (class195) this.field2430.method3263(arg0);
        if (var3 != null) {
            this.field2428.method3211(var3);
        }
        return var3;
    }

    @ObfuscatedName("gg.q(J)V")
    public void method3248(long arg0) {
        class195 var3 = (class195) this.field2430.method3263(arg0);
        if (var3 != null) {
            var3.method3312();
            var3.method3350();
            this.field2429++;
        }
    }

    @ObfuscatedName("gg.x(Lgq;J)V")
    public void method3256(class195 arg0, long arg1) {
        if (this.field2429 == 0) {
            class195 var4 = this.field2428.method3213();
            var4.method3312();
            var4.method3350();
            if (this.field2427 == var4) {
                class195 var5 = this.field2428.method3213();
                var5.method3312();
                var5.method3350();
            }
        } else {
            this.field2429--;
        }
        this.field2430.method3269(arg0, arg1);
        this.field2428.method3211(arg0);
    }

    @ObfuscatedName("gg.y()V")
    public void method3250() {
        this.field2428.method3215();
        this.field2430.method3264();
        this.field2427 = new class195();
        this.field2429 = this.field2431;
    }
}
