package deob;

@ObfuscatedName("ma")
public class class356 {

    @ObfuscatedName("ma.p")
    public String field3988;

    @ObfuscatedName("ma.j")
    public class275 field3990;

    @ObfuscatedName("ma.r")
    public int field3991 = 0;

    @ObfuscatedName("ma.b")
    public boolean field3989 = false;

    public class356(class275 arg0) {
        this.field3990 = arg0;
    }

    @ObfuscatedName("ma.v(Ljava/lang/String;B)V")
    public void method5529(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3988 != arg0) {
            this.field3988 = arg0;
            this.field3991 = 0;
            this.field3989 = false;
            this.method5522();
        }
    }

    @ObfuscatedName("ma.n(B)I")
    public int method5522() {
        if (this.field3991 < 33) {
            if (!this.field3990.method4488(class185.field2133.field2137, this.field3988)) {
                return this.field3991;
            }
            this.field3991 = 33;
        }
        if (this.field3991 == 33) {
            if (this.field3990.method4501(class185.field2135.field2137, this.field3988) && !this.field3990.method4488(class185.field2135.field2137, this.field3988)) {
                return this.field3991;
            }
            this.field3991 = 66;
        }
        if (this.field3991 == 66) {
            if (!this.field3990.method4488(this.field3988, class185.field2136.field2137)) {
                return this.field3991;
            }
            this.field3991 = 100;
            this.field3989 = true;
        }
        return this.field3991;
    }

    @ObfuscatedName("ma.f(I)Z")
    public boolean method5520() {
        return this.field3989;
    }

    @ObfuscatedName("ma.y(I)I")
    public int method5525() {
        return this.field3991;
    }
}
