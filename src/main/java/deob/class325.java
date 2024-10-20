package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ml")
public class class325 {

    @ObfuscatedName("ml.at")
    public class114 field3527;

    @ObfuscatedName("ml.an")
    public class515 field3528;

    public class325(String arg0, class112 arg1) {
        try {
            this.field3527 = arg1.method2663(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3527 = null;
        }
    }

    public class325(class114 arg0) {
        this.field3527 = arg0;
    }

    @ObfuscatedName("ml.at(I)Ltm;")
    public class515 method5428() {
        if (this.field3528 == null && this.field3527 != null && this.field3527.method2687()) {
            if (this.field3527.method2688() != null) {
                this.field3528 = Statics.method1943(this.field3527.method2688());
            }
            this.field3527 = null;
        }
        return this.field3528;
    }
}
