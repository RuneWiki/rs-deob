package deob;

@ObfuscatedName("br")
public class class58 extends class382 {

    @ObfuscatedName("br.c")
    public int field451;

    @ObfuscatedName("br.b")
    public int field453;

    @ObfuscatedName("br.p")
    public int field452;

    @ObfuscatedName("br.m")
    public String field455;

    @ObfuscatedName("br.t")
    public class440 field454;

    @ObfuscatedName("br.s")
    public class355 field458 = class355.field4129;

    @ObfuscatedName("br.j")
    public class355 field456 = class355.field4129;

    @ObfuscatedName("br.w")
    public String field450;

    @ObfuscatedName("br.n")
    public String field457;

    public class58(int arg0, String arg1, String arg2, String arg3) {
        this.method1048(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("br.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1048(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class98.field1270 - 1;
        this.field451 = var5;
        this.field453 = client.field481;
        this.field452 = arg0;
        this.field455 = arg1;
        this.method1054();
        this.field450 = arg2;
        this.field457 = arg3;
        this.method1059();
        this.method1070();
    }

    @ObfuscatedName("br.b(I)V")
    public void method1059() {
        this.field458 = class355.field4129;
    }

    @ObfuscatedName("br.p(B)Z")
    public final boolean method1057() {
        if (class355.field4129 == this.field458) {
            this.method1069();
        }
        return class355.field4123 == this.field458;
    }

    @ObfuscatedName("br.m(B)V")
    public void method1069() {
        this.field458 = Statics.field182.field782.method5822(this.field454) ? class355.field4123 : class355.field4122;
    }

    @ObfuscatedName("br.t(B)V")
    public void method1070() {
        this.field456 = class355.field4129;
    }

    @ObfuscatedName("br.s(I)Z")
    public final boolean method1052() {
        if (class355.field4129 == this.field456) {
            this.method1053();
        }
        return class355.field4123 == this.field456;
    }

    @ObfuscatedName("br.j(B)V")
    public void method1053() {
        this.field456 = Statics.field182.field783.method5822(this.field454) ? class355.field4123 : class355.field4122;
    }

    @ObfuscatedName("br.w(I)V")
    public final void method1054() {
        if (this.field455 == null) {
            this.field454 = null;
        } else {
            this.field454 = new class440(client.method4384(this.field455), Statics.field2283);
        }
    }
}
