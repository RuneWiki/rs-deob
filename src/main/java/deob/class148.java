package deob;

@ObfuscatedName("ei")
public class class148 extends class289 {

    @ObfuscatedName("ei.n")
    public final boolean field1962;

    public class148(boolean arg0) {
        this.field1962 = arg0;
    }

    @ObfuscatedName("ei.n(Lkx;Lkx;I)I")
    public int method3136(class293 arg0, class293 arg1) {
        if (client.field630 == arg0.field3701 && client.field630 == arg1.field3701) {
            return this.field1962 ? arg0.field3702 - arg1.field3702 : arg1.field3702 - arg0.field3702;
        } else {
            return this.method5147(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3136((class293) arg0, (class293) arg1);
    }
}
