package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("kh")
public class class292 {

    @ObfuscatedName("kh.s")
    public class103 field3323;

    @ObfuscatedName("kh.h")
    public class457 field3324;

    public class292(String arg0, class101 arg1) {
        try {
            this.field3323 = arg1.method2369(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3323 = null;
        }
    }

    public class292(class103 arg0) {
        this.field3323 = arg0;
    }

    @ObfuscatedName("kh.s(I)Lqn;")
    public class457 method4931() {
        if (this.field3324 == null && this.field3323 != null && this.field3323.method2384()) {
            if (this.field3323.method2394() != null) {
                this.field3324 = class29.method2872(this.field3323.method2394());
            }
            this.field3323 = null;
        }
        return this.field3324;
    }
}
