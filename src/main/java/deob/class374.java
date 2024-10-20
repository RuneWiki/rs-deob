package deob;

@ObfuscatedName("nl")
public class class374 {

    @ObfuscatedName("nl.m")
    public String field4124;

    @ObfuscatedName("nl.k")
    public class290 field4125;

    @ObfuscatedName("nl.t")
    public int field4121 = 0;

    @ObfuscatedName("nl.a")
    public boolean field4122 = false;

    public class374(class290 arg0) {
        this.field4125 = arg0;
    }

    @ObfuscatedName("nl.l(Ljava/lang/String;I)V")
    public void method5805(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4124 != arg0) {
            this.field4124 = arg0;
            this.field4121 = 0;
            this.field4122 = false;
            this.method5817();
        }
    }

    @ObfuscatedName("nl.q(I)I")
    public int method5817() {
        if (this.field4121 < 33) {
            if (!this.field4125.method4775(class200.field2216.field2220, this.field4124)) {
                return this.field4121;
            }
            this.field4121 = 33;
        }
        if (this.field4121 == 33) {
            if (this.field4125.method4773(class200.field2217.field2220, this.field4124) && !this.field4125.method4775(class200.field2217.field2220, this.field4124)) {
                return this.field4121;
            }
            this.field4121 = 66;
        }
        if (this.field4121 == 66) {
            if (!this.field4125.method4775(this.field4124, class200.field2219.field2220)) {
                return this.field4121;
            }
            this.field4121 = 100;
            this.field4122 = true;
        }
        return this.field4121;
    }

    @ObfuscatedName("nl.f(I)Z")
    public boolean method5807() {
        return this.field4122;
    }

    @ObfuscatedName("nl.j(I)I")
    public int method5816() {
        return this.field4121;
    }
}
