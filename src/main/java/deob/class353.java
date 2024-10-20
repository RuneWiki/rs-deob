package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("ny")
public class class353 {

    @ObfuscatedName("ny.ak")
    public class118 field3745;

    @ObfuscatedName("ny.al")
    public class560 field3746;

    public class353(String arg0, class116 arg1) {
        try {
            this.field3745 = arg1.method2771(new URL(arg0));
        } catch (MalformedURLException var4) {
            this.field3745 = null;
        }
    }

    public class353(class118 arg0) {
        this.field3745 = arg0;
    }

    @ObfuscatedName("ny.ak(B)Lvc;")
    public class560 method5928() {
        if (this.field3746 == null && this.field3745 != null && this.field3745.method2797()) {
            if (this.field3745.method2798() != null) {
                this.field3746 = class31.method7694(this.field3745.method2798());
            }
            this.field3745 = null;
        }
        return this.field3746;
    }
}
