package deob;

@ObfuscatedName("gx")
public final class class184 {

    @ObfuscatedName("gx.n")
    public class195 field2983 = new class195();

    @ObfuscatedName("gx.o")
    public int field2986;

    @ObfuscatedName("gx.a")
    public int field2984;

    @ObfuscatedName("gx.w")
    public class187 field2982;

    @ObfuscatedName("gx.m")
    public class194 field2985 = new class194();

    public class184(int arg0) {
        this.field2986 = arg0;
        this.field2984 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2982 = new class187(var2);
    }

    @ObfuscatedName("gx.n(J)Lgo;")
    public class195 method3373(long arg0) {
        class195 var3 = (class195) this.field2982.method3418(arg0);
        if (var3 != null) {
            this.field2985.method3503(var3);
        }
        return var3;
    }

    @ObfuscatedName("gx.o(J)V")
    public void method3379(long arg0) {
        class195 var3 = (class195) this.field2982.method3418(arg0);
        if (var3 != null) {
            var3.method3540();
            var3.method3518();
            this.field2984++;
        }
    }

    @ObfuscatedName("gx.a(Lgo;J)V")
    public void method3372(class195 arg0, long arg1) {
        if (this.field2984 == 0) {
            class195 var4 = this.field2985.method3511();
            var4.method3540();
            var4.method3518();
            if (this.field2983 == var4) {
                class195 var5 = this.field2985.method3511();
                var5.method3540();
                var5.method3518();
            }
        } else {
            this.field2984--;
        }
        this.field2982.method3410(arg0, arg1);
        this.field2985.method3503(arg0);
    }

    @ObfuscatedName("gx.w()V")
    public void method3376() {
        this.field2985.method3507();
        this.field2982.method3420();
        this.field2983 = new class195();
        this.field2984 = this.field2986;
    }
}
