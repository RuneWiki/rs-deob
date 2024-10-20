package deob;

@ObfuscatedName("oy")
public class class415 {

    @ObfuscatedName("oy.a")
    public String field4511;

    @ObfuscatedName("oy.m")
    public class316 field4509;

    @ObfuscatedName("oy.p")
    public int field4513 = 0;

    @ObfuscatedName("oy.s")
    public boolean field4514 = false;

    public class415(class316 arg0) {
        this.field4509 = arg0;
    }

    @ObfuscatedName("oy.o(Ljava/lang/String;I)V")
    public void method6424(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4511 != arg0) {
            this.field4511 = arg0;
            this.field4513 = 0;
            this.field4514 = false;
            this.method6422();
        }
    }

    @ObfuscatedName("oy.q(I)I")
    public int method6422() {
        if (this.field4513 < 33) {
            if (!this.field4509.method5203(class245.field2908.field2916, this.field4511)) {
                return this.field4513;
            }
            this.field4513 = 33;
        }
        if (this.field4513 == 33) {
            if (this.field4509.method5211(class245.field2909.field2916, this.field4511) && !this.field4509.method5203(class245.field2909.field2916, this.field4511)) {
                return this.field4513;
            }
            this.field4513 = 66;
        }
        if (this.field4513 == 66) {
            if (!this.field4509.method5203(this.field4511, class245.field2912.field2916)) {
                return this.field4513;
            }
            this.field4513 = 100;
            this.field4514 = true;
        }
        return this.field4513;
    }

    @ObfuscatedName("oy.l(I)Z")
    public boolean method6430() {
        return this.field4514;
    }

    @ObfuscatedName("oy.k(B)I")
    public int method6425() {
        return this.field4513;
    }
}
