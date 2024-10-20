package deob;

@ObfuscatedName("jq")
public class class243 extends class255 {

    @ObfuscatedName("jq.at")
    public final int field2529;

    @ObfuscatedName("jq.ah")
    public final class250 field2527;

    @ObfuscatedName("jq.ar")
    public final int field2528;

    @ObfuscatedName("jq.ao")
    public final int field2526;

    public class243(class334 arg0, class334 arg1, int arg2, class250 arg3) {
        super(arg0, arg1);
        this.field2529 = arg2;
        this.field2527 = arg3;
        class178 var5 = class178.method3048(this.method4123());
        class541 var6 = var5.method3253(false);
        if (var6 == null) {
            this.field2528 = 0;
            this.field2526 = 0;
        } else {
            this.field2528 = var6.field5236;
            this.field2526 = var6.field5239;
        }
    }

    @ObfuscatedName("jq.ah(I)I")
    public int method4123() {
        return this.field2529;
    }

    @ObfuscatedName("jq.ar(B)Ljk;")
    public class250 method4120() {
        return this.field2527;
    }

    @ObfuscatedName("jq.ao(I)I")
    public int method4121() {
        return this.field2528;
    }

    @ObfuscatedName("jq.ab(I)I")
    public int method4122() {
        return this.field2526;
    }
}
