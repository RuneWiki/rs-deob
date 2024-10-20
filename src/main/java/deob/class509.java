package deob;

@ObfuscatedName("tv")
public final class class509 {

    @ObfuscatedName("tv.az")
    public int field5104;

    @ObfuscatedName("tv.ah")
    public class493[] field5102;

    @ObfuscatedName("tv.af")
    public class493 field5103;

    @ObfuscatedName("tv.at")
    public class493 field5101;

    @ObfuscatedName("tv.an")
    public int field5105 = 0;

    public class509(int arg0) {
        this.field5104 = arg0;
        this.field5102 = new class493[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class493 var3 = this.field5102[var2] = new class493();
            var3.field4950 = var3;
            var3.field4952 = var3;
        }
    }

    @ObfuscatedName("tv.az(J)Lsu;")
    public class493 method8206(long arg0) {
        class493 var3 = this.field5102[(int) (arg0 & (long) (this.field5104 - 1))];
        for (this.field5103 = var3.field4950; this.field5103 != var3; this.field5103 = this.field5103.field4950) {
            if (this.field5103.field4951 == arg0) {
                class493 var4 = this.field5103;
                this.field5103 = this.field5103.field4950;
                return var4;
            }
        }
        this.field5103 = null;
        return null;
    }

    @ObfuscatedName("tv.ah()I")
    public int method8205() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5104; var2++) {
            class493 var3 = this.field5102[var2];
            for (class493 var4 = var3.field4950; var4 != var3; var4 = var4.field4950) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("tv.af(Lsu;J)V")
    public void method8204(class493 arg0, long arg1) {
        if (arg0.field4952 != null) {
            arg0.method7855();
        }
        class493 var4 = this.field5102[(int) (arg1 & (long) (this.field5104 - 1))];
        arg0.field4952 = var4.field4952;
        arg0.field4950 = var4;
        arg0.field4952.field4950 = arg0;
        arg0.field4950.field4952 = arg0;
        arg0.field4951 = arg1;
    }

    @ObfuscatedName("tv.at()Lsu;")
    public class493 method8207() {
        this.field5105 = 0;
        return this.method8203();
    }

    @ObfuscatedName("tv.an()Lsu;")
    public class493 method8203() {
        if (this.field5105 > 0 && this.field5102[this.field5105 - 1] != this.field5101) {
            class493 var1 = this.field5101;
            this.field5101 = var1.field4950;
            return var1;
        }
        class493 var2;
        do {
            if (this.field5105 >= this.field5104) {
                return null;
            }
            var2 = this.field5102[this.field5105++].field4950;
        } while (this.field5102[this.field5105 - 1] == var2);
        this.field5101 = var2.field4950;
        return var2;
    }
}
