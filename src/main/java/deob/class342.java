package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nd")
public class class342 {

    @ObfuscatedName("nd.ac")
    public class117 field3601;

    @ObfuscatedName("nd.al")
    public class544 field3600;

    public class342(String arg0, class115 arg1) {
        try {
            this.field3601 = arg1.method2701(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3601 = null;
        }
    }

    public class342(class117 arg0) {
        this.field3601 = arg0;
    }

    @ObfuscatedName("nd.ac(I)Lud;")
    public class544 method5663() {
        if (this.field3600 == null && this.field3601 != null && this.field3601.method2731()) {
            if (this.field3601.method2727() != null) {
                this.field3600 = class31.method4487(this.field3601.method2727());
            }
            this.field3601 = null;
        }
        return this.field3600;
    }
}
