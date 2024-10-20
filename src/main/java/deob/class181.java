package deob;

@ObfuscatedName("ft")
public class class181 {

    @ObfuscatedName("ft.ci")
    public long field2115;

    @ObfuscatedName("ft.ca")
    public class181 field2114;

    @ObfuscatedName("ft.cc")
    public class181 field2113;

    @ObfuscatedName("ft.fz()V")
    public void method3351() {
        if (this.field2113 != null) {
            this.field2113.field2114 = this.field2114;
            this.field2114.field2113 = this.field2113;
            this.field2114 = null;
            this.field2113 = null;
        }
    }

    @ObfuscatedName("ft.fj()Z")
    public boolean method3353() {
        return this.field2113 != null;
    }
}
