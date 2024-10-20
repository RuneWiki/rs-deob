package deob;

@ObfuscatedName("fw")
public class class174 extends class179 {

    @ObfuscatedName("fw.cd")
    public class174 field2805;

    @ObfuscatedName("fw.ca")
    public class174 field2804;

    @ObfuscatedName("fw.fm()V")
    public void method3270() {
        if (this.field2804 != null) {
            this.field2804.field2805 = this.field2805;
            this.field2805.field2804 = this.field2804;
            this.field2805 = null;
            this.field2804 = null;
        }
    }
}
