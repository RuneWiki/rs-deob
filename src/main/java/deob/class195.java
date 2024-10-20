package deob;

@ObfuscatedName("gi")
public class class195 {

    @ObfuscatedName("gi.g")
    public final int field2914;

    @ObfuscatedName("gi.j")
    public final long field2915;

    @ObfuscatedName("gi.z")
    public final class201 field2919;

    @ObfuscatedName("gi.b")
    public String field2917;

    @ObfuscatedName("gi.k")
    public String field2918;

    public class195(class108 arg0, byte arg1, int arg2) {
        this.field2917 = arg0.method2091();
        this.field2918 = arg0.method2091();
        this.field2914 = arg0.method2263();
        this.field2915 = arg0.method2089();
        int var4 = arg0.method2117();
        int var5 = arg0.method2117();
        this.field2919 = new class201();
        this.field2919.method3328(2);
        this.field2919.method3332(arg1);
        this.field2919.field2940 = var4;
        this.field2919.field2941 = var5;
        this.field2919.field2942 = 0;
        this.field2919.field2943 = 0;
        this.field2919.field2944 = arg2;
    }

    @ObfuscatedName("gi.g(I)Ljava/lang/String;")
    public String method3285() {
        return this.field2917;
    }

    @ObfuscatedName("gi.j(I)Ljava/lang/String;")
    public String method3283() {
        return this.field2918;
    }
}
