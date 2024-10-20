package deob;

@ObfuscatedName("bv")
public class class62 extends class428 {

    @ObfuscatedName("bv.h")
    public int field487;

    @ObfuscatedName("bv.e")
    public int field495;

    @ObfuscatedName("bv.v")
    public int field486;

    @ObfuscatedName("bv.x")
    public String field489;

    @ObfuscatedName("bv.m")
    public class490 field488;

    @ObfuscatedName("bv.q")
    public class399 field484 = class399.field4546;

    @ObfuscatedName("bv.f")
    public class399 field485 = class399.field4546;

    @ObfuscatedName("bv.r")
    public String field491;

    @ObfuscatedName("bv.u")
    public String field492;

    public class62(int arg0, String arg1, String arg2, String arg3) {
        this.method1108(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bv.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1108(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class107.field1417 - 1;
        this.field487 = var5;
        this.field495 = client.field519;
        this.field486 = arg0;
        this.field489 = arg1;
        this.method1104();
        this.field491 = arg2;
        this.field492 = arg3;
        this.method1110();
        this.method1101();
    }

    @ObfuscatedName("bv.e(B)V")
    public void method1110() {
        this.field484 = class399.field4546;
    }

    @ObfuscatedName("bv.v(B)Z")
    public final boolean method1099() {
        if (class399.field4546 == this.field484) {
            this.method1100();
        }
        return class399.field4547 == this.field484;
    }

    @ObfuscatedName("bv.x(I)V")
    public void method1100() {
        this.field484 = Statics.field4582.field829.method6867(this.field488) ? class399.field4547 : class399.field4548;
    }

    @ObfuscatedName("bv.m(B)V")
    public void method1101() {
        this.field485 = class399.field4546;
    }

    @ObfuscatedName("bv.q(I)Z")
    public final boolean method1102() {
        if (class399.field4546 == this.field485) {
            this.method1103();
        }
        return class399.field4547 == this.field485;
    }

    @ObfuscatedName("bv.f(B)V")
    public void method1103() {
        this.field485 = Statics.field4582.field830.method6867(this.field488) ? class399.field4547 : class399.field4548;
    }

    @ObfuscatedName("bv.r(I)V")
    public final void method1104() {
        if (this.field489 == null) {
            this.field488 = null;
        } else {
            this.field488 = new class490(client.method4961(this.field489), Statics.field986);
        }
    }
}
