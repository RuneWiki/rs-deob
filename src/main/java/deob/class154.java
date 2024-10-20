package deob;

@ObfuscatedName("eh")
public class class154 extends class298 {

    @ObfuscatedName("eh.c")
    public final boolean field2132;

    public class154(boolean arg0) {
        this.field2132 = arg0;
    }

    @ObfuscatedName("eh.c(Lke;Lke;I)I")
    public int method2921(class302 arg0, class302 arg1) {
        if (arg0.field3841 == 0 || arg1.field3841 == 0) {
            return this.method4912(arg0, arg1);
        } else if (this.field2132) {
            return arg0.field3840 - arg1.field3840;
        } else {
            return arg1.field3840 - arg0.field3840;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2921((class302) arg0, (class302) arg1);
    }
}
