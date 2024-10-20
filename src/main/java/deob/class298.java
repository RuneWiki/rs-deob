package deob;

@ObfuscatedName("kd")
public class class298 {

    @ObfuscatedName("kd.l")
    public final int field3757;

    @ObfuscatedName("kd.q")
    public final long field3760;

    @ObfuscatedName("kd.f")
    public final class299 field3758;

    @ObfuscatedName("kd.j")
    public String field3759;

    @ObfuscatedName("kd.m")
    public String field3756;

    public class298(class401 arg0, byte arg1, int arg2) {
        this.field3759 = arg0.method6474();
        this.field3756 = arg0.method6474();
        this.field3757 = arg0.method6284();
        this.field3760 = arg0.method6275();
        int var4 = arg0.method6277();
        int var5 = arg0.method6277();
        this.field3758 = new class299();
        this.field3758.method4933(2);
        this.field3758.method4931(arg1);
        this.field3758.field3764 = var4;
        this.field3758.field3763 = var5;
        this.field3758.field3766 = 0;
        this.field3758.field3767 = 0;
        this.field3758.field3765 = arg2;
    }

    @ObfuscatedName("kd.l(B)Ljava/lang/String;")
    public String method4921() {
        return this.field3759;
    }

    @ObfuscatedName("kd.q(B)Ljava/lang/String;")
    public String method4922() {
        return this.field3756;
    }
}
