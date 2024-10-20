package deob;

@ObfuscatedName("fh")
public class class158 extends class298 {

    @ObfuscatedName("fh.c")
    public final boolean field2149;

    public class158(boolean arg0) {
        this.field2149 = arg0;
    }

    @ObfuscatedName("fh.c(Lke;Lke;I)I")
    public int method2949(class302 arg0, class302 arg1) {
        if (arg0.field3841 == 0 || arg1.field3841 == 0) {
            return this.method4912(arg0, arg1);
        } else if (this.field2149) {
            return arg0.method4884().method5043(arg1.method4884());
        } else {
            return arg1.method4884().method5043(arg0.method4884());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2949((class302) arg0, (class302) arg1);
    }
}
