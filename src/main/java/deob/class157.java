package deob;

@ObfuscatedName("fc")
public class class157 extends class298 {

    @ObfuscatedName("fc.o")
    public final boolean field2166;

    public class157(boolean arg0) {
        this.field2166 = arg0;
    }

    @ObfuscatedName("fc.o(Lkv;Lkv;S)I")
    public int method2918(class302 arg0, class302 arg1) {
        if (arg0.field3847 == arg1.field3847) {
            return this.method4894(arg0, arg1);
        } else if (this.field2166) {
            return arg0.field3847 - arg1.field3847;
        } else {
            return arg1.field3847 - arg0.field3847;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2918((class302) arg0, (class302) arg1);
    }
}
