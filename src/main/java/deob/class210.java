package deob;

@ObfuscatedName("ht")
public final class class210 {

    @ObfuscatedName("ht.a")
    public int field2503;

    @ObfuscatedName("ht.s")
    public class212[] field2506;

    @ObfuscatedName("ht.g")
    public class212 field2505;

    @ObfuscatedName("ht.x")
    public class212 field2504;

    @ObfuscatedName("ht.h")
    public int field2507 = 0;

    public class210(int arg0) {
        this.field2503 = arg0;
        this.field2506 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field2506[var2] = new class212();
            var3.field2511 = var3;
            var3.field2510 = var3;
        }
    }

    @ObfuscatedName("ht.a(J)Lhy;")
    public class212 method3911(long arg0) {
        class212 var3 = this.field2506[(int) (arg0 & (long) (this.field2503 - 1))];
        for (this.field2505 = var3.field2511; this.field2505 != var3; this.field2505 = this.field2505.field2511) {
            if (this.field2505.field2512 == arg0) {
                class212 var4 = this.field2505;
                this.field2505 = this.field2505.field2511;
                return var4;
            }
        }
        this.field2505 = null;
        return null;
    }

    @ObfuscatedName("ht.s(Lhy;J)V")
    public void method3920(class212 arg0, long arg1) {
        if (arg0.field2510 != null) {
            arg0.method3960();
        }
        class212 var4 = this.field2506[(int) (arg1 & (long) (this.field2503 - 1))];
        arg0.field2510 = var4.field2510;
        arg0.field2511 = var4;
        arg0.field2510.field2511 = arg0;
        arg0.field2511.field2510 = arg0;
        arg0.field2512 = arg1;
    }

    @ObfuscatedName("ht.g()V")
    public void method3925() {
        for (int var1 = 0; var1 < this.field2503; var1++) {
            class212 var2 = this.field2506[var1];
            while (true) {
                class212 var3 = var2.field2511;
                if (var2 == var3) {
                    break;
                }
                var3.method3960();
            }
        }
        this.field2505 = null;
        this.field2504 = null;
    }

    @ObfuscatedName("ht.x()Lhy;")
    public class212 method3914() {
        this.field2507 = 0;
        return this.method3915();
    }

    @ObfuscatedName("ht.h()Lhy;")
    public class212 method3915() {
        if (this.field2507 > 0 && this.field2506[this.field2507 - 1] != this.field2504) {
            class212 var1 = this.field2504;
            this.field2504 = var1.field2511;
            return var1;
        }
        class212 var2;
        do {
            if (this.field2507 >= this.field2503) {
                return null;
            }
            var2 = this.field2506[this.field2507++].field2511;
        } while (this.field2506[this.field2507 - 1] == var2);
        this.field2504 = var2.field2511;
        return var2;
    }
}
