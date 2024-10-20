package deob;

@ObfuscatedName("gb")
public class class187 extends class199 {

    @ObfuscatedName("gb.l")
    public final int field2112;

    @ObfuscatedName("gb.q")
    public final class194 field2109;

    @ObfuscatedName("gb.f")
    public final int field2108;

    @ObfuscatedName("gb.j")
    public final int field2110;

    public class187(class258 arg0, class258 arg1, int arg2, class194 arg3) {
        super(arg0, arg1);
        this.field2112 = arg2;
        this.field2109 = arg3;
        class154 var5 = class154.method156(this.method3195());
        class414 var6 = var5.method2654(false);
        if (var6 == null) {
            this.field2108 = 0;
            this.field2110 = 0;
        } else {
            this.field2108 = var6.field4390;
            this.field2110 = var6.field4383;
        }
    }

    @ObfuscatedName("gb.q(I)I")
    public int method3195() {
        return this.field2112;
    }

    @ObfuscatedName("gb.f(S)Lga;")
    public class194 method3209() {
        return this.field2109;
    }

    @ObfuscatedName("gb.j(I)I")
    public int method3197() {
        return this.field2108;
    }

    @ObfuscatedName("gb.m(I)I")
    public int method3198() {
        return this.field2110;
    }
}
