package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nm")
public class class345 {

    @ObfuscatedName("nm.aq")
    public class116 field3652;

    @ObfuscatedName("nm.aw")
    public class548 field3651;

    public class345(String arg0, class114 arg1) {
        try {
            this.field3652 = arg1.method2761(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3652 = null;
        }
    }

    public class345(class116 arg0) {
        this.field3652 = arg0;
    }

    @ObfuscatedName("nm.aq(I)Lvd;")
    public class548 method5805() {
        if (this.field3651 == null && this.field3652 != null && this.field3652.method2778()) {
            if (this.field3652.method2780() != null) {
                this.field3651 = class31.method3587(this.field3652.method2780());
            }
            this.field3652 = null;
        }
        return this.field3651;
    }
}
