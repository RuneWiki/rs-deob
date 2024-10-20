package deob;

@ObfuscatedName("fg")
public class class157 extends class298 {

    @ObfuscatedName("fg.c")
    public final boolean field2141;

    public class157(boolean arg0) {
        this.field2141 = arg0;
    }

    @ObfuscatedName("fg.c(Lke;Lke;I)I")
    public int method2943(class302 arg0, class302 arg1) {
        if (arg0.field3839 == arg1.field3839) {
            return this.method4912(arg0, arg1);
        } else if (this.field2141) {
            return arg0.field3839 - arg1.field3839;
        } else {
            return arg1.field3839 - arg0.field3839;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2943((class302) arg0, (class302) arg1);
    }
}
