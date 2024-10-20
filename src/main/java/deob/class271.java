package deob;

@ObfuscatedName("ks")
public class class271 extends class291 {

    @ObfuscatedName("ks.az")
    public final int field2970;

    @ObfuscatedName("ks.ah")
    public final class274 field2968;

    @ObfuscatedName("ks.af")
    public int field2969;

    @ObfuscatedName("ks.at")
    public class286 field2967;

    @ObfuscatedName("ks.an")
    public int field2971;

    @ObfuscatedName("ks.ao")
    public int field2972;

    public class271(class339 arg0, class339 arg1, int arg2, class274 arg3) {
        super(arg0, arg1);
        this.field2970 = arg2;
        this.field2968 = arg3;
        this.method4840();
    }

    @ObfuscatedName("ks.az(I)V")
    public void method4840() {
        this.field2969 = class222.method2212(this.field2970).method3755().field2283;
        this.field2967 = this.field2968.method4994(class197.method5698(this.field2969));
        class197 var1 = class197.method5698(this.method4842());
        class549 var2 = var1.method3426(false);
        if (var2 == null) {
            this.field2971 = 0;
            this.field2972 = 0;
        } else {
            this.field2971 = var2.field5330;
            this.field2972 = var2.field5331;
        }
    }

    @ObfuscatedName("ks.ah(I)I")
    public int method4842() {
        return this.field2969;
    }

    @ObfuscatedName("ks.af(I)Lkz;")
    public class286 method4839() {
        return this.field2967;
    }

    @ObfuscatedName("ks.at(I)I")
    public int method4843() {
        return this.field2971;
    }

    @ObfuscatedName("ks.an(I)I")
    public int method4847() {
        return this.field2972;
    }
}
