package deob;

@ObfuscatedName("ts")
public final class class505 {

    @ObfuscatedName("ts.am")
    public int field5053;

    @ObfuscatedName("ts.ap")
    public class489[] field5056;

    @ObfuscatedName("ts.af")
    public class489 field5055;

    @ObfuscatedName("ts.aj")
    public class489 field5054;

    @ObfuscatedName("ts.aq")
    public int field5057 = 0;

    public class505(int arg0) {
        this.field5053 = arg0;
        this.field5056 = new class489[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class489 var3 = this.field5056[var2] = new class489();
            var3.field4888 = var3;
            var3.field4890 = var3;
        }
    }

    @ObfuscatedName("ts.am(J)Lse;")
    public class489 method8301(long arg0) {
        class489 var3 = this.field5056[(int) (arg0 & (long) (this.field5053 - 1))];
        for (this.field5055 = var3.field4888; this.field5055 != var3; this.field5055 = this.field5055.field4888) {
            if (this.field5055.field4889 == arg0) {
                class489 var4 = this.field5055;
                this.field5055 = this.field5055.field4888;
                return var4;
            }
        }
        this.field5055 = null;
        return null;
    }

    @ObfuscatedName("ts.ap()I")
    public int method8300() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5053; var2++) {
            class489 var3 = this.field5056[var2];
            for (class489 var4 = var3.field4888; var4 != var3; var4 = var4.field4888) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("ts.af(Lse;J)V")
    public void method8307(class489 arg0, long arg1) {
        if (arg0.field4890 != null) {
            arg0.method7988();
        }
        class489 var4 = this.field5056[(int) (arg1 & (long) (this.field5053 - 1))];
        arg0.field4890 = var4.field4890;
        arg0.field4888 = var4;
        arg0.field4890.field4888 = arg0;
        arg0.field4888.field4890 = arg0;
        arg0.field4889 = arg1;
    }

    @ObfuscatedName("ts.aj()Lse;")
    public class489 method8304() {
        this.field5057 = 0;
        return this.method8302();
    }

    @ObfuscatedName("ts.aq()Lse;")
    public class489 method8302() {
        if (this.field5057 > 0 && this.field5056[this.field5057 - 1] != this.field5054) {
            class489 var1 = this.field5054;
            this.field5054 = var1.field4888;
            return var1;
        }
        class489 var2;
        do {
            if (this.field5057 >= this.field5053) {
                return null;
            }
            var2 = this.field5056[this.field5057++].field4888;
        } while (this.field5056[this.field5057 - 1] == var2);
        this.field5054 = var2.field4888;
        return var2;
    }
}
