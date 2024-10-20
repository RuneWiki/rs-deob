package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("kz")
public class class298 {

    @ObfuscatedName("kz.a")
    public class110 field3408;

    @ObfuscatedName("kz.f")
    public class477 field3407;

    public class298(String arg0, class108 arg1) {
        try {
            this.field3408 = arg1.method2565(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3408 = null;
        }
    }

    public class298(class110 arg0) {
        this.field3408 = arg0;
    }

    @ObfuscatedName("kz.a(B)Lri;")
    public class477 method5175() {
        if (this.field3407 == null && this.field3408 != null && this.field3408.method2596()) {
            if (this.field3408.method2609() != null) {
                this.field3407 = class32.method389(this.field3408.method2609());
            }
            this.field3408 = null;
        }
        return this.field3407;
    }
}
