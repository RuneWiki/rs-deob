package deob;

@ObfuscatedName("b")
public class class3 {

    @ObfuscatedName("b.o")
    public final int field18;

    @ObfuscatedName("b.m")
    public final long field17;

    @ObfuscatedName("b.b")
    public final class5 field20;

    @ObfuscatedName("b.g")
    public String field19;

    @ObfuscatedName("b.h")
    public String field16;

    public class3(class154 arg0, byte arg1, int arg2) {
        this.field19 = arg0.method2606();
        this.field16 = arg0.method2606();
        this.field18 = arg0.method2554();
        this.field17 = arg0.method2558();
        int var4 = arg0.method2557();
        int var5 = arg0.method2557();
        this.field20 = new class5();
        this.field20.method56(2);
        this.field20.method47(arg1);
        this.field20.field31 = var4;
        this.field20.field32 = var5;
        this.field20.field30 = 0;
        this.field20.field34 = 0;
        this.field20.field29 = arg2;
    }

    @ObfuscatedName("b.o(I)Ljava/lang/String;")
    public String method25() {
        return this.field19;
    }

    @ObfuscatedName("b.m(I)Ljava/lang/String;")
    public String method18() {
        return this.field16;
    }
}
