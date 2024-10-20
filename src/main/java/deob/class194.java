package deob;

@ObfuscatedName("ga")
public final class class194 {

    @ObfuscatedName("ga.a")
    public class205 field3090 = new class205();

    @ObfuscatedName("ga.w")
    public int field3089;

    @ObfuscatedName("ga.d")
    public int field3092;

    @ObfuscatedName("ga.c")
    public class197 field3091;

    @ObfuscatedName("ga.y")
    public class204 field3088 = new class204();

    public class194(int arg0) {
        this.field3089 = arg0;
        this.field3092 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3091 = new class197(var2);
    }

    @ObfuscatedName("ga.a(J)Lgi;")
    public class205 method3579(long arg0) {
        class205 var3 = (class205) this.field3091.method3607(arg0);
        if (var3 != null) {
            this.field3088.method3702(var3);
        }
        return var3;
    }

    @ObfuscatedName("ga.w(J)V")
    public void method3580(long arg0) {
        class205 var3 = (class205) this.field3091.method3607(arg0);
        if (var3 != null) {
            var3.method3737();
            var3.method3718();
            this.field3092++;
        }
    }

    @ObfuscatedName("ga.d(Lgi;J)V")
    public void method3581(class205 arg0, long arg1) {
        if (this.field3092 == 0) {
            class205 var4 = this.field3088.method3716();
            var4.method3737();
            var4.method3718();
            if (this.field3090 == var4) {
                class205 var5 = this.field3088.method3716();
                var5.method3737();
                var5.method3718();
            }
        } else {
            this.field3092--;
        }
        this.field3091.method3614(arg0, arg1);
        this.field3088.method3702(arg0);
    }

    @ObfuscatedName("ga.c()V")
    public void method3582() {
        this.field3088.method3706();
        this.field3091.method3609();
        this.field3090 = new class205();
        this.field3092 = this.field3089;
    }
}
