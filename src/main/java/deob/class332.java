package deob;

@ObfuscatedName("lf")
public class class332 {

    @ObfuscatedName("lf.b")
    public String field3937;

    @ObfuscatedName("lf.a")
    public class254 field3938;

    @ObfuscatedName("lf.c")
    public int field3935 = 0;

    @ObfuscatedName("lf.z")
    public boolean field3939 = false;

    public class332(class254 arg0) {
        this.field3938 = arg0;
    }

    @ObfuscatedName("lf.n(Ljava/lang/String;I)V")
    public void method5832(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3937 != arg0) {
            this.field3937 = arg0;
            this.field3935 = 0;
            this.field3939 = false;
            this.method5830();
        }
    }

    @ObfuscatedName("lf.h(B)I")
    public int method5830() {
        if (this.field3935 < 33) {
            if (!this.field3938.method4528(class36.field300.field297, this.field3937)) {
                return this.field3935;
            }
            this.field3935 = 33;
        }
        if (this.field3935 == 33) {
            if (this.field3938.method4517(class36.field295.field297, this.field3937) && !this.field3938.method4528(class36.field295.field297, this.field3937)) {
                return this.field3935;
            }
            this.field3935 = 66;
        }
        if (this.field3935 == 66) {
            if (!this.field3938.method4528(this.field3937, class36.field296.field297)) {
                return this.field3935;
            }
            this.field3935 = 100;
            this.field3939 = true;
        }
        return this.field3935;
    }

    @ObfuscatedName("lf.l(I)Z")
    public boolean method5835() {
        return this.field3939;
    }

    @ObfuscatedName("lf.g(I)I")
    public int method5837() {
        return this.field3935;
    }
}
