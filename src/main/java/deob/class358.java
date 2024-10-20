package deob;

@ObfuscatedName("mp")
public class class358 {

    @ObfuscatedName("mp.l")
    public String field4018;

    @ObfuscatedName("mp.n")
    public class277 field4016;

    @ObfuscatedName("mp.w")
    public int field4017 = 0;

    @ObfuscatedName("mp.f")
    public boolean field4020 = false;

    public class358(class277 arg0) {
        this.field4016 = arg0;
    }

    @ObfuscatedName("mp.s(Ljava/lang/String;I)V")
    public void method5478(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4018 != arg0) {
            this.field4018 = arg0;
            this.field4017 = 0;
            this.field4020 = false;
            this.method5479();
        }
    }

    @ObfuscatedName("mp.t(I)I")
    public int method5479() {
        if (this.field4017 < 33) {
            if (!this.field4016.method4510(class187.field2116.field2114, this.field4018)) {
                return this.field4017;
            }
            this.field4017 = 33;
        }
        if (this.field4017 == 33) {
            if (this.field4016.method4477(class187.field2115.field2114, this.field4018) && !this.field4016.method4510(class187.field2115.field2114, this.field4018)) {
                return this.field4017;
            }
            this.field4017 = 66;
        }
        if (this.field4017 == 66) {
            if (!this.field4016.method4510(this.field4018, class187.field2117.field2114)) {
                return this.field4017;
            }
            this.field4017 = 100;
            this.field4020 = true;
        }
        return this.field4017;
    }

    @ObfuscatedName("mp.v(I)Z")
    public boolean method5480() {
        return this.field4020;
    }

    @ObfuscatedName("mp.j(I)I")
    public int method5484() {
        return this.field4017;
    }
}
