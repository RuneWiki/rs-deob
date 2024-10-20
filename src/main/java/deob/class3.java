package deob;

@ObfuscatedName("e")
public class class3 {

    @ObfuscatedName("e.g")
    public final int field18;

    @ObfuscatedName("e.r")
    public final long field17;

    @ObfuscatedName("e.e")
    public final class5 field20;

    @ObfuscatedName("e.q")
    public String field19;

    @ObfuscatedName("e.c")
    public String field21;

    public class3(class185 arg0, byte arg1, int arg2) {
        this.field19 = arg0.method3474();
        this.field21 = arg0.method3474();
        this.field18 = arg0.method3467();
        this.field17 = arg0.method3471();
        int var4 = arg0.method3588();
        int var5 = arg0.method3588();
        this.field20 = new class5();
        this.field20.method57(2);
        this.field20.method39(arg1);
        this.field20.field32 = var4;
        this.field20.field34 = var5;
        this.field20.field39 = 0;
        this.field20.field36 = 0;
        this.field20.field31 = arg2;
    }

    @ObfuscatedName("e.g(I)Ljava/lang/String;")
    public String method19() {
        return this.field19;
    }

    @ObfuscatedName("e.r(I)Ljava/lang/String;")
    public String method20() {
        return this.field21;
    }
}
