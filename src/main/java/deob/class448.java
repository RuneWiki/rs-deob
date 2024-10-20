package deob;

@ObfuscatedName("rk")
public class class448 {

    @ObfuscatedName("rk.an")
    public String field4717;

    @ObfuscatedName("rk.ao")
    public class340 field4722;

    @ObfuscatedName("rk.av")
    public int field4720 = 0;

    @ObfuscatedName("rk.aq")
    public boolean field4723 = false;

    public class448(class340 arg0) {
        this.field4722 = arg0;
    }

    @ObfuscatedName("rk.aj(Ljava/lang/String;I)V")
    public void method7370(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4717 != arg0) {
            this.field4717 = arg0;
            this.field4720 = 0;
            this.field4723 = false;
            this.method7374();
        }
    }

    @ObfuscatedName("rk.al(I)I")
    public int method7374() {
        if (this.field4720 < 33) {
            if (!this.field4722.method5857(class264.field3015.field3019, this.field4717)) {
                return this.field4720;
            }
            this.field4720 = 33;
        }
        if (this.field4720 == 33) {
            if (this.field4722.method5907(class264.field3017.field3019, this.field4717) && !this.field4722.method5857(class264.field3017.field3019, this.field4717)) {
                return this.field4720;
            }
            this.field4720 = 66;
        }
        if (this.field4720 == 66) {
            if (!this.field4722.method5857(this.field4717, class264.field3018.field3019)) {
                return this.field4720;
            }
            this.field4720 = 100;
            this.field4723 = true;
        }
        return this.field4720;
    }

    @ObfuscatedName("rk.ac(I)Z")
    public boolean method7369() {
        return this.field4723;
    }

    @ObfuscatedName("rk.ab(B)I")
    public int method7376() {
        return this.field4720;
    }
}
