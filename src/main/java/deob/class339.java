package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nd")
public class class339 {

    @ObfuscatedName("nd.at")
    public class115 field3587;

    @ObfuscatedName("nd.ah")
    public class541 field3585;

    public class339(String arg0, class113 arg1) {
        try {
            this.field3587 = arg1.method2741(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3587 = null;
        }
    }

    public class339(class115 arg0) {
        this.field3587 = arg0;
    }

    @ObfuscatedName("nd.at(I)Luz;")
    public class541 method5658() {
        if (this.field3585 == null && this.field3587 != null && this.field3587.method2770()) {
            if (this.field3587.method2774() != null) {
                this.field3585 = class31.method7894(this.field3587.method2774());
            }
            this.field3587 = null;
        }
        return this.field3585;
    }
}
