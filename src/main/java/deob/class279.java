package deob;

@ObfuscatedName("kq")
public class class279 extends class291 {

    @ObfuscatedName("kq.az")
    public final int field3057;

    @ObfuscatedName("kq.ah")
    public final class286 field3059;

    @ObfuscatedName("kq.af")
    public final int field3058;

    @ObfuscatedName("kq.at")
    public final int field3056;

    public class279(class339 arg0, class339 arg1, int arg2, class286 arg3) {
        super(arg0, arg1);
        this.field3057 = arg2;
        this.field3059 = arg3;
        class197 var5 = class197.method5698(this.method4842());
        class549 var6 = var5.method3426(false);
        if (var6 == null) {
            this.field3058 = 0;
            this.field3056 = 0;
        } else {
            this.field3058 = var6.field5330;
            this.field3056 = var6.field5331;
        }
    }

    @ObfuscatedName("kq.ah(I)I")
    public int method4842() {
        return this.field3057;
    }

    @ObfuscatedName("kq.af(I)Lkz;")
    public class286 method4839() {
        return this.field3059;
    }

    @ObfuscatedName("kq.at(I)I")
    public int method4843() {
        return this.field3058;
    }

    @ObfuscatedName("kq.an(I)I")
    public int method4847() {
        return this.field3056;
    }
}
