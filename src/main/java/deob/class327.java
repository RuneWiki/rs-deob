package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("mw")
public class class327 {

    @ObfuscatedName("mw.au")
    public class115 field3558;

    @ObfuscatedName("mw.ae")
    public class529 field3557;

    public class327(String arg0, class113 arg1) {
        try {
            this.field3558 = arg1.method2691(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3558 = null;
        }
    }

    public class327(class115 arg0) {
        this.field3558 = arg0;
    }

    @ObfuscatedName("mw.au(I)Lui;")
    public class529 method5513() {
        if (this.field3557 == null && this.field3558 != null && this.field3558.method2722()) {
            if (this.field3558.method2728() != null) {
                this.field3557 = class31.method4968(this.field3558.method2728());
            }
            this.field3558 = null;
        }
        return this.field3557;
    }
}
