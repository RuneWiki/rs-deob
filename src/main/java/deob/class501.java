package deob;

@ObfuscatedName("tw")
public final class class501 {

    @ObfuscatedName("tw.at")
    public int field5008;

    @ObfuscatedName("tw.ah")
    public class485[] field5009;

    @ObfuscatedName("tw.ar")
    public class485 field5012;

    @ObfuscatedName("tw.ao")
    public class485 field5011;

    @ObfuscatedName("tw.ab")
    public int field5010 = 0;

    public class501(int arg0) {
        this.field5008 = arg0;
        this.field5009 = new class485[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class485 var3 = this.field5009[var2] = new class485();
            var3.field4850 = var3;
            var3.field4848 = var3;
        }
    }

    @ObfuscatedName("tw.at(J)Lsh;")
    public class485 method8154(long arg0) {
        class485 var3 = this.field5009[(int) (arg0 & (long) (this.field5008 - 1))];
        for (this.field5012 = var3.field4850; this.field5012 != var3; this.field5012 = this.field5012.field4850) {
            if (this.field5012.field4849 == arg0) {
                class485 var4 = this.field5012;
                this.field5012 = this.field5012.field4850;
                return var4;
            }
        }
        this.field5012 = null;
        return null;
    }

    @ObfuscatedName("tw.ah()I")
    public int method8155() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5008; var2++) {
            class485 var3 = this.field5009[var2];
            for (class485 var4 = var3.field4850; var4 != var3; var4 = var4.field4850) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("tw.ar(Lsh;J)V")
    public void method8156(class485 arg0, long arg1) {
        if (arg0.field4848 != null) {
            arg0.method7828();
        }
        class485 var4 = this.field5009[(int) (arg1 & (long) (this.field5008 - 1))];
        arg0.field4848 = var4.field4848;
        arg0.field4850 = var4;
        arg0.field4848.field4850 = arg0;
        arg0.field4850.field4848 = arg0;
        arg0.field4849 = arg1;
    }

    @ObfuscatedName("tw.ao()Lsh;")
    public class485 method8157() {
        this.field5010 = 0;
        return this.method8158();
    }

    @ObfuscatedName("tw.ab()Lsh;")
    public class485 method8158() {
        if (this.field5010 > 0 && this.field5009[this.field5010 - 1] != this.field5011) {
            class485 var1 = this.field5011;
            this.field5011 = var1.field4850;
            return var1;
        }
        class485 var2;
        do {
            if (this.field5010 >= this.field5008) {
                return null;
            }
            var2 = this.field5009[this.field5010++].field4850;
        } while (this.field5009[this.field5010 - 1] == var2);
        this.field5011 = var2.field4850;
        return var2;
    }
}
