package deob;

@ObfuscatedName("gb")
public class class195 {

    @ObfuscatedName("gb.c")
    public final int field2921;

    @ObfuscatedName("gb.j")
    public final long field2917;

    @ObfuscatedName("gb.y")
    public final class201 field2919;

    @ObfuscatedName("gb.r")
    public String field2920;

    @ObfuscatedName("gb.f")
    public String field2923;

    public class195(class108 arg0, byte arg1, int arg2) {
        this.field2920 = arg0.method2216();
        this.field2923 = arg0.method2216();
        this.field2921 = arg0.method2136();
        this.field2917 = arg0.method2140();
        int var4 = arg0.method2144();
        int var5 = arg0.method2144();
        this.field2919 = new class201();
        this.field2919.method3409(2);
        this.field2919.method3410(arg1);
        this.field2919.field2940 = var4;
        this.field2919.field2941 = var5;
        this.field2919.field2939 = 0;
        this.field2919.field2944 = 0;
        this.field2919.field2943 = arg2;
    }

    @ObfuscatedName("gb.c(I)Ljava/lang/String;")
    public String method3372() {
        return this.field2920;
    }

    @ObfuscatedName("gb.j(B)Ljava/lang/String;")
    public String method3369() {
        return this.field2923;
    }
}
