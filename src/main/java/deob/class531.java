package deob;

@ObfuscatedName("ud")
public final class class531 {

    @ObfuscatedName("ud.ap")
    public int field5328;

    @ObfuscatedName("ud.aw")
    public class515[] field5331;

    @ObfuscatedName("ud.ak")
    public class515 field5330;

    @ObfuscatedName("ud.aj")
    public class515 field5329;

    @ObfuscatedName("ud.ai")
    public int field5332 = 0;

    public class531(int arg0) {
        this.field5328 = arg0;
        this.field5331 = new class515[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class515 var3 = this.field5331[var2] = new class515();
            var3.field5171 = var3;
            var3.field5169 = var3;
        }
    }

    @ObfuscatedName("ud.ap(J)Ltw;")
    public class515 method8993(long arg0) {
        class515 var3 = this.field5331[(int) (arg0 & (long) (this.field5328 - 1))];
        for (this.field5330 = var3.field5171; this.field5330 != var3; this.field5330 = this.field5330.field5171) {
            if (this.field5330.field5170 == arg0) {
                class515 var4 = this.field5330;
                this.field5330 = this.field5330.field5171;
                return var4;
            }
        }
        this.field5330 = null;
        return null;
    }

    @ObfuscatedName("ud.aw()I")
    public int method8988() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5328; var2++) {
            class515 var3 = this.field5331[var2];
            for (class515 var4 = var3.field5171; var4 != var3; var4 = var4.field5171) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("ud.ak(Ltw;J)V")
    public void method8990(class515 arg0, long arg1) {
        if (arg0.field5169 != null) {
            arg0.method8667();
        }
        class515 var4 = this.field5331[(int) (arg1 & (long) (this.field5328 - 1))];
        arg0.field5169 = var4.field5169;
        arg0.field5171 = var4;
        arg0.field5169.field5171 = arg0;
        arg0.field5171.field5169 = arg0;
        arg0.field5170 = arg1;
    }

    @ObfuscatedName("ud.aj()Ltw;")
    public class515 method8996() {
        this.field5332 = 0;
        return this.method8999();
    }

    @ObfuscatedName("ud.ai()Ltw;")
    public class515 method8999() {
        if (this.field5332 > 0 && this.field5331[this.field5332 - 1] != this.field5329) {
            class515 var1 = this.field5329;
            this.field5329 = var1.field5171;
            return var1;
        }
        class515 var2;
        do {
            if (this.field5332 >= this.field5328) {
                return null;
            }
            var2 = this.field5331[this.field5332++].field5171;
        } while (this.field5331[this.field5332 - 1] == var2);
        this.field5329 = var2.field5171;
        return var2;
    }
}
