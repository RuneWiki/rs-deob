package deob;

@ObfuscatedName("em")
public class class153 extends class298 {

    @ObfuscatedName("em.t")
    public final boolean field2105;

    public class153(boolean arg0) {
        this.field2105 = arg0;
    }

    @ObfuscatedName("em.t(Lkp;Lkp;I)I")
    public int method2886(class302 arg0, class302 arg1) {
        if (client.field850 == arg0.field3845 && client.field850 == arg1.field3845) {
            return this.field2105 ? arg0.field3843 - arg1.field3843 : arg1.field3843 - arg0.field3843;
        } else {
            return this.method4883(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2886((class302) arg0, (class302) arg1);
    }
}
