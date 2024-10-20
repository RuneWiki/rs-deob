package deob;

@ObfuscatedName("ps")
public class class434 {

    @ObfuscatedName("ps.h")
    public String field4682;

    @ObfuscatedName("ps.j")
    public class330 field4683;

    @ObfuscatedName("ps.y")
    public int field4679 = 0;

    @ObfuscatedName("ps.d")
    public boolean field4685 = false;

    public class434(class330 arg0) {
        this.field4683 = arg0;
    }

    @ObfuscatedName("ps.a(Ljava/lang/String;I)V")
    public void method7197(String arg0) {
        if (arg0 != null && !arg0.isEmpty() && this.field4682 != arg0) {
            this.field4682 = arg0;
            this.field4679 = 0;
            this.field4685 = false;
            this.method7198();
        }
    }

    @ObfuscatedName("ps.f(B)I")
    public int method7198() {
        if (this.field4679 < 33) {
            if (!this.field4683.method5802(class254.field2950.field2954, this.field4682)) {
                return this.field4679;
            }
            this.field4679 = 33;
        }
        if (this.field4679 == 33) {
            if (this.field4683.method5842(class254.field2949.field2954, this.field4682) && !this.field4683.method5802(class254.field2949.field2954, this.field4682)) {
                return this.field4679;
            }
            this.field4679 = 66;
        }
        if (this.field4679 == 66) {
            if (!this.field4683.method5802(this.field4682, class254.field2953.field2954)) {
                return this.field4679;
            }
            this.field4679 = 100;
            this.field4685 = true;
        }
        return this.field4679;
    }

    @ObfuscatedName("ps.c(I)Z")
    public boolean method7199() {
        return this.field4685;
    }

    @ObfuscatedName("ps.x(B)I")
    public int method7196() {
        return this.field4679;
    }
}
