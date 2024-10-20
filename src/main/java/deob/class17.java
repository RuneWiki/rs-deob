package deob;

@ObfuscatedName("s")
public class class17 {

    @ObfuscatedName("s.m")
    public final int field76;

    @ObfuscatedName("s.o")
    public final long field70;

    @ObfuscatedName("s.q")
    public final class19 field69;

    @ObfuscatedName("s.j")
    public String field72;

    @ObfuscatedName("s.p")
    public String field71;

    public class17(class310 arg0, byte arg1, int arg2) {
        this.field72 = arg0.method5236();
        this.field71 = arg0.method5236();
        this.field76 = arg0.method5283();
        this.field70 = arg0.method5233();
        int var4 = arg0.method5209();
        int var5 = arg0.method5209();
        this.field69 = new class19();
        this.field69.method143(2);
        this.field69.method144(arg1);
        this.field69.field81 = var4;
        this.field69.field83 = var5;
        this.field69.field84 = 0;
        this.field69.field86 = 0;
        this.field69.field85 = arg2;
    }

    @ObfuscatedName("s.m(I)Ljava/lang/String;")
    public String method121() {
        return this.field72;
    }

    @ObfuscatedName("s.o(I)Ljava/lang/String;")
    public String method122() {
        return this.field71;
    }
}
