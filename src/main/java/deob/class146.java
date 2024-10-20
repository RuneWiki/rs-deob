package deob;

@ObfuscatedName("eb")
public class class146 extends class284 {

    @ObfuscatedName("eb.z")
    public final boolean field1904;

    public class146(boolean arg0) {
        this.field1904 = arg0;
    }

    @ObfuscatedName("eb.z(Lkz;Lkz;I)I")
    public int method2952(class288 arg0, class288 arg1) {
        if (arg0.field3629 == 0 || arg1.field3629 == 0) {
            return this.method4914(arg0, arg1);
        } else if (this.field1904) {
            return arg0.method4893().method5021(arg1.method4893());
        } else {
            return arg1.method4893().method5021(arg0.method4893());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2952((class288) arg0, (class288) arg1);
    }
}
