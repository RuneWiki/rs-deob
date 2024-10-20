package deob;

import java.util.Iterator;

@ObfuscatedName("sa")
public final class class489 implements Iterable {

    @ObfuscatedName("sa.aw")
    public int field4971;

    @ObfuscatedName("sa.ay")
    public class474[] field4970;

    @ObfuscatedName("sa.ar")
    public class474 field4972;

    @ObfuscatedName("sa.am")
    public class474 field4973;

    @ObfuscatedName("sa.as")
    public int field4974 = 0;

    public class489(int arg0) {
        this.field4971 = arg0;
        this.field4970 = new class474[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class474 var3 = this.field4970[var2] = new class474();
            var3.field4820 = var3;
            var3.field4818 = var3;
        }
    }

    @ObfuscatedName("sa.aw(J)Lsb;")
    public class474 method7961(long arg0) {
        class474 var3 = this.field4970[(int) (arg0 & (long) (this.field4971 - 1))];
        for (this.field4972 = var3.field4820; this.field4972 != var3; this.field4972 = this.field4972.field4820) {
            if (this.field4972.field4819 == arg0) {
                class474 var4 = this.field4972;
                this.field4972 = this.field4972.field4820;
                return var4;
            }
        }
        this.field4972 = null;
        return null;
    }

    @ObfuscatedName("sa.ay(Lsb;J)V")
    public void method7962(class474 arg0, long arg1) {
        if (arg0.field4818 != null) {
            arg0.method7662();
        }
        class474 var4 = this.field4970[(int) (arg1 & (long) (this.field4971 - 1))];
        arg0.field4818 = var4.field4818;
        arg0.field4820 = var4;
        arg0.field4818.field4820 = arg0;
        arg0.field4820.field4818 = arg0;
        arg0.field4819 = arg1;
    }

    @ObfuscatedName("sa.ar()V")
    public void method7963() {
        for (int var1 = 0; var1 < this.field4971; var1++) {
            class474 var2 = this.field4970[var1];
            while (true) {
                class474 var3 = var2.field4820;
                if (var2 == var3) {
                    break;
                }
                var3.method7662();
            }
        }
        this.field4972 = null;
        this.field4973 = null;
    }

    @ObfuscatedName("sa.am()Lsb;")
    public class474 method7965() {
        this.field4974 = 0;
        return this.method7973();
    }

    @ObfuscatedName("sa.as()Lsb;")
    public class474 method7973() {
        if (this.field4974 > 0 && this.field4970[this.field4974 - 1] != this.field4973) {
            class474 var1 = this.field4973;
            this.field4973 = var1.field4820;
            return var1;
        }
        class474 var2;
        do {
            if (this.field4974 >= this.field4971) {
                return null;
            }
            var2 = this.field4970[this.field4974++].field4820;
        } while (this.field4970[this.field4974 - 1] == var2);
        this.field4973 = var2.field4820;
        return var2;
    }

    public Iterator iterator() {
        return new class488(this);
    }
}
