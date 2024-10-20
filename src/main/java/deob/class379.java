package deob;

@ObfuscatedName("og")
public class class379 {

    @ObfuscatedName("og.at")
    public final int field4367;

    @ObfuscatedName("og.ah")
    public final long field4365;

    @ObfuscatedName("og.ar")
    public final class380 field4366;

    @ObfuscatedName("og.ao")
    public String field4368;

    @ObfuscatedName("og.ab")
    public String field4364;

    public class379(class527 arg0, byte arg1, int arg2) {
        this.field4368 = arg0.method8535();
        this.field4364 = arg0.method8535();
        this.field4367 = arg0.method8412();
        this.field4365 = arg0.method8417();
        int var4 = arg0.method8416();
        int var5 = arg0.method8416();
        this.field4366 = new class380();
        this.field4366.method6465(2);
        this.field4366.method6455(arg1);
        this.field4366.field4373 = var4;
        this.field4366.field4376 = var5;
        this.field4366.field4377 = 0;
        this.field4366.field4375 = 0;
        this.field4366.field4374 = arg2;
    }

    @ObfuscatedName("og.at(I)Ljava/lang/String;")
    public String method6446() {
        return this.field4368;
    }

    @ObfuscatedName("og.ah(I)Ljava/lang/String;")
    public String method6447() {
        return this.field4364;
    }
}
