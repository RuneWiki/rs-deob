package deob;

@ObfuscatedName("fg")
public class class157 extends class298 {

    @ObfuscatedName("fg.t")
    public final boolean field2120;

    public class157(boolean arg0) {
        this.field2120 = arg0;
    }

    @ObfuscatedName("fg.t(Lkp;Lkp;I)I")
    public int method2922(class302 arg0, class302 arg1) {
        if (arg0.field3844 == arg1.field3844) {
            return this.method4883(arg0, arg1);
        } else if (this.field2120) {
            return arg0.field3844 - arg1.field3844;
        } else {
            return arg1.field3844 - arg0.field3844;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2922((class302) arg0, (class302) arg1);
    }
}
