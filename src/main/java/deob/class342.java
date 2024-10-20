package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ns")
public class class342 {

    @ObfuscatedName("ns.am")
    public class115 field3627;

    @ObfuscatedName("ns.ap")
    public class545 field3626;

    public class342(String arg0, class113 arg1) {
        try {
            this.field3627 = arg1.method2760(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3627 = null;
        }
    }

    public class342(class115 arg0) {
        this.field3627 = arg0;
    }

    @ObfuscatedName("ns.am(I)Luc;")
    public class545 method5758() {
        if (this.field3626 == null && this.field3627 != null && this.field3627.method2797()) {
            if (this.field3627.method2798() != null) {
                this.field3626 = class31.method3375(this.field3627.method2798());
            }
            this.field3627 = null;
        }
        return this.field3626;
    }
}
