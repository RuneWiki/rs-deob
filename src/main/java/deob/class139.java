package deob;

@ObfuscatedName("ep")
public class class139 extends class284 {

    @ObfuscatedName("ep.z")
    public final boolean field1873;

    public class139(boolean arg0) {
        this.field1873 = arg0;
    }

    @ObfuscatedName("ep.z(Lkz;Lkz;I)I")
    public int method2898(class288 arg0, class288 arg1) {
        if (client.field582 == arg0.field3629 && client.field582 == arg1.field3629) {
            return this.field1873 ? arg0.method4893().method5021(arg1.method4893()) : arg1.method4893().method5021(arg0.method4893());
        } else {
            return this.method4914(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2898((class288) arg0, (class288) arg1);
    }
}
