package deob;

@ObfuscatedName("fr")
public class class179 extends class199 {

    @ObfuscatedName("fr.i")
    public final int field2023;

    @ObfuscatedName("fr.w")
    public final class182 field2021;

    @ObfuscatedName("fr.s")
    public int field2022;

    @ObfuscatedName("fr.a")
    public class194 field2024;

    @ObfuscatedName("fr.o")
    public int field2020;

    @ObfuscatedName("fr.g")
    public int field2025;

    public class179(class258 arg0, class258 arg1, int arg2, class182 arg3) {
        super(arg0, arg1);
        this.field2023 = arg2;
        this.field2021 = arg3;
        this.method3224();
    }

    @ObfuscatedName("fr.i(I)V")
    public void method3224() {
        this.field2022 = Statics.method2740(this.field2023).method2980().field1829;
        this.field2024 = this.field2021.method3366(class154.method3068(this.field2022));
        class154 var1 = class154.method3068(this.method3225());
        class414 var2 = var1.method2700(false);
        if (var2 == null) {
            this.field2020 = 0;
            this.field2025 = 0;
        } else {
            this.field2020 = var2.field4394;
            this.field2025 = var2.field4395;
        }
    }

    @ObfuscatedName("fr.w(I)I")
    public int method3225() {
        return this.field2022;
    }

    @ObfuscatedName("fr.s(B)Lga;")
    public class194 method3226() {
        return this.field2024;
    }

    @ObfuscatedName("fr.a(I)I")
    public int method3227() {
        return this.field2020;
    }

    @ObfuscatedName("fr.o(I)I")
    public int method3230() {
        return this.field2025;
    }
}
