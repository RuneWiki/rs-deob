package deob;

@ObfuscatedName("ez")
public final class class146 {

    @ObfuscatedName("ez.d")
    public class151 field2024 = new class151();

    @ObfuscatedName("ez.c")
    public int field2023;

    @ObfuscatedName("ez.n")
    public int field2022;

    @ObfuscatedName("ez.q")
    public class147 field2020;

    @ObfuscatedName("ez.t")
    public class141 field2021 = new class141();

    public class146(int arg0) {
        this.field2023 = arg0;
        this.field2022 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2020 = new class147(var2);
    }

    @ObfuscatedName("ez.d(J)Lev;")
    public class151 method2598(long arg0) {
        class151 var3 = (class151) this.field2020.method2611(arg0);
        if (var3 != null) {
            this.field2021.method2550(var3);
        }
        return var3;
    }

    @ObfuscatedName("ez.c(J)V")
    public void method2608(long arg0) {
        class151 var3 = (class151) this.field2020.method2611(arg0);
        if (var3 != null) {
            var3.method2652();
            var3.method2689();
            this.field2022++;
        }
    }

    @ObfuscatedName("ez.n(Lev;J)V")
    public void method2607(class151 arg0, long arg1) {
        if (this.field2022 == 0) {
            class151 var4 = this.field2021.method2553();
            var4.method2652();
            var4.method2689();
            if (this.field2024 == var4) {
                class151 var5 = this.field2021.method2553();
                var5.method2652();
                var5.method2689();
            }
        } else {
            this.field2022--;
        }
        this.field2020.method2612(arg0, arg1);
        this.field2021.method2550(arg0);
    }

    @ObfuscatedName("ez.q()V")
    public void method2603() {
        this.field2021.method2561();
        this.field2020.method2613();
        this.field2024 = new class151();
        this.field2022 = this.field2023;
    }
}
