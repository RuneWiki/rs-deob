package deob;

@ObfuscatedName("t")
public class class19 extends class35 {

    @ObfuscatedName("t.m")
    public final int field110;

    @ObfuscatedName("t.f")
    public final class29 field108;

    @ObfuscatedName("t.q")
    public final int field109;

    @ObfuscatedName("t.w")
    public final int field115;

    public class19(class225 arg0, class225 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field110 = arg2;
        this.field108 = arg3;
        class253 var5 = class253.method2731(this.method192());
        class328 var6 = var5.method4376(false);
        if (var6 == null) {
            this.field109 = 0;
            this.field115 = 0;
        } else {
            this.field109 = var6.field3897;
            this.field115 = var6.field3904;
        }
    }

    @ObfuscatedName("t.m(I)I")
    public int method192() {
        return this.field110;
    }

    @ObfuscatedName("t.f(I)Laj;")
    public class29 method191() {
        return this.field108;
    }

    @ObfuscatedName("t.q(B)I")
    public int method190() {
        return this.field109;
    }

    @ObfuscatedName("t.w(I)I")
    public int method201() {
        return this.field115;
    }
}
