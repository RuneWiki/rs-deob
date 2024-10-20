package deob;

@ObfuscatedName("ft")
public class class179 {

    @ObfuscatedName("ft.da")
    public long field2830;

    @ObfuscatedName("ft.ef")
    public class179 field2829;

    @ObfuscatedName("ft.eb")
    public class179 field2831;

    @ObfuscatedName("ft.hx()V")
    public void method3309() {
        if (this.field2831 != null) {
            this.field2831.field2829 = this.field2829;
            this.field2829.field2831 = this.field2831;
            this.field2829 = null;
            this.field2831 = null;
        }
    }

    @ObfuscatedName("ft.hv()Z")
    public boolean method3310() {
        return this.field2831 != null;
    }
}
