package deob;

@ObfuscatedName("jt")
public class class255 extends class267 {

    @ObfuscatedName("jt.af")
    public final int field2956;

    @ObfuscatedName("jt.an")
    public final class262 field2955;

    @ObfuscatedName("jt.aw")
    public final int field2954;

    @ObfuscatedName("jt.ac")
    public final int field2953;

    public class255(class308 arg0, class308 arg1, int arg2, class262 arg3) {
        super(arg0, arg1);
        this.field2956 = arg2;
        this.field2955 = arg3;
        class183 var5 = class183.method6285(this.method4662());
        class503 var6 = var5.method3350(false);
        if (var6 == null) {
            this.field2954 = 0;
            this.field2953 = 0;
        } else {
            this.field2954 = var6.field5088;
            this.field2953 = var6.field5093;
        }
    }

    @ObfuscatedName("jt.an(I)I")
    public int method4662() {
        return this.field2956;
    }

    @ObfuscatedName("jt.aw(I)Lku;")
    public class262 method4651() {
        return this.field2955;
    }

    @ObfuscatedName("jt.ac(I)I")
    public int method4654() {
        return this.field2954;
    }

    @ObfuscatedName("jt.au(I)I")
    public int method4650() {
        return this.field2953;
    }
}
