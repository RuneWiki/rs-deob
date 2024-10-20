package deob;

@ObfuscatedName("fv")
public class class179 extends class199 {

    @ObfuscatedName("fv.l")
    public final int field2031;

    @ObfuscatedName("fv.q")
    public final class182 field2023;

    @ObfuscatedName("fv.f")
    public int field2024;

    @ObfuscatedName("fv.j")
    public class194 field2022;

    @ObfuscatedName("fv.m")
    public int field2029;

    @ObfuscatedName("fv.k")
    public int field2027;

    public class179(class258 arg0, class258 arg1, int arg2, class182 arg3) {
        super(arg0, arg1);
        this.field2031 = arg2;
        this.field2023 = arg3;
        this.method3193();
    }

    @ObfuscatedName("fv.l(I)V")
    public void method3193() {
        this.field2024 = class169.method4277(this.field2031).method2967().field1850;
        this.field2022 = this.field2023.method3341(class154.method156(this.field2024));
        class154 var1 = class154.method156(this.method3195());
        class414 var2 = var1.method2654(false);
        if (var2 == null) {
            this.field2029 = 0;
            this.field2027 = 0;
        } else {
            this.field2029 = var2.field4390;
            this.field2027 = var2.field4383;
        }
    }

    @ObfuscatedName("fv.q(I)I")
    public int method3195() {
        return this.field2024;
    }

    @ObfuscatedName("fv.f(S)Lga;")
    public class194 method3209() {
        return this.field2022;
    }

    @ObfuscatedName("fv.j(I)I")
    public int method3197() {
        return this.field2029;
    }

    @ObfuscatedName("fv.m(I)I")
    public int method3198() {
        return this.field2027;
    }
}
