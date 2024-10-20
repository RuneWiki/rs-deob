package deob;

@ObfuscatedName("kt")
public class class298 {

    @ObfuscatedName("kt.i")
    public final int field3748;

    @ObfuscatedName("kt.w")
    public final long field3746;

    @ObfuscatedName("kt.s")
    public final class299 field3747;

    @ObfuscatedName("kt.a")
    public String field3745;

    @ObfuscatedName("kt.o")
    public String field3749;

    public class298(class401 arg0, byte arg1, int arg2) {
        this.field3745 = arg0.method6335();
        this.field3749 = arg0.method6335();
        this.field3748 = arg0.method6242();
        this.field3746 = arg0.method6249();
        int var4 = arg0.method6245();
        int var5 = arg0.method6245();
        this.field3747 = new class299();
        this.field3747.method4885(2);
        this.field3747.method4886(arg1);
        this.field3747.field3752 = var4;
        this.field3747.field3753 = var5;
        this.field3747.field3754 = 0;
        this.field3747.field3756 = 0;
        this.field3747.field3750 = arg2;
    }

    @ObfuscatedName("kt.i(I)Ljava/lang/String;")
    public String method4874() {
        return this.field3745;
    }

    @ObfuscatedName("kt.w(I)Ljava/lang/String;")
    public String method4873() {
        return this.field3749;
    }
}
