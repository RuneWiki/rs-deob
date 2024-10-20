package deob;

@ObfuscatedName("nu")
public class class352 {

    @ObfuscatedName("nu.af")
    public final int field4284;

    @ObfuscatedName("nu.an")
    public final long field4283;

    @ObfuscatedName("nu.aw")
    public final class353 field4285;

    @ObfuscatedName("nu.ac")
    public String field4286;

    @ObfuscatedName("nu.au")
    public String field4287;

    public class352(class489 arg0, byte arg1, int arg2) {
        this.field4286 = arg0.method8259();
        this.field4287 = arg0.method8259();
        this.field4284 = arg0.method8250();
        this.field4283 = arg0.method8271();
        int var4 = arg0.method8254();
        int var5 = arg0.method8254();
        this.field4285 = new class353();
        this.field4285.method6239(2);
        this.field4285.method6235(arg1);
        this.field4285.field4291 = var4;
        this.field4285.field4293 = var5;
        this.field4285.field4289 = 0;
        this.field4285.field4294 = 0;
        this.field4285.field4290 = arg2;
    }

    @ObfuscatedName("nu.af(I)Ljava/lang/String;")
    public String method6225() {
        return this.field4286;
    }

    @ObfuscatedName("nu.an(I)Ljava/lang/String;")
    public String method6221() {
        return this.field4287;
    }
}
