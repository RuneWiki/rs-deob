package deob;

@ObfuscatedName("et")
public class class156 extends class298 {

    @ObfuscatedName("et.c")
    public final boolean field2139;

    public class156(boolean arg0) {
        this.field2139 = arg0;
    }

    @ObfuscatedName("et.c(Lke;Lke;B)I")
    public int method2935(class302 arg0, class302 arg1) {
        if (arg0.field3841 == arg1.field3841) {
            return this.method4912(arg0, arg1);
        } else if (this.field2139) {
            return arg0.field3841 - arg1.field3841;
        } else {
            return arg1.field3841 - arg0.field3841;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2935((class302) arg0, (class302) arg1);
    }
}
