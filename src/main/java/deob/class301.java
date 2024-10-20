package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ku")
public class class301 {

    @ObfuscatedName("ku.h")
    public class111 field3462;

    @ObfuscatedName("ku.e")
    public class481 field3461;

    public class301(String arg0, class109 arg1) {
        try {
            this.field3462 = arg1.method2608(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3462 = null;
        }
    }

    public class301(class111 arg0) {
        this.field3462 = arg0;
    }

    @ObfuscatedName("ku.h(I)Lrx;")
    public class481 method5254() {
        if (this.field3461 == null && this.field3462 != null && this.field3462.method2647()) {
            if (this.field3462.method2644() != null) {
                this.field3461 = class32.method6061(this.field3462.method2644());
            }
            this.field3462 = null;
        }
        return this.field3461;
    }
}
