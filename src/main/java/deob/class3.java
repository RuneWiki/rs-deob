package deob;

@ObfuscatedName("s")
public class class3 {

    @ObfuscatedName("s.z")
    public final int field20;

    @ObfuscatedName("s.w")
    public final long field21;

    @ObfuscatedName("s.s")
    public final class5 field18;

    @ObfuscatedName("s.l")
    public String field19;

    @ObfuscatedName("s.u")
    public String field22;

    public class3(class183 arg0, byte arg1, int arg2) {
        this.field19 = arg0.method3441();
        this.field22 = arg0.method3441();
        this.field20 = arg0.method3253();
        this.field21 = arg0.method3257();
        int var4 = arg0.method3374();
        int var5 = arg0.method3374();
        this.field18 = new class5();
        this.field18.method45(2);
        this.field18.method41(arg1);
        this.field18.field31 = var4;
        this.field18.field34 = var5;
        this.field18.field33 = 0;
        this.field18.field29 = 0;
        this.field18.field30 = arg2;
    }

    @ObfuscatedName("s.z(I)Ljava/lang/String;")
    public String method17() {
        return this.field19;
    }

    @ObfuscatedName("s.w(I)Ljava/lang/String;")
    public String method19() {
        return this.field22;
    }
}
