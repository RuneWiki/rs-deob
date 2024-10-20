package deob;

@ObfuscatedName("gb")
public final class class190 {

    @ObfuscatedName("gb.j")
    public int field3019;

    @ObfuscatedName("gb.y")
    public class202[] field3018;

    @ObfuscatedName("gb.z")
    public class202 field3020;

    @ObfuscatedName("gb.l")
    public class202 field3021;

    @ObfuscatedName("gb.w")
    public int field3022 = 0;

    public class190(int arg0) {
        this.field3019 = arg0;
        this.field3018 = new class202[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class202 var3 = this.field3018[var2] = new class202();
            var3.field3044 = var3;
            var3.field3045 = var3;
        }
    }

    @ObfuscatedName("gb.j(J)Lgz;")
    public class202 method3459(long arg0) {
        class202 var3 = this.field3018[(int) (arg0 & (long) (this.field3019 - 1))];
        for (this.field3020 = var3.field3044; this.field3020 != var3; this.field3020 = this.field3020.field3044) {
            if (this.field3020.field3043 == arg0) {
                class202 var4 = this.field3020;
                this.field3020 = this.field3020.field3044;
                return var4;
            }
        }
        this.field3020 = null;
        return null;
    }

    @ObfuscatedName("gb.y(Lgz;J)V")
    public void method3463(class202 arg0, long arg1) {
        if (arg0.field3045 != null) {
            arg0.method3563();
        }
        class202 var4 = this.field3018[(int) (arg1 & (long) (this.field3019 - 1))];
        arg0.field3045 = var4.field3045;
        arg0.field3044 = var4;
        arg0.field3045.field3044 = arg0;
        arg0.field3044.field3045 = arg0;
        arg0.field3043 = arg1;
    }

    @ObfuscatedName("gb.z()V")
    public void method3461() {
        for (int var1 = 0; var1 < this.field3019; var1++) {
            class202 var2 = this.field3018[var1];
            while (true) {
                class202 var3 = var2.field3044;
                if (var2 == var3) {
                    break;
                }
                var3.method3563();
            }
        }
        this.field3020 = null;
        this.field3021 = null;
    }

    @ObfuscatedName("gb.l()Lgz;")
    public class202 method3462() {
        this.field3022 = 0;
        return this.method3468();
    }

    @ObfuscatedName("gb.w()Lgz;")
    public class202 method3468() {
        if (this.field3022 > 0 && this.field3018[this.field3022 - 1] != this.field3021) {
            class202 var1 = this.field3021;
            this.field3021 = var1.field3044;
            return var1;
        }
        class202 var2;
        do {
            if (this.field3022 >= this.field3019) {
                return null;
            }
            var2 = this.field3018[this.field3022++].field3044;
        } while (this.field3018[this.field3022 - 1] == var2);
        this.field3021 = var2.field3044;
        return var2;
    }
}
