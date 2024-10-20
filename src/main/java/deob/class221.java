package deob;

import java.lang.ref.SoftReference;

@ObfuscatedName("hn")
public class class221 extends class224 {

    @ObfuscatedName("hn.f")
    public SoftReference field2567;

    public class221(Object arg0, int arg1) {
        super(arg1);
        this.field2567 = new SoftReference(arg0);
    }

    @ObfuscatedName("hn.f()Ljava/lang/Object;")
    public Object method3982() {
        return this.field2567.get();
    }

    @ObfuscatedName("hn.e()Z")
    public boolean method3983() {
        return true;
    }
}
