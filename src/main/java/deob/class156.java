package deob;

@ObfuscatedName("ex")
public class class156 extends class298 {

    @ObfuscatedName("ex.t")
    public final boolean field2117;

    public class156(boolean arg0) {
        this.field2117 = arg0;
    }

    @ObfuscatedName("ex.t(Lkp;Lkp;B)I")
    public int method2921(class302 arg0, class302 arg1) {
        if (arg0.field3845 == arg1.field3845) {
            return this.method4883(arg0, arg1);
        } else if (this.field2117) {
            return arg0.field3845 - arg1.field3845;
        } else {
            return arg1.field3845 - arg0.field3845;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2921((class302) arg0, (class302) arg1);
    }
}
