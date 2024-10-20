package deob;

@ObfuscatedName("gn")
public class class187 extends class199 {

    @ObfuscatedName("gn.n")
    public final int field2100;

    @ObfuscatedName("gn.c")
    public final class194 field2101;

    @ObfuscatedName("gn.m")
    public final int field2102;

    @ObfuscatedName("gn.k")
    public final int field2103;

    public class187(class258 arg0, class258 arg1, int arg2, class194 arg3) {
        super(arg0, arg1);
        this.field2100 = arg2;
        this.field2101 = arg3;
        class154 var5 = class154.method1007(this.method3144());
        class413 var6 = var5.method2602(false);
        if (var6 == null) {
            this.field2102 = 0;
            this.field2103 = 0;
        } else {
            this.field2102 = var6.field4375;
            this.field2103 = var6.field4378;
        }
    }

    @ObfuscatedName("gn.c(B)I")
    public int method3144() {
        return this.field2100;
    }

    @ObfuscatedName("gn.m(S)Lgz;")
    public class194 method3145() {
        return this.field2101;
    }

    @ObfuscatedName("gn.k(B)I")
    public int method3146() {
        return this.field2102;
    }

    @ObfuscatedName("gn.o(I)I")
    public int method3155() {
        return this.field2103;
    }
}
