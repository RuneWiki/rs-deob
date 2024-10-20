package deob;

@ObfuscatedName("lx")
public class class334 {

    @ObfuscatedName("lx.l")
    public String field4006;

    @ObfuscatedName("lx.s")
    public class262 field4007;

    @ObfuscatedName("lx.y")
    public int field4008 = 0;

    @ObfuscatedName("lx.c")
    public boolean field4009 = false;

    public class334(class262 arg0) {
        this.field4007 = arg0;
    }

    @ObfuscatedName("lx.g(Ljava/lang/String;B)V")
    public void method5605(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4006 != arg0) {
            this.field4006 = arg0;
            this.field4008 = 0;
            this.field4009 = false;
            this.method5601();
        }
    }

    @ObfuscatedName("lx.e(I)I")
    public int method5601() {
        if (this.field4008 < 25) {
            if (!this.field4007.method4337(class42.field537.field540, this.field4006)) {
                return this.field4008;
            }
            this.field4008 = 25;
        }
        if (this.field4008 == 25) {
            if (!this.field4007.method4337(this.field4006, class42.field544.field540)) {
                return 25 + this.field4007.method4277(this.field4006) * 25 / 100;
            }
            this.field4008 = 50;
        }
        if (this.field4008 == 50) {
            if (this.field4007.method4287(class42.field538.field540, this.field4006) && !this.field4007.method4337(class42.field538.field540, this.field4006)) {
                return 50;
            }
            this.field4008 = 75;
        }
        if (this.field4008 == 75) {
            if (!this.field4007.method4337(this.field4006, class42.field539.field540)) {
                return 75;
            }
            this.field4008 = 100;
            this.field4009 = true;
        }
        return this.field4008;
    }

    @ObfuscatedName("lx.b(I)Z")
    public boolean method5598() {
        return this.field4009;
    }

    @ObfuscatedName("lx.z(I)I")
    public int method5596() {
        return this.field4008;
    }
}
