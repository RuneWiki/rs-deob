package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("ko")
public class class275 extends class278 {

    @ObfuscatedName("ko.aj")
    public SoftReference field3042;

    public class275(Object arg0, int arg1) {
        super(arg1);
        this.field3042 = new SoftReference(arg0);
    }

    @ObfuscatedName("ko.aj()Ljava/lang/Object;")
    public Object method4912() {
        return this.field3042.get();
    }

    @ObfuscatedName("ko.al()Z")
    public boolean method4914() {
        return true;
    }
}
