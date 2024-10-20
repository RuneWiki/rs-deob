package deob;

@ObfuscatedName("eh")
public class class155 extends class298 {

    @ObfuscatedName("eh.t")
    public final boolean field2114;

    public class155(boolean arg0) {
        this.field2114 = arg0;
    }

    @ObfuscatedName("eh.t(Lkp;Lkp;I)I")
    public int method2906(class302 arg0, class302 arg1) {
        if (arg0.field3845 == 0) {
            if (arg1.field3845 != 0) {
                return this.field2114 ? 1 : -1;
            }
        } else if (arg1.field3845 == 0) {
            return this.field2114 ? -1 : 1;
        }
        return this.method4883(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2906((class302) arg0, (class302) arg1);
    }
}
