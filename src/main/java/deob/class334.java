package deob;

@ObfuscatedName("lg")
public class class334 {

    @ObfuscatedName("lg.b")
    public String field4004;

    @ObfuscatedName("lg.e")
    public class262 field4006;

    @ObfuscatedName("lg.x")
    public int field4005 = 0;

    @ObfuscatedName("lg.p")
    public boolean field4007 = false;

    public class334(class262 arg0) {
        this.field4006 = arg0;
    }

    @ObfuscatedName("lg.t(Ljava/lang/String;I)V")
    public void method5530(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4004 != arg0) {
            this.field4004 = arg0;
            this.field4005 = 0;
            this.field4007 = false;
            this.method5537();
        }
    }

    @ObfuscatedName("lg.q(B)I")
    public int method5537() {
        if (this.field4005 < 25) {
            if (!this.field4006.method4214(class42.field523.field527, this.field4004)) {
                return this.field4005;
            }
            this.field4005 = 25;
        }
        if (this.field4005 == 25) {
            if (!this.field4006.method4214(this.field4004, class42.field525.field527)) {
                return 25 + this.field4006.method4271(this.field4004) * 25 / 100;
            }
            this.field4005 = 50;
        }
        if (this.field4005 == 50) {
            if (this.field4006.method4212(class42.field528.field527, this.field4004) && !this.field4006.method4214(class42.field528.field527, this.field4004)) {
                return 50;
            }
            this.field4005 = 75;
        }
        if (this.field4005 == 75) {
            if (!this.field4006.method4214(this.field4004, class42.field522.field527)) {
                return 75;
            }
            this.field4005 = 100;
            this.field4007 = true;
        }
        return this.field4005;
    }

    @ObfuscatedName("lg.i(I)Z")
    public boolean method5529() {
        return this.field4007;
    }

    @ObfuscatedName("lg.a(B)I")
    public int method5533() {
        return this.field4005;
    }
}
