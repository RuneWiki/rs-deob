package deob;

@ObfuscatedName("lu")
public class class329 {

    @ObfuscatedName("lu.a")
    public String field3934;

    @ObfuscatedName("lu.c")
    public class250 field3929;

    @ObfuscatedName("lu.p")
    public int field3936 = 0;

    @ObfuscatedName("lu.r")
    public boolean field3937 = false;

    public class329(class250 arg0) {
        this.field3929 = arg0;
    }

    @ObfuscatedName("lu.f(Ljava/lang/String;B)V")
    public void method5722(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3934 != arg0) {
            this.field3934 = arg0;
            this.field3936 = 0;
            this.field3937 = false;
            this.method5714();
        }
    }

    @ObfuscatedName("lu.l(I)I")
    public int method5714() {
        if (this.field3936 < 25) {
            if (!this.field3929.method4310(class30.field285.field290, this.field3934)) {
                return this.field3936;
            }
            this.field3936 = 25;
        }
        if (this.field3936 == 25) {
            if (!this.field3929.method4310(this.field3934, class30.field287.field290)) {
                return 25 + this.field3929.method4304(this.field3934) * 25 / 100;
            }
            this.field3936 = 50;
        }
        if (this.field3936 == 50) {
            if (this.field3929.method4308(class30.field288.field290, this.field3934) && !this.field3929.method4310(class30.field288.field290, this.field3934)) {
                return 50;
            }
            this.field3936 = 75;
        }
        if (this.field3936 == 75) {
            if (!this.field3929.method4310(this.field3934, class30.field284.field290)) {
                return 75;
            }
            this.field3936 = 100;
            this.field3937 = true;
        }
        return this.field3936;
    }

    @ObfuscatedName("lu.w(I)Z")
    public boolean method5715() {
        return this.field3937;
    }

    @ObfuscatedName("lu.s(I)I")
    public int method5716() {
        return this.field3936;
    }
}
