package deob;

@ObfuscatedName("gt")
public final class class187 {

    @ObfuscatedName("gt.n")
    public int field2996;

    @ObfuscatedName("gt.o")
    public class199[] field2994;

    @ObfuscatedName("gt.a")
    public class199 field2993;

    @ObfuscatedName("gt.w")
    public class199 field2995;

    @ObfuscatedName("gt.m")
    public int field2997 = 0;

    public class187(int arg0) {
        this.field2996 = arg0;
        this.field2994 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2994[var2] = new class199();
            var3.field3019 = var3;
            var3.field3020 = var3;
        }
    }

    @ObfuscatedName("gt.n(J)Lga;")
    public class199 method3418(long arg0) {
        class199 var3 = this.field2994[(int) (arg0 & (long) (this.field2996 - 1))];
        for (this.field2993 = var3.field3019; this.field2993 != var3; this.field2993 = this.field2993.field3019) {
            if (this.field2993.field3018 == arg0) {
                class199 var4 = this.field2993;
                this.field2993 = this.field2993.field3019;
                return var4;
            }
        }
        this.field2993 = null;
        return null;
    }

    @ObfuscatedName("gt.o(Lga;J)V")
    public void method3410(class199 arg0, long arg1) {
        if (arg0.field3020 != null) {
            arg0.method3540();
        }
        class199 var4 = this.field2994[(int) (arg1 & (long) (this.field2996 - 1))];
        arg0.field3020 = var4.field3020;
        arg0.field3019 = var4;
        arg0.field3020.field3019 = arg0;
        arg0.field3019.field3020 = arg0;
        arg0.field3018 = arg1;
    }

    @ObfuscatedName("gt.a()V")
    public void method3420() {
        for (int var1 = 0; var1 < this.field2996; var1++) {
            class199 var2 = this.field2994[var1];
            while (true) {
                class199 var3 = var2.field3019;
                if (var2 == var3) {
                    break;
                }
                var3.method3540();
            }
        }
        this.field2993 = null;
        this.field2995 = null;
    }

    @ObfuscatedName("gt.w()Lga;")
    public class199 method3411() {
        this.field2997 = 0;
        return this.method3417();
    }

    @ObfuscatedName("gt.m()Lga;")
    public class199 method3417() {
        if (this.field2997 > 0 && this.field2994[this.field2997 - 1] != this.field2995) {
            class199 var1 = this.field2995;
            this.field2995 = var1.field3019;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2997 >= this.field2996) {
                return null;
            }
            var2 = this.field2994[this.field2997++].field3019;
        } while (this.field2994[this.field2997 - 1] == var2);
        this.field2995 = var2.field3019;
        return var2;
    }
}
