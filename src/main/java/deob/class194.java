package deob;

@ObfuscatedName("gv")
public final class class194 {

    @ObfuscatedName("gv.t")
    public class205 field3092 = new class205();

    @ObfuscatedName("gv.i")
    public int field3090;

    @ObfuscatedName("gv.g")
    public int field3089;

    @ObfuscatedName("gv.h")
    public class197 field3091;

    @ObfuscatedName("gv.z")
    public class204 field3093 = new class204();

    public class194(int arg0) {
        this.field3090 = arg0;
        this.field3089 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3091 = new class197(var2);
    }

    @ObfuscatedName("gv.t(J)Lgn;")
    public class205 method3453(long arg0) {
        class205 var3 = (class205) this.field3091.method3485(arg0);
        if (var3 != null) {
            this.field3093.method3574(var3);
        }
        return var3;
    }

    @ObfuscatedName("gv.i(J)V")
    public void method3452(long arg0) {
        class205 var3 = (class205) this.field3091.method3485(arg0);
        if (var3 != null) {
            var3.method3607();
            var3.method3581();
            this.field3089++;
        }
    }

    @ObfuscatedName("gv.g(Lgn;J)V")
    public void method3461(class205 arg0, long arg1) {
        if (this.field3089 == 0) {
            class205 var4 = this.field3093.method3567();
            var4.method3607();
            var4.method3581();
            if (this.field3092 == var4) {
                class205 var5 = this.field3093.method3567();
                var5.method3607();
                var5.method3581();
            }
        } else {
            this.field3089--;
        }
        this.field3091.method3486(arg0, arg1);
        this.field3093.method3574(arg0);
    }

    @ObfuscatedName("gv.h()V")
    public void method3454() {
        this.field3093.method3572();
        this.field3091.method3487();
        this.field3092 = new class205();
        this.field3089 = this.field3090;
    }
}
