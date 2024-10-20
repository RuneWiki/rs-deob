package deob;

@ObfuscatedName("pv")
public class class399 {

    @ObfuscatedName("pv.ac")
    public final int field4614;

    @ObfuscatedName("pv.ae")
    public final long field4615;

    @ObfuscatedName("pv.ag")
    public final class400 field4616;

    @ObfuscatedName("pv.am")
    public String field4617;

    @ObfuscatedName("pv.ax")
    public String field4618;

    public class399(class551 arg0, byte arg1, int arg2) {
        this.field4617 = arg0.method9166();
        this.field4618 = arg0.method9166();
        this.field4614 = arg0.method9119();
        this.field4615 = arg0.method8980();
        int var4 = arg0.method9110();
        int var5 = arg0.method9110();
        this.field4616 = new class400();
        this.field4616.method6946(2);
        this.field4616.method6947(arg1);
        this.field4616.field4625 = var4;
        this.field4616.field4623 = var5;
        this.field4616.field4624 = 0;
        this.field4616.field4621 = 0;
        this.field4616.field4620 = arg2;
    }

    @ObfuscatedName("pv.ac(B)Ljava/lang/String;")
    public String method6936() {
        return this.field4617;
    }

    @ObfuscatedName("pv.ae(I)Ljava/lang/String;")
    public String method6935() {
        return this.field4618;
    }
}
