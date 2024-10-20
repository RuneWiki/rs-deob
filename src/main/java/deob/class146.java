package deob;

@ObfuscatedName("ew")
public class class146 extends class286 {

    @ObfuscatedName("ew.g")
    public final boolean field1951;

    public class146(boolean arg0) {
        this.field1951 = arg0;
    }

    @ObfuscatedName("ew.g(Lkv;Lkv;B)I")
    public int method3119(class290 arg0, class290 arg1) {
        if (arg0.field3709 == arg1.field3709) {
            return this.method5152(arg0, arg1);
        } else if (this.field1951) {
            return arg0.field3709 - arg1.field3709;
        } else {
            return arg1.field3709 - arg0.field3709;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3119((class290) arg0, (class290) arg1);
    }
}
