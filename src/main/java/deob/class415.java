package deob;

@ObfuscatedName("ou")
public class class415 {

    @ObfuscatedName("ou.c")
    public String field4517;

    @ObfuscatedName("ou.q")
    public class316 field4512;

    @ObfuscatedName("ou.i")
    public int field4515 = 0;

    @ObfuscatedName("ou.k")
    public boolean field4516 = false;

    public class415(class316 arg0) {
        this.field4512 = arg0;
    }

    @ObfuscatedName("ou.s(Ljava/lang/String;I)V")
    public void method6437(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4517 != arg0) {
            this.field4517 = arg0;
            this.field4515 = 0;
            this.field4516 = false;
            this.method6438();
        }
    }

    @ObfuscatedName("ou.h(I)I")
    public int method6438() {
        if (this.field4515 < 33) {
            if (!this.field4512.method5199(class244.field2870.field2874, this.field4517)) {
                return this.field4515;
            }
            this.field4515 = 33;
        }
        if (this.field4515 == 33) {
            if (this.field4512.method5232(class244.field2875.field2874, this.field4517) && !this.field4512.method5199(class244.field2875.field2874, this.field4517)) {
                return this.field4515;
            }
            this.field4515 = 66;
        }
        if (this.field4515 == 66) {
            if (!this.field4512.method5199(this.field4517, class244.field2869.field2874)) {
                return this.field4515;
            }
            this.field4515 = 100;
            this.field4516 = true;
        }
        return this.field4515;
    }

    @ObfuscatedName("ou.w(I)Z")
    public boolean method6446() {
        return this.field4516;
    }

    @ObfuscatedName("ou.v(I)I")
    public int method6440() {
        return this.field4515;
    }
}
