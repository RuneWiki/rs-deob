package deob;

@ObfuscatedName("gq")
public final class class203 {

    @ObfuscatedName("gq.y")
    public class209 field2454 = new class209();

    @ObfuscatedName("gq.c")
    public int field2458;

    @ObfuscatedName("gq.n")
    public int field2456;

    @ObfuscatedName("gq.u")
    public class205 field2457;

    @ObfuscatedName("gq.i")
    public class197 field2455 = new class197();

    public class203(int arg0) {
        this.field2458 = arg0;
        this.field2456 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2457 = new class205(var2);
    }

    @ObfuscatedName("gq.y(J)Lhn;")
    public class209 method3685(long arg0) {
        class209 var3 = (class209) this.field2457.method3734(arg0);
        if (var3 != null) {
            this.field2455.method3624(var3);
        }
        return var3;
    }

    @ObfuscatedName("gq.c(J)V")
    public void method3686(long arg0) {
        class209 var3 = (class209) this.field2457.method3734(arg0);
        if (var3 != null) {
            var3.method3766();
            var3.method3809();
            this.field2456++;
        }
    }

    @ObfuscatedName("gq.n(Lhn;J)V")
    public void method3687(class209 arg0, long arg1) {
        if (this.field2456 == 0) {
            class209 var4 = this.field2455.method3626();
            var4.method3766();
            var4.method3809();
            if (this.field2454 == var4) {
                class209 var5 = this.field2455.method3626();
                var5.method3766();
                var5.method3809();
            }
        } else {
            this.field2456--;
        }
        this.field2457.method3718(arg0, arg1);
        this.field2455.method3624(arg0);
    }

    @ObfuscatedName("gq.u()V")
    public void method3695() {
        this.field2455.method3632();
        this.field2457.method3719();
        this.field2454 = new class209();
        this.field2456 = this.field2458;
    }
}
