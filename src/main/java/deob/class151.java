package deob;

@ObfuscatedName("eo")
public class class151 extends class298 {

    @ObfuscatedName("eo.c")
    public final boolean field2126;

    public class151(boolean arg0) {
        this.field2126 = arg0;
    }

    @ObfuscatedName("eo.c(Lke;Lke;B)I")
    public int method2898(class302 arg0, class302 arg1) {
        if (client.field858 == arg0.field3841 && client.field858 == arg1.field3841) {
            return this.field2126 ? arg0.method4884().method5043(arg1.method4884()) : arg1.method4884().method5043(arg0.method4884());
        } else {
            return this.method4912(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2898((class302) arg0, (class302) arg1);
    }
}
