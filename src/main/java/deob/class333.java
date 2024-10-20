package deob;

@ObfuscatedName("ls")
public class class333 {

    @ObfuscatedName("ls.o")
    public String field3952;

    @ObfuscatedName("ls.u")
    public class245 field3950;

    @ObfuscatedName("ls.g")
    public int field3954 = 0;

    @ObfuscatedName("ls.l")
    public boolean field3955 = false;

    public class333(class245 arg0) {
        this.field3950 = arg0;
    }

    @ObfuscatedName("ls.m(Ljava/lang/String;I)V")
    public void method5716(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3952 != arg0) {
            this.field3952 = arg0;
            this.field3954 = 0;
            this.field3955 = false;
            this.method5717();
        }
    }

    @ObfuscatedName("ls.f(I)I")
    public int method5717() {
        if (this.field3954 < 33) {
            if (!this.field3950.method4178(class36.field289.field293, this.field3952)) {
                return this.field3954;
            }
            this.field3954 = 33;
        }
        if (this.field3954 == 33) {
            if (this.field3950.method4207(class36.field291.field293, this.field3952) && !this.field3950.method4178(class36.field291.field293, this.field3952)) {
                return this.field3954;
            }
            this.field3954 = 66;
        }
        if (this.field3954 == 66) {
            if (!this.field3950.method4178(this.field3952, class36.field288.field293)) {
                return this.field3954;
            }
            this.field3954 = 100;
            this.field3955 = true;
        }
        return this.field3954;
    }

    @ObfuscatedName("ls.q(S)Z")
    public boolean method5718() {
        return this.field3955;
    }

    @ObfuscatedName("ls.w(I)I")
    public int method5719() {
        return this.field3954;
    }
}
