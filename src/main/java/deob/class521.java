package deob;

@ObfuscatedName("up")
public final class class521 {

    @ObfuscatedName("up.aq")
    public int field5239;

    @ObfuscatedName("up.ad")
    public class505[] field5236;

    @ObfuscatedName("up.ag")
    public class505 field5237;

    @ObfuscatedName("up.ak")
    public class505 field5238;

    @ObfuscatedName("up.ap")
    public int field5240 = 0;

    public class521(int arg0) {
        this.field5239 = arg0;
        this.field5236 = new class505[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class505 var3 = this.field5236[var2] = new class505();
            var3.field5083 = var3;
            var3.field5081 = var3;
        }
    }

    @ObfuscatedName("up.aq(J)Ltz;")
    public class505 method8464(long arg0) {
        class505 var3 = this.field5236[(int) (arg0 & (long) (this.field5239 - 1))];
        for (this.field5237 = var3.field5083; this.field5237 != var3; this.field5237 = this.field5237.field5083) {
            if (this.field5237.field5082 == arg0) {
                class505 var4 = this.field5237;
                this.field5237 = this.field5237.field5083;
                return var4;
            }
        }
        this.field5237 = null;
        return null;
    }

    @ObfuscatedName("up.ad()I")
    public int method8465() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5239; var2++) {
            class505 var3 = this.field5236[var2];
            for (class505 var4 = var3.field5083; var4 != var3; var4 = var4.field5083) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("up.ag(Ltz;J)V")
    public void method8470(class505 arg0, long arg1) {
        if (arg0.field5081 != null) {
            arg0.method8130();
        }
        class505 var4 = this.field5236[(int) (arg1 & (long) (this.field5239 - 1))];
        arg0.field5081 = var4.field5081;
        arg0.field5083 = var4;
        arg0.field5081.field5083 = arg0;
        arg0.field5083.field5081 = arg0;
        arg0.field5082 = arg1;
    }

    @ObfuscatedName("up.ak()Ltz;")
    public class505 method8467() {
        this.field5240 = 0;
        return this.method8471();
    }

    @ObfuscatedName("up.ap()Ltz;")
    public class505 method8471() {
        if (this.field5240 > 0 && this.field5236[this.field5240 - 1] != this.field5238) {
            class505 var1 = this.field5238;
            this.field5238 = var1.field5083;
            return var1;
        }
        class505 var2;
        do {
            if (this.field5240 >= this.field5239) {
                return null;
            }
            var2 = this.field5236[this.field5240++].field5083;
        } while (this.field5236[this.field5240 - 1] == var2);
        this.field5238 = var2.field5083;
        return var2;
    }
}
