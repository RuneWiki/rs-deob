package deob;

@ObfuscatedName("gh")
public class class187 extends class199 {

    @ObfuscatedName("gh.i")
    public final int field2112;

    @ObfuscatedName("gh.w")
    public final class194 field2106;

    @ObfuscatedName("gh.s")
    public final int field2105;

    @ObfuscatedName("gh.a")
    public final int field2108;

    public class187(class258 arg0, class258 arg1, int arg2, class194 arg3) {
        super(arg0, arg1);
        this.field2112 = arg2;
        this.field2106 = arg3;
        class154 var5 = class154.method3068(this.method3225());
        class414 var6 = var5.method2700(false);
        if (var6 == null) {
            this.field2105 = 0;
            this.field2108 = 0;
        } else {
            this.field2105 = var6.field4394;
            this.field2108 = var6.field4395;
        }
    }

    @ObfuscatedName("gh.w(I)I")
    public int method3225() {
        return this.field2112;
    }

    @ObfuscatedName("gh.s(B)Lga;")
    public class194 method3226() {
        return this.field2106;
    }

    @ObfuscatedName("gh.a(I)I")
    public int method3227() {
        return this.field2105;
    }

    @ObfuscatedName("gh.o(I)I")
    public int method3230() {
        return this.field2108;
    }
}
