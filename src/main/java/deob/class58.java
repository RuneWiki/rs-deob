package deob;

@ObfuscatedName("bj")
public class class58 extends class407 {

    @ObfuscatedName("bj.c")
    public int field470;

    @ObfuscatedName("bj.p")
    public int field471;

    @ObfuscatedName("bj.f")
    public int field475;

    @ObfuscatedName("bj.n")
    public String field473;

    @ObfuscatedName("bj.k")
    public class466 field474;

    @ObfuscatedName("bj.w")
    public class378 field480 = class378.field4371;

    @ObfuscatedName("bj.s")
    public class378 field472 = class378.field4371;

    @ObfuscatedName("bj.q")
    public String field477;

    @ObfuscatedName("bj.m")
    public String field478;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method1070(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bj.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public void method1070(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class100.field1336 - 1;
        this.field470 = var5;
        this.field471 = client.field504;
        this.field475 = arg0;
        this.field473 = arg1;
        this.method1096();
        this.field477 = arg2;
        this.field478 = arg3;
        this.method1074();
        this.method1081();
    }

    @ObfuscatedName("bj.p(I)V")
    public void method1074() {
        this.field480 = class378.field4371;
    }

    @ObfuscatedName("bj.f(I)Z")
    public final boolean method1072() {
        if (class378.field4371 == this.field480) {
            this.method1073();
        }
        return class378.field4369 == this.field480;
    }

    @ObfuscatedName("bj.n(I)V")
    public void method1073() {
        this.field480 = Statics.field3345.field813.method6248(this.field474) ? class378.field4369 : class378.field4370;
    }

    @ObfuscatedName("bj.k(I)V")
    public void method1081() {
        this.field472 = class378.field4371;
    }

    @ObfuscatedName("bj.w(I)Z")
    public final boolean method1099() {
        if (class378.field4371 == this.field472) {
            this.method1088();
        }
        return class378.field4369 == this.field472;
    }

    @ObfuscatedName("bj.s(I)V")
    public void method1088() {
        this.field472 = Statics.field3345.field811.method6248(this.field474) ? class378.field4369 : class378.field4370;
    }

    @ObfuscatedName("bj.q(B)V")
    public final void method1096() {
        if (this.field473 == null) {
            this.field474 = null;
        } else {
            this.field474 = new class466(client.method189(this.field473), Statics.field1304);
        }
    }
}
