package deob;

@ObfuscatedName("gz")
public final class class194 {

    @ObfuscatedName("gz.e")
    public class205 field3081 = new class205();

    @ObfuscatedName("gz.w")
    public int field3080;

    @ObfuscatedName("gz.f")
    public int field3079;

    @ObfuscatedName("gz.s")
    public class197 field3082;

    @ObfuscatedName("gz.p")
    public class204 field3083 = new class204();

    public class194(int arg0) {
        this.field3080 = arg0;
        this.field3079 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3082 = new class197(var2);
    }

    @ObfuscatedName("gz.e(J)Lgh;")
    public class205 method3473(long arg0) {
        class205 var3 = (class205) this.field3082.method3507(arg0);
        if (var3 != null) {
            this.field3083.method3594(var3);
        }
        return var3;
    }

    @ObfuscatedName("gz.w(J)V")
    public void method3474(long arg0) {
        class205 var3 = (class205) this.field3082.method3507(arg0);
        if (var3 != null) {
            var3.method3632();
            var3.method3610();
            this.field3079++;
        }
    }

    @ObfuscatedName("gz.f(Lgh;J)V")
    public void method3475(class205 arg0, long arg1) {
        if (this.field3079 == 0) {
            class205 var4 = this.field3083.method3596();
            var4.method3632();
            var4.method3610();
            if (this.field3081 == var4) {
                class205 var5 = this.field3083.method3596();
                var5.method3632();
                var5.method3610();
            }
        } else {
            this.field3079--;
        }
        this.field3082.method3508(arg0, arg1);
        this.field3083.method3594(arg0);
    }

    @ObfuscatedName("gz.s()V")
    public void method3479() {
        this.field3083.method3609();
        this.field3082.method3509();
        this.field3081 = new class205();
        this.field3079 = this.field3080;
    }
}
