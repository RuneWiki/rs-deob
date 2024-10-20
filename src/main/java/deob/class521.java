package deob;

import java.util.Iterator;

@ObfuscatedName("ud")
public final class class521 implements Iterable {

    @ObfuscatedName("ud.ab")
    public int field5239;

    @ObfuscatedName("ud.ay")
    public class506[] field5236;

    @ObfuscatedName("ud.an")
    public class506 field5237;

    @ObfuscatedName("ud.au")
    public class506 field5238;

    @ObfuscatedName("ud.ax")
    public int field5235 = 0;

    public class521(int arg0) {
        this.field5239 = arg0;
        this.field5236 = new class506[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class506 var3 = this.field5236[var2] = new class506();
            var3.field5074 = var3;
            var3.field5076 = var3;
        }
    }

    @ObfuscatedName("ud.ab(J)Ltp;")
    public class506 method8512(long arg0) {
        class506 var3 = this.field5236[(int) (arg0 & (long) (this.field5239 - 1))];
        for (this.field5237 = var3.field5074; this.field5237 != var3; this.field5237 = this.field5237.field5074) {
            if (this.field5237.field5075 == arg0) {
                class506 var4 = this.field5237;
                this.field5237 = this.field5237.field5074;
                return var4;
            }
        }
        this.field5237 = null;
        return null;
    }

    @ObfuscatedName("ud.ay(Ltp;J)V")
    public void method8513(class506 arg0, long arg1) {
        if (arg0.field5076 != null) {
            arg0.method8218();
        }
        class506 var4 = this.field5236[(int) (arg1 & (long) (this.field5239 - 1))];
        arg0.field5076 = var4.field5076;
        arg0.field5074 = var4;
        arg0.field5076.field5074 = arg0;
        arg0.field5074.field5076 = arg0;
        arg0.field5075 = arg1;
    }

    @ObfuscatedName("ud.an()V")
    public void method8530() {
        for (int var1 = 0; var1 < this.field5239; var1++) {
            class506 var2 = this.field5236[var1];
            while (true) {
                class506 var3 = var2.field5074;
                if (var2 == var3) {
                    break;
                }
                var3.method8218();
            }
        }
        this.field5237 = null;
        this.field5238 = null;
    }

    @ObfuscatedName("ud.au()Ltp;")
    public class506 method8520() {
        this.field5235 = 0;
        return this.method8515();
    }

    @ObfuscatedName("ud.ax()Ltp;")
    public class506 method8515() {
        if (this.field5235 > 0 && this.field5236[this.field5235 - 1] != this.field5238) {
            class506 var1 = this.field5238;
            this.field5238 = var1.field5074;
            return var1;
        }
        class506 var2;
        do {
            if (this.field5235 >= this.field5239) {
                return null;
            }
            var2 = this.field5236[this.field5235++].field5074;
        } while (this.field5236[this.field5235 - 1] == var2);
        this.field5238 = var2.field5074;
        return var2;
    }

    public Iterator iterator() {
        return new class520(this);
    }
}
