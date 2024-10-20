package deob;

@ObfuscatedName("bf")
public class class58 extends class365 {

    @ObfuscatedName("bf.i")
    public int field446;

    @ObfuscatedName("bf.w")
    public int field442;

    @ObfuscatedName("bf.s")
    public int field443;

    @ObfuscatedName("bf.a")
    public String field444;

    @ObfuscatedName("bf.o")
    public class422 field447;

    @ObfuscatedName("bf.g")
    public class343 field441 = class343.field3969;

    @ObfuscatedName("bf.e")
    public class343 field452 = class343.field3969;

    @ObfuscatedName("bf.p")
    public String field448;

    @ObfuscatedName("bf.j")
    public String field445;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method1052(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bf.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1052(int arg0, String arg1, String arg2, String arg3) {
        this.field446 = class98.method4647();
        this.field442 = client.field555;
        this.field443 = arg0;
        this.field444 = arg1;
        this.method1054();
        this.field448 = arg2;
        this.field445 = arg3;
        this.method1048();
        this.method1051();
    }

    @ObfuscatedName("bf.w(I)V")
    public void method1048() {
        this.field441 = class343.field3969;
    }

    @ObfuscatedName("bf.s(B)Z")
    public final boolean method1049() {
        if (class343.field3969 == this.field441) {
            this.method1050();
        }
        return class343.field3970 == this.field441;
    }

    @ObfuscatedName("bf.a(I)V")
    public void method1050() {
        this.field441 = Statics.field1352.field764.method5498(this.field447) ? class343.field3970 : class343.field3971;
    }

    @ObfuscatedName("bf.o(I)V")
    public void method1051() {
        this.field452 = class343.field3969;
    }

    @ObfuscatedName("bf.g(B)Z")
    public final boolean method1058() {
        if (class343.field3969 == this.field452) {
            this.method1073();
        }
        return class343.field3970 == this.field452;
    }

    @ObfuscatedName("bf.e(I)V")
    public void method1073() {
        this.field452 = Statics.field1352.field763.method5498(this.field447) ? class343.field3970 : class343.field3971;
    }

    @ObfuscatedName("bf.p(I)V")
    public final void method1054() {
        if (this.field444 == null) {
            this.field447 = null;
        } else {
            this.field447 = new class422(client.method4165(this.field444), Statics.field3757);
        }
    }
}
