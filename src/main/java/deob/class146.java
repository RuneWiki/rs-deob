package deob;

@ObfuscatedName("eg")
public class class146 extends class290 {

    @ObfuscatedName("eg.a")
    public final boolean field1949;

    public class146(boolean arg0) {
        this.field1949 = arg0;
    }

    @ObfuscatedName("eg.a(Lkl;Lkl;I)I")
    public int method3115(class294 arg0, class294 arg1) {
        if (client.field650 == arg0.field3713 && client.field650 == arg1.field3713) {
            return this.field1949 ? arg0.method5090().method5239(arg1.method5090()) : arg1.method5090().method5239(arg0.method5090());
        } else {
            return this.method5117(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3115((class294) arg0, (class294) arg1);
    }
}
