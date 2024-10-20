package deob;

@ObfuscatedName("fk")
public class class6 extends class17 {

    @ObfuscatedName("fk.cz")
    public class6 field22;

    @ObfuscatedName("fk.ci")
    public class6 field23;

    @ObfuscatedName("fk.eh()V")
    public void method51() {
        if (this.field22 != null) {
            this.field22.field23 = this.field23;
            this.field23.field22 = this.field22;
            this.field23 = null;
            this.field22 = null;
        }
    }
}
