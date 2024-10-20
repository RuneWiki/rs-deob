package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("mc")
public class class328 {

    @ObfuscatedName("mc.aw")
    public class115 field3551;

    @ObfuscatedName("mc.ay")
    public class528 field3549;

    public class328(String arg0, class113 arg1) {
        try {
            this.field3551 = arg1.method2686(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3551 = null;
        }
    }

    public class328(class115 arg0) {
        this.field3551 = arg0;
    }

    @ObfuscatedName("mc.aw(I)Lud;")
    public class528 method5509() {
        if (this.field3549 == null && this.field3551 != null && this.field3551.method2711()) {
            if (this.field3551.method2710() != null) {
                this.field3549 = class31.method2969(this.field3551.method2710());
            }
            this.field3551 = null;
        }
        return this.field3549;
    }
}
