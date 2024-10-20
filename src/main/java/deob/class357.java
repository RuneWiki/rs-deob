package deob;

@ObfuscatedName("mx")
public class class357 {

    @ObfuscatedName("mx.j")
    public String field3985;

    @ObfuscatedName("mx.o")
    public class276 field3986;

    @ObfuscatedName("mx.m")
    public int field3987 = 0;

    @ObfuscatedName("mx.r")
    public boolean field3988 = false;

    public class357(class276 arg0) {
        this.field3986 = arg0;
    }

    @ObfuscatedName("mx.f(Ljava/lang/String;I)V")
    public void method5436(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3985 != arg0) {
            this.field3985 = arg0;
            this.field3987 = 0;
            this.field3988 = false;
            this.method5437();
        }
    }

    @ObfuscatedName("mx.e(I)I")
    public int method5437() {
        if (this.field3987 < 33) {
            if (!this.field3986.method4566(class186.field2135.field2134, this.field3985)) {
                return this.field3987;
            }
            this.field3987 = 33;
        }
        if (this.field3987 == 33) {
            if (this.field3986.method4522(class186.field2131.field2134, this.field3985) && !this.field3986.method4566(class186.field2131.field2134, this.field3985)) {
                return this.field3987;
            }
            this.field3987 = 66;
        }
        if (this.field3987 == 66) {
            if (!this.field3986.method4566(this.field3985, class186.field2130.field2134)) {
                return this.field3987;
            }
            this.field3987 = 100;
            this.field3988 = true;
        }
        return this.field3987;
    }

    @ObfuscatedName("mx.v(I)Z")
    public boolean method5444() {
        return this.field3988;
    }

    @ObfuscatedName("mx.y(I)I")
    public int method5439() {
        return this.field3987;
    }
}
