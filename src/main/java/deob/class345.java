package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nr")
public class class345 {

    @ObfuscatedName("nr.az")
    public class116 field3670;

    @ObfuscatedName("nr.ah")
    public class549 field3671;

    public class345(String arg0, class114 arg1) {
        try {
            this.field3670 = arg1.method2677(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3670 = null;
        }
    }

    public class345(class116 arg0) {
        this.field3670 = arg0;
    }

    @ObfuscatedName("nr.az(B)Lvg;")
    public class549 method5716() {
        if (this.field3671 == null && this.field3670 != null && this.field3670.method2712()) {
            if (this.field3670.method2714() != null) {
                this.field3671 = class31.method6516(this.field3670.method2714());
            }
            this.field3670 = null;
        }
        return this.field3671;
    }
}
