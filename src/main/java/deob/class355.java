package deob;

@ObfuscatedName("ml")
public class class355 {

    @ObfuscatedName("ml.b")
    public String field3988;

    @ObfuscatedName("ml.e")
    public class253 field3989;

    @ObfuscatedName("ml.k")
    public int field3984 = 0;

    @ObfuscatedName("ml.g")
    public boolean field3990 = false;

    public class355(class253 arg0) {
        this.field3989 = arg0;
    }

    @ObfuscatedName("ml.f(Ljava/lang/String;I)V")
    public void method5383(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3988 != arg0) {
            this.field3988 = arg0;
            this.field3984 = 0;
            this.field3990 = false;
            this.method5384();
        }
    }

    @ObfuscatedName("ml.o(I)I")
    public int method5384() {
        if (this.field3984 < 33) {
            if (!this.field3989.method4000(class163.field1762.field1767, this.field3988)) {
                return this.field3984;
            }
            this.field3984 = 33;
        }
        if (this.field3984 == 33) {
            if (this.field3989.method3942(class163.field1764.field1767, this.field3988) && !this.field3989.method4000(class163.field1764.field1767, this.field3988)) {
                return this.field3984;
            }
            this.field3984 = 66;
        }
        if (this.field3984 == 66) {
            if (!this.field3989.method4000(this.field3988, class163.field1766.field1767)) {
                return this.field3984;
            }
            this.field3984 = 100;
            this.field3990 = true;
        }
        return this.field3984;
    }

    @ObfuscatedName("ml.u(I)Z")
    public boolean method5385() {
        return this.field3990;
    }

    @ObfuscatedName("ml.p(I)I")
    public int method5386() {
        return this.field3984;
    }
}
