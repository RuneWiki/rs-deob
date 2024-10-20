package deob;

@ObfuscatedName("eu")
public class class153 extends class290 {

    @ObfuscatedName("eu.a")
    public final boolean field1979;

    public class153(boolean arg0) {
        this.field1979 = arg0;
    }

    @ObfuscatedName("eu.a(Lkl;Lkl;I)I")
    public int method3166(class294 arg0, class294 arg1) {
        if (arg0.field3713 == 0 || arg1.field3713 == 0) {
            return this.method5117(arg0, arg1);
        } else if (this.field1979) {
            return arg0.method5090().method5239(arg1.method5090());
        } else {
            return arg1.method5090().method5239(arg0.method5090());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3166((class294) arg0, (class294) arg1);
    }
}
