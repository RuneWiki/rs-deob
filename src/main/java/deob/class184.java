package deob;

@ObfuscatedName("gc")
public final class class184 {

    @ObfuscatedName("gc.n")
    public class195 field2981 = new class195();

    @ObfuscatedName("gc.g")
    public int field2982;

    @ObfuscatedName("gc.a")
    public int field2985;

    @ObfuscatedName("gc.m")
    public class187 field2984;

    @ObfuscatedName("gc.s")
    public class194 field2983 = new class194();

    public class184(int arg0) {
        this.field2982 = arg0;
        this.field2985 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2984 = new class187(var2);
    }

    @ObfuscatedName("gc.n(J)Lge;")
    public class195 method3388(long arg0) {
        class195 var3 = (class195) this.field2984.method3425(arg0);
        if (var3 != null) {
            this.field2983.method3517(var3);
        }
        return var3;
    }

    @ObfuscatedName("gc.g(J)V")
    public void method3389(long arg0) {
        class195 var3 = (class195) this.field2984.method3425(arg0);
        if (var3 != null) {
            var3.method3554();
            var3.method3527();
            this.field2985++;
        }
    }

    @ObfuscatedName("gc.a(Lge;J)V")
    public void method3396(class195 arg0, long arg1) {
        if (this.field2985 == 0) {
            class195 var4 = this.field2983.method3516();
            var4.method3554();
            var4.method3527();
            if (this.field2981 == var4) {
                class195 var5 = this.field2983.method3516();
                var5.method3554();
                var5.method3527();
            }
        } else {
            this.field2985--;
        }
        this.field2984.method3426(arg0, arg1);
        this.field2983.method3517(arg0);
    }

    @ObfuscatedName("gc.m()V")
    public void method3398() {
        this.field2983.method3518();
        this.field2984.method3430();
        this.field2981 = new class195();
        this.field2985 = this.field2982;
    }
}
