package deob;

import java.util.Iterator;

@ObfuscatedName("ro")
public final class class464 implements Iterable {

    @ObfuscatedName("ro.af")
    public int field4896;

    @ObfuscatedName("ro.an")
    public class449[] field4895;

    @ObfuscatedName("ro.aw")
    public class449 field4897;

    @ObfuscatedName("ro.ac")
    public class449 field4898;

    @ObfuscatedName("ro.au")
    public int field4899 = 0;

    public class464(int arg0) {
        this.field4896 = arg0;
        this.field4895 = new class449[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class449 var3 = this.field4895[var2] = new class449();
            var3.field4746 = var3;
            var3.field4747 = var3;
        }
    }

    @ObfuscatedName("ro.af(J)Lrp;")
    public class449 method7945(long arg0) {
        class449 var3 = this.field4895[(int) (arg0 & (long) (this.field4896 - 1))];
        for (this.field4897 = var3.field4746; this.field4897 != var3; this.field4897 = this.field4897.field4746) {
            if (this.field4897.field4745 == arg0) {
                class449 var4 = this.field4897;
                this.field4897 = this.field4897.field4746;
                return var4;
            }
        }
        this.field4897 = null;
        return null;
    }

    @ObfuscatedName("ro.an(Lrp;J)V")
    public void method7946(class449 arg0, long arg1) {
        if (arg0.field4747 != null) {
            arg0.method7651();
        }
        class449 var4 = this.field4895[(int) (arg1 & (long) (this.field4896 - 1))];
        arg0.field4747 = var4.field4747;
        arg0.field4746 = var4;
        arg0.field4747.field4746 = arg0;
        arg0.field4746.field4747 = arg0;
        arg0.field4745 = arg1;
    }

    @ObfuscatedName("ro.aw()V")
    public void method7947() {
        for (int var1 = 0; var1 < this.field4896; var1++) {
            class449 var2 = this.field4895[var1];
            while (true) {
                class449 var3 = var2.field4746;
                if (var2 == var3) {
                    break;
                }
                var3.method7651();
            }
        }
        this.field4897 = null;
        this.field4898 = null;
    }

    @ObfuscatedName("ro.ac()Lrp;")
    public class449 method7948() {
        this.field4899 = 0;
        return this.method7951();
    }

    @ObfuscatedName("ro.au()Lrp;")
    public class449 method7951() {
        if (this.field4899 > 0 && this.field4895[this.field4899 - 1] != this.field4898) {
            class449 var1 = this.field4898;
            this.field4898 = var1.field4746;
            return var1;
        }
        class449 var2;
        do {
            if (this.field4899 >= this.field4896) {
                return null;
            }
            var2 = this.field4895[this.field4899++].field4746;
        } while (this.field4895[this.field4899 - 1] == var2);
        this.field4898 = var2.field4746;
        return var2;
    }

    public Iterator iterator() {
        return new class463(this);
    }
}
