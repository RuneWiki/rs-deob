package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("kf")
public class class292 {

    @ObfuscatedName("kf.v")
    public class103 field3296;

    @ObfuscatedName("kf.c")
    public class451 field3294;

    public class292(String arg0, class101 arg1) {
        try {
            this.field3296 = arg1.method2402(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3296 = null;
        }
    }

    public class292(class103 arg0) {
        this.field3296 = arg0;
    }

    @ObfuscatedName("kf.v(I)Lqi;")
    public class451 method5013() {
        if (this.field3294 == null && this.field3296 != null && this.field3296.method2444()) {
            if (this.field3296.method2431() != null) {
                this.field3294 = class29.method1805(this.field3296.method2431());
            }
            this.field3296 = null;
        }
        return this.field3294;
    }
}
