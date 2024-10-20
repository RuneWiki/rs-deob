package deob;

@ObfuscatedName("go")
public class class208 {

    @ObfuscatedName("go.eg")
    public long field3100;

    @ObfuscatedName("go.ek")
    public class208 field3099;

    @ObfuscatedName("go.eo")
    public class208 field3101;

    @ObfuscatedName("go.hy()V")
    public void method3626() {
        if (this.field3101 != null) {
            this.field3101.field3099 = this.field3099;
            this.field3099.field3101 = this.field3101;
            this.field3099 = null;
            this.field3101 = null;
        }
    }

    @ObfuscatedName("go.he()Z")
    public boolean method3624() {
        return this.field3101 != null;
    }
}
