package deob;

@ObfuscatedName("le")
public class class333 {

    @ObfuscatedName("le.i")
    public String field3941;

    @ObfuscatedName("le.g")
    public class235 field3942;

    @ObfuscatedName("le.d")
    public int field3943 = 0;

    @ObfuscatedName("le.l")
    public boolean field3944 = false;

    public class333(class235 arg0) {
        this.field3942 = arg0;
    }

    @ObfuscatedName("le.c(Ljava/lang/String;B)V")
    public void method5844(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field3941 != arg0) {
            this.field3941 = arg0;
            this.field3943 = 0;
            this.field3944 = false;
            this.method5845();
        }
    }

    @ObfuscatedName("le.t(I)I")
    public int method5845() {
        if (this.field3943 < 33) {
            if (!this.field3942.method3858(class36.field310.field309, this.field3941)) {
                return this.field3943;
            }
            this.field3943 = 33;
        }
        if (this.field3943 == 33) {
            if (this.field3942.method3928(class36.field311.field309, this.field3941) && !this.field3942.method3858(class36.field311.field309, this.field3941)) {
                return this.field3943;
            }
            this.field3943 = 66;
        }
        if (this.field3943 == 66) {
            if (!this.field3942.method3858(this.field3941, class36.field313.field309)) {
                return this.field3943;
            }
            this.field3943 = 100;
            this.field3944 = true;
        }
        return this.field3943;
    }

    @ObfuscatedName("le.o(I)Z")
    public boolean method5857() {
        return this.field3944;
    }

    @ObfuscatedName("le.e(I)I")
    public int method5847() {
        return this.field3943;
    }
}
