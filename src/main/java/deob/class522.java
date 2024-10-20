package deob;

@ObfuscatedName("up")
public final class class522 {

    @ObfuscatedName("up.ab")
    public int field5241;

    @ObfuscatedName("up.ay")
    public class506[] field5240;

    @ObfuscatedName("up.an")
    public class506 field5242;

    @ObfuscatedName("up.au")
    public class506 field5243;

    @ObfuscatedName("up.ax")
    public int field5244 = 0;

    public class522(int arg0) {
        this.field5241 = arg0;
        this.field5240 = new class506[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class506 var3 = this.field5240[var2] = new class506();
            var3.field5074 = var3;
            var3.field5076 = var3;
        }
    }

    @ObfuscatedName("up.ab(J)Ltp;")
    public class506 method8544(long arg0) {
        class506 var3 = this.field5240[(int) (arg0 & (long) (this.field5241 - 1))];
        for (this.field5242 = var3.field5074; this.field5242 != var3; this.field5242 = this.field5242.field5074) {
            if (this.field5242.field5075 == arg0) {
                class506 var4 = this.field5242;
                this.field5242 = this.field5242.field5074;
                return var4;
            }
        }
        this.field5242 = null;
        return null;
    }

    @ObfuscatedName("up.ay()I")
    public int method8536() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5241; var2++) {
            class506 var3 = this.field5240[var2];
            for (class506 var4 = var3.field5074; var4 != var3; var4 = var4.field5074) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("up.an(Ltp;J)V")
    public void method8551(class506 arg0, long arg1) {
        if (arg0.field5076 != null) {
            arg0.method8218();
        }
        class506 var4 = this.field5240[(int) (arg1 & (long) (this.field5241 - 1))];
        arg0.field5076 = var4.field5076;
        arg0.field5074 = var4;
        arg0.field5076.field5074 = arg0;
        arg0.field5074.field5076 = arg0;
        arg0.field5075 = arg1;
    }

    @ObfuscatedName("up.au()Ltp;")
    public class506 method8546() {
        this.field5244 = 0;
        return this.method8539();
    }

    @ObfuscatedName("up.ax()Ltp;")
    public class506 method8539() {
        if (this.field5244 > 0 && this.field5240[this.field5244 - 1] != this.field5243) {
            class506 var1 = this.field5243;
            this.field5243 = var1.field5074;
            return var1;
        }
        class506 var2;
        do {
            if (this.field5244 >= this.field5241) {
                return null;
            }
            var2 = this.field5240[this.field5244++].field5074;
        } while (this.field5240[this.field5244 - 1] == var2);
        this.field5243 = var2.field5074;
        return var2;
    }
}
