package deob;

@ObfuscatedName("ey")
public class class153 extends class298 {

    @ObfuscatedName("ey.c")
    public final boolean field2131;

    public class153(boolean arg0) {
        this.field2131 = arg0;
    }

    @ObfuscatedName("ey.c(Lke;Lke;B)I")
    public int method2912(class302 arg0, class302 arg1) {
        if (client.field858 == arg0.field3841 && client.field858 == arg1.field3841) {
            return this.field2131 ? arg0.field3840 - arg1.field3840 : arg1.field3840 - arg0.field3840;
        } else {
            return this.method4912(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2912((class302) arg0, (class302) arg1);
    }
}
