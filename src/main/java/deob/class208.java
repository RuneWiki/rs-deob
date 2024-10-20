package deob;

@ObfuscatedName("ga")
public class class208 {

    @ObfuscatedName("ga.eo")
    public long field3112;

    @ObfuscatedName("ga.ek")
    public class208 field3110;

    @ObfuscatedName("ga.eq")
    public class208 field3111;

    @ObfuscatedName("ga.in()V")
    public void method3651() {
        if (this.field3111 != null) {
            this.field3111.field3110 = this.field3110;
            this.field3110.field3111 = this.field3111;
            this.field3110 = null;
            this.field3111 = null;
        }
    }

    @ObfuscatedName("ga.ik()Z")
    public boolean method3649() {
        return this.field3111 != null;
    }
}
