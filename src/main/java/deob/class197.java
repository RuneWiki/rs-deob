package deob;

@ObfuscatedName("gr")
public class class197 {

    @ObfuscatedName("gr.a")
    public final int field2939;

    @ObfuscatedName("gr.v")
    public final long field2937;

    @ObfuscatedName("gr.i")
    public final class203 field2938;

    @ObfuscatedName("gr.b")
    public String field2940;

    @ObfuscatedName("gr.l")
    public String field2941;

    public class197(class110 arg0, byte arg1, int arg2) {
        this.field2940 = arg0.method2139();
        this.field2941 = arg0.method2139();
        this.field2939 = arg0.method2282();
        this.field2937 = arg0.method2137();
        int var4 = arg0.method2136();
        int var5 = arg0.method2136();
        this.field2938 = new class203();
        this.field2938.method3428(2);
        this.field2938.method3421(arg1);
        this.field2938.field2959 = var4;
        this.field2938.field2962 = var5;
        this.field2938.field2963 = 0;
        this.field2938.field2961 = 0;
        this.field2938.field2960 = arg2;
    }

    @ObfuscatedName("gr.a(B)Ljava/lang/String;")
    public String method3377() {
        return this.field2940;
    }

    @ObfuscatedName("gr.v(I)Ljava/lang/String;")
    public String method3378() {
        return this.field2941;
    }
}
