package deob;

@ObfuscatedName("ga")
public class class195 {

    @ObfuscatedName("ga.l")
    public final int field2918;

    @ObfuscatedName("ga.y")
    public final long field2921;

    @ObfuscatedName("ga.g")
    public final class201 field2919;

    @ObfuscatedName("ga.j")
    public String field2917;

    @ObfuscatedName("ga.w")
    public String field2920;

    public class195(class108 arg0, byte arg1, int arg2) {
        this.field2917 = arg0.method2168();
        this.field2920 = arg0.method2168();
        this.field2918 = arg0.method2163();
        this.field2921 = arg0.method2166();
        int var4 = arg0.method2297();
        int var5 = arg0.method2297();
        this.field2919 = new class201();
        this.field2919.method3466(2);
        this.field2919.method3469(arg1);
        this.field2919.field2939 = var4;
        this.field2919.field2938 = var5;
        this.field2919.field2940 = 0;
        this.field2919.field2941 = 0;
        this.field2919.field2937 = arg2;
    }

    @ObfuscatedName("ga.l(S)Ljava/lang/String;")
    public String method3412() {
        return this.field2917;
    }

    @ObfuscatedName("ga.y(I)Ljava/lang/String;")
    public String method3411() {
        return this.field2920;
    }
}
