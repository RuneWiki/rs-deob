package deob;

@ObfuscatedName("lw")
public class class334 {

    @ObfuscatedName("lw.x")
    public String field3999;

    @ObfuscatedName("lw.z")
    public class262 field4001;

    @ObfuscatedName("lw.p")
    public int field3996 = 0;

    @ObfuscatedName("lw.w")
    public boolean field4002 = false;

    public class334(class262 arg0) {
        this.field4001 = arg0;
    }

    @ObfuscatedName("lw.c(Ljava/lang/String;I)V")
    public void method5567(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3999 != arg0) {
            this.field3999 = arg0;
            this.field3996 = 0;
            this.field4002 = false;
            this.method5568();
        }
    }

    @ObfuscatedName("lw.i(I)I")
    public int method5568() {
        if (this.field3996 < 25) {
            if (!this.field4001.method4276(class42.field515.field514, this.field3999)) {
                return this.field3996;
            }
            this.field3996 = 25;
        }
        if (this.field3996 == 25) {
            if (!this.field4001.method4276(this.field3999, class42.field517.field514)) {
                return 25 + this.field4001.method4215(this.field3999) * 25 / 100;
            }
            this.field3996 = 50;
        }
        if (this.field3996 == 50) {
            if (this.field4001.method4210(class42.field518.field514, this.field3999) && !this.field4001.method4276(class42.field518.field514, this.field3999)) {
                return 50;
            }
            this.field3996 = 75;
        }
        if (this.field3996 == 75) {
            if (!this.field4001.method4276(this.field3999, class42.field519.field514)) {
                return 75;
            }
            this.field3996 = 100;
            this.field4002 = true;
        }
        return this.field3996;
    }

    @ObfuscatedName("lw.o(I)Z")
    public boolean method5572() {
        return this.field4002;
    }

    @ObfuscatedName("lw.j(I)I")
    public int method5570() {
        return this.field3996;
    }
}
