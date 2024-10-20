package deob;

@ObfuscatedName("gx")
public final class class203 {

    @ObfuscatedName("gx.z")
    public int field2415;

    @ObfuscatedName("gx.w")
    public class205[] field2416;

    @ObfuscatedName("gx.s")
    public class205 field2417;

    @ObfuscatedName("gx.l")
    public class205 field2418;

    @ObfuscatedName("gx.u")
    public int field2419 = 0;

    public class203(int arg0) {
        this.field2415 = arg0;
        this.field2416 = new class205[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class205 var3 = this.field2416[var2] = new class205();
            var3.field2423 = var3;
            var3.field2424 = var3;
        }
    }

    @ObfuscatedName("gx.z(J)Lga;")
    public class205 method3712(long arg0) {
        class205 var3 = this.field2416[(int) (arg0 & (long) (this.field2415 - 1))];
        for (this.field2417 = var3.field2423; this.field2417 != var3; this.field2417 = this.field2417.field2423) {
            if (this.field2417.field2422 == arg0) {
                class205 var4 = this.field2417;
                this.field2417 = this.field2417.field2423;
                return var4;
            }
        }
        this.field2417 = null;
        return null;
    }

    @ObfuscatedName("gx.w(Lga;J)V")
    public void method3708(class205 arg0, long arg1) {
        if (arg0.field2424 != null) {
            arg0.method3756();
        }
        class205 var4 = this.field2416[(int) (arg1 & (long) (this.field2415 - 1))];
        arg0.field2424 = var4.field2424;
        arg0.field2423 = var4;
        arg0.field2424.field2423 = arg0;
        arg0.field2423.field2424 = arg0;
        arg0.field2422 = arg1;
    }

    @ObfuscatedName("gx.s()V")
    public void method3709() {
        for (int var1 = 0; var1 < this.field2415; var1++) {
            class205 var2 = this.field2416[var1];
            while (true) {
                class205 var3 = var2.field2423;
                if (var2 == var3) {
                    break;
                }
                var3.method3756();
            }
        }
        this.field2417 = null;
        this.field2418 = null;
    }

    @ObfuscatedName("gx.l()Lga;")
    public class205 method3710() {
        this.field2419 = 0;
        return this.method3711();
    }

    @ObfuscatedName("gx.u()Lga;")
    public class205 method3711() {
        if (this.field2419 > 0 && this.field2416[this.field2419 - 1] != this.field2418) {
            class205 var1 = this.field2418;
            this.field2418 = var1.field2423;
            return var1;
        }
        class205 var2;
        do {
            if (this.field2419 >= this.field2415) {
                return null;
            }
            var2 = this.field2416[this.field2419++].field2423;
        } while (this.field2416[this.field2419 - 1] == var2);
        this.field2418 = var2.field2423;
        return var2;
    }
}
