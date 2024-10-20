package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nd")
public class class357 {

    @ObfuscatedName("nd.ap")
    public class121 field3808;

    @ObfuscatedName("nd.aw")
    public class572 field3805;

    public class357(String arg0, class119 arg1) {
        try {
            this.field3808 = arg1.method3078(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3808 = null;
        }
    }

    public class357(class121 arg0) {
        this.field3808 = arg0;
    }

    @ObfuscatedName("nd.ap(I)Lvv;")
    public class572 method6323() {
        if (this.field3805 == null && this.field3808 != null && this.field3808.method3110()) {
            if (this.field3808.method3111() != null) {
                this.field3805 = class31.method8331(this.field3808.method3111());
            }
            this.field3808 = null;
        }
        return this.field3805;
    }
}
