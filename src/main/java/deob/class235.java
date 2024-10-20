package deob;

@ObfuscatedName("jp")
public class class235 extends class255 {

    @ObfuscatedName("jp.at")
    public final int field2451;

    @ObfuscatedName("jp.ah")
    public final class238 field2447;

    @ObfuscatedName("jp.ar")
    public int field2448;

    @ObfuscatedName("jp.ao")
    public class250 field2449;

    @ObfuscatedName("jp.ab")
    public int field2452;

    @ObfuscatedName("jp.au")
    public int field2446;

    public class235(class334 arg0, class334 arg1, int arg2, class238 arg3) {
        super(arg0, arg1);
        this.field2451 = arg2;
        this.field2447 = arg3;
        this.method4117();
    }

    @ObfuscatedName("jp.at(I)V")
    public void method4117() {
        this.field2448 = Statics.method4138(this.field2451).method3592().field2104;
        this.field2449 = this.field2447.method4261(class178.method3048(this.field2448));
        class178 var1 = class178.method3048(this.method4123());
        class541 var2 = var1.method3253(false);
        if (var2 == null) {
            this.field2452 = 0;
            this.field2446 = 0;
        } else {
            this.field2452 = var2.field5236;
            this.field2446 = var2.field5239;
        }
    }

    @ObfuscatedName("jp.ah(I)I")
    public int method4123() {
        return this.field2448;
    }

    @ObfuscatedName("jp.ar(B)Ljk;")
    public class250 method4120() {
        return this.field2449;
    }

    @ObfuscatedName("jp.ao(I)I")
    public int method4121() {
        return this.field2452;
    }

    @ObfuscatedName("jp.ab(I)I")
    public int method4122() {
        return this.field2446;
    }
}
