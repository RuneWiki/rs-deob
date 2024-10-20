package deob;

@ObfuscatedName("gc")
public class class183 extends class187 {

    @ObfuscatedName("gc.cd")
    public class183 field2863;

    @ObfuscatedName("gc.cp")
    public class183 field2862;

    @ObfuscatedName("gc.ef()V")
    public void method3260() {
        if (this.field2862 != null) {
            this.field2862.field2863 = this.field2863;
            this.field2863.field2862 = this.field2862;
            this.field2863 = null;
            this.field2862 = null;
        }
    }
}
