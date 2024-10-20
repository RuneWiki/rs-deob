package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("lr")
public class class312 {

    @ObfuscatedName("lr.af")
    public class110 field3498;

    @ObfuscatedName("lr.an")
    public class503 field3500;

    public class312(String arg0, class108 arg1) {
        try {
            this.field3498 = arg1.method2679(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3498 = null;
        }
    }

    public class312(class110 arg0) {
        this.field3498 = arg0;
    }

    @ObfuscatedName("lr.af(B)Ltq;")
    public class503 method5437() {
        if (this.field3500 == null && this.field3498 != null && this.field3498.method2708()) {
            if (this.field3498.method2710() != null) {
                this.field3500 = class31.method5990(this.field3498.method2710());
            }
            this.field3498 = null;
        }
        return this.field3500;
    }
}
