package deob;

@ObfuscatedName("gi")
public final class class194 {

    @ObfuscatedName("gi.b")
    public class205 field3081 = new class205();

    @ObfuscatedName("gi.g")
    public int field3079;

    @ObfuscatedName("gi.j")
    public int field3078;

    @ObfuscatedName("gi.d")
    public class197 field3080;

    @ObfuscatedName("gi.x")
    public class204 field3082 = new class204();

    public class194(int arg0) {
        this.field3079 = arg0;
        this.field3078 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3080 = new class197(var2);
    }

    @ObfuscatedName("gi.b(J)Lgl;")
    public class205 method3495(long arg0) {
        class205 var3 = (class205) this.field3080.method3538(arg0);
        if (var3 != null) {
            this.field3082.method3604(var3);
        }
        return var3;
    }

    @ObfuscatedName("gi.g(J)V")
    public void method3488(long arg0) {
        class205 var3 = (class205) this.field3080.method3538(arg0);
        if (var3 != null) {
            var3.method3647();
            var3.method3620();
            this.field3078++;
        }
    }

    @ObfuscatedName("gi.j(Lgl;J)V")
    public void method3490(class205 arg0, long arg1) {
        if (this.field3078 == 0) {
            class205 var4 = this.field3082.method3617();
            var4.method3647();
            var4.method3620();
            if (this.field3081 == var4) {
                class205 var5 = this.field3082.method3617();
                var5.method3647();
                var5.method3620();
            }
        } else {
            this.field3078--;
        }
        this.field3080.method3528(arg0, arg1);
        this.field3082.method3604(arg0);
    }

    @ObfuscatedName("gi.d()V")
    public void method3486() {
        this.field3082.method3608();
        this.field3080.method3529();
        this.field3081 = new class205();
        this.field3078 = this.field3079;
    }
}
