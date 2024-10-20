package deob;

@ObfuscatedName("de")
public class class89 implements Runnable {

    @ObfuscatedName("de.aw")
    public boolean field1089 = true;

    @ObfuscatedName("de.ay")
    public Object field1088 = new Object();

    @ObfuscatedName("de.ar")
    public int field1084 = 0;

    @ObfuscatedName("de.am")
    public int[] field1085 = new int[500];

    @ObfuscatedName("de.as")
    public int[] field1082 = new int[500];

    @ObfuscatedName("de.aj")
    public long[] field1087 = new long[500];

    public void run() {
        while (this.field1089) {
            Object var1 = this.field1088;
            synchronized (this.field1088) {
                if (this.field1084 < 500) {
                    this.field1085[this.field1084] = class36.field245;
                    this.field1082[this.field1084] = class36.field246;
                    this.field1087[this.field1084] = class36.field247;
                    this.field1084++;
                }
            }
            class304.method173(50L);
        }
    }
}
