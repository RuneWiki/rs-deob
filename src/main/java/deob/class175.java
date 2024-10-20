package deob;

@ObfuscatedName("fi")
public final class class175 {

    @ObfuscatedName("fi.x")
    public int field2805;

    @ObfuscatedName("fi.p")
    public class179[] field2804;

    @ObfuscatedName("fi.k")
    public class179 field2806;

    @ObfuscatedName("fi.a")
    public class179 field2807;

    @ObfuscatedName("fi.q")
    public int field2808 = 0;

    public class175(int arg0) {
        this.field2805 = arg0;
        this.field2804 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2804[var2] = new class179();
            var3.field2815 = var3;
            var3.field2814 = var3;
        }
    }

    @ObfuscatedName("fi.x(J)Lfz;")
    public class179 method3259(long arg0) {
        class179 var3 = this.field2804[(int) (arg0 & (long) (this.field2805 - 1))];
        for (this.field2806 = var3.field2815; this.field2806 != var3; this.field2806 = this.field2806.field2815) {
            if (this.field2806.field2816 == arg0) {
                class179 var4 = this.field2806;
                this.field2806 = this.field2806.field2815;
                return var4;
            }
        }
        this.field2806 = null;
        return null;
    }

    @ObfuscatedName("fi.p(Lfz;J)V")
    public void method3253(class179 arg0, long arg1) {
        if (arg0.field2814 != null) {
            arg0.method3301();
        }
        class179 var4 = this.field2804[(int) (arg1 & (long) (this.field2805 - 1))];
        arg0.field2814 = var4.field2814;
        arg0.field2815 = var4;
        arg0.field2814.field2815 = arg0;
        arg0.field2815.field2814 = arg0;
        arg0.field2816 = arg1;
    }

    @ObfuscatedName("fi.k()V")
    public void method3245() {
        for (int var1 = 0; var1 < this.field2805; var1++) {
            class179 var2 = this.field2804[var1];
            while (true) {
                class179 var3 = var2.field2815;
                if (var2 == var3) {
                    break;
                }
                var3.method3301();
            }
        }
        this.field2806 = null;
        this.field2807 = null;
    }

    @ObfuscatedName("fi.a()Lfz;")
    public class179 method3248() {
        this.field2808 = 0;
        return this.method3247();
    }

    @ObfuscatedName("fi.q()Lfz;")
    public class179 method3247() {
        if (this.field2808 > 0 && this.field2804[this.field2808 - 1] != this.field2807) {
            class179 var1 = this.field2807;
            this.field2807 = var1.field2815;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2808 >= this.field2805) {
                return null;
            }
            var2 = this.field2804[this.field2808++].field2815;
        } while (this.field2804[this.field2808 - 1] == var2);
        this.field2807 = var2.field2815;
        return var2;
    }
}
