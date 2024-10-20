package deob;

@ObfuscatedName("nv")
public class class373 {

    @ObfuscatedName("nv.o")
    public String field4101;

    @ObfuscatedName("nv.g")
    public class290 field4098;

    @ObfuscatedName("nv.z")
    public int field4103 = 0;

    @ObfuscatedName("nv.a")
    public boolean field4105 = false;

    public class373(class290 arg0) {
        this.field4098 = arg0;
    }

    @ObfuscatedName("nv.n(Ljava/lang/String;I)V")
    public void method5770(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4101 != arg0) {
            this.field4101 = arg0;
            this.field4103 = 0;
            this.field4105 = false;
            this.method5771();
        }
    }

    @ObfuscatedName("nv.c(I)I")
    public int method5771() {
        if (this.field4103 < 33) {
            if (!this.field4098.method4732(class200.field2204.field2205, this.field4101)) {
                return this.field4103;
            }
            this.field4103 = 33;
        }
        if (this.field4103 == 33) {
            if (this.field4098.method4727(class200.field2202.field2205, this.field4101) && !this.field4098.method4732(class200.field2202.field2205, this.field4101)) {
                return this.field4103;
            }
            this.field4103 = 66;
        }
        if (this.field4103 == 66) {
            if (!this.field4098.method4732(this.field4101, class200.field2201.field2205)) {
                return this.field4103;
            }
            this.field4103 = 100;
            this.field4105 = true;
        }
        return this.field4103;
    }

    @ObfuscatedName("nv.m(I)Z")
    public boolean method5776() {
        return this.field4105;
    }

    @ObfuscatedName("nv.k(I)I")
    public int method5783() {
        return this.field4103;
    }
}
