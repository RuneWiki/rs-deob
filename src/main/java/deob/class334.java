package deob;

@ObfuscatedName("lw")
public class class334 {

    @ObfuscatedName("lw.m")
    public String field4001;

    @ObfuscatedName("lw.z")
    public class262 field4004;

    @ObfuscatedName("lw.i")
    public int field4005 = 0;

    @ObfuscatedName("lw.u")
    public boolean field4006 = false;

    public class334(class262 arg0) {
        this.field4004 = arg0;
    }

    @ObfuscatedName("lw.o(Ljava/lang/String;I)V")
    public void method5556(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4001 != arg0) {
            this.field4001 = arg0;
            this.field4005 = 0;
            this.field4006 = false;
            this.method5557();
        }
    }

    @ObfuscatedName("lw.k(B)I")
    public int method5557() {
        if (this.field4005 < 25) {
            if (!this.field4004.method4179(class42.field538.field539, this.field4001)) {
                return this.field4005;
            }
            this.field4005 = 25;
        }
        if (this.field4005 == 25) {
            if (!this.field4004.method4179(this.field4001, class42.field534.field539)) {
                return 25 + this.field4004.method4182(this.field4001) * 25 / 100;
            }
            this.field4005 = 50;
        }
        if (this.field4005 == 50) {
            if (this.field4004.method4228(class42.field542.field539, this.field4001) && !this.field4004.method4179(class42.field542.field539, this.field4001)) {
                return 50;
            }
            this.field4005 = 75;
        }
        if (this.field4005 == 75) {
            if (!this.field4004.method4179(this.field4001, class42.field540.field539)) {
                return 75;
            }
            this.field4005 = 100;
            this.field4006 = true;
        }
        return this.field4005;
    }

    @ObfuscatedName("lw.t(I)Z")
    public boolean method5558() {
        return this.field4006;
    }

    @ObfuscatedName("lw.d(B)I")
    public int method5559() {
        return this.field4005;
    }
}
