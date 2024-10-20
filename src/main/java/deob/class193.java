package deob;

@ObfuscatedName("ge")
public class class193 {

    @ObfuscatedName("ge.cf")
    public long field2467;

    @ObfuscatedName("ge.cl")
    public class193 field2466;

    @ObfuscatedName("ge.cd")
    public class193 field2465;

    @ObfuscatedName("ge.jg()V")
    public void method3308() {
        if (this.field2465 != null) {
            this.field2465.field2466 = this.field2466;
            this.field2466.field2465 = this.field2465;
            this.field2466 = null;
            this.field2465 = null;
        }
    }

    @ObfuscatedName("ge.jk()Z")
    public boolean method3313() {
        return this.field2465 != null;
    }
}
