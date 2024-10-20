package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nd")
public class class358 {

    @ObfuscatedName("nd.ac")
    public class121 field3780;

    @ObfuscatedName("nd.ae")
    public class565 field3781;

    public class358(String arg0, class119 arg1) {
        try {
            this.field3780 = arg1.method2971(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3780 = null;
        }
    }

    public class358(class121 arg0) {
        this.field3780 = arg0;
    }

    @ObfuscatedName("nd.ac(I)Lvv;")
    public class565 method6161() {
        if (this.field3781 == null && this.field3780 != null && this.field3780.method2996()) {
            if (this.field3780.method2997() != null) {
                this.field3781 = class31.method2805(this.field3780.method2997());
            }
            this.field3780 = null;
        }
        return this.field3781;
    }
}
