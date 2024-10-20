package deob;

@ObfuscatedName("eg")
public class class156 extends class298 {

    @ObfuscatedName("eg.o")
    public final boolean field2164;

    public class156(boolean arg0) {
        this.field2164 = arg0;
    }

    @ObfuscatedName("eg.o(Lkv;Lkv;B)I")
    public int method2911(class302 arg0, class302 arg1) {
        if (arg0.field3848 == arg1.field3848) {
            return this.method4894(arg0, arg1);
        } else if (this.field2164) {
            return arg0.field3848 - arg1.field3848;
        } else {
            return arg1.field3848 - arg0.field3848;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2911((class302) arg0, (class302) arg1);
    }
}
