package deob;

@ObfuscatedName("ec")
public class class154 extends class298 {

    @ObfuscatedName("ec.o")
    public final boolean field2156;

    public class154(boolean arg0) {
        this.field2156 = arg0;
    }

    @ObfuscatedName("ec.o(Lkv;Lkv;B)I")
    public int method2892(class302 arg0, class302 arg1) {
        if (arg0.field3848 == 0 || arg1.field3848 == 0) {
            return this.method4894(arg0, arg1);
        } else if (this.field2156) {
            return arg0.field3846 - arg1.field3846;
        } else {
            return arg1.field3846 - arg0.field3846;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2892((class302) arg0, (class302) arg1);
    }
}
