package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ls")
public class class308 {

    @ObfuscatedName("ls.aj")
    public class112 field3449;

    @ObfuscatedName("ls.al")
    public class492 field3447;

    public class308(String arg0, class110 arg1) {
        try {
            this.field3449 = arg1.method2663(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3449 = null;
        }
    }

    public class308(class112 arg0) {
        this.field3449 = arg0;
    }

    @ObfuscatedName("ls.aj(I)Lsn;")
    public class492 method5227() {
        if (this.field3447 == null && this.field3449 != null && this.field3449.method2693()) {
            if (this.field3449.method2689() != null) {
                this.field3447 = class31.method2942(this.field3449.method2689());
            }
            this.field3449 = null;
        }
        return this.field3447;
    }
}
