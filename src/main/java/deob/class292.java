package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("kk")
public class class292 {

    @ObfuscatedName("kk.o")
    public class103 field3357;

    @ObfuscatedName("kk.q")
    public class453 field3358;

    public class292(String arg0, class101 arg1) {
        try {
            this.field3357 = arg1.method2399(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3357 = null;
        }
    }

    public class292(class103 arg0) {
        this.field3357 = arg0;
    }

    @ObfuscatedName("kk.o(I)Lqr;")
    public class453 method4932() {
        if (this.field3358 == null && this.field3357 != null && this.field3357.method2415()) {
            if (this.field3357.method2414() != null) {
                this.field3358 = class29.method3909(this.field3357.method2414());
            }
            this.field3357 = null;
        }
        return this.field3358;
    }
}
