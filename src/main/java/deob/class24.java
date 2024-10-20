package deob;

@ObfuscatedName("r")
public class class24 extends class35 {

    @ObfuscatedName("r.m")
    public final int field179;

    @ObfuscatedName("r.f")
    public final class30 field173;

    @ObfuscatedName("r.q")
    public int field175;

    @ObfuscatedName("r.w")
    public class29 field176;

    @ObfuscatedName("r.o")
    public int field177;

    @ObfuscatedName("r.u")
    public int field174;

    public class24(class225 arg0, class225 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field179 = arg2;
        this.field173 = arg3;
        this.method277();
    }

    @ObfuscatedName("r.z(I)V")
    public void method277() {
        this.field175 = class265.method763(this.field179).method4601().field3450;
        this.field176 = this.field173.method419(class253.method2731(this.field175));
        class253 var1 = class253.method2731(this.method192());
        class328 var2 = var1.method4376(false);
        if (var2 == null) {
            this.field177 = 0;
            this.field174 = 0;
        } else {
            this.field177 = var2.field3897;
            this.field174 = var2.field3904;
        }
    }

    @ObfuscatedName("r.m(I)I")
    public int method192() {
        return this.field175;
    }

    @ObfuscatedName("r.f(I)Laj;")
    public class29 method191() {
        return this.field176;
    }

    @ObfuscatedName("r.q(B)I")
    public int method190() {
        return this.field177;
    }

    @ObfuscatedName("r.w(I)I")
    public int method201() {
        return this.field174;
    }
}
