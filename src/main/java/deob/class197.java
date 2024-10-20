package deob;

@ObfuscatedName("gj")
public class class197 {

    @ObfuscatedName("gj.v")
    public final int field2941;

    @ObfuscatedName("gj.t")
    public final long field2940;

    @ObfuscatedName("gj.f")
    public final class203 field2944;

    @ObfuscatedName("gj.j")
    public String field2942;

    @ObfuscatedName("gj.l")
    public String field2939;

    public class197(class110 arg0, byte arg1, int arg2) {
        this.field2942 = arg0.method2159();
        this.field2939 = arg0.method2159();
        this.field2941 = arg0.method2194();
        this.field2940 = arg0.method2167();
        int var4 = arg0.method2297();
        int var5 = arg0.method2297();
        this.field2944 = new class203();
        this.field2944.method3465(2);
        this.field2944.method3466(arg1);
        this.field2944.field2965 = var4;
        this.field2944.field2962 = var5;
        this.field2944.field2964 = 0;
        this.field2944.field2960 = 0;
        this.field2944.field2961 = arg2;
    }

    @ObfuscatedName("gj.v(I)Ljava/lang/String;")
    public String method3420() {
        return this.field2942;
    }

    @ObfuscatedName("gj.t(B)Ljava/lang/String;")
    public String method3422() {
        return this.field2939;
    }
}
