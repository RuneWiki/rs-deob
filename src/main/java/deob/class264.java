package deob;

@ObfuscatedName("kf")
public class class264 extends class276 {

    @ObfuscatedName("kf.aw")
    public final int field2953;

    @ObfuscatedName("kf.ay")
    public final class271 field2954;

    @ObfuscatedName("kf.ar")
    public final int field2955;

    @ObfuscatedName("kf.am")
    public final int field2956;

    public class264(class324 arg0, class324 arg1, int arg2, class271 arg3) {
        super(arg0, arg1);
        this.field2953 = arg2;
        this.field2954 = arg3;
        class188 var5 = class188.method3780(this.method4675());
        class528 var6 = var5.method3280(false);
        if (var6 == null) {
            this.field2955 = 0;
            this.field2956 = 0;
        } else {
            this.field2955 = var6.field5169;
            this.field2956 = var6.field5174;
        }
    }

    @ObfuscatedName("kf.ay(I)I")
    public int method4675() {
        return this.field2953;
    }

    @ObfuscatedName("kf.ar(S)Lka;")
    public class271 method4680() {
        return this.field2954;
    }

    @ObfuscatedName("kf.am(B)I")
    public int method4677() {
        return this.field2955;
    }

    @ObfuscatedName("kf.as(I)I")
    public int method4678() {
        return this.field2956;
    }
}
