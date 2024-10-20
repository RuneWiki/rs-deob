package deob;

@ObfuscatedName("md")
public class class342 {

    @ObfuscatedName("md.i")
    public String field3977;

    @ObfuscatedName("md.o")
    public class244 field3978;

    @ObfuscatedName("md.x")
    public int field3975 = 0;

    @ObfuscatedName("md.w")
    public boolean field3980 = false;

    public class342(class244 arg0) {
        this.field3978 = arg0;
    }

    @ObfuscatedName("md.z(Ljava/lang/String;I)V")
    public void method5929(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3977 != arg0) {
            this.field3977 = arg0;
            this.field3975 = 0;
            this.field3980 = false;
            this.method5930();
        }
    }

    @ObfuscatedName("md.k(I)I")
    public int method5930() {
        if (this.field3975 < 33) {
            if (!this.field3978.method3895(class45.field319.field325, this.field3977)) {
                return this.field3975;
            }
            this.field3975 = 33;
        }
        if (this.field3975 == 33) {
            if (this.field3978.method3892(class45.field328.field325, this.field3977) && !this.field3978.method3895(class45.field328.field325, this.field3977)) {
                return this.field3975;
            }
            this.field3975 = 66;
        }
        if (this.field3975 == 66) {
            if (!this.field3978.method3895(this.field3977, class45.field322.field325)) {
                return this.field3975;
            }
            this.field3975 = 100;
            this.field3980 = true;
        }
        return this.field3975;
    }

    @ObfuscatedName("md.s(I)Z")
    public boolean method5931() {
        return this.field3980;
    }

    @ObfuscatedName("md.t(B)I")
    public int method5932() {
        return this.field3975;
    }
}
