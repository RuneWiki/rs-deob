package deob;

@ObfuscatedName("ko")
public class class298 {

    @ObfuscatedName("ko.n")
    public final int field3759;

    @ObfuscatedName("ko.c")
    public final long field3762;

    @ObfuscatedName("ko.m")
    public final class299 field3760;

    @ObfuscatedName("ko.k")
    public String field3761;

    @ObfuscatedName("ko.o")
    public String field3758;

    public class298(class400 arg0, byte arg1, int arg2) {
        this.field3761 = arg0.method6226();
        this.field3758 = arg0.method6226();
        this.field3759 = arg0.method6219();
        this.field3762 = arg0.method6223();
        int var4 = arg0.method6222();
        int var5 = arg0.method6222();
        this.field3760 = new class299();
        this.field3760.method4878(2);
        this.field3760.method4879(arg1);
        this.field3760.field3766 = var4;
        this.field3760.field3769 = var5;
        this.field3760.field3768 = 0;
        this.field3760.field3764 = 0;
        this.field3760.field3765 = arg2;
    }

    @ObfuscatedName("ko.n(I)Ljava/lang/String;")
    public String method4874() {
        return this.field3761;
    }

    @ObfuscatedName("ko.c(I)Ljava/lang/String;")
    public String method4868() {
        return this.field3758;
    }
}
