package deob;

@ObfuscatedName("fi")
public class class173 extends class185 {

    @ObfuscatedName("fi.f")
    public final int field2031;

    @ObfuscatedName("fi.e")
    public final class180 field2028;

    @ObfuscatedName("fi.v")
    public final int field2029;

    @ObfuscatedName("fi.y")
    public final int field2027;

    public class173(class244 arg0, class244 arg1, int arg2, class180 arg3) {
        super(arg0, arg1);
        this.field2031 = arg2;
        this.field2028 = arg3;
        class140 var5 = class140.method4496(this.method2967());
        class397 var6 = var5.method2433(false);
        if (var6 == null) {
            this.field2029 = 0;
            this.field2027 = 0;
        } else {
            this.field2029 = var6.field4262;
            this.field2027 = var6.field4254;
        }
    }

    @ObfuscatedName("fi.e(I)I")
    public int method2967() {
        return this.field2031;
    }

    @ObfuscatedName("fi.v(I)Lfd;")
    public class180 method2978() {
        return this.field2028;
    }

    @ObfuscatedName("fi.y(B)I")
    public int method2969() {
        return this.field2029;
    }

    @ObfuscatedName("fi.j(I)I")
    public int method2972() {
        return this.field2027;
    }
}
