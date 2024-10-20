package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nb")
public class class356 {

    @ObfuscatedName("nb.ab")
    public class119 field3730;

    @ObfuscatedName("nb.ay")
    public class563 field3729;

    public class356(String arg0, class117 arg1) {
        try {
            this.field3730 = arg1.method2856(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3730 = null;
        }
    }

    public class356(class119 arg0) {
        this.field3730 = arg0;
    }

    @ObfuscatedName("nb.ab(I)Lvc;")
    public class563 method5990() {
        if (this.field3729 == null && this.field3730 != null && this.field3730.method2885()) {
            if (this.field3730.method2886() != null) {
                this.field3729 = class31.method4354(this.field3730.method2886());
            }
            this.field3730 = null;
        }
        return this.field3729;
    }
}
