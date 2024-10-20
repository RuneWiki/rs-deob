package deob;

@ObfuscatedName("nc")
public class class374 {

    @ObfuscatedName("nc.o")
    public String field4125;

    @ObfuscatedName("nc.g")
    public class290 field4124;

    @ObfuscatedName("nc.e")
    public int field4119 = 0;

    @ObfuscatedName("nc.p")
    public boolean field4126 = false;

    public class374(class290 arg0) {
        this.field4124 = arg0;
    }

    @ObfuscatedName("nc.i(Ljava/lang/String;I)V")
    public void method5790(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4125 != arg0) {
            this.field4125 = arg0;
            this.field4119 = 0;
            this.field4126 = false;
            this.method5779();
        }
    }

    @ObfuscatedName("nc.w(I)I")
    public int method5779() {
        if (this.field4119 < 33) {
            if (!this.field4124.method4763(class200.field2212.field2213, this.field4125)) {
                return this.field4119;
            }
            this.field4119 = 33;
        }
        if (this.field4119 == 33) {
            if (this.field4124.method4761(class200.field2216.field2213, this.field4125) && !this.field4124.method4763(class200.field2216.field2213, this.field4125)) {
                return this.field4119;
            }
            this.field4119 = 66;
        }
        if (this.field4119 == 66) {
            if (!this.field4124.method4763(this.field4125, class200.field2215.field2213)) {
                return this.field4119;
            }
            this.field4119 = 100;
            this.field4126 = true;
        }
        return this.field4119;
    }

    @ObfuscatedName("nc.s(B)Z")
    public boolean method5780() {
        return this.field4126;
    }

    @ObfuscatedName("nc.a(B)I")
    public int method5781() {
        return this.field4119;
    }
}
