package deob;

@ObfuscatedName("en")
public class class143 extends class286 {

    @ObfuscatedName("en.g")
    public final boolean field1942;

    public class143(boolean arg0) {
        this.field1942 = arg0;
    }

    @ObfuscatedName("en.g(Lkv;Lkv;I)I")
    public int method3099(class290 arg0, class290 arg1) {
        if (client.field692 == arg0.field3709 && client.field692 == arg1.field3709) {
            return this.field1942 ? arg0.field3707 - arg1.field3707 : arg1.field3707 - arg0.field3707;
        } else {
            return this.method5152(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3099((class290) arg0, (class290) arg1);
    }
}
