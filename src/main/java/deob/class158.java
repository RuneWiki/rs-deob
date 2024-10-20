package deob;

@ObfuscatedName("fu")
public class class158 extends class298 {

    @ObfuscatedName("fu.o")
    public final boolean field2169;

    public class158(boolean arg0) {
        this.field2169 = arg0;
    }

    @ObfuscatedName("fu.o(Lkv;Lkv;I)I")
    public int method2928(class302 arg0, class302 arg1) {
        if (arg0.field3848 == 0 || arg1.field3848 == 0) {
            return this.method4894(arg0, arg1);
        } else if (this.field2169) {
            return arg0.method4883().method5020(arg1.method4883());
        } else {
            return arg1.method4883().method5020(arg0.method4883());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2928((class302) arg0, (class302) arg1);
    }
}
