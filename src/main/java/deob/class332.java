package deob;

@ObfuscatedName("lr")
public class class332 {

    @ObfuscatedName("lr.z")
    public String field3935;

    @ObfuscatedName("lr.p")
    public class234 field3939;

    @ObfuscatedName("lr.h")
    public int field3940 = 0;

    @ObfuscatedName("lr.y")
    public boolean field3934 = false;

    public class332(class234 arg0) {
        this.field3939 = arg0;
    }

    @ObfuscatedName("lr.u(Ljava/lang/String;B)V")
    public void method5840(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3935 != arg0) {
            this.field3935 = arg0;
            this.field3940 = 0;
            this.field3934 = false;
            this.method5847();
        }
    }

    @ObfuscatedName("lr.f(I)I")
    public int method5847() {
        if (this.field3940 < 33) {
            if (!this.field3939.method3888(class36.field304.field303, this.field3935)) {
                return this.field3940;
            }
            this.field3940 = 33;
        }
        if (this.field3940 == 33) {
            if (this.field3939.method3863(class36.field308.field303, this.field3935) && !this.field3939.method3888(class36.field308.field303, this.field3935)) {
                return this.field3940;
            }
            this.field3940 = 66;
        }
        if (this.field3940 == 66) {
            if (!this.field3939.method3888(this.field3935, class36.field307.field303)) {
                return this.field3940;
            }
            this.field3940 = 100;
            this.field3934 = true;
        }
        return this.field3940;
    }

    @ObfuscatedName("lr.b(I)Z")
    public boolean method5842() {
        return this.field3934;
    }

    @ObfuscatedName("lr.g(B)I")
    public int method5841() {
        return this.field3940;
    }
}
