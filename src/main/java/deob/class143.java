package deob;

@ObfuscatedName("eu")
public class class143 extends class284 {

    @ObfuscatedName("eu.z")
    public final boolean field1891;

    public class143(boolean arg0) {
        this.field1891 = arg0;
    }

    @ObfuscatedName("eu.z(Lkz;Lkz;I)I")
    public int method2934(class288 arg0, class288 arg1) {
        if (arg0.field3629 == 0) {
            if (arg1.field3629 != 0) {
                return this.field1891 ? 1 : -1;
            }
        } else if (arg1.field3629 == 0) {
            return this.field1891 ? -1 : 1;
        }
        return this.method4914(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2934((class288) arg0, (class288) arg1);
    }
}
