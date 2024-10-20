package deob;

@ObfuscatedName("gc")
public class class195 extends class193 {

    @ObfuscatedName("gc.cu")
    public class195 field2442;

    @ObfuscatedName("gc.cg")
    public class195 field2443;

    @ObfuscatedName("gc.cd()V")
    public void method3320() {
        if (this.field2443 != null) {
            this.field2443.field2442 = this.field2442;
            this.field2442.field2443 = this.field2443;
            this.field2442 = null;
            this.field2443 = null;
        }
    }
}
