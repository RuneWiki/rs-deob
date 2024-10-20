package deob;

@ObfuscatedName("oo")
public class class413 {

    @ObfuscatedName("oo.b")
    public String field4454;

    @ObfuscatedName("oo.n")
    public class316 field4450;

    @ObfuscatedName("oo.s")
    public int field4453 = 0;

    @ObfuscatedName("oo.l")
    public boolean field4452 = false;

    public class413(class316 arg0) {
        this.field4450 = arg0;
    }

    @ObfuscatedName("oo.v(Ljava/lang/String;I)V")
    public void method6527(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4454 != arg0) {
            this.field4454 = arg0;
            this.field4453 = 0;
            this.field4452 = false;
            this.method6531();
        }
    }

    @ObfuscatedName("oo.c(I)I")
    public int method6531() {
        if (this.field4453 < 33) {
            if (!this.field4450.method5346(class220.field2415.field2416, this.field4454)) {
                return this.field4453;
            }
            this.field4453 = 33;
        }
        if (this.field4453 == 33) {
            if (this.field4450.method5313(class220.field2419.field2416, this.field4454) && !this.field4450.method5346(class220.field2419.field2416, this.field4454)) {
                return this.field4453;
            }
            this.field4453 = 66;
        }
        if (this.field4453 == 66) {
            if (!this.field4450.method5346(this.field4454, class220.field2418.field2416)) {
                return this.field4453;
            }
            this.field4453 = 100;
            this.field4452 = true;
        }
        return this.field4453;
    }

    @ObfuscatedName("oo.i(S)Z")
    public boolean method6529() {
        return this.field4452;
    }

    @ObfuscatedName("oo.f(I)I")
    public int method6528() {
        return this.field4453;
    }
}
