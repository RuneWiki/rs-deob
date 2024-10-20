package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nf")
public class class354 {

    @ObfuscatedName("nf.aq")
    public class119 field3762;

    @ObfuscatedName("nf.ad")
    public class561 field3760;

    public class354(String arg0, class117 arg1) {
        try {
            this.field3762 = arg1.method2797(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3762 = null;
        }
    }

    public class354(class119 arg0) {
        this.field3762 = arg0;
    }

    @ObfuscatedName("nf.aq(I)Lvg;")
    public class561 method5906() {
        if (this.field3760 == null && this.field3762 != null && this.field3762.method2822()) {
            if (this.field3762.method2823() != null) {
                this.field3760 = class31.method3511(this.field3762.method2823());
            }
            this.field3762 = null;
        }
        return this.field3760;
    }
}
