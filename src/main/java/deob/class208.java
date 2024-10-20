package deob;

@ObfuscatedName("gs")
public class class208 {

    @ObfuscatedName("gs.j")
    public final int field3075;

    @ObfuscatedName("gs.y")
    public final long field3073;

    @ObfuscatedName("gs.z")
    public final class214 field3074;

    @ObfuscatedName("gs.l")
    public String field3072;

    @ObfuscatedName("gs.w")
    public String field3076;

    public class208(class114 arg0, byte arg1, int arg2) {
        this.field3072 = arg0.method2440();
        this.field3076 = arg0.method2440();
        this.field3075 = arg0.method2324();
        this.field3073 = arg0.method2328();
        int var4 = arg0.method2327();
        int var5 = arg0.method2327();
        this.field3074 = new class214();
        this.field3074.method3635(2);
        this.field3074.method3636(arg1);
        this.field3074.field3097 = var4;
        this.field3074.field3096 = var5;
        this.field3074.field3098 = 0;
        this.field3074.field3095 = 0;
        this.field3074.field3094 = arg2;
    }

    @ObfuscatedName("gs.j(B)Ljava/lang/String;")
    public String method3600() {
        return this.field3072;
    }

    @ObfuscatedName("gs.y(I)Ljava/lang/String;")
    public String method3601() {
        return this.field3076;
    }
}
