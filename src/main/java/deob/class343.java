package deob;

@ObfuscatedName("mj")
public class class343 {

    @ObfuscatedName("mj.y")
    public String field3979;

    @ObfuscatedName("mj.h")
    public class245 field3980;

    @ObfuscatedName("mj.z")
    public int field3978 = 0;

    @ObfuscatedName("mj.e")
    public boolean field3977 = false;

    public class343(class245 arg0) {
        this.field3980 = arg0;
    }

    @ObfuscatedName("mj.n(Ljava/lang/String;I)V")
    public void method6002(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3979 != arg0) {
            this.field3979 = arg0;
            this.field3978 = 0;
            this.field3977 = false;
            this.method6003();
        }
    }

    @ObfuscatedName("mj.v(I)I")
    public int method6003() {
        if (this.field3978 < 33) {
            if (!this.field3980.method4019(class45.field324.field335, this.field3979)) {
                return this.field3978;
            }
            this.field3978 = 33;
        }
        if (this.field3978 == 33) {
            if (this.field3980.method4003(class45.field325.field335, this.field3979) && !this.field3980.method4019(class45.field325.field335, this.field3979)) {
                return this.field3978;
            }
            this.field3978 = 66;
        }
        if (this.field3978 == 66) {
            if (!this.field3980.method4019(this.field3979, class45.field327.field335)) {
                return this.field3978;
            }
            this.field3978 = 100;
            this.field3977 = true;
        }
        return this.field3978;
    }

    @ObfuscatedName("mj.d(I)Z")
    public boolean method6001() {
        return this.field3977;
    }

    @ObfuscatedName("mj.c(I)I")
    public int method6005() {
        return this.field3978;
    }
}
