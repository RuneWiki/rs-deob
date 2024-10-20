package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("kk")
public class class293 {

    @ObfuscatedName("kk.c")
    public class104 field3358;

    @ObfuscatedName("kk.p")
    public class458 field3359;

    public class293(String arg0, class102 arg1) {
        try {
            this.field3358 = arg1.method2554(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3358 = null;
        }
    }

    public class293(class104 arg0) {
        this.field3358 = arg0;
    }

    @ObfuscatedName("kk.c(I)Lqi;")
    public class458 method5143() {
        if (this.field3359 == null && this.field3358 != null && this.field3358.method2596()) {
            if (this.field3358.method2589() != null) {
                this.field3359 = class29.method316(this.field3358.method2589());
            }
            this.field3358 = null;
        }
        return this.field3359;
    }
}
