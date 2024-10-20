package deob;

@ObfuscatedName("fn")
public class class181 extends class186 {

    @ObfuscatedName("fn.cg")
    public long field2133;

    @ObfuscatedName("fn.cf")
    public class181 field2132;

    @ObfuscatedName("fn.cp")
    public class181 field2131;

    @ObfuscatedName("fn.cg()V")
    public void method3294() {
        if (this.field2131 != null) {
            this.field2131.field2132 = this.field2132;
            this.field2132.field2131 = this.field2131;
            this.field2132 = null;
            this.field2131 = null;
        }
    }
}
