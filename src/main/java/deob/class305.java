package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("kn")
public class class305 {

    @ObfuscatedName("kn.f")
    public class110 field3476;

    @ObfuscatedName("kn.w")
    public class488 field3475;

    public class305(String arg0, class108 arg1) {
        try {
            this.field3476 = arg1.method2721(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3476 = null;
        }
    }

    public class305(class110 arg0) {
        this.field3476 = arg0;
    }

    @ObfuscatedName("kn.f(I)Lrs;")
    public class488 method5346() {
        if (this.field3475 == null && this.field3476 != null && this.field3476.method2747()) {
            if (this.field3476.method2758() != null) {
                this.field3475 = class31.method4990(this.field3476.method2758());
            }
            this.field3476 = null;
        }
        return this.field3475;
    }
}
