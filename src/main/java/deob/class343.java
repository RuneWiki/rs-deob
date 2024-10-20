package deob;

@ObfuscatedName("ma")
public class class343 {

    @ObfuscatedName("ma.z")
    public String field3985;

    @ObfuscatedName("ma.q")
    public class245 field3984;

    @ObfuscatedName("ma.k")
    public int field3982 = 0;

    @ObfuscatedName("ma.c")
    public boolean field3988 = false;

    public class343(class245 arg0) {
        this.field3984 = arg0;
    }

    @ObfuscatedName("ma.f(Ljava/lang/String;B)V")
    public void method5919(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3985 != arg0) {
            this.field3985 = arg0;
            this.field3982 = 0;
            this.field3988 = false;
            this.method5921();
        }
    }

    @ObfuscatedName("ma.b(I)I")
    public int method5921() {
        if (this.field3982 < 33) {
            if (!this.field3984.method3927(class45.field320.field325, this.field3985)) {
                return this.field3982;
            }
            this.field3982 = 33;
        }
        if (this.field3982 == 33) {
            if (this.field3984.method3929(class45.field322.field325, this.field3985) && !this.field3984.method3927(class45.field322.field325, this.field3985)) {
                return this.field3982;
            }
            this.field3982 = 66;
        }
        if (this.field3982 == 66) {
            if (!this.field3984.method3927(this.field3985, class45.field329.field325)) {
                return this.field3982;
            }
            this.field3982 = 100;
            this.field3988 = true;
        }
        return this.field3982;
    }

    @ObfuscatedName("ma.l(I)Z")
    public boolean method5922() {
        return this.field3988;
    }

    @ObfuscatedName("ma.m(I)I")
    public int method5920() {
        return this.field3982;
    }
}
