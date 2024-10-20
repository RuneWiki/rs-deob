package deob;

@ObfuscatedName("eg")
public class class154 extends class287 {

    @ObfuscatedName("eg.m")
    public final boolean field1957;

    public class154(boolean arg0) {
        this.field1957 = arg0;
    }

    @ObfuscatedName("eg.m(Lke;Lke;B)I")
    public int method3073(class291 arg0, class291 arg1) {
        if (client.field622 == arg0.field3703 && client.field622 == arg1.field3703) {
            return this.field1957 ? arg0.field3701 - arg1.field3701 : arg1.field3701 - arg0.field3701;
        } else {
            return this.method5011(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3073((class291) arg0, (class291) arg1);
    }
}
