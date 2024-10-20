package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ki")
public class class291 {

    @ObfuscatedName("ki.c")
    public class103 field3332;

    @ObfuscatedName("ki.v")
    public class456 field3333;

    public class291(String arg0, class101 arg1) {
        try {
            this.field3332 = arg1.method2402(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3332 = null;
        }
    }

    public class291(class103 arg0) {
        this.field3332 = arg0;
    }

    @ObfuscatedName("ki.c(B)Lqe;")
    public class456 method5032() {
        if (this.field3333 == null && this.field3332 != null && this.field3332.method2426()) {
            if (this.field3332.method2429() != null) {
                this.field3333 = class29.method3589(this.field3332.method2429());
            }
            this.field3332 = null;
        }
        return this.field3333;
    }
}
