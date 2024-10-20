package deob;

@ObfuscatedName("go")
public final class class200 {

    @ObfuscatedName("go.a")
    public int field3144;

    @ObfuscatedName("go.d")
    public class212[] field3145;

    @ObfuscatedName("go.v")
    public class212 field3146;

    @ObfuscatedName("go.r")
    public class212 field3147;

    @ObfuscatedName("go.z")
    public int field3148 = 0;

    public class200(int arg0) {
        this.field3144 = arg0;
        this.field3145 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3145[var2] = new class212();
            var3.field3170 = var3;
            var3.field3172 = var3;
        }
    }

    @ObfuscatedName("go.a(J)Lhr;")
    public class212 method3580(long arg0) {
        class212 var3 = this.field3145[(int) (arg0 & (long) (this.field3144 - 1))];
        for (this.field3146 = var3.field3170; this.field3146 != var3; this.field3146 = this.field3146.field3170) {
            if (this.field3146.field3171 == arg0) {
                class212 var4 = this.field3146;
                this.field3146 = this.field3146.field3170;
                return var4;
            }
        }
        this.field3146 = null;
        return null;
    }

    @ObfuscatedName("go.d(Lhr;J)V")
    public void method3586(class212 arg0, long arg1) {
        if (arg0.field3172 != null) {
            arg0.method3729();
        }
        class212 var4 = this.field3145[(int) (arg1 & (long) (this.field3144 - 1))];
        arg0.field3172 = var4.field3172;
        arg0.field3170 = var4;
        arg0.field3172.field3170 = arg0;
        arg0.field3170.field3172 = arg0;
        arg0.field3171 = arg1;
    }

    @ObfuscatedName("go.v()V")
    public void method3582() {
        for (int var1 = 0; var1 < this.field3144; var1++) {
            class212 var2 = this.field3145[var1];
            while (true) {
                class212 var3 = var2.field3170;
                if (var2 == var3) {
                    break;
                }
                var3.method3729();
            }
        }
        this.field3146 = null;
        this.field3147 = null;
    }

    @ObfuscatedName("go.r()Lhr;")
    public class212 method3583() {
        this.field3148 = 0;
        return this.method3590();
    }

    @ObfuscatedName("go.z()Lhr;")
    public class212 method3590() {
        if (this.field3148 > 0 && this.field3145[this.field3148 - 1] != this.field3147) {
            class212 var1 = this.field3147;
            this.field3147 = var1.field3170;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3148 >= this.field3144) {
                return null;
            }
            var2 = this.field3145[this.field3148++].field3170;
        } while (this.field3145[this.field3148 - 1] == var2);
        this.field3147 = var2.field3170;
        return var2;
    }
}
