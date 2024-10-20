package deob;

@ObfuscatedName("gl")
public class class205 {

    @ObfuscatedName("gl.cb")
    public long field2450;

    @ObfuscatedName("gl.cg")
    public class205 field2448;

    @ObfuscatedName("gl.cl")
    public class205 field2449;

    @ObfuscatedName("gl.kc()V")
    public void method3782() {
        if (this.field2449 != null) {
            this.field2449.field2448 = this.field2448;
            this.field2448.field2449 = this.field2449;
            this.field2448 = null;
            this.field2449 = null;
        }
    }

    @ObfuscatedName("gl.kz()Z")
    public boolean method3783() {
        return this.field2449 != null;
    }
}
